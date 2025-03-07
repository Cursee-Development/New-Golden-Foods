package com.cursee.golden_foods.core;

import com.cursee.golden_foods.core.registry.ModBlocksFabric;
import com.cursee.golden_foods.core.registry.ModEnchantmentsFabric;
import com.cursee.golden_foods.core.registry.ModItemsFabric;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AnvilMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import oshi.util.tuples.Triplet;

public class EnchantedGoldenFoodCreationMethodFabric {

    public static Triplet<Integer, Integer, ItemStack> createGoldenFoods(AnvilMenu instance, ItemStack slotLeft, ItemStack slotRight, ItemStack slotOutput, String leftSlotName, int baseCost, Player player) {

        if (!EnchantmentHelper.getEnchantments(slotRight).containsKey(ModEnchantmentsFabric.GOLDEN_FOODS)) return null;

        final Integer experienceCost = Math.min(slotLeft.getCount(), 40);

        if (slotLeft.is(Items.GOLDEN_APPLE)) {
            final ItemStack toReturn = new ItemStack(Items.ENCHANTED_GOLDEN_APPLE);
            return new Triplet<>(experienceCost, slotLeft.getCount(), toReturn);
        }

        if (slotLeft.is(Items.GOLDEN_CARROT)) {
            final ItemStack toReturn = new ItemStack(ModItemsFabric.ENCHANTED_GOLDEN_CARROT);
            return new Triplet<>(experienceCost, slotLeft.getCount(), toReturn);
        }

        if (slotLeft.is(ModItemsFabric.GOLDEN_MELON_SLICE)) {
            final ItemStack toReturn = new ItemStack(ModItemsFabric.ENCHANTED_GOLDEN_MELON_SLICE);
            return new Triplet<>(experienceCost, slotLeft.getCount(), toReturn);
        }

        if (slotLeft.is(ModItemsFabric.GOLDEN_SWEET_BERRIES)) {
            final ItemStack toReturn = new ItemStack(ModItemsFabric.ENCHANTED_GOLDEN_SWEET_BERRIES);
            return new Triplet<>(experienceCost, slotLeft.getCount(), toReturn);
        }

        if (slotLeft.is(ModItemsFabric.GOLDEN_GLOW_BERRIES)) {
            final ItemStack toReturn = new ItemStack(ModItemsFabric.ENCHANTED_GOLDEN_GLOW_BERRIES);
            return new Triplet<>(experienceCost, slotLeft.getCount(), toReturn);
        }

        if (slotLeft.is(ModItemsFabric.GOLDEN_BAKED_POTATO)) {
            final ItemStack toReturn = new ItemStack(ModItemsFabric.ENCHANTED_GOLDEN_BAKED_POTATO);
            return new Triplet<>(experienceCost, slotLeft.getCount(), toReturn);
        }

        if (slotLeft.is(ModItemsFabric.GOLDEN_BEETROOT)) {
            final ItemStack toReturn = new ItemStack(ModItemsFabric.ENCHANTED_GOLDEN_BEETROOT);
            return new Triplet<>(experienceCost, slotLeft.getCount(), toReturn);
        }

        if (slotLeft.is(ModItemsFabric.GOLDEN_DRIED_KELP)) {
            final ItemStack toReturn = new ItemStack(ModItemsFabric.ENCHANTED_GOLDEN_DRIED_KELP);
            return new Triplet<>(experienceCost, slotLeft.getCount(), toReturn);
        }

        if (slotLeft.is(ModItemsFabric.GOLDEN_BREAD)) {
            final ItemStack toReturn = new ItemStack(ModItemsFabric.ENCHANTED_GOLDEN_BREAD);
            return new Triplet<>(experienceCost, slotLeft.getCount(), toReturn);
        }

        if (slotLeft.is(ModItemsFabric.GOLDEN_COOKIE)) {
            final ItemStack toReturn = new ItemStack(ModItemsFabric.ENCHANTED_GOLDEN_COOKIE);
            return new Triplet<>(experienceCost, slotLeft.getCount(), toReturn);
        }

        if (slotLeft.is(ModItemsFabric.GOLDEN_PUMPKIN_PIE)) {
            final ItemStack toReturn = new ItemStack(ModItemsFabric.ENCHANTED_GOLDEN_PUMPKIN_PIE);
            return new Triplet<>(experienceCost, slotLeft.getCount(), toReturn);
        }

        if (slotLeft.is(ModBlocksFabric.GOLDEN_CAKE.asItem())) {
            final ItemStack toReturn = new ItemStack(ModBlocksFabric.ENCHANTED_GOLDEN_CAKE.asItem());
            return new Triplet<>(experienceCost, slotLeft.getCount(), toReturn);
        }

        if (slotLeft.is(ModItemsFabric.GOLDEN_CHORUS_FRUIT)) {
            final ItemStack toReturn = new ItemStack(ModItemsFabric.ENCHANTED_GOLDEN_CHORUS_FRUIT);
            return new Triplet<>(experienceCost, slotLeft.getCount(), toReturn);
        }

        if (slotLeft.is(ModItemsFabric.GOLDEN_MILK_BUCKET)) {
            final ItemStack toReturn = new ItemStack(ModItemsFabric.ENCHANTED_GOLDEN_MILK_BUCKET);
            return new Triplet<>(experienceCost, slotLeft.getCount(), toReturn);
        }

        if (slotLeft.is(ModItemsFabric.GOLDEN_HONEY_BOTTLE)) {
            final ItemStack toReturn = new ItemStack(ModItemsFabric.ENCHANTED_GOLDEN_HONEY_BOTTLE);
            return new Triplet<>(experienceCost, slotLeft.getCount(), toReturn);
        }

        if (slotLeft.is(ModItemsFabric.GOLDEN_MUSHROOM_STEW)) {
            final ItemStack toReturn = new ItemStack(ModItemsFabric.ENCHANTED_GOLDEN_MUSHROOM_STEW);
            return new Triplet<>(experienceCost, slotLeft.getCount(), toReturn);
        }

        if (slotLeft.is(ModItemsFabric.GOLDEN_BEETROOT_SOUP)) {
            final ItemStack toReturn = new ItemStack(ModItemsFabric.ENCHANTED_GOLDEN_BEETROOT_SOUP);
            return new Triplet<>(experienceCost, slotLeft.getCount(), toReturn);
        }

        if (slotLeft.is(ModItemsFabric.GOLDEN_RABBIT_STEW)) {
            final ItemStack toReturn = new ItemStack(ModItemsFabric.ENCHANTED_GOLDEN_RABBIT_STEW);
            return new Triplet<>(experienceCost, slotLeft.getCount(), toReturn);
        }

        if (slotLeft.is(ModItemsFabric.GOLDEN_COOKED_BEEF)) {
            final ItemStack toReturn = new ItemStack(ModItemsFabric.ENCHANTED_GOLDEN_COOKED_BEEF);
            return new Triplet<>(experienceCost, slotLeft.getCount(), toReturn);
        }

        if (slotLeft.is(ModItemsFabric.GOLDEN_COOKED_PORKCHOP)) {
            final ItemStack toReturn = new ItemStack(ModItemsFabric.ENCHANTED_GOLDEN_COOKED_PORKCHOP);
            return new Triplet<>(experienceCost, slotLeft.getCount(), toReturn);
        }

        if (slotLeft.is(ModItemsFabric.GOLDEN_COOKED_MUTTON)) {
            final ItemStack toReturn = new ItemStack(ModItemsFabric.ENCHANTED_GOLDEN_COOKED_MUTTON);
            return new Triplet<>(experienceCost, slotLeft.getCount(), toReturn);
        }

        if (slotLeft.is(ModItemsFabric.GOLDEN_COOKED_CHICKEN)) {
            final ItemStack toReturn = new ItemStack(ModItemsFabric.ENCHANTED_GOLDEN_COOKED_CHICKEN);
            return new Triplet<>(experienceCost, slotLeft.getCount(), toReturn);
        }

        if (slotLeft.is(ModItemsFabric.GOLDEN_COOKED_RABBIT)) {
            final ItemStack toReturn = new ItemStack(ModItemsFabric.ENCHANTED_GOLDEN_COOKED_RABBIT);
            return new Triplet<>(experienceCost, slotLeft.getCount(), toReturn);
        }

        if (slotLeft.is(ModItemsFabric.GOLDEN_COOKED_COD)) {
            final ItemStack toReturn = new ItemStack(ModItemsFabric.ENCHANTED_GOLDEN_COOKED_COD);
            return new Triplet<>(experienceCost, slotLeft.getCount(), toReturn);
        }

        if (slotLeft.is(ModItemsFabric.GOLDEN_COOKED_SALMON)) {
            final ItemStack toReturn = new ItemStack(ModItemsFabric.ENCHANTED_GOLDEN_COOKED_SALMON);
            return new Triplet<>(experienceCost, slotLeft.getCount(), toReturn);
        }

        return null;
    }
}
