package com.ardium.pvp.items;

import com.ardium.pvp.Ardium;
import com.ardium.pvp.blocks.RegistryBlocks;
import com.ardium.pvp.entity.ItemDynamite;
import com.ardium.pvp.items.crops.*;
import com.ardium.pvp.newcrops.SeedsAmorpha;
import com.ardium.pvp.newcrops.SeedsCleome;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class RegistryItems {
    public static Item ardium_ingot;
    public static Item dynamite;
    public static Item ardium_apple;
    public static Item backpack;
    public static Item wand_explorer;
    public static Item itemLantern;
    public static Item amorpha_petal;
    public static Item leaf;
    public static Item spruce_door, acacia_door, birch_door, dark_oak_door, jungle_door;
    public static Item CropEssencesT1, CropEssencesT3, CropEssencesT2;
    public static Item fertilized_seed, gold_seed, emerald_seed, redstone_seed, inferium_seed, intermidium_seed, superium_seed, supremium_seed, iron_seed, coal_seed, lapis_seed, diamond_seed, certus_seed, certuslvl2_seed, infused_fragment, element_essences, magical_essences, air_seed, earth_seed, water_seed, fire_seed;
    private static Item admin_tool;
    private static Item xpberry;
    private static Item amorpha_seeds;
    public static Item record_electric, ardium_crystal;
    private static Item cleome_seeds;


    public static void preInitialization() {
        //Initializing random Items
        admin_tool = new ItemAdminTool ();
        ardium_ingot = new ItemIngotArdium ();
        ardium_apple = new ItemArdiumApple (10, 10F, false);
        backpack = new ItemBackpack ();
        dynamite = new ItemDynamite ();
        wand_explorer = new ItemWandExplorer ();
        xpberry = new itemBerryXP ();

        //Initializing wood types specific doors
        spruce_door = new ItemDoorSpruce ();
        acacia_door = new ItemDoorAcacia ();
        birch_door = new ItemDoorBirch ();
        jungle_door = new ItemDoorJungle ();
        dark_oak_door = new ItemDoorDarkOak ();

        //Initializing the Lantern (as an Item)
        itemLantern = new ItemLantern ();

        //Initializing CropEssences per tier
        CropEssencesT1 = new ItemCropEssencesT1 ();
        CropEssencesT2 = new ItemCropEssencesT2 ();
        CropEssencesT3 = new ItemCropEssencesT3 ();


        //Initilizing Seeds
        inferium_seed = new SeedInferium (RegistryBlocks.inferium_crop, RegistryBlocks.inferium_crop).setUnlocalizedName ("inferium_seed");
        intermidium_seed = new SeedIntermedium (RegistryBlocks.intermidium_crop, RegistryBlocks.intermidium_crop).setUnlocalizedName ("intermedium_seed");
        superium_seed = new SeedsSuperium (RegistryBlocks.superium_crops, RegistryBlocks.superium_crops).setUnlocalizedName ("superium_seed");
        supremium_seed = new SeedsSupremium (RegistryBlocks.supremium_crops, RegistryBlocks.supremium_crops).setUnlocalizedName ("supremium_seed");
        fertilized_seed = new SeedFertilized (RegistryBlocks.fertilized_crop, RegistryBlocks.fertilized_crop).setUnlocalizedName ("fertilized_seed");
        air_seed = new SeedAir (RegistryBlocks.air_crop, RegistryBlocks.air_crop).setUnlocalizedName ("air_seed");
        earth_seed = new SeedEarth (RegistryBlocks.earth_crop, RegistryBlocks.earth_crop).setUnlocalizedName ("earth_seed");
        fire_seed = new SeedFire (RegistryBlocks.fire_crop, RegistryBlocks.fire_crop).setUnlocalizedName ("fire_seed");
        water_seed = new SeedWater (RegistryBlocks.water_crop, RegistryBlocks.water_crop).setUnlocalizedName ("water_seed");
        iron_seed = new SeedIron (RegistryBlocks.iron_crop, RegistryBlocks.iron_crop).setUnlocalizedName ("iron_seed");
        coal_seed = new SeedCoal (RegistryBlocks.coal_crop, RegistryBlocks.coal_crop).setUnlocalizedName ("coal_seed");
        lapis_seed = new SeedLapis (RegistryBlocks.lapis_crop, RegistryBlocks.lapis_crop).setUnlocalizedName ("lapis_seed");
        gold_seed = new SeedGold (RegistryBlocks.gold_crop, RegistryBlocks.gold_crop).setUnlocalizedName ("gold_seed");
        redstone_seed = new SeedRedstone (RegistryBlocks.redstone_crop, RegistryBlocks.redstone_crop).setUnlocalizedName ("redstone_seed");
        emerald_seed = new SeedEmerald (RegistryBlocks.emerald_crop, RegistryBlocks.emerald_crop).setUnlocalizedName ("emerald_seed");
        diamond_seed = new SeedDiamond (RegistryBlocks.diamond_crop, RegistryBlocks.diamond_crop).setUnlocalizedName ("diamond_seed");
        certus_seed = new SeedCertus (RegistryBlocks.certus_crop, RegistryBlocks.certus_crop, "certusquartzseed").setUnlocalizedName ("certus_seed");
        certuslvl2_seed = new SeedCertus (RegistryBlocks.certuslvl2_crop, RegistryBlocks.certuslvl2_crop, "chargedcertusquartzseed").setUnlocalizedName ("certuslvl2_seed");
        infused_fragment = new ItemInfusedFragment ().setUnlocalizedName ("InfusedFragment");
        element_essences = new ItemElementEssences ().setUnlocalizedName ("ElementEssence");
        magical_essences = new ItemMagicalEssences ().setUnlocalizedName ("MagicalEssences");


        amorpha_seeds = new SeedsAmorpha (RegistryBlocks.amorpha_crop, Blocks.farmland).setUnlocalizedName ("SeedsAmorpha").setTextureName (Ardium.MOD_ID + ":SeedsAmorpha").setCreativeTab (Ardium.ARDIUM_CREATIVE_TAB);
        cleome_seeds = new SeedsCleome (RegistryBlocks.cleome_crop, Blocks.farmland).setUnlocalizedName ("cleome_seeds").setTextureName (Ardium.MOD_ID + ":cleome_seeds").setCreativeTab (Ardium.ARDIUM_CREATIVE_TAB);

        amorpha_petal = new Item ().setUnlocalizedName ("amorpha_petal").setTextureName (Ardium.MOD_ID + ":amorpha_petal").setCreativeTab (Ardium.ARDIUM_CREATIVE_TAB);

        leaf = new Item ().setUnlocalizedName ("leaf").setTextureName (Ardium.MOD_ID + ":leaf").setCreativeTab (Ardium.ARDIUM_CREATIVE_TAB);

        register ();
    }

    private static void register() {
        //Registering random Items
        GameRegistry.registerItem (ardium_ingot, ardium_ingot.getUnlocalizedName ().substring (5), Ardium.MOD_ID);
        GameRegistry.registerItem (dynamite, dynamite.getUnlocalizedName ().substring (5), Ardium.MOD_ID);
        GameRegistry.registerItem (ardium_apple, "ardium_apple", Ardium.MOD_ID);
        GameRegistry.registerItem (backpack, "backpack", Ardium.MOD_ID);
        GameRegistry.registerItem (wand_explorer, "wand_explorer", Ardium.MOD_ID);
        GameRegistry.registerItem (admin_tool, "admin_tool", Ardium.MOD_ID);
        GameRegistry.registerItem (xpberry, "xpberry", Ardium.MOD_ID);

        //Registering Doors (Items)
        GameRegistry.registerItem (spruce_door, spruce_door.getUnlocalizedName ().substring (5), Ardium.MOD_ID);
        GameRegistry.registerItem (acacia_door, acacia_door.getUnlocalizedName ().substring (5), Ardium.MOD_ID);
        GameRegistry.registerItem (birch_door, birch_door.getUnlocalizedName ().substring (5), Ardium.MOD_ID);
        GameRegistry.registerItem (jungle_door, jungle_door.getUnlocalizedName ().substring (5), Ardium.MOD_ID);
        GameRegistry.registerItem (dark_oak_door, dark_oak_door.getUnlocalizedName ().substring (5), Ardium.MOD_ID);

        GameRegistry.registerItem (itemLantern, "itemLantern");

        //Registering CropEsssences
        GameRegistry.registerItem (CropEssencesT1, "CropEssencesT1");
        GameRegistry.registerItem (CropEssencesT2, "CropEssencesT2");
        GameRegistry.registerItem (CropEssencesT3, "CropEssencesT3");

        //Registering Seeds
        GameRegistry.registerItem (infused_fragment, "infused_fragment");
        GameRegistry.registerItem (element_essences, "element_essences");
        GameRegistry.registerItem (magical_essences, "magical_essences");
        GameRegistry.registerItem (air_seed, "air_seed");
        GameRegistry.registerItem (fire_seed, "fire_seed");
        GameRegistry.registerItem (water_seed, "water_seed");
        GameRegistry.registerItem (iron_seed, "iron_seed");
        GameRegistry.registerItem (lapis_seed, "lapis_seed");
        GameRegistry.registerItem (coal_seed, "coal_seed");
        GameRegistry.registerItem (gold_seed, "gold_seed");
        GameRegistry.registerItem (emerald_seed, "emerald_seed");
        GameRegistry.registerItem (redstone_seed, "redstone_seed");
        GameRegistry.registerItem (diamond_seed, "diamond_seed");
        GameRegistry.registerItem (certus_seed, "certus_seed");
        GameRegistry.registerItem (certuslvl2_seed, "certuslvl2_seed");
        GameRegistry.registerItem (fertilized_seed, "fertilized_seed");
        GameRegistry.registerItem (superium_seed, "superium_seed");
        GameRegistry.registerItem (supremium_seed, "supremium_seed");
        GameRegistry.registerItem (inferium_seed, "inferium_seed");
        GameRegistry.registerItem (intermidium_seed, "intermidium_seed");
        GameRegistry.registerItem (amorpha_seeds, "SeedsAmorpha");
        GameRegistry.registerItem (cleome_seeds, "cleome_seeds");

        GameRegistry.registerItem (amorpha_petal, "amorpha_petal");
        GameRegistry.registerItem (leaf, "leaf");
    }

}