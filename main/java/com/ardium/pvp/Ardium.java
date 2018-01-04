package com.ardium.pvp;

import com.ardium.pvp.common.CommonProxy;
import com.ardium.pvp.creativetabs.ArdiumTab;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;

@Mod(modid = Ardium.MOD_ID, name = Ardium.MOD_NAME, version = Ardium.MOD_VERSION, acceptedMinecraftVersions = Ardium.ACCEPTED_MINECRAFT_VERSIONS)

public class Ardium {
    public static final String MOD_ID = "ardium";

    static final String MOD_NAME = "Ardium";
    public static final CreativeTabs ARDIUM_CREATIVE_TAB = new ArdiumTab (CreativeTabs.getNextID (), MOD_NAME);
    static final String MOD_VERSION = "Special Edition";
    //static final String DEPENDENCIES = "after:CodeChickenCore;" + "after:NotEnoughItems;";
    static final String ACCEPTED_MINECRAFT_VERSIONS = "[1.7.10]";
    private static final String CLIENT_PROXY_PATH = "com.ardium.pvp.client.ClientProxy";
    private static final String COMMON_PROXY_PATH = "com.ardium.pvp.common.CommonProxy";

    @Instance("ardium")
    public static Ardium instance;
    @SidedProxy(clientSide = CLIENT_PROXY_PATH, serverSide = CLIENT_PROXY_PATH)
    public static CommonProxy commonProxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent preInitializationEvent) {
        commonProxy.preInitialization (preInitializationEvent);
    }

    @EventHandler
    public void Init(FMLInitializationEvent initializationEvent) {
        commonProxy.initialization (initializationEvent);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent initializationEvent) {
        commonProxy.postInit (initializationEvent);
    }
}
