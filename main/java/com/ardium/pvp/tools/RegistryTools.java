package com.ardium.pvp.tools;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class RegistryTools 
{
    public static Item ardium_sword;
    public static Item ardium_pickaxe;
    public static Item ardium_shovel;
    public static Item ardium_axe;

    private static ToolMaterial Oxium = EnumHelper.addToolMaterial ("Oxium", 3, 2000, 20.0F, 5.0F, 25);
    private static ToolMaterial Ardium = EnumHelper.addToolMaterial ("Ardium", 3, 1561, 8.0F, 3.0F, 10);
	public static void init() 
	{
        ardium_sword = new ToolSword (Ardium).setCreativeTab (com.ardium.pvp.Ardium.ARDIUM_CREATIVE_TAB).setTextureName (com.ardium.pvp.Ardium.MOD_ID + ":ardium_sword").setUnlocalizedName ("ardium_sword");
		GameRegistry.registerItem(ardium_sword,"ardium_sword");

        ardium_pickaxe = new ToolPickaxe (Ardium).setCreativeTab (com.ardium.pvp.Ardium.ARDIUM_CREATIVE_TAB).setTextureName (com.ardium.pvp.Ardium.MOD_ID + ":ardium_pickaxe").setUnlocalizedName ("ardium_pickaxe");
		GameRegistry.registerItem(ardium_pickaxe,"ardium_pickaxe");

        ardium_shovel = new ToolShovel (Ardium).setCreativeTab (com.ardium.pvp.Ardium.ARDIUM_CREATIVE_TAB).setTextureName (com.ardium.pvp.Ardium.MOD_ID + ":ardium_shovel").setUnlocalizedName ("ardium_shovel");
		GameRegistry.registerItem(ardium_shovel,"ardium_shovel");

        Item ardium_multitool = new ToolMultitool (Ardium).setCreativeTab (com.ardium.pvp.Ardium.ARDIUM_CREATIVE_TAB).setTextureName (com.ardium.pvp.Ardium.MOD_ID + ":ardium_multitool").setUnlocalizedName ("ardium_multitool");
		GameRegistry.registerItem(ardium_multitool,"ardium_multitool");

        ardium_axe = new ToolAxe (Ardium).setCreativeTab (com.ardium.pvp.Ardium.ARDIUM_CREATIVE_TAB).setTextureName (com.ardium.pvp.Ardium.MOD_ID + ":ardium_axe").setUnlocalizedName ("ardium_axe");
		GameRegistry.registerItem(ardium_axe,"ardium_axe");

        Item oxium_sword = new ToolSword (Oxium).setCreativeTab (com.ardium.pvp.Ardium.ARDIUM_CREATIVE_TAB).setTextureName (com.ardium.pvp.Ardium.MOD_ID + ":oxium_sword").setUnlocalizedName ("oxium_sword");
		GameRegistry.registerItem(oxium_sword,"oxium_sword");

        Item oxium_pickaxe = new ToolPickaxe (Oxium).setCreativeTab (com.ardium.pvp.Ardium.ARDIUM_CREATIVE_TAB).setTextureName (com.ardium.pvp.Ardium.MOD_ID + ":oxium_pickaxe").setUnlocalizedName ("oxium_pickaxe");
		GameRegistry.registerItem(oxium_pickaxe,"oxium_pickaxe");

        Item oxium_shovel = new ToolShovel (Oxium).setCreativeTab (com.ardium.pvp.Ardium.ARDIUM_CREATIVE_TAB).setTextureName (com.ardium.pvp.Ardium.MOD_ID + ":oxium_shovel").setUnlocalizedName ("oxium_shovel");
		GameRegistry.registerItem(oxium_shovel,"oxium_shovel");

        Item oxium_multitool = new ToolMultitool (Oxium).setCreativeTab (com.ardium.pvp.Ardium.ARDIUM_CREATIVE_TAB).setTextureName (com.ardium.pvp.Ardium.MOD_ID + ":oxium_multitool").setUnlocalizedName ("oxium_multitool");
		GameRegistry.registerItem(oxium_multitool,"oxium_multitool");

        Item oxium_axe = new ToolAxe (Oxium).setCreativeTab (com.ardium.pvp.Ardium.ARDIUM_CREATIVE_TAB).setTextureName (com.ardium.pvp.Ardium.MOD_ID + ":oxium_axe").setUnlocalizedName ("oxium_axe");
		GameRegistry.registerItem(oxium_axe,"oxium_axe");

	}
}
