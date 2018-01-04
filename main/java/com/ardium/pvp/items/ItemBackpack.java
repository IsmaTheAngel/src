package com.ardium.pvp.items;

import com.ardium.pvp.Ardium;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class ItemBackpack extends Item {
    private static final String NAME = "backpack";

    ItemBackpack() {
        setUnlocalizedName (Ardium.MOD_ID + "_" + NAME);
        setTextureName (Ardium.MOD_ID + ":" + NAME);
        setCreativeTab (Ardium.ARDIUM_CREATIVE_TAB);
        setTextureName (Ardium.MOD_ID + ":backpack");
        maxStackSize = 1;

    }


    /**
     * Used to open the gui
     */
    @Override
    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player) {
        if ( !world.isRemote ) {
            player.openGui (Ardium.instance, 1, world, 0, 0, 0);
            NBTTagCompound nbt = player.getHeldItem ().getTagCompound ();
            nbt.setBoolean ("Open", true);
        }
        return itemStack;
    }

    @Override
    public void onUpdate(ItemStack stack, World world, Entity entity, int i, boolean bool) {
        if ( (stack.hasTagCompound ()) && (stack.getTagCompound ().hasKey ("Open")) &&
                (!bool) ) {
            stack.getTagCompound ().setBoolean ("Open", false);
        }
        super.onUpdate (stack, world, entity, i, bool);
    }
}

