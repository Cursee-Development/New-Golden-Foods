package com.cursee.golden_foods.core.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.NotNull;

public class GoldenCakeBlock extends CakeBlock {

    public GoldenCakeBlock() {
        super(Properties.copy(Blocks.CAKE));
    }

    @Override
    public @NotNull InteractionResult use(@NotNull BlockState blockState, @NotNull Level level, @NotNull BlockPos blockPos, @NotNull Player player, @NotNull InteractionHand interactionhand, @NotNull BlockHitResult blockHitResult) {

        ItemStack itemStack = player.getItemInHand(interactionhand);
        Item item = itemStack.getItem();

        if (itemStack.is(ItemTags.CANDLES) && blockState.getValue(BITES) == 0) {

            Block block = Block.byItem(item);

            if (block instanceof CandleBlock) {

                if (!player.isCreative()) {
                    itemStack.shrink(1);
                }

                level.playSound((Player)null, blockPos, SoundEvents.CAKE_ADD_CANDLE, SoundSource.BLOCKS, 1.0F, 1.0F);
                level.setBlockAndUpdate(blockPos, CandleCakeBlock.byCandle(block));
                level.gameEvent(player, GameEvent.BLOCK_CHANGE, blockPos);
                player.awardStat(Stats.ITEM_USED.get(item));

                return InteractionResult.SUCCESS;
            }
        }

        if (level.isClientSide) {

            if (eat(level, blockPos, blockState, player).consumesAction()) {
                return InteractionResult.SUCCESS;
            }

            if (itemStack.isEmpty()) {
                return InteractionResult.CONSUME;
            }
        }

        return eat(level, blockPos, blockState, player);
    }

    protected static @NotNull InteractionResult eat(LevelAccessor levelAccessor, @NotNull BlockPos blockPos, BlockState blockState, Player player) {

        player.awardStat(Stats.EAT_CAKE_SLICE);

        player.getFoodData().eat(4, 1.2f);
        player.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 100, 1));
        player.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 2400, 1));

        int currentBites = blockState.getValue(BITES);

        levelAccessor.gameEvent(player, GameEvent.EAT, blockPos);

        if (currentBites < 6) {
            levelAccessor.setBlock(blockPos, blockState.setValue(BITES, Integer.valueOf(currentBites + 1)), 3);
        }
        else {
            levelAccessor.removeBlock(blockPos, false);
            levelAccessor.gameEvent(player, GameEvent.BLOCK_DESTROY, blockPos);
        }

        return InteractionResult.SUCCESS;
    }
}
