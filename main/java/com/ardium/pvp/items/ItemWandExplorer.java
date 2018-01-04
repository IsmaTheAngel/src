package com.ardium.pvp.items;

import com.ardium.pvp.Ardium;
import com.ardium.pvp.render.Radar;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderWorldLastEvent;

public class ItemWandExplorer extends Item {
    public ItemWandExplorer() {
        setUnlocalizedName ("wand_explorer");
        setCreativeTab (Ardium.ARDIUM_CREATIVE_TAB);
        setTextureName (Ardium.MOD_ID + ":wand_explorer");
        setMaxStackSize (1);
        setMaxDamage (50);

    }

    @SubscribeEvent
    public void onWorldRender(RenderWorldLastEvent renderWorldLastEvent) {
        if ( (Minecraft.getMinecraft ().thePlayer.getHeldItem () != null) &&
                ((Minecraft.getMinecraft ().thePlayer.getHeldItem ().getItem () instanceof ItemWandExplorer)) &&
                (Minecraft.getMinecraft ().theWorld.isRemote) &&
                (Minecraft.getMinecraft ().theWorld != null) ) {
            for (int i = 0; i < Minecraft.getMinecraft ().theWorld.loadedTileEntityList.size (); i++) {
                if ( (Minecraft.getMinecraft ().theWorld.loadedTileEntityList.get (i) instanceof TileEntity)
                        && (Minecraft.getMinecraft ().theWorld.loadedTileEntityList.get (i) instanceof IInventory) ) {

                    TileEntity tileEntity = (TileEntity) Minecraft.getMinecraft ().theWorld.loadedTileEntityList.get (i);
                    Radar.drawChestESP (tileEntity.xCoord - Minecraft.getMinecraft ().thePlayer.lastTickPosX, tileEntity.yCoord -
                            Minecraft.getMinecraft ().thePlayer.lastTickPosY, tileEntity.zCoord -
                            Minecraft.getMinecraft ().thePlayer.lastTickPosZ);
                }
            }
        }
    }

    public void onUpdate(ItemStack stack, World world, Entity entity, int slotIndex, boolean isInHand) {
        super.onUpdate (stack, world, entity, slotIndex, isInHand);
        if ( (isInHand) &&
                (world.getTotalWorldTime () % 20L == 0L) ) {
            if ( stack.getItemDamageForDisplay () < stack.getMaxDamage () ) {
                if ( !world.isRemote ) {
                    stack.damageItem (1, (EntityPlayer) entity);
                }
            } else {
                ((EntityPlayer) entity).destroyCurrentEquippedItem ();
            }
        }
    }
}