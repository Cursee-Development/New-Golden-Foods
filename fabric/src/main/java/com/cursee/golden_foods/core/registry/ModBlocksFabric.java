package com.cursee.golden_foods.core.registry;

import com.cursee.golden_foods.core.block.custom.EnchantedGoldenCakeBlock;
import com.cursee.golden_foods.core.block.custom.GoldenCakeBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CakeBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class ModBlocksFabric {

    public static void register() {}

    public static final Block GOLDEN_CAKE = RegistryFabric.registerBlockWithItem("golden_cake", GoldenCakeBlock::new);
    public static final Block ENCHANTED_GOLDEN_CAKE = RegistryFabric.registerBlockWithItem("enchanted_golden_cake", EnchantedGoldenCakeBlock::new);
}
