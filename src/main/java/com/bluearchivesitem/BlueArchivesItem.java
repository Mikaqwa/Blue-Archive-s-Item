package com.bluearchivesitem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bluearchivesitem.item.ModItemGroups;
import com.bluearchivesitem.item.ModItems;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;

public class BlueArchivesItem implements ModInitializer {
	public static final String MOD_ID = "blue_archives_item";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final RegistryKey<PlacedFeature> CUSTOM_ORE_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier("blue_archives_item","ore_custom"));//注册一个PlacedFeature的RegistryKey，路径为ore_custom。后续在生成类中使用这个RegistryKey来添加自定义矿石生成。
	public static final RegistryKey<PlacedFeature> END_CUSTOM_ORE_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier("blue_archives_item","ore_end_custom"));//注册一个PlacedFeature的RegistryKey，路径为ore_end_custom。后续在生成类中使用这个RegistryKey来添加自定义矿石生成。

	@Override
	public void onInitialize() {
		ModItems.registerItems(); // 注册物品
		com.bluearchivesitem.block.ModBlocks.registerBlocks(); // 注册方块
		ModItemGroups.registerItemGroups(); // 注册物品栏
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, CUSTOM_ORE_PLACED_KEY);// 在主世界生成青辉石矿石
		BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.RAW_GENERATION, END_CUSTOM_ORE_PLACED_KEY);//在末地生成
		LOGGER.info("Blue Archive's Item Mod loaded!");
	}
}
