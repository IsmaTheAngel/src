package com.ardium.pvp.items;

import com.ardium.pvp.Ardium;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

class ItemAdminTool extends Item {
    ItemAdminTool()
	  {
	    setUnlocalizedName("admintool");
          setCreativeTab (Ardium.ARDIUM_CREATIVE_TAB);
          setTextureName (Ardium.MOD_ID + ":" + getUnlocalizedName ().substring (5));
          setMaxStackSize (1);
	  }
	  
	  public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ)
	  {
	    if (!world.isRemote)
	    {
            TileEntity tileEntity = world.getTileEntity (x, y, z);
            if ( tileEntity == null ) {
	        return false;
	      }
            if ( ((tileEntity instanceof IInventory)) && (tileEntity.getClass ().toString ().contains ("Chest")) )
	        
	      {
	        player.openGui(Ardium.instance, 50, world, x, y, z);
	        return true;
	      }
	    }
	    return true;
	  }
	}
