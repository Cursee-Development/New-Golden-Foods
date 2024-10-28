package com.cursee.golden_foods.core.enchantment;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantments;
import org.jetbrains.annotations.NotNull;

public class GoldenFoodsEnchantment extends Enchantment {

    public GoldenFoodsEnchantment() {
        super(Rarity.COMMON, EnchantmentCategory.FISHING_ROD, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
    }

    @Override
    public int getMaxLevel() {
        return 1;
    }

    @Override
    public int getMinCost(int level) {
        return 30;
    }

    @Override
    public int getMaxCost(int level) {
        return 30;
    }

    @Override
    protected boolean checkCompatibility(@NotNull Enchantment other) {
        return other == Enchantments.FISHING_LUCK || other == Enchantments.FISHING_SPEED;
    }

//        @Override
//        public boolean canEnchant(ItemStack stack) {
//            return stack.is(Items.FISHING_ROD);
//        }
}
