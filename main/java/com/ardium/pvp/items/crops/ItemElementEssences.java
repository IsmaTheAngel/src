package com.ardium.pvp.items.crops;

import com.ardium.pvp.Ardium;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;

import java.util.List;

public class ItemElementEssences  extends Item
{
    private static final String[] field_150923_a = {"water", "fire", "earth", "air"};
    private static final String[] field_150921_b = {"essence_water", "essence_fire", "essence_earth", "essence_air"};
	  @SideOnly(Side.CLIENT)
	  private IIcon[] field_150920_d;
	  private static final String __OBFID = "CL_00000022";
	  
	  public ItemElementEssences()
	  {
	    setHasSubtypes(true);
	    setMaxDamage(0);
          setCreativeTab (Ardium.ARDIUM_CREATIVE_TAB);
	  }
	  
	  @SideOnly(Side.CLIENT)
	  public IIcon getIconFromDamage(int par1)
	  {
	    int j = MathHelper.clamp_int(par1, 0, 3);
	    return this.field_150920_d[j];
	  }
	  
	  public String getUnlocalizedName(ItemStack par1ItemStack)
	  {
	    int i = MathHelper.clamp_int(par1ItemStack.getItemDamage(), 0, 3);
	    return super.getUnlocalizedName() + "." + field_150923_a[i];
	  }
	  
	  @SideOnly(Side.CLIENT)
	  public void getSubItems(Item p_150895_1_, CreativeTabs p_150895_2_, List p_150895_3_)
	  {
	    for (int i = 0; i < 4; i++) {
	      p_150895_3_.add(new ItemStack(p_150895_1_, 1, i));
	    }
	  }
	  
	  @SideOnly(Side.CLIENT)
	  public void registerIcons(IIconRegister par1IconRegister)
	  {
	    this.field_150920_d = new IIcon[field_150921_b.length];
	    for (int i = 0; i < field_150921_b.length; i++) {
	      this.field_150920_d[i] = par1IconRegister.registerIcon("ardium:" + field_150921_b[i]);
	    }
	  }
	}