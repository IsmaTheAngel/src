package fr.ardium.mod.blocks.crops;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.ardium.mod.items.RegistryItems;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

public class BlockCropInferium extends BlockCropsMod
{
	  @SideOnly(Side.CLIENT)
	  private IIcon[] iconArray;
	  
	  public BlockCropInferium(int par1)
	  {
	    setBlockName("InferiumCrop");
	
	  }
	  
	  public int getRenderType()
	  {
	    return 1;
	  }
	  
	  @SideOnly(Side.CLIENT)
	  public IIcon getIcon(int par1, int par2)
	  {
	    if (par2 < 7)
	    {
	      if (par2 == 6) {
	        par2 = 5;
	      }
	      return this.iconArray[(par2 >> 1)];
	    }
	    return this.iconArray[3];
	  }
	 
	  protected Item func_149866_i()
	  {
	    return RegistryItems.inferium_seed;
	  }
	  
	 
	  
	  protected Item func_149865_P()
	  {
	    return RegistryItems.magical_essences;
	  }
	  
	  public int damageDropped(int i)
	  {
	    return 0;
	  }
	  
	  @SideOnly(Side.CLIENT)
	  public void registerBlockIcons(IIconRegister p_149651_1_)
	  {
	    this.iconArray = new IIcon[4];
	    for (int i = 0; i < this.iconArray.length; i++) {
	      this.iconArray[i] = p_149651_1_.registerIcon("ardium:crops/inferium/Crop_" + i);
	    }
	  }
	}
