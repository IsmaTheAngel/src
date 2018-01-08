package fr.ardium.mod.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import fr.ardium.mod.items.ItemBucketMod;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidRegistry;

public class RegistryFluid {
	public static FluidFakeWater FakeWater;
	public static Fluid FluidFakeWater;
	public static Item FakeWaterBucket;
	public static void init() 
	{
	FluidFakeWater = new Fluid("FluidFakeWater").setDensity(200);
	FluidRegistry.registerFluid(FluidFakeWater);
	FakeWater = new FluidFakeWater(FluidFakeWater, Material.water);
    GameRegistry.registerBlock(FakeWater, "FakeWater");
    FakeWaterBucket = new ItemBucketMod(FakeWater, "FakeWaterBucket", "FakeWaterBucket");
	GameRegistry.registerItem(FakeWaterBucket, "FakeWaterBucket");
    FluidContainerRegistry.registerFluidContainer(FluidFakeWater, new ItemStack(FakeWaterBucket), new ItemStack(Items.bucket));
}
}
