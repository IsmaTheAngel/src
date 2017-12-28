package fr.ardium.mod.items.crops;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.ardium.mod.Ardium;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;

public class ItemCropEssencesT3  extends Item
{
	  public static final String[] field_150923_a = { "diamond", "certus_quartz", "certus_quartz_charged" };
	  public static final String[] field_150921_b = { "essence_diamond", "essence_certus_quartz", "essence_certus_quartz_charged"};
	  @SideOnly(Side.CLIENT)
	  private IIcon[] field_150920_d;
	  private static final String __OBFID = "CL_00000022";
	  
	  public ItemCropEssencesT3()
	  {
	    setHasSubtypes(true);
	    setMaxDamage(0);
	    setCreativeTab(Ardium.ArdiumCreativeTab);
	  }
	  
	  @SideOnly(Side.CLIENT)
	  public IIcon getIconFromDamage(int par1)
	  {
	    int j = MathHelper.clamp_int(par1, 0, 2);
	    return this.field_150920_d[j];
	  }
	  
	  public String getUnlocalizedName(ItemStack par1ItemStack)
	  {
	    int i = MathHelper.clamp_int(par1ItemStack.getItemDamage(), 0, 2);
	    return super.getUnlocalizedName() + "." + field_150923_a[i];
	  }
	  
	  @SideOnly(Side.CLIENT)
	  public void getSubItems(Item p_150895_1_, CreativeTabs p_150895_2_, List p_150895_3_)
	  {
	    for (int i = 0; i < 3; i++) {
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
