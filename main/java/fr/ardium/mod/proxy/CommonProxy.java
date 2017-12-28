package fr.ardium.mod.proxy;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import fr.ardium.mod.Ardium;
import fr.ardium.mod.BackpackEventHandler;
import fr.ardium.mod.api.TinkerAPI;
import fr.ardium.mod.armors.RegistryArmors;
import fr.ardium.mod.blocks.RegistryBlocks;
import fr.ardium.mod.blocks.RegistryFluid;
import fr.ardium.mod.entity.EntityDynamite;
import fr.ardium.mod.items.ItemWandExplorer;
import fr.ardium.mod.items.RegistryItems;
import fr.ardium.mod.recipies.RExtractorRecipies;
import fr.ardium.mod.recipies.RFertilizerRecipies;
import fr.ardium.mod.recipies.RegistryRecipies;
import fr.ardium.mod.tile.GuiHandler;
import fr.ardium.mod.tile.TileEntityArdiumFurnace;
import fr.ardium.mod.tile.TileEntityFertilizer;
import fr.ardium.mod.tile.TileEntityOxiumFurnace;
import fr.ardium.mod.tile.TileExtractor;
import fr.ardium.mod.tools.RegistryTools;
import fr.ardium.mod.world.WorldRegister;
import net.minecraftforge.common.MinecraftForge;

public class CommonProxy {



	public void registerRenders()
	  {
		
	  }
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event)
	{
		 if (event.getSide() == Side.CLIENT)
		    {
		      FMLCommonHandler.instance().bus().register(new ItemWandExplorer());
		      MinecraftForge.EVENT_BUS.register(new ItemWandExplorer());
		    }
		WorldRegister.mainRegistry();
		RegistryBlocks.init();
		RegistryItems.init();
		RegistryTools.init();
		RegistryArmors.init();
		RegistryFluid.init();
		TinkerAPI.addMoltenMetals();
		TinkerAPI._addSmelteryBlocks();
		TinkerAPI._addArdiumMaterials();
		TinkerAPI._intiParts();
		TinkerAPI._registerParts();
		TinkerAPI.addBuckets();
	}
	@EventHandler
	public static void Init(FMLInitializationEvent event)
	{
		EntityRegistry.registerModEntity(EntityDynamite.class, "Dynamite", 6, Ardium.instance, 80, 3, true);
		RegistryRecipies.register();
	    NetworkRegistry.INSTANCE.registerGuiHandler(Ardium.instance, new GuiHandler());
	    MinecraftForge.EVENT_BUS.register(new BackpackEventHandler());
	    GameRegistry.registerTileEntity(TileEntityArdiumFurnace.class, "ardium:tileardiumfurnace");
		GameRegistry.registerTileEntity(TileEntityOxiumFurnace.class, "ardium:tileoxiumfurnace");
		GameRegistry.registerTileEntity(TileExtractor.class, "ardium:tileextractor");
		GameRegistry.registerTileEntity(TileEntityFertilizer.class, "ardium:tilefertilizer");
		GameRegistry.addRecipe(new RExtractorRecipies());
		GameRegistry.addRecipe(new RFertilizerRecipies());
	}
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
