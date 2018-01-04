package com.ardium.pvp.items;

import com.ardium.pvp.Ardium;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

class itemBerryXP extends Item {
    itemBerryXP() {
        setMaxStackSize (64);
        setUnlocalizedName ("xpberry");
        setCreativeTab (Ardium.ARDIUM_CREATIVE_TAB);
        setTextureName (Ardium.MOD_ID + ":" + getUnlocalizedName ().substring (5));
    }

    @Override
    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
        stack.stackSize -= 1;
        player.addExperience (20);
        return stack;
    }
}