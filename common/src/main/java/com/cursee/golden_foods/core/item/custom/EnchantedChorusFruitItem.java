package com.cursee.golden_foods.core.item.custom;

import net.minecraft.world.item.ChorusFruitItem;
import net.minecraft.world.item.ItemStack;

public class EnchantedChorusFruitItem extends ChorusFruitItem {

    public EnchantedChorusFruitItem(Properties properties) {
        super(properties);
    }

    @Override
    public boolean isFoil(ItemStack itemStack) {
        return true;
    }
}
