package com.cursee.golden_foods.core.registry;

import com.cursee.golden_foods.core.enchantment.GoldenFoodsEnchantment;
import net.minecraft.world.item.enchantment.Enchantment;

public class ModEnchantmentsFabric {

    public static void register() {}

    public static final Enchantment GOLDEN_FOODS = RegistryFabric.registerEnchantment("golden_foods", GoldenFoodsEnchantment::new);
}
