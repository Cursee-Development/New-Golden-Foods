package com.cursee.golden_foods.mixin;

import com.cursee.golden_foods.core.registry.ModEnchantmentsFabric;
import com.cursee.golden_foods.core.registry.ModItemsFabric;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.FishingHook;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import javax.annotation.Nullable;

@Mixin(FishingHook.class)
public abstract class FabricFishingHookMixin {

    @Shadow @Nullable public abstract Player getPlayerOwner();

    @Redirect(method = "retrieve", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/Level;addFreshEntity(Lnet/minecraft/world/entity/Entity;)Z", ordinal = 0))
    private boolean redirected$retrieveAddFreshEntity0(Level instance, Entity entity) {

        if (getPlayerOwner() == null || !(entity instanceof ItemEntity itemEntity) || instance.random.nextFloat() > 0.05f) return instance.addFreshEntity(entity);

        Player player = getPlayerOwner();
        boolean hasEnchantment = EnchantmentHelper.getEnchantmentLevel(ModEnchantmentsFabric.GOLDEN_FOODS, player) > 0;

        if (!hasEnchantment) return instance.addFreshEntity(entity);

        if (itemEntity.getItem().is(Items.COD)) {
            return instance.addFreshEntity(new ItemEntity(instance, player.getX(), player.getY(), player.getZ(), new ItemStack(ModItemsFabric.ENCHANTED_GOLDEN_COOKED_COD)));
        }
        else if (itemEntity.getItem().is(Items.SALMON)) {
            return instance.addFreshEntity(new ItemEntity(instance, player.getX(), player.getY(), player.getZ(), new ItemStack(ModItemsFabric.ENCHANTED_GOLDEN_COOKED_SALMON)));
        }

        return instance.addFreshEntity(entity);
    }
}
