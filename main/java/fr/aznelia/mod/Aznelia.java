package fr.aznelia.mod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.aznelia.mod.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

@Mod(modid = "aznelia" , name = "Aznelia" , version = "1")

public class Aznelia 
{
	@Instance("ardium")
	public static Aznelia instance;
	@SidedProxy (clientSide = "fr.aznelia.mod.proxy.ClientProxy" , serverSide = "fr.aznelia.mod.proxy.CommonProxy")
	public static CommonProxy proxy;
	public static String MODID = "aznelia";
	//public static CreativeTabs AzneliaCreativeTab = new CreativeTabs("Aznelia")
    //{
    //     @SideOnly(Side.CLIENT)
    //    public Item getTabIconItem()
    //    {
    //        return Item.getItemFromBlock(//Block);
    //    }
    // };
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		CommonProxy.preInit(event);
		proxy.registerRenders();
	}
	@EventHandler
	public void Init(FMLInitializationEvent event)
	{
		CommonProxy.Init(event);
	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		CommonProxy.postInit(event);
	}
}
