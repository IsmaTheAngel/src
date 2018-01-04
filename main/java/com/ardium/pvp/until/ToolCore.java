package com.ardium.pvp.until;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import java.util.Random;

class ToolCore extends Item {
    public static IIcon blankSprite;
    private Random random = new Random ();
	  public static IIcon emptyIcon;

    ToolCore(int baseDamage)
	  {
	    this.maxStackSize = 1;
	    setMaxDamage(3000);

          int damageVsEntity = baseDamage;
	    this.canRepair = true;
	  }
	  
	  public boolean onBlockStartBreak(ItemStack stack, int x, int y, int z, EntityPlayer player)
	  {
	    boolean cancelHarvest = false;
	    for (ActiveToolMod mod : TConstructRegistry.activeModifiers) {
	      if (mod.beforeBlockBreak(this, stack, x, y, z, player)) {
	        cancelHarvest = true;
	      }
	    }
	    return cancelHarvest;
	  }

    public boolean onBlockDestroyed(ItemStack itemstack, World world, Block block, int x, int y, int z, EntityLivingBase player) {
        return (block == null) || (!(block.getBlockHardness (world, x, y, z) != 0.0D)) || AbilityHelper.onBlockChanged (itemstack, world, block, x, y, z, player, this.random);
    }
	}
