package com.ardium.pvp.items;


import com.ardium.pvp.Ardium;
import com.ardium.pvp.blocks.RegistryBlocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

class ItemLantern extends Item {

    ItemLantern() {
        setUnlocalizedName ("itemLantern");
        setTextureName (Ardium.MOD_ID + ":" + getUnlocalizedName ().substring (5));
        setCreativeTab (Ardium.ARDIUM_CREATIVE_TAB);
        setMaxStackSize (1);
        setMaxDamage (32);
    }

    @Override
    public void onUpdate(ItemStack itemStack, World world, Entity entity, int slot, boolean par5) {
        if ( (entity instanceof EntityPlayer) ) {
            EntityPlayer p = (EntityPlayer) entity;
            ItemStack blah = new ItemStack (RegistryItems.itemLantern, 1);
            if ( (slot >= 0) && (itemStack.equals (blah)) ) {
                p.inventory.mainInventory[slot] = new ItemStack (RegistryItems.itemLantern, 1);
            }
        }
    }

    @Override
    public boolean onItemUse(ItemStack itemStack, EntityPlayer entityPlayer, World world, int x, int y, int z, int par7, float hitX, float hitY, float hitZ) {
        if ( !world.getBlock (x, y, z).equals (Blocks.snow) ) {

            switch (par7) {
                case 0:
                    y--;
                    break;
                case 1:
                    y++;
                    break;
                case 2:
                    z--;
                    break;
                case 3:
                    z++;
                    break;
                case 4:
                    x--;
                    break;
                case 5:
                    x++;
                    break;
            }

            if ( world.getBlock (x, y, z) != Blocks.air ) {
                return false;
            }
        }
        if ( !entityPlayer.canPlayerEdit (x, y, z, par7, itemStack) ) {
            return false;
        }
        if ( RegistryBlocks.lanternPhys.canPlaceBlockAt (world, x, y, z) ) {
            itemStack.stackSize -= 1;
            world.setBlock (x, y, z, RegistryBlocks.lanternPhys);
            return true;
        }
        return false;
    }
}
