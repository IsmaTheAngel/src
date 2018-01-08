package fr.ardium.mod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.ardium.mod.blocks.RegistryBlocks;
import fr.ardium.mod.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

@Mod(modid = "ardium", name = "Ardium", version = "Special Edition")

public class Ardium {
    @Instance("ardium")
    public static Ardium instance;
    @SidedProxy(clientSide = "fr.ardium.mod.proxy.ClientProxy", serverSide = "fr.ardium.mod.proxy.CommonProxy")
    public static CommonProxy proxy;
    public static final String MOD_ID = "ardium";
    public static CreativeTabs ArdiumCreativeTab = new CreativeTabs ("Ardium") {
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            return Item.getItemFromBlock (RegistryBlocks.ardium_block);
        }
    };

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        CommonProxy.preInit (event);
        proxy.registerRenders ();
    }

    @EventHandler
    public void Init(FMLInitializationEvent event) {
        CommonProxy.Init (event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        CommonProxy.postInit (event);
    }
}
