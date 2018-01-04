package com.ardium.pvp.blocks;

import com.ardium.pvp.items.ItemBucketMod;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidRegistry;

public class RegistryFluid {
    public static Item FakeWaterBucket;
	public static void init() 
	{
        Fluid fluidFakeWater = new Fluid ("FluidFakeWater").setDensity (200);
        FluidRegistry.registerFluid (fluidFakeWater);
        FluidFakeWater fakeWater = new FluidFakeWater (fluidFakeWater, Material.water);
        GameRegistry.registerBlock (fakeWater, "FakeWater");
        FakeWaterBucket = new ItemBucketMod (fakeWater, "FakeWaterBucket", "FakeWaterBucket");
	GameRegistry.registerItem(FakeWaterBucket, "FakeWaterBucket");
        FluidContainerRegistry.registerFluidContainer (fluidFakeWater, new ItemStack (FakeWaterBucket), new ItemStack (Items.bucket));
}
}
