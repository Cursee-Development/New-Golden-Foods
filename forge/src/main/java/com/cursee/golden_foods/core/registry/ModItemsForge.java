package com.cursee.golden_foods.core.registry;

import com.cursee.golden_foods.core.foods.ModFoods;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.RegistryObject;

public class ModItemsForge {

    public static void register() {}

    public static final RegistryObject<Item> ENCHANTED_GOLDEN_CARROT = RegistryForge.registerItem("enchanted_golden_carrot", () -> new Item(new Item.Properties().food(ModFoods.ENCHANTED_GOLDEN_CARROT).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true)));

    public static final RegistryObject<Item> GOLDEN_MELON_SLICE = RegistryForge.registerItem("golden_melon_slice", () -> new Item(new Item.Properties().food(ModFoods.GOLDEN_MELON_SLICE)));
    public static final RegistryObject<Item> ENCHANTED_GOLDEN_MELON_SLICE = RegistryForge.registerItem("enchanted_golden_melon_slice", () -> new Item(new Item.Properties().food(ModFoods.ENCHANTED_GOLDEN_MELON_SLICE).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true)));

    public static final RegistryObject<Item> GOLDEN_SWEET_BERRIES = RegistryForge.registerItem("golden_sweet_berries", () -> new Item(new Item.Properties().food(ModFoods.GOLDEN_SWEET_BERRIES)));
    public static final RegistryObject<Item> ENCHANTED_GOLDEN_SWEET_BERRIES = RegistryForge.registerItem("enchanted_golden_sweet_berries", () -> new Item(new Item.Properties().food(ModFoods.ENCHANTED_GOLDEN_SWEET_BERRIES).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true)));

    public static final RegistryObject<Item> GOLDEN_GLOW_BERRIES = RegistryForge.registerItem("golden_glow_berries", () -> new Item(new Item.Properties().food(ModFoods.GOLDEN_GLOW_BERRIES)));
    public static final RegistryObject<Item> ENCHANTED_GOLDEN_GLOW_BERRIES = RegistryForge.registerItem("enchanted_golden_glow_berries", () -> new Item(new Item.Properties().food(ModFoods.ENCHANTED_GOLDEN_GLOW_BERRIES).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true)));

    public static final RegistryObject<Item> GOLDEN_BAKED_POTATO = RegistryForge.registerItem("golden_baked_potato", () -> new Item(new Item.Properties().food(ModFoods.GOLDEN_BAKED_POTATO)));
    public static final RegistryObject<Item> ENCHANTED_GOLDEN_BAKED_POTATO = RegistryForge.registerItem("enchanted_golden_baked_potato", () -> new Item(new Item.Properties().food(ModFoods.ENCHANTED_GOLDEN_BAKED_POTATO).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true)));

    public static final RegistryObject<Item> GOLDEN_BEETROOT = RegistryForge.registerItem("golden_beetroot", () -> new Item(new Item.Properties().food(ModFoods.GOLDEN_BEETROOT)));
    public static final RegistryObject<Item> ENCHANTED_GOLDEN_BEETROOT = RegistryForge.registerItem("enchanted_golden_beetroot", () -> new Item(new Item.Properties().food(ModFoods.ENCHANTED_GOLDEN_BEETROOT).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true)));

    public static final RegistryObject<Item> GOLDEN_DRIED_KELP = RegistryForge.registerItem("golden_dried_kelp", () -> new Item(new Item.Properties().food(ModFoods.GOLDEN_DRIED_KELP)));
    public static final RegistryObject<Item> ENCHANTED_GOLDEN_DRIED_KELP = RegistryForge.registerItem("enchanted_golden_dried_kelp", () -> new Item(new Item.Properties().food(ModFoods.ENCHANTED_GOLDEN_DRIED_KELP).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true)));

    public static final RegistryObject<Item> GOLDEN_BREAD = RegistryForge.registerItem("golden_bread", () -> new Item(new Item.Properties().food(ModFoods.GOLDEN_BREAD)));
    public static final RegistryObject<Item> ENCHANTED_GOLDEN_BREAD = RegistryForge.registerItem("enchanted_golden_bread", () -> new Item(new Item.Properties().food(ModFoods.ENCHANTED_GOLDEN_BREAD).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true)));

    public static final RegistryObject<Item> GOLDEN_COOKIE = RegistryForge.registerItem("golden_cookie", () -> new Item(new Item.Properties().food(ModFoods.GOLDEN_COOKIE)));
    public static final RegistryObject<Item> ENCHANTED_GOLDEN_COOKIE = RegistryForge.registerItem("enchanted_golden_cookie", () -> new Item(new Item.Properties().food(ModFoods.ENCHANTED_GOLDEN_COOKIE).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true)));

    public static final RegistryObject<Item> GOLDEN_PUMPKIN_PIE = RegistryForge.registerItem("golden_pumpkin_pie", () -> new Item(new Item.Properties().food(ModFoods.GOLDEN_PUMPKIN_PIE)));
    public static final RegistryObject<Item> ENCHANTED_GOLDEN_PUMPKIN_PIE = RegistryForge.registerItem("enchanted_golden_pumpkin_pie", () -> new Item(new Item.Properties().food(ModFoods.ENCHANTED_GOLDEN_PUMPKIN_PIE).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true)));

    public static final RegistryObject<Item> GOLDEN_CHORUS_FRUIT = RegistryForge.registerItem("golden_chorus_fruit", () -> new ChorusFruitItem(new Item.Properties().food(ModFoods.GOLDEN_CHORUS_FRUIT)));
    public static final RegistryObject<Item> ENCHANTED_GOLDEN_CHORUS_FRUIT = RegistryForge.registerItem("enchanted_golden_chorus_fruit", () -> new ChorusFruitItem(new Item.Properties().food(ModFoods.ENCHANTED_GOLDEN_CHORUS_FRUIT).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true)));

    public static final RegistryObject<Item> GOLDEN_MILK_BUCKET = RegistryForge.registerItem("golden_milk_bucket", () -> new MilkBucketItem(new Item.Properties().food(ModFoods.GOLDEN_MILK_BUCKET)));
    public static final RegistryObject<Item> ENCHANTED_GOLDEN_MILK_BUCKET = RegistryForge.registerItem("enchanted_golden_milk_bucket", () -> new MilkBucketItem(new Item.Properties().food(ModFoods.ENCHANTED_GOLDEN_MILK_BUCKET).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true)));

    public static final RegistryObject<Item> GOLDEN_HONEY_BOTTLE = RegistryForge.registerItem("golden_honey_bottle", () -> new HoneyBottleItem(new Item.Properties().food(ModFoods.GOLDEN_HONEY_BOTTLE)));
    public static final RegistryObject<Item> ENCHANTED_GOLDEN_HONEY_BOTTLE = RegistryForge.registerItem("enchanted_golden_honey_bottle", () -> new HoneyBottleItem(new Item.Properties().food(ModFoods.ENCHANTED_GOLDEN_HONEY_BOTTLE).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true)));

    public static final RegistryObject<Item> GOLDEN_MUSHROOM_STEW = RegistryForge.registerItem("golden_mushroom_stew", () -> new Item(new Item.Properties().food(ModFoods.GOLDEN_MUSHROOM_STEW)));
    public static final RegistryObject<Item> ENCHANTED_GOLDEN_MUSHROOM_STEW = RegistryForge.registerItem("enchanted_golden_mushroom_stew", () -> new Item(new Item.Properties().food(ModFoods.ENCHANTED_GOLDEN_MUSHROOM_STEW).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true)));
    public static final RegistryObject<Item> GOLDEN_BEETROOT_SOUP = RegistryForge.registerItem("golden_beetroot_soup", () -> new Item(new Item.Properties().food(ModFoods.GOLDEN_BEETROOT_SOUP)));
    public static final RegistryObject<Item> ENCHANTED_GOLDEN_BEETROOT_SOUP = RegistryForge.registerItem("enchanted_golden_beetroot_soup", () -> new Item(new Item.Properties().food(ModFoods.ENCHANTED_GOLDEN_BEETROOT_SOUP).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true)));
    public static final RegistryObject<Item> GOLDEN_RABBIT_STEW = RegistryForge.registerItem("golden_rabbit_stew", () -> new Item(new Item.Properties().food(ModFoods.GOLDEN_RABBIT_STEW)));
    public static final RegistryObject<Item> ENCHANTED_GOLDEN_RABBIT_STEW = RegistryForge.registerItem("enchanted_golden_rabbit_stew", () -> new Item(new Item.Properties().food(ModFoods.ENCHANTED_GOLDEN_RABBIT_STEW).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true)));

    public static final RegistryObject<Item> GOLDEN_COOKED_BEEF = RegistryForge.registerItem("golden_cooked_beef", () -> new Item(new Item.Properties().food(ModFoods.GOLDEN_COOKED_BEEF)));
    public static final RegistryObject<Item> ENCHANTED_GOLDEN_COOKED_BEEF = RegistryForge.registerItem("enchanted_golden_cooked_beef", () -> new Item(new Item.Properties().food(ModFoods.ENCHANTED_GOLDEN_COOKED_BEEF).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true)));
    public static final RegistryObject<Item> GOLDEN_COOKED_PORKCHOP = RegistryForge.registerItem("golden_cooked_porkchop", () -> new Item(new Item.Properties().food(ModFoods.GOLDEN_COOKED_PORKCHOP)));
    public static final RegistryObject<Item> ENCHANTED_GOLDEN_COOKED_PORKCHOP = RegistryForge.registerItem("enchanted_golden_cooked_porkchop", () -> new Item(new Item.Properties().food(ModFoods.ENCHANTED_GOLDEN_COOKED_PORKCHOP).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true)));
    public static final RegistryObject<Item> GOLDEN_COOKED_MUTTON = RegistryForge.registerItem("golden_cooked_mutton", () -> new Item(new Item.Properties().food(ModFoods.GOLDEN_COOKED_MUTTON)));
    public static final RegistryObject<Item> ENCHANTED_GOLDEN_COOKED_MUTTON = RegistryForge.registerItem("enchanted_golden_cooked_mutton", () -> new Item(new Item.Properties().food(ModFoods.ENCHANTED_GOLDEN_COOKED_MUTTON).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true)));
    public static final RegistryObject<Item> GOLDEN_COOKED_CHICKEN = RegistryForge.registerItem("golden_cooked_chicken", () -> new Item(new Item.Properties().food(ModFoods.GOLDEN_COOKED_CHICKEN)));
    public static final RegistryObject<Item> ENCHANTED_GOLDEN_COOKED_CHICKEN = RegistryForge.registerItem("enchanted_golden_cooked_chicken", () -> new Item(new Item.Properties().food(ModFoods.ENCHANTED_GOLDEN_COOKED_CHICKEN).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true)));
    public static final RegistryObject<Item> GOLDEN_COOKED_RABBIT = RegistryForge.registerItem("golden_cooked_rabbit", () -> new Item(new Item.Properties().food(ModFoods.GOLDEN_COOKED_RABBIT)));
    public static final RegistryObject<Item> ENCHANTED_GOLDEN_COOKED_RABBIT = RegistryForge.registerItem("enchanted_golden_cooked_rabbit", () -> new Item(new Item.Properties().food(ModFoods.ENCHANTED_GOLDEN_COOKED_RABBIT).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true)));
    public static final RegistryObject<Item> GOLDEN_COOKED_COD = RegistryForge.registerItem("golden_cooked_cod", () -> new Item(new Item.Properties().food(ModFoods.GOLDEN_COOKED_COD)));
    public static final RegistryObject<Item> ENCHANTED_GOLDEN_COOKED_COD = RegistryForge.registerItem("enchanted_golden_cooked_cod", () -> new Item(new Item.Properties().food(ModFoods.ENCHANTED_GOLDEN_COOKED_COD).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true)));
    public static final RegistryObject<Item> GOLDEN_COOKED_SALMON = RegistryForge.registerItem("golden_cooked_salmon", () -> new Item(new Item.Properties().food(ModFoods.GOLDEN_COOKED_SALMON)));
    public static final RegistryObject<Item> ENCHANTED_GOLDEN_COOKED_SALMON = RegistryForge.registerItem("enchanted_golden_cooked_salmon", () -> new Item(new Item.Properties().food(ModFoods.ENCHANTED_GOLDEN_COOKED_SALMON).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true)));
}
