package fr.ardium.mod.api;

import java.util.HashMap;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import tconstruct.library.TConstructRegistry;
import tconstruct.library.client.TConstructClientRegistry;

public class TinkerAPI 
{
	  public static Block arcSmeltery;
	  public static Block arcSocket;
	  public static Block autoSmeltery;
	  public static Part ARROWHEAD;
	  public static Part AXE_HEAD;
	  public static Part BATTLE_SIGN_HEAD;
	  public static Part BINDING;
	  public static Part CHISEL_HEAD;
	  public static Part CHUNK;
	  public static Part CROSSBAR;
	  public static Part EXCAVATOR_HEAD;
	  public static Part FRYPAN_HEAD;
	  public static Part FULL_GUARD;
	  public static Part HAMMER_HEAD;
	  public static Part KNIFE_BLADE;
	  public static Part LARGE_GUARD;
	  public static Part LARGE_SWORD_BLADE;
	  public static Part LARGEPLATE;
	  public static Part LUMBERAXE_HEAD;
	  public static Part MEDIUM_GUARD;
	  public static Part PICKAXE_HEAD;
	  public static Part SCYTHE_HEAD;
	  public static Part SHOVEL_HEAD;
	  public static Part SWORD_BLADE;
	  public static Part TOOLROD;
	  public static Part TOUGHBIND;
	  public static Part TOUGHROD;
	  public static Part SHURIKEN;
	  public static Part BOW_LIMB;
	  public static Part CROSSBOW_LIMB;
	  public static Part CROSSBOW_BODY;
	  public static Part BOLT;
	  private static boolean _minimalTextures = false;
	  private static boolean _minimalCustomTexutres = false;
	  private static BucketHandler INSTANCE = new BucketHandler();
	  private static HashMap<Block, ItemStack> FILLED_BUCKETS = new HashMap();
	  public static BucketHandler getInstance()
	  {
	    return INSTANCE;
	  }
	  
	  
	//MoltenMetals
	public static void addMoltenMetal(String tag, String unlocalizedName, String fluidName, String iconFlow, String iconStill)
	  {
	    Fluid fluid = new Fluid(fluidName).setLuminosity(15).setDensity(3000).setViscosity(6000).setTemperature(1300);
	    boolean registered = FluidRegistry.registerFluid(fluid);
	    
	    MoltenMetalBlock moltenMetal = new MoltenMetalBlock(fluid, unlocalizedName, iconStill, iconFlow, registered);
	    
	    GameRegistry.registerBlock(moltenMetal, tag);
	  }
	 public static void addMoltenMetals()
	  {
	   addMoltenMetal("moltenArdium", "ardium.oxium", "ardium.molten", "molten_ardium_flow", "molten_ardium_still");
	   addMoltenMetal("moltenOxium", "molten.oxium", "oxium.molten", "molten_oxium_flow", "molten_oxium_still");
	  }	   
	 //SmelteryBlocks
	 public static void _addSmelteryBlocks()
	  {
	    arcSmeltery = new ArcSmelteryBlock().setBlockName("arcSmeltery");
	    arcSocket = new SmelterySocket();
	    autoSmeltery = new AutoSmelteryBlock();
	    
	    GameRegistry.registerBlock(arcSmeltery, ArcSmelteryItemBlock.class, "arcSmeltery");
	    GameRegistry.registerBlock(arcSocket, "arcSocket");
	    GameRegistry.registerBlock(autoSmeltery, "autoSmeltery");
	    
	    GameRegistry.registerTileEntity(TileEntityArcSmeltery.class, "ardium:arcSmeltery");
	    GameRegistry.registerTileEntity(TileEntitySocket.class, "ardium:arcSocket");
	    GameRegistry.registerTileEntity(TileEntityAutoSmeltery.class, "ardium:autoSmeltery");
	  }
	 //Parts
	 public static void _registerTextures(int materialID, String texturePath, boolean customTexture)
	  {
	    if ((customTexture) && (_minimalCustomTexutres)) {
	      return;
	    }
	    if ((!customTexture) && (_minimalTextures)) {
	      return;
	    }
	    TConstructClientRegistry.addMaterialRenderMapping(materialID, "tinker", texturePath, true);
	  }
	  public static void _addArdiumMaterials()
	  {
		  TConstructRegistry.addToolMaterial(619, "Ardium", "material.ardium", 6, 700, 500, 9, 2.5F, 0, 0.0F, EnumChatFormatting.DARK_PURPLE.toString(), 10211322);
		  TConstructRegistry.addToolMaterial(621, "Oxium", "material.oxium", 6, 900, 800, 8, 1.0F, 0, 0.0F, EnumChatFormatting.LIGHT_PURPLE.toString(), 16070911);
		  _registerTextures(619, "parts", true);
	      _registerTextures(621, "parts", true);
	      TConstructRegistry.addArrowMaterial(619, 8.0F, 20.0F);
	      TConstructRegistry.addArrowMaterial(621, 3.0F, 0.5F);
	      TConstructRegistry.addBowMaterial(619, 2, 6.0F);
	      TConstructRegistry.addBowMaterial(621, 40, 1.2F);
	      TConstructRegistry.addDefaultToolPartMaterial(619);
	      TConstructRegistry.addDefaultToolPartMaterial(621); 
	      TConstructRegistry.addDefaultShardMaterial(619);
	      TConstructRegistry.addDefaultShardMaterial(621);
	      
	  }
	  public static void _intiParts()
	  {
	    ARROWHEAD = new Part("arrowhead", 0, "fun_stuff/red_aurum_toughbind");
	    AXE_HEAD = new Part("axe.head", 0, "fun_stuff/red_aurum_toughbind");
	    BATTLE_SIGN_HEAD = new Part("battle.sign", 0, "fun_stuff/red_aurum_toughbind");
	    BINDING = new Part("binding", 0, "fun_stuff/red_aurum_toughbind");
	    CHISEL_HEAD = new Part("chisel.head", 0, "fun_stuff/red_aurum_toughbind");
	    CHUNK = new Part("chunk", 0, "fun_stuff/red_aurum_toughbind");
	    CROSSBAR = new Part("crossbar", 0, "fun_stuff/red_aurum_toughbind");
	    EXCAVATOR_HEAD = new Part("excavator.head", 0, "fun_stuff/red_aurum_toughbind");
	    FRYPAN_HEAD = new Part("frypan.head", 0, "fun_stuff/red_aurum_toughbind");
	    FULL_GUARD = new Part("full.guard", 0, "fun_stuff/red_aurum_toughbind");
	    HAMMER_HEAD = new Part("hammer.head", 0, "fun_stuff/red_aurum_toughbind");
	    KNIFE_BLADE = new Part("knife.blade", 0, "fun_stuff/red_aurum_toughbind");
	    LARGE_GUARD = new Part("large.guard", 0, "fun_stuff/red_aurum_toughbind");
	    LARGE_SWORD_BLADE = new Part("large.sword.blade", 0, "fun_stuff/red_aurum_toughbind");
	    LARGEPLATE = new Part("largeplate", 0, "fun_stuff/red_aurum_toughbind");
	    LUMBERAXE_HEAD = new Part("lumberaxe.head", 0, "fun_stuff/red_aurum_toughbind");
	    MEDIUM_GUARD = new Part("medium.guard", 0, "fun_stuff/red_aurum_toughbind");
	    PICKAXE_HEAD = new Part("pickaxe.head", 0, "fun_stuff/red_aurum_toughbind");
	    SCYTHE_HEAD = new Part("scythe.head", 0, "fun_stuff/red_aurum_toughbind");
	    SHOVEL_HEAD = new Part("shovel.head", 0, "fun_stuff/red_aurum_toughbind");
	    SWORD_BLADE = new Part("sword.blade", 0, "fun_stuff/red_aurum_toughbind");
	    TOOLROD = new Part("toolrod", 0, "fun_stuff/red_aurum_toughbind");
	    TOUGHBIND = new Part("toughbind", 0, "fun_stuff/red_aurum_toughbind");
	    TOUGHROD = new Part("toughrod", 0, "fun_stuff/red_aurum_toughbind");
	  }
	  
