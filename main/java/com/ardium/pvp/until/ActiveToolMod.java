package com.ardium.pvp.until;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

class ActiveToolMod {
	public boolean beforeBlockBreak(ToolCore tool, ItemStack stack, int x, int y, int z, EntityLivingBase entity)
	  {
	    return false;
	  }
	  
	  public boolean damageTool(ItemStack stack, int damage, EntityLivingBase entity)
	  {
	    return false;
	  }
}
