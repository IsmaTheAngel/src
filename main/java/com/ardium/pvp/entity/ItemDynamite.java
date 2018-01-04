package com.ardium.pvp.entity;

import com.ardium.pvp.Ardium;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemDynamite extends Item {
    public ItemDynamite() {
        setUnlocalizedName ("dynamite");
        setTextureName (Ardium.MOD_ID + ":" + getUnlocalizedName ().substring (5));
        setCreativeTab (Ardium.ARDIUM_CREATIVE_TAB);
    }

    @Override
    public int getItemEnchantability() {
        return 0;
    }

    @Override
    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
        if ( entityPlayer.inventory.consumeInventoryItem (this) ) {
            world.playSoundAtEntity (entityPlayer, "game.tnt.primed", 1.0F, 1.0F / (itemRand.nextFloat () * 0.4F + 0.8F));
            if ( !world.isRemote ) {
                world.spawnEntityInWorld (new EntityDynamite (world, entityPlayer, 40 + itemRand.nextInt (10)));
            }
        }
        return itemStack;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean shouldRotateAroundWhenRendering() {
        return true;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean isFull3D() {
        return true;
    }
}
	