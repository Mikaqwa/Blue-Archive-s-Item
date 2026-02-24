package com.bluearchivesitem.item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.item.Items;

public class BlueArchiveToolMaterial implements ToolMaterial {
    public static final BlueArchiveToolMaterial INSTANCE = new BlueArchiveToolMaterial();

    @Override
    public int getDurability() { 
        return 1560; // 耐久度1560
    } 

    @Override
    public float getMiningSpeedMultiplier() { 
        return 8.0F; // 挖掘速度8.0F
    } 

    @Override
    public float getAttackDamage() { 
        return 4.0F; // 伤害4.0F
    } 

    @Override
    public int getMiningLevel() { 
        return 3; // 必须改为 3，才能挖掘黑曜石（钻石级别）
    } 

    @Override
    public int getEnchantability() { 
        return 10; // 钻石级的附魔能力通常是 10
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.QHS); 
    }
}