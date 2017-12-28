package fr.ardium.mod.items;

import fr.ardium.mod.Ardium;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemXPBerry extends Item
{
	  public ItemXPBerry()
	  {
	    setMaxStackSize(64);
	    setUnlocalizedName("experienceberry");
	    setCreativeTab(Ardium.ArdiumCreativeTab);
	    setTextureName("Ardium:xpberry");
	  }
	  
	  public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
	  {
	    stack.stackSize -= 1;
	    player.addExperience(20);
	    return stack;
	  }
	}