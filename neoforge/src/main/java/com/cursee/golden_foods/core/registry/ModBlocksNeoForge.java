package com.cursee.golden_foods.core.registry;

import com.cursee.golden_foods.core.block.custom.EnchantedGoldenCakeBlock;
import com.cursee.golden_foods.core.block.custom.GoldenCakeBlock;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredHolder;

public class ModBlocksNeoForge {

    public static void register() {}

    public static final DeferredHolder<Block, Block> GOLDEN_CAKE = RegistryNeoForge.registerBlockWithItem("golden_cake", GoldenCakeBlock::new);
    public static final DeferredHolder<Block, Block> ENCHANTED_GOLDEN_CAKE = RegistryNeoForge.registerBlockWithItem("enchanted_golden_cake", EnchantedGoldenCakeBlock::new);
}
