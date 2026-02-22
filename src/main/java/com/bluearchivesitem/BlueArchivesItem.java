package com.bluearchivesitem;

import com.bluearchivesitem.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BlueArchivesItem implements ModInitializer {
	public static final String MOD_ID = "blue-archives-item";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerItems(); // 注册物品
		LOGGER.info("Blue Archive's Item Mod loaded!");
	}
}
