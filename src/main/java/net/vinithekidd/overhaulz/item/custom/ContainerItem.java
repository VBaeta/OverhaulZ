package net.vinithekidd.overhaulz.item.custom;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class ContainerItem extends Item {
    private final Item emptyBox;
    private final Item storedItem;
    private final int storedAmount;

    public ContainerItem(Item.Settings settings, Item emptyBox, Item storedItem, int storedAmount) {
        super(settings);
        this.emptyBox = emptyBox;
        this.storedItem = storedItem;
        this.storedAmount = storedAmount;
    }

    @Override
    public ActionResult use(World world, PlayerEntity player, Hand hand) {
        ItemStack stackInHand = player.getStackInHand(hand);

        if (!world.isClient) {

            boolean addedToInventory = player.getInventory().insertStack(new ItemStack(storedItem, storedAmount));

            if (addedToInventory) {
                world.playSound(null, player.getBlockPos(),
                        SoundEvents.BLOCK_CHAIN_STEP, SoundCategory.PLAYERS, 1.0f, 1.0f);

                player.setStackInHand(hand, new ItemStack(emptyBox));

                return ActionResult.SUCCESS;
            } else {
                player.sendMessage(Text.literal("Sem espaço no inventário!").formatted(net.minecraft.util.Formatting.RED), true);
                return ActionResult.CONSUME;
            }
        }

        return ActionResult.PASS;
    }
}
