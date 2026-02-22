package com.bluearchivesitem.item;

import com.bluearchivesitem.BlueArchivesItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
	// 青辉石 item id: qhs
	public static final Item QHS = new Item(new FabricItemSettings());

	public static void registerItems() {
		registerItem("qhs", QHS);
	}

	// 注册物品工具方法
	private static Item registerItem(String name, Item item) {
		return Registry.register(Registries.ITEM,
				new Identifier(BlueArchivesItem.MOD_ID, name),
				item);
	}
}