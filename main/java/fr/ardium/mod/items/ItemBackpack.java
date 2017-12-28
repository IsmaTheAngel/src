package fr.ardium.mod.items;

import fr.ardium.mod.Ardium;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class ItemBackpack extends Item
{
	public static final String NAME = "backpack";

	public ItemBackpack() {
		this.setUnlocalizedName(Ardium.MODID + "_" + NAME);
		this.setTextureName(Ardium.MODID + ":" + NAME);
		this.setCreativeTab(Ardium.ArdiumCreativeTab);
		this.setTextureName("ardium:backpack");
		this.maxStackSize = 1; // N'oubliez pas ceci, Á‡ empÍche l'item d'Ítre stackable

	}

	
	/**
	 * Used to open the gui
	 */
	 public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
	  {
	    if (!world.isRemote)
	    {
	      player.openGui(Ardium.instance, 1, world, 0, 0, 0);
	      NBTTagCompound nbt = player.getHeldItem().getTagCompound();
	      nbt.setBoolean("Open", true);
	    }
	    return stack;
	  }
	  
	  public void onUpdate(ItemStack stack, World world, Entity e, int in, boolean b)
	  {
	    if ((stack.hasTagCompound()) && (stack.getTagCompound().hasKey("Open")) && 
	      (!b)) {
	      stack.getTagCompound().setBoolean("Open", false);
	    }
	    super.onUpdate(stack, world, e, in, b);
	  }
	}

