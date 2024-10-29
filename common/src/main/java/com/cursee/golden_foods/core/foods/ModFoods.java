package com.cursee.golden_foods.core.foods;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Items;

/**
 * Holds the values for all new golden food items. Nutrition is the same value as the vanilla food, but the saturation
 * modifier is multiplied by 4 from the original value. This could probably be done in the creation methods instead,
 * to match the vanilla value.
 *
 * @see net.minecraft.world.food.Foods
 */
public class ModFoods {

    private static FoodProperties.Builder goldenFoodProperties(int nutrition, float saturationModifier) {
        return new FoodProperties.Builder().nutrition(nutrition).saturationModifier(saturationModifier)
                .effect(new MobEffectInstance(MobEffects.REGENERATION, 100, 1), 1.0F)
                .effect(new MobEffectInstance(MobEffects.ABSORPTION, 2400, 0), 1.0F).alwaysEdible();
    }

    private static FoodProperties.Builder enchantedGoldenFoodProperties(int nutrition, float saturationModifier) {
        return new FoodProperties.Builder().nutrition(nutrition).saturationModifier(saturationModifier)
                .effect(new MobEffectInstance(MobEffects.REGENERATION, 400, 1), 1.0F)
                .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 6000, 0), 1.0F)
                .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 6000, 0), 1.0F)
                .effect(new MobEffectInstance(MobEffects.ABSORPTION, 2400, 3), 1.0F).alwaysEdible();
    }

    public static final FoodProperties ENCHANTED_GOLDEN_CARROT = enchantedGoldenFoodProperties(3, 2.4f).build();

    public static final FoodProperties GOLDEN_MELON_SLICE = goldenFoodProperties(2, 1.2f).build();
    public static final FoodProperties ENCHANTED_GOLDEN_MELON_SLICE = enchantedGoldenFoodProperties(2, 1.2f).build();

    public static final FoodProperties GOLDEN_SWEET_BERRIES = goldenFoodProperties(2, 0.4f).build();
    public static final FoodProperties ENCHANTED_GOLDEN_SWEET_BERRIES = enchantedGoldenFoodProperties(2, 0.4f).build();

    public static final FoodProperties GOLDEN_GLOW_BERRIES = goldenFoodProperties(2, 0.4f).build();
    public static final FoodProperties ENCHANTED_GOLDEN_GLOW_BERRIES = enchantedGoldenFoodProperties(2, 0.4f).build();

    public static final FoodProperties GOLDEN_BAKED_POTATO = goldenFoodProperties(5, 2.4f).build();
    public static final FoodProperties ENCHANTED_GOLDEN_BAKED_POTATO = enchantedGoldenFoodProperties(5, 2.4f).build();

    public static final FoodProperties GOLDEN_BEETROOT = goldenFoodProperties(1, 2.4f).build();
    public static final FoodProperties ENCHANTED_GOLDEN_BEETROOT = enchantedGoldenFoodProperties(1, 2.4f).build();

    public static final FoodProperties GOLDEN_DRIED_KELP = goldenFoodProperties(1, 1.2f).build();
    public static final FoodProperties ENCHANTED_GOLDEN_DRIED_KELP = enchantedGoldenFoodProperties(1, 1.2f).build();

    public static final FoodProperties GOLDEN_BREAD = goldenFoodProperties(5, 2.4f).build();
    public static final FoodProperties ENCHANTED_GOLDEN_BREAD = enchantedGoldenFoodProperties(5, 2.4f).build();

    public static final FoodProperties GOLDEN_COOKIE = goldenFoodProperties(2, 0.4f).build();
    public static final FoodProperties ENCHANTED_GOLDEN_COOKIE = enchantedGoldenFoodProperties(2, 0.4f).build();
    public static final FoodProperties GOLDEN_PUMPKIN_PIE = goldenFoodProperties(8, 1.2f).build();
    public static final FoodProperties ENCHANTED_GOLDEN_PUMPKIN_PIE = enchantedGoldenFoodProperties(8, 1.2f).build();
    public static final FoodProperties GOLDEN_CHORUS_FRUIT = goldenFoodProperties(4, 1.2f).build();
    public static final FoodProperties ENCHANTED_GOLDEN_CHORUS_FRUIT = enchantedGoldenFoodProperties(4, 1.2f).build();

    public static final FoodProperties GOLDEN_MILK_BUCKET = goldenFoodProperties(4, 1.2f).build();
    public static final FoodProperties ENCHANTED_GOLDEN_MILK_BUCKET = enchantedGoldenFoodProperties(4, 1.2f).build();

    public static final FoodProperties GOLDEN_HONEY_BOTTLE = goldenFoodProperties(6, 0.4f).build();
    public static final FoodProperties ENCHANTED_GOLDEN_HONEY_BOTTLE = enchantedGoldenFoodProperties(6, 0.4f).build();

    public static final FoodProperties GOLDEN_MUSHROOM_STEW = goldenFoodProperties(6, 2.4f).usingConvertsTo(Items.BOWL).build();
    public static final FoodProperties ENCHANTED_GOLDEN_MUSHROOM_STEW = enchantedGoldenFoodProperties(6, 2.4f).usingConvertsTo(Items.BOWL).build();
    public static final FoodProperties GOLDEN_BEETROOT_SOUP = goldenFoodProperties(6, 2.4f).usingConvertsTo(Items.BOWL).build();
    public static final FoodProperties ENCHANTED_GOLDEN_BEETROOT_SOUP = enchantedGoldenFoodProperties(6, 2.4f).usingConvertsTo(Items.BOWL).build();
    public static final FoodProperties GOLDEN_RABBIT_STEW = goldenFoodProperties(10, 2.4f).usingConvertsTo(Items.BOWL).build();
    public static final FoodProperties ENCHANTED_GOLDEN_RABBIT_STEW = enchantedGoldenFoodProperties(10, 2.4f).usingConvertsTo(Items.BOWL).build();

    public static final FoodProperties GOLDEN_COOKED_BEEF = goldenFoodProperties(8, 3.2f).build();
    public static final FoodProperties ENCHANTED_GOLDEN_COOKED_BEEF = enchantedGoldenFoodProperties(8, 3.2f).build();
    public static final FoodProperties GOLDEN_COOKED_PORKCHOP = goldenFoodProperties(8, 3.2f).build();
    public static final FoodProperties ENCHANTED_GOLDEN_COOKED_PORKCHOP = enchantedGoldenFoodProperties(8, 3.2f).build();
    public static final FoodProperties GOLDEN_COOKED_MUTTON = goldenFoodProperties(6, 3.2f).build();
    public static final FoodProperties ENCHANTED_GOLDEN_COOKED_MUTTON = enchantedGoldenFoodProperties(6, 3.2f).build();
    public static final FoodProperties GOLDEN_COOKED_CHICKEN = goldenFoodProperties(6, 2.4f).build();
    public static final FoodProperties ENCHANTED_GOLDEN_COOKED_CHICKEN = enchantedGoldenFoodProperties(6, 2.4f).build();
    public static final FoodProperties GOLDEN_COOKED_RABBIT = goldenFoodProperties(5, 2.4f).build();
    public static final FoodProperties ENCHANTED_GOLDEN_COOKED_RABBIT = enchantedGoldenFoodProperties(5, 2.4f).build();
    public static final FoodProperties GOLDEN_COOKED_COD = goldenFoodProperties(5, 2.4f).build();
    public static final FoodProperties ENCHANTED_GOLDEN_COOKED_COD = enchantedGoldenFoodProperties(5, 2.4f).build();
    public static final FoodProperties GOLDEN_COOKED_SALMON = goldenFoodProperties(6, 3.2f).build();
    public static final FoodProperties ENCHANTED_GOLDEN_COOKED_SALMON = enchantedGoldenFoodProperties(6, 3.2f).build();
}
