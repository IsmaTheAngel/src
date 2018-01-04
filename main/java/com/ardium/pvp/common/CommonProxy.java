package com.ardium.pvp.common;

import com.ardium.pvp.Ardium;
import com.ardium.pvp.BackpackEventHandler;
import com.ardium.pvp.armors.RegistryArmors;
import com.ardium.pvp.blocks.RegistryBlocks;
import com.ardium.pvp.blocks.RegistryFluid;
import com.ardium.pvp.entity.EntityDynamite;
import com.ardium.pvp.items.RegistryItems;
import com.ardium.pvp.recipies.RExtractorRecipies;
import com.ardium.pvp.recipies.RFertilizerRecipies;
import com.ardium.pvp.recipies.RegistryRecipies;
import com.ardium.pvp.tileentities.GuiHandler;
import com.ardium.pvp.tileentities.TileEntityArdiumFurnace;
import com.ardium.pvp.tileentities.TileEntityFertilizer;
import com.ardium.pvp.tileentities.TileExtractor;
import com.ardium.pvp.tools.RegistryTools;
import com.ardium.pvp.world.WorldRegister;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.common.MinecraftForge;

public class CommonProxy {

    public void preInitialization(FMLPreInitializationEvent preInitializationEvent) {
        WorldRegister.mainRegistry ();
        RegistryBlocks.init ();
        RegistryItems.preInitialization ();
        RegistryTools.init ();
        RegistryArmors.init ();
        RegistryFluid.init ();

    }

    public void initialization(FMLInitializationEvent initializationEvent) {
        EntityRegistry.registerModEntity (EntityDynamite.class, "dynamite", EntityRegistry.findGlobalUniqueEntityId (), Ardium.instance, 80, 3,
                true);
        RegistryRecipies.register ();
        NetworkRegistry.INSTANCE.registerGuiHandler (Ardium.instance, new GuiHandler ());
        MinecraftForge.EVENT_BUS.register (new BackpackEventHandler ());
        GameRegistry.registerTileEntity (TileEntityArdiumFurnace.class, Ardium.MOD_ID + ":tileardiumfurnace");
        GameRegistry.registerTileEntity (TileExtractor.class, Ardium.MOD_ID + ":tileextractor");
        GameRegistry.registerTileEntity (TileEntityFertilizer.class, Ardium.MOD_ID + ":tilefertilizer");
        GameRegistry.addRecipe (new RExtractorRecipies ());
        GameRegistry.addRecipe (new RFertilizerRecipies ());
    }

    public void postInit(FMLPostInitializationEvent postInitializationEvent) {

    }
}
