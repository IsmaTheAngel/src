package fr.ardium.mod.api;

import java.util.HashMap;
import java.util.Map;

import cpw.mods.fml.common.eventhandler.Event;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.FillBucketEvent;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;

public class BucketHandler {
private static BucketHandler INSTANCE = new BucketHandler();
private static HashMap<Block, ItemStack> FILLED_BUCKETS = new HashMap();

public static BucketHandler getInstance()
{
  return INSTANCE;
}

public static void addBuckets()
{
  MoltenMetalBucketItem bucket = new MoltenMetalBucketItem(null);
  GameRegistry.registerItem(bucket, "extra.bucket");
  
  int bucketVol = 1000;
  ItemStack emptyBucketStack = FluidContainerRegistry.EMPTY_BUCKET.copy();
  
  FluidStack fluidStack = FluidRegistry.getFluidStack("fairy.molten", bucketVol);
  if (fluidStack != null)
  {
    int bucketId = 1;
    
    bucket.addTextureMaping(bucketId, fluidStack.getFluid().getName(), "bucket_fill_fairy");
    
    ItemStack bucketStack = new ItemStack(bucket, 1, bucketId);
    
    FILLED_BUCKETS.put(fluidStack.getFluid().getBlock(), bucketStack);
    
    FluidContainerRegistry.registerFluidContainer(fluidStack, bucketStack, emptyBucketStack);
  }
  fluidStack = FluidRegistry.getFluidStack("refined.glowstone.molten", bucketVol);
  if (fluidStack != null)
  {
    int bucketId = 2;
    
    bucket.addTextureMaping(bucketId, fluidStack.getFluid().getName(), "bucket_fill_glowstone");
    
    ItemStack bucketStack = new ItemStack(bucket, 1, bucketId);
    
    FILLED_BUCKETS.put(fluidStack.getFluid().getBlock(), bucketStack);
    
    FluidContainerRegistry.registerFluidContainer(fluidStack, bucketStack, emptyBucketStack);
  }
  fluidStack = FluidRegistry.getFluidStack("osmium.molten", bucketVol);
  if (fluidStack != null)
  {
    int bucketId = 3;
    
    bucket.addTextureMaping(bucketId, fluidStack.getFluid().getName(), "bucket_fill_osmium");
    
    ItemStack bucketStack = new ItemStack(bucket, 1, bucketId);
    
    FILLED_BUCKETS.put(fluidStack.getFluid().getBlock(), bucketStack);
    
    FluidContainerRegistry.registerFluidContainer(fluidStack, bucketStack, emptyBucketStack);
  }
  fluidStack = FluidRegistry.getFluidStack("pokefennium.molten", bucketVol);
  if (fluidStack != null)
  {
    int bucketId = 4;
    
    bucket.addTextureMaping(bucketId, fluidStack.getFluid().getName(), "bucket_fill_pokefennium");
    
    ItemStack bucketStack = new ItemStack(bucket, 1, bucketId);
    
    FILLED_BUCKETS.put(fluidStack.getFluid().getBlock(), bucketStack);
    
    FluidContainerRegistry.registerFluidContainer(fluidStack, bucketStack, emptyBucketStack);
  }
  fluidStack = FluidRegistry.getFluidStack("red.aurum.molten", bucketVol);
  if (fluidStack != null)
  {
    int bucketId = 5;
    
    bucket.addTextureMaping(bucketId, fluidStack.getFluid().getName(), "bucket_fill_red_aurum");
    
    ItemStack bucketStack = new ItemStack(bucket, 1, bucketId);
    
    FILLED_BUCKETS.put(fluidStack.getFluid().getBlock(), bucketStack);
    
    FluidContainerRegistry.registerFluidContainer(fluidStack, bucketStack, emptyBucketStack);
  }
  fluidStack = FluidRegistry.getFluidStack("desh.molten", bucketVol);
  if (fluidStack != null)
  {
    int bucketId = 6;
    
    bucket.addTextureMaping(bucketId, fluidStack.getFluid().getName(), "bucket_fill_desh");
    
    ItemStack bucketStack = new ItemStack(bucket, 1, bucketId);
    
    FILLED_BUCKETS.put(fluidStack.getFluid().getBlock(), bucketStack);
    
    FluidContainerRegistry.registerFluidContainer(fluidStack, bucketStack, emptyBucketStack);
  }
  fluidStack = FluidRegistry.getFluidStack("potato.soup", bucketVol);
  if (fluidStack != null)
  {
    int bucketId = 7;
    
    bucket.addTextureMaping(bucketId, fluidStack.getFluid().getName(), "bucket_fill_potato_soup");
    
    ItemStack bucketStack = new ItemStack(bucket, 1, bucketId);
    
    FILLED_BUCKETS.put(fluidStack.getFluid().getBlock(), bucketStack);
    
    FluidContainerRegistry.registerFluidContainer(fluidStack, bucketStack, emptyBucketStack);
  }
  fluidStack = FluidRegistry.getFluidStack("drulloy.molten", bucketVol);
  if (fluidStack != null)
  {
    int bucketId = 8;
    
    bucket.addTextureMaping(bucketId, fluidStack.getFluid().getName(), "bucket_fill_drulloy");
    
    ItemStack bucketStack = new ItemStack(bucket, 1, bucketId);
    
    FILLED_BUCKETS.put(fluidStack.getFluid().getBlock(), bucketStack);
    
    FluidContainerRegistry.registerFluidContainer(fluidStack, bucketStack, emptyBucketStack);
  }
  fluidStack = FluidRegistry.getFluidStack("dark.steel.molten", bucketVol);
  if (fluidStack != null)
  {
    int bucketId = 9;
    
    bucket.addTextureMaping(bucketId, fluidStack.getFluid().getName(), "bucket_fill_darksteel");
    
    ItemStack bucketStack = new ItemStack(bucket, 1, bucketId);
    
    FILLED_BUCKETS.put(fluidStack.getFluid().getBlock(), bucketStack);
    
    FluidContainerRegistry.registerFluidContainer(fluidStack, bucketStack, emptyBucketStack);
  }
  fluidStack = FluidRegistry.getFluidStack("zinc.molten", bucketVol);
  if (fluidStack != null)
  {
    int bucketId = 10;
    
    bucket.addTextureMaping(bucketId, fluidStack.getFluid().getName(), "bucket_fill_zinc");
    
    ItemStack bucketStack = new ItemStack(bucket, 1, bucketId);
    
    FILLED_BUCKETS.put(fluidStack.getFluid().getBlock(), bucketStack);
    
    FluidContainerRegistry.registerFluidContainer(fluidStack, bucketStack, emptyBucketStack);
  }
  fluidStack = FluidRegistry.getFluidStack("brass.molten", bucketVol);
  if (fluidStack != null)
  {
    int bucketId = 11;
    
    bucket.addTextureMaping(bucketId, fluidStack.getFluid().getName(), "bucket_fill_brass");
    
    ItemStack bucketStack = new ItemStack(bucket, 1, bucketId);
    
    FILLED_BUCKETS.put(fluidStack.getFluid().getBlock(), bucketStack);
    
    FluidContainerRegistry.registerFluidContainer(fluidStack, bucketStack, emptyBucketStack);
  }
  fluidStack = FluidRegistry.getFluidStack("adamantine.molten", bucketVol);
  if (fluidStack != null)
  {
    int bucketId = 12;
    
    bucket.addTextureMaping(bucketId, fluidStack.getFluid().getName(), "bucket_fill_adamantine");
    
    ItemStack bucketStack = new ItemStack(bucket, 1, bucketId);
    
    FILLED_BUCKETS.put(fluidStack.getFluid().getBlock(), bucketStack);
    
    FluidContainerRegistry.registerFluidContainer(fluidStack, bucketStack, emptyBucketStack);
  }
  fluidStack = FluidRegistry.getFluidStack("manasteel.molten", bucketVol);
  if (fluidStack != null)
  {
    int bucketId = 13;
    
    bucket.addTextureMaping(bucketId, fluidStack.getFluid().getName(), "bucket_fill_manasteel");
    
    ItemStack bucketStack = new ItemStack(bucket, 1, bucketId);
    
    FILLED_BUCKETS.put(fluidStack.getFluid().getBlock(), bucketStack);
    
    FluidContainerRegistry.registerFluidContainer(fluidStack, bucketStack, emptyBucketStack);
  }
  fluidStack = FluidRegistry.getFluidStack("terrasteel.molten", bucketVol);
  if (fluidStack != null)
  {
    int bucketId = 14;
    
    bucket.addTextureMaping(bucketId, fluidStack.getFluid().getName(), "bucket_fill_terrasteel");
    
    ItemStack bucketStack = new ItemStack(bucket, 1, bucketId);
    
    FILLED_BUCKETS.put(fluidStack.getFluid().getBlock(), bucketStack);
    
    FluidContainerRegistry.registerFluidContainer(fluidStack, bucketStack, emptyBucketStack);
  }
  fluidStack = FluidRegistry.getFluidStack("elementium.molten", bucketVol);
  if (fluidStack != null)
  {
    int bucketId = 15;
    
    bucket.addTextureMaping(bucketId, fluidStack.getFluid().getName(), "bucket_fill_elementium");
    
    ItemStack bucketStack = new ItemStack(bucket, 1, bucketId);
    
    FILLED_BUCKETS.put(fluidStack.getFluid().getBlock(), bucketStack);
    
    FluidContainerRegistry.registerFluidContainer(fluidStack, bucketStack, emptyBucketStack);
  }
  fluidStack = FluidRegistry.getFluidStack("voidmetal.molten", bucketVol);
  if (fluidStack != null)
  {
    int bucketId = 16;
    
    bucket.addTextureMaping(bucketId, fluidStack.getFluid().getName(), "bucket_fill_voidmetal");
    
    ItemStack bucketStack = new ItemStack(bucket, 1, bucketId);
    
    FILLED_BUCKETS.put(fluidStack.getFluid().getBlock(), bucketStack);
    
    FluidContainerRegistry.registerFluidContainer(fluidStack, bucketStack, emptyBucketStack);
  }
  fluidStack = FluidRegistry.getFluidStack("blutonium.molten", bucketVol);
  if (fluidStack != null)
  {
    int bucketId = 17;
    
    bucket.addTextureMaping(bucketId, fluidStack.getFluid().getName(), "bucket_fill_blutonium");
    
    ItemStack bucketStack = new ItemStack(bucket, 1, bucketId);
    
    FILLED_BUCKETS.put(fluidStack.getFluid().getBlock(), bucketStack);
    
    FluidContainerRegistry.registerFluidContainer(fluidStack, bucketStack, emptyBucketStack);
  }
  fluidStack = FluidRegistry.getFluidStack("ludicrite.molten", bucketVol);
  if (fluidStack != null)
  {
    int bucketId = 18;
    
    bucket.addTextureMaping(bucketId, fluidStack.getFluid().getName(), "bucket_fill_ludicrite");
    
    ItemStack bucketStack = new ItemStack(bucket, 1, bucketId);
    
    FILLED_BUCKETS.put(fluidStack.getFluid().getBlock(), bucketStack);
    
    FluidContainerRegistry.registerFluidContainer(fluidStack, bucketStack, emptyBucketStack);
  }
  fluidStack = FluidRegistry.getFluidStack("bedrockium.molten", bucketVol);
  if (fluidStack != null)
  {
    int bucketId = 19;
    
    bucket.addTextureMaping(bucketId, fluidStack.getFluid().getName(), "bucket_fill_bedrockium");
    
    ItemStack bucketStack = new ItemStack(bucket, 1, bucketId);
    
    FILLED_BUCKETS.put(fluidStack.getFluid().getBlock(), bucketStack);
    
    FluidContainerRegistry.registerFluidContainer(fluidStack, bucketStack, emptyBucketStack);
  }
  fluidStack = FluidRegistry.getFluidStack("witheriron.molten", bucketVol);
  if (fluidStack != null)
  {
    int bucketId = 20;
    
    bucket.addTextureMaping(bucketId, fluidStack.getFluid().getName(), "bucket_fill_witheriron");
    
    ItemStack bucketStack = new ItemStack(bucket, 1, bucketId);
    
    FILLED_BUCKETS.put(fluidStack.getFluid().getBlock(), bucketStack);
    
    FluidContainerRegistry.registerFluidContainer(fluidStack, bucketStack, emptyBucketStack);
  }
  fluidStack = FluidRegistry.getFluidStack("amethyst.molten", bucketVol);
  if (fluidStack != null)
  {
    int bucketId = 21;
    
    bucket.addTextureMaping(bucketId, fluidStack.getFluid().getName(), "bucket_fill_amethyst");
    
    ItemStack bucketStack = new ItemStack(bucket, 1, bucketId);
    
    FILLED_BUCKETS.put(fluidStack.getFluid().getBlock(), bucketStack);
    
    FluidContainerRegistry.registerFluidContainer(fluidStack, bucketStack, emptyBucketStack);
  }
  fluidStack = FluidRegistry.getFluidStack("emberstone.molten", bucketVol);
  if (fluidStack != null)
  {
    int bucketId = 22;
    
    bucket.addTextureMaping(bucketId, fluidStack.getFluid().getName(), "bucket_fill_emberstone");
    
    ItemStack bucketStack = new ItemStack(bucket, 1, bucketId);
    
    FILLED_BUCKETS.put(fluidStack.getFluid().getBlock(), bucketStack);
    
    FluidContainerRegistry.registerFluidContainer(fluidStack, bucketStack, emptyBucketStack);
  }
  fluidStack = FluidRegistry.getFluidStack("jade.molten", bucketVol);
  if (fluidStack != null)
  {
    int bucketId = 23;
    
    bucket.addTextureMaping(bucketId, fluidStack.getFluid().getName(), "bucket_fill_jade");
    
    ItemStack bucketStack = new ItemStack(bucket, 1, bucketId);
    
    FILLED_BUCKETS.put(fluidStack.getFluid().getBlock(), bucketStack);
    
    FluidContainerRegistry.registerFluidContainer(fluidStack, bucketStack, emptyBucketStack);
  }
  fluidStack = FluidRegistry.getFluidStack("limonite.molten", bucketVol);
  if (fluidStack != null)
  {
    int bucketId = 24;
    
    bucket.addTextureMaping(bucketId, fluidStack.getFluid().getName(), "bucket_fill_limonite");
    
    ItemStack bucketStack = new ItemStack(bucket, 1, bucketId);
    
    FILLED_BUCKETS.put(fluidStack.getFluid().getBlock(), bucketStack);
    
    FluidContainerRegistry.registerFluidContainer(fluidStack, bucketStack, emptyBucketStack);
  }
  fluidStack = FluidRegistry.getFluidStack("rosite.molten", bucketVol);
  if (fluidStack != null)
  {
    int bucketId = 25;
    
    bucket.addTextureMaping(bucketId, fluidStack.getFluid().getName(), "bucket_fill_rosite");
    
    ItemStack bucketStack = new ItemStack(bucket, 1, bucketId);
    
    FILLED_BUCKETS.put(fluidStack.getFluid().getBlock(), bucketStack);
    
    FluidContainerRegistry.registerFluidContainer(fluidStack, bucketStack, emptyBucketStack);
  }
  fluidStack = FluidRegistry.getFluidStack("sapphire.molten", bucketVol);
  if (fluidStack != null)
  {
    int bucketId = 26;
    
    bucket.addTextureMaping(bucketId, fluidStack.getFluid().getName(), "bucket_fill_sapphire");
    
    ItemStack bucketStack = new ItemStack(bucket, 1, bucketId);
    
    FILLED_BUCKETS.put(fluidStack.getFluid().getBlock(), bucketStack);
    
    FluidContainerRegistry.registerFluidContainer(fluidStack, bucketStack, emptyBucketStack);
  }
  fluidStack = FluidRegistry.getFluidStack("skeletal.molten", bucketVol);
  if (fluidStack != null)
  {
    int bucketId = 27;
    
    bucket.addTextureMaping(bucketId, fluidStack.getFluid().getName(), "bucket_fill_skeletal");
    
    ItemStack bucketStack = new ItemStack(bucket, 1, bucketId);
    
    FILLED_BUCKETS.put(fluidStack.getFluid().getBlock(), bucketStack);
    
    FluidContainerRegistry.registerFluidContainer(fluidStack, bucketStack, emptyBucketStack);
  }
  fluidStack = FluidRegistry.getFluidStack("baronyte.molten", bucketVol);
  if (fluidStack != null)
  {
    int bucketId = 28;
    
    bucket.addTextureMaping(bucketId, fluidStack.getFluid().getName(), "bucket_fill_baronyte");
    
    ItemStack bucketStack = new ItemStack(bucket, 1, bucketId);
    
    FILLED_BUCKETS.put(fluidStack.getFluid().getBlock(), bucketStack);
    
    FluidContainerRegistry.registerFluidContainer(fluidStack, bucketStack, emptyBucketStack);
  }
  fluidStack = FluidRegistry.getFluidStack("blazium.molten", bucketVol);
  if (fluidStack != null)
  {
    int bucketId = 29;
    
    bucket.addTextureMaping(bucketId, fluidStack.getFluid().getName(), "bucket_fill_blazium");
    
    ItemStack bucketStack = new ItemStack(bucket, 1, bucketId);
    
    FILLED_BUCKETS.put(fluidStack.getFluid().getBlock(), bucketStack);
    
    FluidContainerRegistry.registerFluidContainer(fluidStack, bucketStack, emptyBucketStack);
  }
  fluidStack = FluidRegistry.getFluidStack("elecanium.molten", bucketVol);
  if (fluidStack != null)
  {
    int bucketId = 30;
    
    bucket.addTextureMaping(bucketId, fluidStack.getFluid().getName(), "bucket_fill_elecanium");
    
    ItemStack bucketStack = new ItemStack(bucket, 1, bucketId);
    
    FILLED_BUCKETS.put(fluidStack.getFluid().getBlock(), bucketStack);
    
    FluidContainerRegistry.registerFluidContainer(fluidStack, bucketStack, emptyBucketStack);
  }
  fluidStack = FluidRegistry.getFluidStack("ghastly.molten", bucketVol);
  if (fluidStack != null)
  {
    int bucketId = 31;
    
    bucket.addTextureMaping(bucketId, fluidStack.getFluid().getName(), "bucket_fill_ghastly");
    
    ItemStack bucketStack = new ItemStack(bucket, 1, bucketId);
    
    FILLED_BUCKETS.put(fluidStack.getFluid().getBlock(), bucketStack);
    
    FluidContainerRegistry.registerFluidContainer(fluidStack, bucketStack, emptyBucketStack);
  }
  fluidStack = FluidRegistry.getFluidStack("ghoulish.molten", bucketVol);
  if (fluidStack != null)
  {
    int bucketId = 32;
    
    bucket.addTextureMaping(bucketId, fluidStack.getFluid().getName(), "bucket_fill_ghoulish");
    
    ItemStack bucketStack = new ItemStack(bucket, 1, bucketId);
    
    FILLED_BUCKETS.put(fluidStack.getFluid().getBlock(), bucketStack);
    
    FluidContainerRegistry.registerFluidContainer(fluidStack, bucketStack, emptyBucketStack);
  }
  fluidStack = FluidRegistry.getFluidStack("lyon.molten", bucketVol);
  if (fluidStack != null)
  {
    int bucketId = 33;
    
    bucket.addTextureMaping(bucketId, fluidStack.getFluid().getName(), "bucket_fill_lyon");
    
    ItemStack bucketStack = new ItemStack(bucket, 1, bucketId);
    
    FILLED_BUCKETS.put(fluidStack.getFluid().getBlock(), bucketStack);
    
    FluidContainerRegistry.registerFluidContainer(fluidStack, bucketStack, emptyBucketStack);
  }
  fluidStack = FluidRegistry.getFluidStack("mystite.molten", bucketVol);
  if (fluidStack != null)
  {
    int bucketId = 34;
    
    bucket.addTextureMaping(bucketId, fluidStack.getFluid().getName(), "bucket_fill_mystite");
    
    ItemStack bucketStack = new ItemStack(bucket, 1, bucketId);
    
    FILLED_BUCKETS.put(fluidStack.getFluid().getBlock(), bucketStack);
    
    FluidContainerRegistry.registerFluidContainer(fluidStack, bucketStack, emptyBucketStack);
  }
  fluidStack = FluidRegistry.getFluidStack("varsium.molten", bucketVol);
  if (fluidStack != null)
  {
    int bucketId = 35;
    
    bucket.addTextureMaping(bucketId, fluidStack.getFluid().getName(), "bucket_fill_varsium");
    
    ItemStack bucketStack = new ItemStack(bucket, 1, bucketId);
    
    FILLED_BUCKETS.put(fluidStack.getFluid().getBlock(), bucketStack);
    
    FluidContainerRegistry.registerFluidContainer(fluidStack, bucketStack, emptyBucketStack);
  }
  fluidStack = FluidRegistry.getFluidStack("constantan.molten", bucketVol);
  if (fluidStack != null)
  {
    int bucketId = 36;
    
    bucket.addTextureMaping(bucketId, fluidStack.getFluid().getName(), "bucket_fill_constantan");
    
    ItemStack bucketStack = new ItemStack(bucket, 1, bucketId);
    
    FILLED_BUCKETS.put(fluidStack.getFluid().getBlock(), bucketStack);
    
    FluidContainerRegistry.registerFluidContainer(fluidStack, bucketStack, emptyBucketStack);
  }
}

public void fillEvent(FillBucketEvent event)
{
  World world = event.world;
  MovingObjectPosition pos = event.target;
  
  Block block = world.getBlock(pos.blockX, pos.blockY, pos.blockZ);
  
  ItemStack bucketStack = getFilledBucket(block);
  if (bucketStack == null) {
    return;
  }
  world.setBlockToAir(pos.blockX, pos.blockY, pos.blockZ);
  
  event.result = bucketStack;
  event.setResult(Event.Result.ALLOW);
}

public static HashMap<Block, ItemStack> getAllBuckets()
{
  return FILLED_BUCKETS;
}

public static ItemStack getFilledBucket(Block fluidBlock)
{
  return (ItemStack)FILLED_BUCKETS.get(fluidBlock);
}

public static ItemStack getFilledBucket(String fluidName)
{
  Block fluidBlock = FluidRegistry.getFluid(fluidName).getBlock();
  return ((ItemStack)FILLED_BUCKETS.get(fluidBlock)).copy();
}

public static boolean isAvailableBucket(int fluidBlockId)
{
  return FILLED_BUCKETS.containsKey(Integer.valueOf(fluidBlockId));
}

public static boolean isAvailableBucket(String fluidName)
{
  Block fluidBlock = FluidRegistry.getFluid(fluidName).getBlock();
  return FILLED_BUCKETS.containsKey(fluidBlock);
}

public static Block getBlock(ItemStack bucketStack)
{
  Block block = Blocks.air;
  for (Map.Entry<Block, ItemStack> entry : FILLED_BUCKETS.entrySet())
  {
    ItemStack stack = (ItemStack)entry.getValue();
    if (stack.isItemEqual(bucketStack))
    {
      block = (Block)entry.getKey();
      break;
    }
  }
  return block;
}
}
