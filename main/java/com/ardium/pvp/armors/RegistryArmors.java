package com.ardium.pvp.armors;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class RegistryArmors {
    private static ArmorMaterial Oxium = EnumHelper.addArmorMaterial ("Oxium", 350, new int[]{5, 10, 8, 5}, 30);
    public static ArmorMaterial Ardium = EnumHelper.addArmorMaterial ("Ardium", 350, new int[]{3, 8, 6, 3}, 20);
    public static Item ardium_helmet, ardium_chestplate, ardium_leggings, ardium_boots;

    public static void init() {
        //Default
        ardium_helmet = new ItemArdiumArmor (Ardium, 0).setCreativeTab (com.ardium.pvp.Ardium.ARDIUM_CREATIVE_TAB).setTextureName (com.ardium.pvp.Ardium.MOD_ID + ":ardium_helmet").setUnlocalizedName ("ardium_helmet");
        GameRegistry.registerItem (ardium_helmet, "ardium_helmet");

        ardium_chestplate = new ItemArdiumArmor (Ardium, 1).setCreativeTab (com.ardium.pvp.Ardium.ARDIUM_CREATIVE_TAB).setTextureName (com.ardium.pvp.Ardium.MOD_ID + ":ardium_chestplate").setUnlocalizedName ("ardium_chestplate");
        GameRegistry.registerItem (ardium_chestplate, "ardium_chestplate");

        ardium_leggings = new ItemArdiumArmor (Ardium, 2).setCreativeTab (com.ardium.pvp.Ardium.ARDIUM_CREATIVE_TAB).setTextureName (com.ardium.pvp.Ardium.MOD_ID + ":ardium_leggings").setUnlocalizedName ("ardium_leggings");
        GameRegistry.registerItem (ardium_leggings, "ardium_leggings");

        ardium_boots = new ItemArdiumArmor (Ardium, 3).setCreativeTab (com.ardium.pvp.Ardium.ARDIUM_CREATIVE_TAB).setTextureName (com.ardium.pvp.Ardium.MOD_ID + ":ardium_boots").setUnlocalizedName ("ardium_boots");
        GameRegistry.registerItem (ardium_boots, "ardium_boots");

        Item oxium_helmet = new ItemOxiumArmor (Oxium, 0).setCreativeTab (com.ardium.pvp.Ardium.ARDIUM_CREATIVE_TAB).setTextureName (com.ardium.pvp.Ardium.MOD_ID + ":oxium_helmet").setUnlocalizedName ("oxium_helmet");
        GameRegistry.registerItem (oxium_helmet, "oxium_helmet");

        Item oxium_chestplate = new ItemOxiumArmor (Oxium, 1).setCreativeTab (com.ardium.pvp.Ardium.ARDIUM_CREATIVE_TAB).setTextureName (com.ardium.pvp.Ardium.MOD_ID + ":oxium_chestplate").setUnlocalizedName ("oxium_chestplate");
        GameRegistry.registerItem (oxium_chestplate, "oxium_chestplate");

        Item oxium_leggings = new ItemOxiumArmor (Oxium, 2).setCreativeTab (com.ardium.pvp.Ardium.ARDIUM_CREATIVE_TAB).setTextureName (com.ardium.pvp.Ardium.MOD_ID + ":oxium_leggings").setUnlocalizedName ("oxium_leggings");
        GameRegistry.registerItem (oxium_leggings, "oxium_leggings");

        Item oxium_boots = new ItemOxiumArmor (Oxium, 3).setCreativeTab (com.ardium.pvp.Ardium.ARDIUM_CREATIVE_TAB).setTextureName (com.ardium.pvp.Ardium.MOD_ID + ":oxium_boots").setUnlocalizedName ("oxium_boots");
        GameRegistry.registerItem (oxium_boots, "oxium_boots");

        Item ardium_3D_helmet = new ItemArdium3DArmor (Ardium, 0).setCreativeTab (com.ardium.pvp.Ardium.ARDIUM_CREATIVE_TAB).setTextureName (com.ardium.pvp.Ardium.MOD_ID + ":ardium_3D_helmet").setUnlocalizedName ("ardium_3D_helmet");
        GameRegistry.registerItem (ardium_3D_helmet, "ardium_3D_helmet");

        Item ardium_3D_chestplate = new ItemArdium3DArmor (Ardium, 1).setCreativeTab (com.ardium.pvp.Ardium.ARDIUM_CREATIVE_TAB).setTextureName (com.ardium.pvp.Ardium.MOD_ID + ":ardium_3D_chestplate").setUnlocalizedName ("ardium_3D_chestplate");
        GameRegistry.registerItem (ardium_3D_chestplate, "ardium_3D_chestplate");

        Item ardium_3D_leggings = new ItemArdium3DArmor (Ardium, 2).setCreativeTab (com.ardium.pvp.Ardium.ARDIUM_CREATIVE_TAB).setTextureName (com.ardium.pvp.Ardium.MOD_ID + ":ardium_3D_leggings").setUnlocalizedName ("ardium_3D_leggings");
        GameRegistry.registerItem (ardium_3D_leggings, "ardium_3D_leggings");

        Item ardium_3D_boots = new ItemArdium3DArmor (Ardium, 3).setCreativeTab (com.ardium.pvp.Ardium.ARDIUM_CREATIVE_TAB).setTextureName (com.ardium.pvp.Ardium.MOD_ID + ":ardium_3D_boots").setUnlocalizedName ("ardium_3D_boots");
        GameRegistry.registerItem (ardium_3D_boots, "ardium_3D_boots");
    }
}
