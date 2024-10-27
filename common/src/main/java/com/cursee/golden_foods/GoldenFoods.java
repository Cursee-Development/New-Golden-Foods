package com.cursee.golden_foods;

import net.minecraft.resources.ResourceLocation;

public class GoldenFoods {

    public static void init() {}

    public static class Identifier extends ResourceLocation {

        public Identifier(String location) {
            super(Constants.MOD_ID, location);
        }
    }
}