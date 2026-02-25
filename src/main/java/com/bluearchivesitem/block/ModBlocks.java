package com.bluearchivesitem.block;

import com.bluearchivesitem.BlueArchivesItem;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.registry.tag.BlockTags;

//public class ModBlocks {
    /*// 方块：青辉石矿石块
    public static final Block QHS_ORE_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.STONE)
            
            // 1. 开采条件：铁镐及以上才能开采
            .requiresTool()  // 必须配合工具，空手无法开采
            // 2. 基础属性（可自定义）
            .strength(2.5f, 750.0f)  // 硬度5.0，爆炸抗性1200
            // 3. 音效
            .sounds(BlockSoundGroup.AMETHYST_BLOCK)  // 临时用石头音效，后续替换为自定义
            // 4. 材质
            .nonOpaque());
    //方块：青辉石块
    public static final Block QHS_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.STONE)
            // 1. 开采条件：铁镐及以上才能开采
            //.requiresTool()  // 必须配合工具，空手无法开采
            // 2. 基础属性（可自定义）
            .strength(3.5f, 900.0f)  // 硬度5.0，爆炸抗性1200
            // 3. 音效
            .sounds(BlockSoundGroup.AMETHYST_BLOCK)  
            // 4. 材质
            .nonOpaque());*/

public class ModBlocks {
    // 方块：青辉石块
    public static final Block QHS_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)
            .requiresTool()
            .strength(3.5f, 5.5f)//666这个青辉石块是防爆混凝土
            .sounds(BlockSoundGroup.AMETHYST_BLOCK)
            .nonOpaque());
    public static final Block QHS_ORE_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE)
            .requiresTool()
            .strength(2.5f, 3.0f)
            .sounds(BlockSoundGroup.AMETHYST_BLOCK)
            .nonOpaque());

    public static void registerBlocks() {
        BlueArchivesItem.LOGGER.info("Registering Mod Blocks for " + BlueArchivesItem.MOD_ID);

        // Use Item.Settings and create a BlockItem inside registerBlock.
        // Avoid referencing ItemGroup constants (mapping names may differ); register without a group.
        registerBlock("qhs_block", QHS_BLOCK, new Item.Settings());
        registerBlock("qhs_ore_block", QHS_ORE_BLOCK, new Item.Settings());
    }

    private static Block registerBlock(String name, Block block, Item.Settings settings) {
        Block registered = Registry.register(Registries.BLOCK, new Identifier("blue_archives_item", name), block);
        // Register the BlockItem using the provided settings
        Registry.register(Registries.ITEM, new Identifier("blue_archives_item", name), new BlockItem(block, settings));
        return registered;
    }
}