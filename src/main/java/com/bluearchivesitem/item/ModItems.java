package com.bluearchivesitem.item;

import com.bluearchivesitem.BlueArchivesItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    // 1. 定义物品：青辉石
    // 提示：1.20.1 中 FabricItemSettings 是完全没问题的
    public static final Item QHS = new Item(new FabricItemSettings());

    // 2. 统一注册方法
    public static void registerItems() {
        // 建议在这里打印一条日志，方便在控制台确认物品是否注册成功
        BlueArchivesItem.LOGGER.info("Registering Mod Items for " + BlueArchivesItem.MOD_ID);
        
        registerItem("qhs", QHS);
    }

    // 3. 辅助注册工具
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, 
                new Identifier(BlueArchivesItem.MOD_ID, name), 
                item);
    }
}
