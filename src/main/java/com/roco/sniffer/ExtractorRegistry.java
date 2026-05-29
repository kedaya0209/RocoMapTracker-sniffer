package com.roco.sniffer;

import com.roco.sniffer.extractors.*;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 提取器注册表：opcode → EventExtractor 映射。
 * <p>
 * 具体提取器通过 {@link EventExtractor#supportedOpcodes()} 声明支持的 opcode，
 * 在 {@link #createDefault()} 中自动注册。Lambda 提取器需手动注册。
 */
@Slf4j
public class ExtractorRegistry {

    private final Map<Integer, EventExtractor> extractors = new HashMap<>();

    public void register(int opcode, EventExtractor extractor) {
        extractors.put(opcode, extractor);
    }

    public void unregister(int opcode) {
        extractors.remove(opcode);
    }

    public boolean hasExtractor(int opcode) {
        return extractors.containsKey(opcode);
    }

    public Set<Integer> registeredOpcodes() {
        return extractors.keySet();
    }

    /**
     * 分发到对应提取器。无注册提取器时静默跳过。
     *
     * @return true 如果有提取器被调用
     */
    public boolean handle(int opcode, byte[] payload, ExtractorContext ctx) {
        EventExtractor ext = extractors.get(opcode);
        if (ext == null) return false;
        try {
            ext.handle(opcode, payload, ctx);
        } catch (Exception e) {
            log.warn("提取器异常 opcode=0x{}: {}", String.format("%04X", opcode), e.getMessage());
        }
        return true;
    }

    /**
     * 自动注册提取器：遍历 supportedOpcodes() 注册每个 opcode。
     */
    private void autoRegister(EventExtractor extractor) {
        for (int opcode : extractor.supportedOpcodes()) {
            register(opcode, extractor);
        }
    }

    /**
     * 创建默认注册表。
     * <p>
     * 具体提取器通过 supportedOpcodes() 自动注册；
     * Lambda 提取器（不声明 opcode）手动注册。
     */
    public static ExtractorRegistry createDefault() {
        ExtractorRegistry registry = new ExtractorRegistry();

        // 自动注册（提取器声明 supportedOpcodes）
        registry.autoRegister(new SceneChangeExtractor());
        registry.autoRegister(new AreaEventExtractor());
        registry.autoRegister(new ItemPickupExtractor());
        SwitchMainTeamExtractor switchMainTeam = new SwitchMainTeamExtractor();
        registry.autoRegister(switchMainTeam);
        registry.autoRegister(new TeamRosterExtractor());
        registry.autoRegister(new PetInfoPageExtractor());
        registry.autoRegister(new SkillSelectExtractor());
        registry.autoRegister(new BattleEnterExtractor());
        registry.autoRegister(new RoundStartExtractor());
        registry.autoRegister(new SkillDeclareExtractor());
        PerformActionExtractor performExtractor = new PerformActionExtractor();
        registry.autoRegister(performExtractor);
        registry.autoRegister(new BattleFinishExtractor());

        // 手动注册（lambda 提取器，不声明 supportedOpcodes）
        registry.register(0x01A9, (opcode, payload, _) ->
                log.debug("[battle] 0x{} (len={})", String.format("%04X", opcode), payload.length));
        registry.register(0x130C, (_, payload, _) ->
                log.debug("[battle] 技能确认 (len={})", payload.length));
        registry.register(0x1312, (_, payload, _) ->
                log.debug("[battle] 回合流程 (len={})", payload.length));

        return registry;
    }
}
