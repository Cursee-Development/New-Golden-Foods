package com.cursee.golden_foods.core.item.custom;

import net.minecraft.world.item.BowlFoodItem;
import net.minecraft.world.item.ItemStack;

public class EnchantedBowlFoodItem extends BowlFoodItem {

    public EnchantedBowlFoodItem(Properties properties) {
        super(properties);
    }

    @Override
    public boolean isFoil(ItemStack itemStack) {
        return true;
    }
}
