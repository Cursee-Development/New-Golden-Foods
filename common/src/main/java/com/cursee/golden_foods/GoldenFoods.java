package com.cursee.golden_foods;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.enchantment.Enchantment;

public class GoldenFoods {

    public static final ResourceKey<Enchantment> GOLDEN_FOODS = ResourceKey.create(Registries.ENCHANTMENT, GoldenFoods.Identifier.of("golden_foods"));

    public static void init() {}

    public static class Identifier {

        public static ResourceLocation of(String location) {
            return ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, location);
        }
    }
}