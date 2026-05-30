package io.github.kedaya0209.roco.sniffer.codec;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;

import lombok.extern.slf4j.Slf4j;
import net.jcip.annotations.ThreadSafe;

/**
 * AES-128-CBC 解密器。
 * <p>
 * 对应 Python: rkpp_network.py decrypt_4013_body / decrypt_4013_body_candidates
 * <p>
 * 洛克王国协议使用两种 AES 解密模式：
 * <ul>
 *   <li>embedded-IV: body[:16] = IV, body[16:] = 密文</li>
 *   <li>fixed-IV: IV = [0,1,2,...,15], body 整体 = 密文</li>
 * </ul>
 */
@Slf4j
@ThreadSafe
public class Decryptor {

    private static final byte[] FIXED_IV = {
            0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15
    };

    /**
     * 从 0x1002 握手包 body 中提取 AES 密钥（前 16 字节）。
     *
     * @param body 0x1002 帧的 body
     * @return 16 字节 AES key
     * @throws IllegalArgumentException 如果 body 长度不足
     */
    public static byte[] extractKey(byte[] body) {
        if (body.length < 16) {
            throw new IllegalArgumentException("0x1002 body too short for key: " + body.length);
        }
        return Arrays.copyOf(body, 16);
    }

    /**
     * 解密 0x4013 数据包（两种模式都尝试）。
     *
     * @param key  16 字节 AES key
     * @param body 0x4013 帧的 body
     * @return 解密结果（可能多个候选）
     * @throws IllegalArgumentException 如果两种模式都解密失败
     */
    public static DecryptResult[] decryptCandidates(byte[] key, byte[] body) {
        if (body.length < 16) {
            throw new IllegalArgumentException("0x4013 body too short to decrypt: " + body.length);
        }

        java.util.List<DecryptResult> results = new java.util.ArrayList<>();

        // 模式1: fixed-IV (body 整体是密文，必须 16 字节对齐)
        if (body.length % 16 == 0) {
            try {
                byte[] plain = aesDecrypt(key, FIXED_IV, body);
                results.add(new DecryptResult("fixed_iv", FIXED_IV, body, plain));
            } catch (Exception e) {
                // ignore, try next
            }
        }

        // 模式2: embedded-IV (body[:16]=IV, body[16:]=密文)
        if (body.length >= 32) {
            byte[] iv = Arrays.copyOf(body, 16);
            byte[] ct = Arrays.copyOfRange(body, 16, body.length);
            if (ct.length % 16 == 0) {
                try {
                    byte[] plain = aesDecrypt(key, iv, ct);
                    results.add(new DecryptResult("embedded_iv", iv, ct, plain));
                } catch (Exception e) {
                    // ignore
                }
            }
        }

        if (results.isEmpty()) {
            throw new IllegalArgumentException("No valid AES decryption candidate");
        }

        return results.toArray(new DecryptResult[0]);
    }

    /**
     * 解密 0x4013（取第一个成功的结果）。
     */
    public static DecryptResult decrypt(byte[] key, byte[] body) {
        return decryptCandidates(key, body)[0];
    }

    private static byte[] aesDecrypt(byte[] key, byte[] iv, byte[] ciphertext) throws Exception {
        SecretKeySpec keySpec = new SecretKeySpec(key, "AES");
        IvParameterSpec ivSpec = new IvParameterSpec(iv);
        Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
        cipher.init(Cipher.DECRYPT_MODE, keySpec, ivSpec);
        return cipher.doFinal(ciphertext);
    }

    /**
     * 解密结果。
     *
     * @param mode       解密模式 ("fixed_iv" 或 "embedded_iv")
     * @param iv         使用的 IV
     * @param ciphertext 实际解密的密文
     * @param plaintext  解密后的明文
     */
    public record DecryptResult(String mode, byte[] iv, byte[] ciphertext, byte[] plaintext) {
    }
}