	  public static void _addMatrialToToolParts(int matrialId, String unlocalizedName, String texture)
	  {
	    ARROWHEAD.addMaterial(matrialId, unlocalizedName, texture + "_arrowhead");
	    
	    AXE_HEAD.addMaterial(matrialId, unlocalizedName, texture + "_axe_head");
	    
	    BATTLE_SIGN_HEAD.addMaterial(matrialId, unlocalizedName, texture + "_battlesign_head");
	    
	    BINDING.addMaterial(matrialId, unlocalizedName, texture + "_binding");
	    
	    CHISEL_HEAD.addMaterial(matrialId, unlocalizedName, texture + "_chisel_head");
	    
	    CHUNK.addMaterial(matrialId, unlocalizedName, texture + "_chunk");
	    
	    CROSSBAR.addMaterial(matrialId, unlocalizedName, texture + "_crossbar");
	    
	    EXCAVATOR_HEAD.addMaterial(matrialId, unlocalizedName, texture + "_excavator_head");
	    
	    FRYPAN_HEAD.addMaterial(matrialId, unlocalizedName, texture + "_frypan_head");
	    
	    FULL_GUARD.addMaterial(matrialId, unlocalizedName, texture + "_full_guard");
	    
	    HAMMER_HEAD.addMaterial(matrialId, unlocalizedName, texture + "_hammer_head");
	    
	    KNIFE_BLADE.addMaterial(matrialId, unlocalizedName, texture + "_knife_blade");
	    
	    LARGE_GUARD.addMaterial(matrialId, unlocalizedName, texture + "_large_guard");
	    
	    LARGE_SWORD_BLADE.addMaterial(matrialId, unlocalizedName, texture + "_large_sword_blade");
	    
	    LARGEPLATE.addMaterial(matrialId, unlocalizedName, texture + "_largeplate");
	    
	    LUMBERAXE_HEAD.addMaterial(matrialId, unlocalizedName, texture + "_lumberaxe_head");
	    
	    MEDIUM_GUARD.addMaterial(matrialId, unlocalizedName, texture + "_medium_guard");
	    
	    PICKAXE_HEAD.addMaterial(matrialId, unlocalizedName, texture + "_pickaxe_head");
	    
	    SCYTHE_HEAD.addMaterial(matrialId, unlocalizedName, texture + "_scythe_head");
	    
	    SHOVEL_HEAD.addMaterial(matrialId, unlocalizedName, texture + "_shovel_head");
	    
	    SWORD_BLADE.addMaterial(matrialId, unlocalizedName, texture + "_sword_blade");
	    
	    TOOLROD.addMaterial(matrialId, unlocalizedName, texture + "_rod");
	    
	    TOUGHBIND.addMaterial(matrialId, unlocalizedName, texture + "_toughbind");
	    
	    TOUGHROD.addMaterial(matrialId, unlocalizedName, texture + "_toughrod");
	    
	    
	  }
	  
