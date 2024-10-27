package com.cursee.golden_foods.core.registry;

import com.cursee.golden_foods.core.block.custom.EnchantedGoldenCakeBlock;
import com.cursee.golden_foods.core.block.custom.GoldenCakeBlock;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocksForge {

    public static void register() {}

    public static final RegistryObject<Block> GOLDEN_CAKE = RegistryForge.registerBlockWithItem("golden_cake", GoldenCakeBlock::new);
    public static final RegistryObject<Block> ENCHANTED_GOLDEN_CAKE = RegistryForge.registerBlockWithItem("enchanted_golden_cake", EnchantedGoldenCakeBlock::new);
}
