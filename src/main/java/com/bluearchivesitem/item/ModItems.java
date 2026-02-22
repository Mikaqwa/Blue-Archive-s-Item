package com.bluearchivesitem.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import com.bluearchivesitem.BlueArchivesItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    // 1. 定义物品：青辉石
    public static final Item QHS = new Item(new FabricItemSettings());

    // 2. 统一注册方法
    public static void registerItems() {
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