package fr.aznelia.mod.proxy;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import fr.aznelia.mod.armor.RegistryArmors;
import fr.aznelia.mod.blocks.RegistryBlocks;
import fr.aznelia.mod.fluid.RegistryFluid;
import fr.aznelia.mod.items.RegistryItems;
import fr.aznelia.mod.recipies.RegistryRecipies;
import fr.aznelia.mod.tools.RegistryTools;
import net.minecraftforge.common.MinecraftForge;

public class CommonProxy {
	public void registerRenders()
	  {
		
	  }
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event)
	{
		RegistryBlocks.init();
		RegistryItems.init();
		RegistryTools.init();
		RegistryArmors.init();
		RegistryFluid.init();

	}
	@EventHandler
	public static void Init(FMLInitializationEvent event)
	{
		RegistryRecipies.register();
	}
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event)
	{
		
	}
}


