package com.bluearchivesitem.item;

import com.bluearchivesitem.BlueArchivesItem;
import com.bluearchivesitem.block.ModBlocks;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup; // 1.20.1 叫 ItemGroup
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    // 注册物品栏
    public static final ItemGroup BLUE_ARCHIVE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(BlueArchivesItem.MOD_ID, "blue_archive_group"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.QHS)) // 物品栏图标
                    .displayName(Text.translatable("itemgroup.blue_archives_group")) // 物品栏名字
                    .entries((displayContext, entries) -> {
                        // 添加物品
                        entries.add(ModItems.QHS);
                        entries.add(ModItems.QHS_PICKAXE);

                        entries.add(ModBlocks.QHS_BLOCK);
                        entries.add(ModBlocks.QHS_ORE_BLOCK);
                        // entries.add(ModItems.OTHER_ITEM);
                    }).build());

    public static void registerItemGroups() {
        BlueArchivesItem.LOGGER.info("Registering Item Groups for " + BlueArchivesItem.MOD_ID);
    }
}