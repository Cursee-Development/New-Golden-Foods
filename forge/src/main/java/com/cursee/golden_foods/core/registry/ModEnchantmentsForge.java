package com.cursee.golden_foods.core.registry;

import com.cursee.golden_foods.core.enchantment.GoldenFoodsEnchantment;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraftforge.registries.RegistryObject;

public class ModEnchantmentsForge {

    public static void register() {}

    public static final RegistryObject<Enchantment> GOLDEN_FOODS = RegistryForge.registerEnchantment("golden_foods", GoldenFoodsEnchantment::new);
}
