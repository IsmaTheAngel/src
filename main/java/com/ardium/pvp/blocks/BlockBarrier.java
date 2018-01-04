package com.ardium.pvp.blocks;

import com.ardium.pvp.Ardium;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.util.ForgeDirection;

class BlockBarrier extends Block {
    private IIcon creativeIcon;

public BlockBarrier()
{
  super(Material.rock);
    setCreativeTab (Ardium.ARDIUM_CREATIVE_TAB);
  setStepSound(soundTypeStone);
  setLightOpacity(0);
  setHarvestLevel("pickaxe", 1);
  setBlockName("barrier");
  setBlockTextureName("ardium:air");
  setBlockUnbreakable();
}

public boolean isOpaqueCube()
{
  return false;
}

@SideOnly(Side.CLIENT)
public int getRenderBlockPass()
{
  return 0;
}

public boolean isSideSolid(IBlockAccess world, int x, int y, int z, ForgeDirection side)
{
  return false;
}

public boolean renderAsNormalBlock()
{
  return false;
}

public int getRenderType()
{
  return super.getRenderType();
}

public boolean shouldSideBeRendered(IBlockAccess p_149646_1_, int p_149646_2_, int p_149646_3_, int p_149646_4_, int p_149646_5_)
{
  return false;
}

public void registerBlockIcons(IIconRegister icon)
{
  this.creativeIcon = icon.registerIcon("ardium:barrier");
  super.registerBlockIcons(icon);
}

@SideOnly(Side.CLIENT)
public IIcon getIcon(int side, int metadata)
{
  if (metadata == 0) {
    return this.creativeIcon;
  }
  return super.getIcon(side, metadata);
}
}
