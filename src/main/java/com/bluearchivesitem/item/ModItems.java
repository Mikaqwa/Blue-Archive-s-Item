package com.bluearchivesitem.item;

import com.bluearchivesitem.BlueArchivesItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item QHS = registerItem("qhs", new Item(new FabricItemSettings()));
    public static final Item QHS_PICKAXE = registerItem("qhs_pickaxe", new ModPickaxeItem(BlueArchiveToolMaterial.INSTANCE, 1, -2.8F, new FabricItemSettings()));    
    public static final Item QHS_AXE = registerItem("qhs_axe", new ModAxeItem(BlueArchiveToolMaterial.INSTANCE, 7.0F,-2.5F,new FabricItemSettings()));

    public static void registerItems() {
        BlueArchivesItem.LOGGER.info("Registering Mod Items for " + BlueArchivesItem.MOD_ID);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM,
                new Identifier("blue_archives_item", name),
                item);
    }
}