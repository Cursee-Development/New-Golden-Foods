package com.cursee.golden_foods.core.item.custom;

// import net.minecraft.world.item.BowlFoodItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

/** Food Properties handle determining whether the item is a bowl. */
@Deprecated(forRemoval = true, since = "1.21.1")
public class EnchantedBowlFoodItem extends Item { // extends BowlFoodItem {

    public EnchantedBowlFoodItem(Properties properties) {
        super(properties);
    }

    @Override
    public boolean isFoil(ItemStack itemStack) {
        return true;
    }
}