	  public static void _registerParts()
	  {
	    GameRegistry.registerItem(ARROWHEAD, "arrowhead");
	    GameRegistry.registerItem(AXE_HEAD, "axeHead");
	    GameRegistry.registerItem(BATTLE_SIGN_HEAD, "battelSign");
	    GameRegistry.registerItem(BINDING, "binding");
	    GameRegistry.registerItem(CHISEL_HEAD, "chiselHead");
	    GameRegistry.registerItem(CHUNK, "chunk");
	    GameRegistry.registerItem(CROSSBAR, "crossbar");
	    GameRegistry.registerItem(EXCAVATOR_HEAD, "excavatorHead");
	    GameRegistry.registerItem(FRYPAN_HEAD, "frypanHead");
	    GameRegistry.registerItem(FULL_GUARD, "fullGuard");
	    GameRegistry.registerItem(HAMMER_HEAD, "hammerHead");
	    GameRegistry.registerItem(KNIFE_BLADE, "knifeBlade");
	    GameRegistry.registerItem(LARGE_GUARD, "largeGuard");
	    GameRegistry.registerItem(LARGE_SWORD_BLADE, "largeSwordBlade");
	    GameRegistry.registerItem(LARGEPLATE, "largeplate");
	    GameRegistry.registerItem(LUMBERAXE_HEAD, "lumberaxeHead");
	    GameRegistry.registerItem(MEDIUM_GUARD, "mediumGuard");
	    GameRegistry.registerItem(PICKAXE_HEAD, "pickaxeHead");
	    GameRegistry.registerItem(SCYTHE_HEAD, "scytheHead");
	    GameRegistry.registerItem(SHOVEL_HEAD, "shovelHead");
	    GameRegistry.registerItem(SWORD_BLADE, "swordBlade");
	    GameRegistry.registerItem(TOOLROD, "toolrod");
	    GameRegistry.registerItem(TOUGHBIND, "toughbind");
	    GameRegistry.registerItem(TOUGHROD, "toughrod");
	   
	  }
	  //Buckets
	  public static void addBuckets()
	  {
		   MoltenMetalBucketItem bucket = new MoltenMetalBucketItem(null);
		    GameRegistry.registerItem(bucket, "extra.bucket");
		    
		    int bucketVol = 1000;
		    ItemStack emptyBucketStack = FluidContainerRegistry.EMPTY_BUCKET.copy();
		    
		    FluidStack fluidStack = FluidRegistry.getFluidStack("ardium.molten", bucketVol);
		    if (fluidStack != null)
		    {

	    
	    int bucketId = 1;
	      
	      bucket.addTextureMaping(bucketId, fluidStack.getFluid().getName(), "bucket_fill_ardium");
	      
	      ItemStack bucketStack = new ItemStack(bucket, 1, bucketId);
	      
	      FILLED_BUCKETS.put(fluidStack.getFluid().getBlock(), bucketStack);
	      
	      FluidContainerRegistry.registerFluidContainer(fluidStack, bucketStack, emptyBucketStack);
	    }
	    fluidStack = FluidRegistry.getFluidStack("oxium.molten", bucketVol);
	    if (fluidStack != null)
	    {
	      int bucketId = 2;
	      
	      bucket.addTextureMaping(bucketId, fluidStack.getFluid().getName(), "bucket_fill_oxium");
	      
	      ItemStack bucketStack = new ItemStack(bucket, 1, bucketId);
	      
	      FILLED_BUCKETS.put(fluidStack.getFluid().getBlock(), bucketStack);
	      
	      FluidContainerRegistry.registerFluidContainer(fluidStack, bucketStack, emptyBucketStack);
	    }

}
	    
	 
}
	 
