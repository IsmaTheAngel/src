package com.ardium.pvp.items;

import com.ardium.pvp.Ardium;
import com.ardium.pvp.blocks.RegistryBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemDoor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

class ItemDoorDarkOak extends ItemDoor {
    ItemDoorDarkOak() {
        super (Material.wood);
        setUnlocalizedName ("dark_oak_door");
        setTextureName (Ardium.MOD_ID + ":" + getUnlocalizedName ().substring (5));
        setMaxStackSize (1);
    }

    public static void placeDoorBlock(World world, int x, int y, int z, int p_150924_4_, Block block) {
        byte b0 = 0;
        byte b1 = 0;

        switch (p_150924_4_) {
            case 0:
                b1 = 1;
                break;
            case 1:
                b0 = -1;
                break;
            case 2:
                b1 = -1;
                break;
            case 3:
                b0 = 1;
                break;
        }

        int i1 = (world.getBlock (x - b0, y, z - b1).isNormalCube () ? 1 : 0) + (world.getBlock (x - b0, y + 1, z - b1).isNormalCube () ? 1 : 0);
        int j1 = (world.getBlock (x + b0, y, z + b1).isNormalCube () ? 1 : 0) + (world.getBlock (x + b0, y + 1, z + b1).isNormalCube () ? 1 : 0);
        boolean flag = world.getBlock (x - b0, y, z - b1) == block || world.getBlock (x - b0, y + 1, z - b1) == block;
        boolean flag1 = world.getBlock (x + b0, y, z + b1) == block || world.getBlock (x + b0, y + 1, z + b1) == block;
        boolean flag2 = false;

        if ( flag && !flag1 ) {
            flag2 = true;
        } else if ( j1 > i1 ) {
            flag2 = true;
        }

        world.setBlock (x, y, z, block, p_150924_4_, 2);
        world.setBlock (x, y + 1, z, block, 8 | (flag2 ? 1 : 0), 2);
        world.notifyBlocksOfNeighborChange (x, y, z, block);
        world.notifyBlocksOfNeighborChange (x, y + 1, z, block);
    }

    /**
     * Callback for item usage. If the item does something special on right clicking, he will have one of those. Return
     * True if something happen and false if it don't. This is for ITEMS, not BLOCKS
     */
    @Override
    public boolean onItemUse(ItemStack itemStack, EntityPlayer entityPlayer, World world, int p_77648_4_, int p_77648_5_, int p_77648_6_, int p_77648_7_, float hitX, float hitY, float hitZ) {
        if ( p_77648_7_ != 1 ) {
            return false;
        } else {
            ++p_77648_5_;
            Block block = RegistryBlocks.block_dark_oak_door;
            if ( entityPlayer.canPlayerEdit (p_77648_4_, p_77648_5_, p_77648_6_, p_77648_7_, itemStack) && entityPlayer.canPlayerEdit (p_77648_4_, p_77648_5_ + 1, p_77648_6_, p_77648_7_, itemStack) ) {
                if ( !block.canPlaceBlockAt (world, p_77648_4_, p_77648_5_, p_77648_6_) ) {
                    return false;
                } else {
                    int i1 = MathHelper.floor_double ((double) ((entityPlayer.rotationYaw + 180.0F) * 4.0F / 360.0F) - 0.5D) & 3;
                    placeDoorBlock (world, p_77648_4_, p_77648_5_, p_77648_6_, i1, block);
                    --itemStack.stackSize;
                    return true;
                }
            } else {
                return false;
            }
        }
    }
}