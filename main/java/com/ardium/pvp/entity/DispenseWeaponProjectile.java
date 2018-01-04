package com.ardium.pvp.entity;

import net.minecraft.block.BlockDispenser;
import net.minecraft.dispenser.BehaviorProjectileDispense;
import net.minecraft.dispenser.IBlockSource;
import net.minecraft.dispenser.IPosition;
import net.minecraft.entity.Entity;
import net.minecraft.entity.IProjectile;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

import java.util.Random;

abstract class DispenseWeaponProjectile extends BehaviorProjectileDispense {

    DispenseWeaponProjectile()
	  {
          Random rand = new Random ();
	  }
	  
	  public ItemStack dispenseStack(IBlockSource blocksource, ItemStack itemstack)
	  {
	    World world = blocksource.getWorld();
	    IPosition pos = BlockDispenser.func_149939_a(blocksource);
	    EnumFacing face = BlockDispenser.func_149937_b(blocksource.getBlockMetadata());
	    IProjectile projectile = getProjectileEntity(world, pos, itemstack);
	    projectile.setThrowableHeading(face.getFrontOffsetX(), face.getFrontOffsetY() + getYVel(), face.getFrontOffsetZ(), getVelocity(), getDeviation());
	    world.spawnEntityInWorld((Entity)projectile);
	    itemstack.splitStack(1);
	    return itemstack;
	  }

    private IProjectile getProjectileEntity(World world, IPosition pos, ItemStack itemstack)
	  {
	    return getProjectileEntity(world, pos);
	  }

    private double getYVel()
	  {
	    return 0.1D;
	  }

    private float getVelocity()
	  {
	    return func_82500_b();
	  }

    private float getDeviation()
	  {
	    return func_82498_a();
	  }
	  
	  protected void playDispenseSound(IBlockSource blocksource)
	  {
	    super.playDispenseSound(blocksource);
	  }
	  
	  protected void spawnDispenseParticles(IBlockSource blocksource, EnumFacing facing)
	  {
	    super.spawnDispenseParticles(blocksource, facing);
	  }
	}