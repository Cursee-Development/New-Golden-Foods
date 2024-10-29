package com.cursee.golden_foods;

import com.cursee.golden_foods.core.registry.RegistryNeoForge;
import com.cursee.monolib.core.sailing.Sailing;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class GoldenFoodsNeoForge {
    
    public GoldenFoodsNeoForge(IEventBus modEventBus) {
        GoldenFoods.init();
        Sailing.register(Constants.MOD_NAME, Constants.MOD_ID, Constants.MOD_VERSION, Constants.MC_VERSION_RAW, Constants.PUBLISHER_AUTHOR, Constants.PRIMARY_CURSEFORGE_MODRINTH);
        RegistryNeoForge.register(modEventBus);
    }
}