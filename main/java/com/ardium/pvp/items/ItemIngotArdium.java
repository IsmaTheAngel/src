package com.ardium.pvp.items;

import com.ardium.pvp.Ardium;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

class ItemIngotArdium extends Item {
    ItemIngotArdium() {
        setUnlocalizedName ("ardium_ingot");
        setCreativeTab (Ardium.ARDIUM_CREATIVE_TAB);
        setTextureName (Ardium.MOD_ID + ":" + getUnlocalizedName ().substring (5));
    }

    @Override
    public boolean isBeaconPayment(ItemStack itemStack) {
        return itemStack.getItem () instanceof ItemIngotArdium;
    }

    @Override
    public void addInformation(ItemStack itemStack, EntityPlayer entityPlayer, List list, boolean isShowned) {
        //Add a description to the ardium ingot
        //list.add ("");
    }
}
