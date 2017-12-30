package fr.ardium.mod.items;

import cpw.mods.fml.common.registry.GameRegistry;
import fr.ardium.mod.Ardium;
import fr.ardium.mod.blocks.RegistryBlocks;
import fr.ardium.mod.entity.ItemDynamite;
import fr.ardium.mod.items.crops.ItemCropEssencesT1;
import fr.ardium.mod.items.crops.ItemCropEssencesT2;
import fr.ardium.mod.items.crops.ItemCropEssencesT3;
import fr.ardium.mod.items.crops.ItemElementEssences;
import fr.ardium.mod.items.crops.ItemInfusedFragment;
import fr.ardium.mod.items.crops.ItemMagicalEssences;
import fr.ardium.mod.items.crops.SeedAir;
import fr.ardium.mod.items.crops.SeedCertus;
import fr.ardium.mod.items.crops.SeedCoal;
import fr.ardium.mod.items.crops.SeedDiamond;
import fr.ardium.mod.items.crops.SeedEarth;
import fr.ardium.mod.items.crops.SeedEmerald;
import fr.ardium.mod.items.crops.SeedFertilized;
import fr.ardium.mod.items.crops.SeedFire;
import fr.ardium.mod.items.crops.SeedGold;
import fr.ardium.mod.items.crops.SeedInferium;
import fr.ardium.mod.items.crops.SeedIntermedium;
import fr.ardium.mod.items.crops.SeedIron;
import fr.ardium.mod.items.crops.SeedLapis;
import fr.ardium.mod.items.crops.SeedRedstone;
import fr.ardium.mod.items.crops.SeedWater;
import fr.ardium.mod.items.crops.SeedsSuperium;
import fr.ardium.mod.items.crops.SeedsSupremium;
import fr.ardium.mod.newcrops.CleomeSeeds;
import fr.ardium.mod.newcrops.amorpha_seeds;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class RegistryItems 
{
	public static Item ardium_ingot; 
	public static Item dynamite;
	public static Item ardium_apple;
	public static Item backpack;
	public static Item wand_explorer , admin_tool;
	public static Item xpberry , itemLantern;
	public static Item spruce_door,acacia_door,birch_door,dark_oak_door,jungle_door;
	public static Item CropEssencesT1,CropEssencesT3,CropEssencesT2;
	public static Item fertilized_seed,gold_seed,emerald_seed,redstone_seed,inferium_seed,intermidium_seed,superium_seed,supremium_seed,iron_seed,coal_seed,lapis_seed,diamond_seed,certus_seed,certuslvl2_seed,infused_fragment,element_essences,magical_essences,air_seed,earth_seed,water_seed,fire_seed;
	public static Item amorpha_seeds,amorpha_petal,leave;
	public static Item record_electric,ardium_crystal;
	public static Item cleome_seeds;

	
	public static void init() {
	ardium_ingot = new Item().setUnlocalizedName("ardium_ingot").setCreativeTab(Ardium.ArdiumCreativeTab).setTextureName(Ardium.MODID + ":ardium_ingot");
	GameRegistry.registerItem(ardium_ingot,"ardium_ingot");
	
	dynamite = new ItemDynamite("Dynamite").setUnlocalizedName("dynamite").setCreativeTab(Ardium.ArdiumCreativeTab).setTextureName(Ardium.MODID + ":dynamite");
	GameRegistry.registerItem(dynamite,"dynamite");
	
	ardium_apple = new ItemArdiumApple(10, 10F, false).setAlwaysEdible().setUnlocalizedName("ardium_apple").setCreativeTab(Ardium.ArdiumCreativeTab).setTextureName(Ardium.MODID + ":ardium_apple");
	GameRegistry.registerItem(ardium_apple,"ardium_apple");

	backpack = new ItemBackpack();
	GameRegistry.registerItem(backpack,"backpack");
	
	wand_explorer = new ItemWandExplorer().setUnlocalizedName("wand_explorer").setCreativeTab(Ardium.ArdiumCreativeTab).setTextureName(Ardium.MODID + ":wand_explorer");;
	GameRegistry.registerItem(wand_explorer,"wand_explorer");
	
	admin_tool = new ItemAdminChest();
	GameRegistry.registerItem(admin_tool,"admin_tool");
	
	xpberry = new ItemXPBerry();
	GameRegistry.registerItem(xpberry,"xpberry");
	
	spruce_door = new ItemSpruceDoor(Material.wood).setUnlocalizedName("spruce_door").setCreativeTab(CreativeTabs.tabRedstone).setTextureName(Ardium.MODID + ":spruce_door");
	GameRegistry.registerItem(spruce_door,"spruce_door");
	
	acacia_door = new ItemAcaciaDoor(Material.wood).setUnlocalizedName("acacia_door").setCreativeTab(CreativeTabs.tabRedstone).setTextureName(Ardium.MODID + ":acacia_door");
	GameRegistry.registerItem(acacia_door,"acacia_door");
	
	birch_door = new ItemBirchDoor(Material.wood).setUnlocalizedName("birch_door").setCreativeTab(CreativeTabs.tabRedstone).setTextureName(Ardium.MODID + ":birch_door");
	GameRegistry.registerItem(birch_door,"birch_door");
	
	jungle_door = new ItemJungleDoor(Material.wood).setUnlocalizedName("jungle_door").setCreativeTab(CreativeTabs.tabRedstone).setTextureName(Ardium.MODID + ":jungle_door");
	GameRegistry.registerItem(jungle_door,"jungle_door");
	
	dark_oak_door = new ItemDarkOakDoor(Material.wood).setUnlocalizedName("dark_oak_door").setCreativeTab(CreativeTabs.tabRedstone).setTextureName(Ardium.MODID + ":dark_oak_door");
	GameRegistry.registerItem(dark_oak_door,"dark_oak_door");
	
    itemLantern = new ItemLantern("Lantern").setUnlocalizedName("itemLantern").setTextureName("Ardium:lantern");
    GameRegistry.registerItem(itemLantern,"itemLantern");
    
    CropEssencesT1 = new ItemCropEssencesT1().setUnlocalizedName("CropEssences");
    CropEssencesT2 = new ItemCropEssencesT2().setUnlocalizedName("CropEssences");
    CropEssencesT3  = new ItemCropEssencesT3().setUnlocalizedName("CropEssences");
    GameRegistry.registerItem(CropEssencesT1, "CropEssencesT1");
    GameRegistry.registerItem(CropEssencesT2, "CropEssencesT2");
    GameRegistry.registerItem(CropEssencesT3, "CropEssencesT3");
    
    inferium_seed = new SeedInferium(RegistryBlocks.inferium_crop, RegistryBlocks.inferium_crop).setUnlocalizedName("inferium_seed");
    intermidium_seed = new SeedIntermedium(RegistryBlocks.intermidium_crop,RegistryBlocks.intermidium_crop).setUnlocalizedName("intermedium_seed");
    superium_seed = new SeedsSuperium(RegistryBlocks.superium_crops,RegistryBlocks.superium_crops).setUnlocalizedName("superium_seed");
    supremium_seed = new SeedsSupremium(RegistryBlocks.supremium_crops,RegistryBlocks.supremium_crops).setUnlocalizedName("supremium_seed");
    fertilized_seed = new SeedFertilized(RegistryBlocks.fertilized_crop, RegistryBlocks.fertilized_crop).setUnlocalizedName("fertilized_seed");
    air_seed = new SeedAir(RegistryBlocks.air_crop, RegistryBlocks.air_crop).setUnlocalizedName("air_seed");
    earth_seed = new SeedEarth(RegistryBlocks.earth_crop,RegistryBlocks.earth_crop).setUnlocalizedName("earth_seed");
    fire_seed = new SeedFire(RegistryBlocks.fire_crop,RegistryBlocks.fire_crop).setUnlocalizedName("fire_seed");
    water_seed = new SeedWater(RegistryBlocks.water_crop,RegistryBlocks.water_crop).setUnlocalizedName("water_seed");
    iron_seed = new SeedIron(RegistryBlocks.iron_crop, RegistryBlocks.iron_crop).setUnlocalizedName("iron_seed");
    coal_seed = new SeedCoal(RegistryBlocks.coal_crop,RegistryBlocks.coal_crop).setUnlocalizedName("coal_seed");
    lapis_seed = new SeedLapis(RegistryBlocks.lapis_crop,RegistryBlocks.lapis_crop).setUnlocalizedName("lapis_seed");
    gold_seed = new SeedGold(RegistryBlocks.gold_crop, RegistryBlocks.gold_crop).setUnlocalizedName("gold_seed");
    redstone_seed = new SeedRedstone(RegistryBlocks.redstone_crop,RegistryBlocks.redstone_crop).setUnlocalizedName("redstone_seed");
    emerald_seed = new SeedEmerald(RegistryBlocks.emerald_crop,RegistryBlocks.emerald_crop).setUnlocalizedName("emerald_seed");
    diamond_seed = new SeedDiamond(RegistryBlocks.diamond_crop, RegistryBlocks.diamond_crop).setUnlocalizedName("diamond_seed");
    certus_seed = new SeedCertus(RegistryBlocks.certus_crop,RegistryBlocks.certus_crop, "certusquartzseed").setUnlocalizedName("certus_seed");
    certuslvl2_seed = new SeedCertus(RegistryBlocks.certuslvl2_crop,RegistryBlocks.certuslvl2_crop, "chargedcertusquartzseed").setUnlocalizedName("certuslvl2_seed");
    infused_fragment = new ItemInfusedFragment().setUnlocalizedName("InfusedFragment");
    element_essences = new ItemElementEssences().setUnlocalizedName("ElementEssence");
    magical_essences = new ItemMagicalEssences().setUnlocalizedName("MagicalEssences");
    
    GameRegistry.registerItem(infused_fragment, "infused_fragment");
    GameRegistry.registerItem(element_essences, "element_essences");
    GameRegistry.registerItem(magical_essences, "magical_essences");
    GameRegistry.registerItem(air_seed, "air_seed");
    GameRegistry.registerItem(fire_seed, "fire_seed");
    GameRegistry.registerItem(water_seed, "water_seed");
    GameRegistry.registerItem(iron_seed, "iron_seed");
    GameRegistry.registerItem(lapis_seed, "lapis_seed");
    GameRegistry.registerItem(coal_seed, "coal_seed");
    GameRegistry.registerItem(gold_seed, "gold_seed");
    GameRegistry.registerItem(emerald_seed, "emerald_seed");
    GameRegistry.registerItem(redstone_seed, "redstone_seed");
    GameRegistry.registerItem(diamond_seed, "diamond_seed");
    GameRegistry.registerItem(certus_seed, "certus_seed");
    GameRegistry.registerItem(certuslvl2_seed, "certuslvl2_seed");
    GameRegistry.registerItem(fertilized_seed, "fertilized_seed");
    GameRegistry.registerItem(superium_seed, "superium_seed");
    GameRegistry.registerItem(supremium_seed, "supremium_seed");
    GameRegistry.registerItem(inferium_seed, "inferium_seed");
    GameRegistry.registerItem(intermidium_seed, "intermidium_seed");

	amorpha_seeds = new amorpha_seeds(RegistryBlocks.amorpha_crop, Blocks.farmland).setUnlocalizedName("amorpha_seeds").setTextureName(Ardium.MODID+":amorpha_seeds").setCreativeTab(Ardium.ArdiumCreativeTab);
	GameRegistry.registerItem(amorpha_seeds, "amorpha_seeds");
	
	amorpha_petal= new Item().setUnlocalizedName("amorpha_petal").setTextureName(Ardium.MODID+":amorpha_petal").setCreativeTab(Ardium.ArdiumCreativeTab);
	GameRegistry.registerItem(amorpha_petal, "amorpha_petal");
	
	leave= new Item().setUnlocalizedName("leave").setTextureName(Ardium.MODID+":leave").setCreativeTab(Ardium.ArdiumCreativeTab);
	GameRegistry.registerItem(leave, "leave");
	
	cleome_seeds = new CleomeSeeds(RegistryBlocks.cleome_crop, Blocks.farmland).setUnlocalizedName("cleome_seeds").setTextureName(Ardium.MODID+":cleome_seeds").setCreativeTab(Ardium.ArdiumCreativeTab);
	GameRegistry.registerItem(cleome_seeds, "cleome_seeds");
	
	
	
	}

    
    
}


