package fr.ardium.mod.api;

import java.util.Locale;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

public class MoltenMetalBlock extends BlockFluidClassic
{
	  private IIcon stillIcon;
	  private IIcon flowingIcon;
	  private String stillIconTexture;
	  private String flowIconTexture;
	  private boolean registeredInFluidDictionary;
	  
	  public MoltenMetalBlock(Fluid fluid, String UnloclizedName, String stillIconTexture, String flowIconTexture, boolean fluidRegistered)
	  {
	    super(fluid, Material.lava);
	    setHardness(100.0F);
	    setLightLevel(1.0F);
	    setBlockName(UnloclizedName);
	    
	    this.stillIconTexture = ("ardium".toLowerCase(Locale.ENGLISH) + ":" + stillIconTexture);
	    this.flowIconTexture = ("ardium".toLowerCase(Locale.ENGLISH) + ":" + flowIconTexture);
	    
	    this.registeredInFluidDictionary = fluidRegistered;
	  }
	  
	  @SideOnly(Side.CLIENT)
	  public void registerBlockIcons(IIconRegister icon)
	  {
	    this.stillIcon = icon.registerIcon(this.stillIconTexture);
	    this.flowingIcon = icon.registerIcon(this.flowIconTexture);
	    if (this.registeredInFluidDictionary) {
	      getFluid().setIcons(this.stillIcon, this.flowingIcon);
	    }
	  }
	  
	  public IIcon getStillIcon()
	  {
	    return this.stillIcon;
	  }
	  
	  public IIcon getFlowingIcon()
	  {
	    return this.flowingIcon;
	  }
	  
	  @SideOnly(Side.CLIENT)
	  public IIcon getIcon(int side, int meta)
	  {
	    if (side <= 1) {
	      return this.stillIcon;
	    }
	    return this.flowingIcon;
	  }
	}
