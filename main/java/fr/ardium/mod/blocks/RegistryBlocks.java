package fr.ardium.mod.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import fr.ardium.mod.Ardium;
import fr.ardium.mod.blocks.crops.BlockCropAir;
import fr.ardium.mod.blocks.crops.BlockCropCertus;
import fr.ardium.mod.blocks.crops.BlockCropCoal;
import fr.ardium.mod.blocks.crops.BlockCropDiamond;
import fr.ardium.mod.blocks.crops.BlockCropEarth;
import fr.ardium.mod.blocks.crops.BlockCropEmerald;
import fr.ardium.mod.blocks.crops.BlockCropFertilized;
import fr.ardium.mod.blocks.crops.BlockCropFire;
import fr.ardium.mod.blocks.crops.BlockCropGold;
import fr.ardium.mod.blocks.crops.BlockCropInferium;
import fr.ardium.mod.blocks.crops.BlockCropIntermedium;
import fr.ardium.mod.blocks.crops.BlockCropIron;
import fr.ardium.mod.blocks.crops.BlockCropLapis;
import fr.ardium.mod.blocks.crops.BlockCropLvl2;
import fr.ardium.mod.blocks.crops.BlockCropRedstone;
import fr.ardium.mod.blocks.crops.BlockCropSuperium;
import fr.ardium.mod.blocks.crops.BlockCropSupremium;
import fr.ardium.mod.blocks.crops.BlockCropWater;
import fr.ardium.mod.newcrops.AmorphaCrop;
import fr.ardium.mod.newcrops.CleomeCrop;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class RegistryBlocks 
{
	public static Block ardium_ore  , ardium_block , big_ardium_block,ardium_stairs,ardium_fences;
	public static Block RainbowLamp;
	public static Block ardium_furnace , ardium_extractor;
	public static Block barrier , lantern , lanternPhys;
	public static Block ardium_bush , xp_bush , oxium_bush;
	public static Block spruce_trapdoor,acacia_trapdoor,birch_trapdoor,dark_oak_trapdoor,jungle_trapdoor;
	public static Block block_spruce_door,block_acacia_door,block_birch_door,block_dark_oak_door,block_jungle_door;
	public static Block fertilized_crop,diamond_crop,certus_crop,certuslvl2_crop,gold_crop,redstone_crop,emerald_crop,inferium_crop,intermidium_crop,superium_crops,supremium_crops,iron_crop,coal_crop,lapis_crop,air_crop,earth_crop,fire_crop,water_crop;
	public static Block fertilizer;
	public static Block iron_box;
	public static Block amorpha_crop;
	public static Block coal_crops,cleome_crop;
	
	public static void init() {
	ardium_ore = new BlockBasic(Material.rock, 2).setBlockName("ardium_ore").setCreativeTab(Ardium.ArdiumCreativeTab).setBlockTextureName(Ardium.MOD_ID + ":ardium_ore").setHardness(5.0F);
	GameRegistry.registerBlock(ardium_ore, ardium_ore.getUnlocalizedName().substring(5));
	
	
	ardium_block = new BlockBasic(Material.rock, 2).setBlockName("ardium_block").setCreativeTab(Ardium.ArdiumCreativeTab).setBlockTextureName(Ardium.MOD_ID + ":ardium_block").setHardness(5.0F);
	GameRegistry.registerBlock(ardium_block, ardium_block.getUnlocalizedName().substring(5));
	
	big_ardium_block = new BlockBasic(Material.rock, 2).setBlockName("big_ardium_block").setCreativeTab(Ardium.ArdiumCreativeTab).setBlockTextureName(Ardium.MOD_ID + ":big_ardium_block").setHardness(5.0F);
	GameRegistry.registerBlock(big_ardium_block, big_ardium_block.getUnlocalizedName().substring(5));
	
	ardium_furnace = new BlockArdiumFurnace(true, "ardium_furnace_off").setBlockName("ardium_furnace").setCreativeTab(Ardium.ArdiumCreativeTab);
	GameRegistry.registerBlock(ardium_furnace, ardium_furnace.getUnlocalizedName().substring(5));
	
	RainbowLamp = new BlockBasic(Material.rock, 2).setBlockName("RainbowLamp").setCreativeTab(Ardium.ArdiumCreativeTab).setBlockTextureName(Ardium.MOD_ID + ":rainbow_lamp").setHardness(5.0F).setLightLevel(2.0F);
	GameRegistry.registerBlock(RainbowLamp, RainbowLamp.getUnlocalizedName().substring(5));
	
	barrier = new BlockBarrier();
	GameRegistry.registerBlock(barrier, barrier.getUnlocalizedName().substring(5));
	
	ardium_extractor = new BlockExtractor().setBlockName("ardium_extractor");
	GameRegistry.registerBlock(ardium_extractor, ardium_extractor.getUnlocalizedName().substring(5));
	
    spruce_trapdoor = new BlockTrapdoor(Material.wood).setBlockName("spruce_trapdoor").setCreativeTab(CreativeTabs.tabRedstone).setBlockTextureName(Ardium.MOD_ID + ":spruce_trapdoor").setHardness(1.0F);
	GameRegistry.registerBlock(spruce_trapdoor, spruce_trapdoor.getUnlocalizedName().substring(5));
	
	acacia_trapdoor = new BlockTrapdoor(Material.wood).setBlockName("acacia_trapdoor").setCreativeTab(CreativeTabs.tabRedstone).setBlockTextureName(Ardium.MOD_ID + ":acacia_trapdoor").setHardness(1.0F);
	GameRegistry.registerBlock(acacia_trapdoor, acacia_trapdoor.getUnlocalizedName().substring(5));
	
	birch_trapdoor = new BlockTrapdoor(Material.wood).setBlockName("birch_trapdoor").setCreativeTab(CreativeTabs.tabRedstone).setBlockTextureName(Ardium.MOD_ID + ":birch_trapdoor").setHardness(1.0F);
	GameRegistry.registerBlock(birch_trapdoor, birch_trapdoor.getUnlocalizedName().substring(5));
	
	dark_oak_trapdoor = new BlockTrapdoor(Material.wood).setBlockName("dark_oak_trapdoor").setCreativeTab(CreativeTabs.tabRedstone).setBlockTextureName(Ardium.MOD_ID + ":dark_oak_trapdoor").setHardness(1.0F);
	GameRegistry.registerBlock(dark_oak_trapdoor, dark_oak_trapdoor.getUnlocalizedName().substring(5));
	
	jungle_trapdoor = new BlockTrapdoor(Material.wood).setBlockName("jungle_trapdoor").setCreativeTab(CreativeTabs.tabRedstone).setBlockTextureName(Ardium.MOD_ID + ":jungle_trapdoor").setHardness(1.0F);
	GameRegistry.registerBlock(jungle_trapdoor, jungle_trapdoor.getUnlocalizedName().substring(5));
	
	block_spruce_door = new BlockSpruceDoor(Material.wood).setBlockName("block_spruce_door").setBlockTextureName(Ardium.MOD_ID + ":spruce_door").setHardness(1.0F);
	GameRegistry.registerBlock(block_spruce_door, block_spruce_door.getUnlocalizedName().substring(5));
	
	block_acacia_door = new BlockAcaciaDoor(Material.wood).setBlockName("block_acacia_door").setBlockTextureName(Ardium.MOD_ID + ":acacia_door").setHardness(1.0F);
	GameRegistry.registerBlock(block_acacia_door,block_acacia_door.getUnlocalizedName().substring(5));
	
	block_birch_door = new BlockBirchDoor(Material.wood).setBlockName("block_birch_door").setBlockTextureName(Ardium.MOD_ID + ":birch_door").setHardness(1.0F);
	GameRegistry.registerBlock(block_birch_door, block_birch_door.getUnlocalizedName().substring(5));
	
	block_dark_oak_door = new BlockDarkOakDoor(Material.wood).setBlockName("block_dark_oak_door").setBlockTextureName(Ardium.MOD_ID + ":dark_oak_door").setHardness(1.0F);
	GameRegistry.registerBlock(block_dark_oak_door, block_dark_oak_door.getUnlocalizedName().substring(5));
	
	block_jungle_door = new BlockJungleDoor(Material.wood).setBlockName("block_jungle_door").setBlockTextureName(Ardium.MOD_ID + ":jungle_door").setHardness(1.0F);
	GameRegistry.registerBlock(block_jungle_door, block_jungle_door.getUnlocalizedName().substring(5));
	
    lantern = new BlockLantern().setBlockName("blockLantern");
	GameRegistry.registerBlock(lantern, lantern.getUnlocalizedName().substring(5));
	
	lanternPhys = new BlockLanternPhys("lanternPhys").setBlockName("blocklanternPhys").setBlockTextureName("ardium:lantern");
	GameRegistry.registerBlock(lanternPhys, lanternPhys.getUnlocalizedName().substring(5));
	
	iron_box = new IronBox(Material.cactus).setBlockName("iron_box").setBlockTextureName(Ardium.MOD_ID + ":iron_box").setCreativeTab(Ardium.ArdiumCreativeTab).setHardness(2.0F);
	GameRegistry.registerBlock(iron_box, iron_box.getUnlocalizedName().substring(5));
	
    fertilized_crop = new BlockCropFertilized(0);
    inferium_crop = new BlockCropInferium(0);
    superium_crops = new BlockCropSuperium(0);
    supremium_crops = new BlockCropSupremium(0);
    intermidium_crop = new BlockCropIntermedium(0);
    air_crop = new BlockCropAir(0);
    earth_crop = new BlockCropEarth(0);
    fire_crop = new BlockCropFire(0);
    water_crop = new BlockCropWater(0);
    iron_crop = new BlockCropIron(0);
    lapis_crop = new BlockCropLapis(0);
    coal_crop = new BlockCropCoal(0);
    gold_crop = new BlockCropGold(0);
    redstone_crop = new BlockCropRedstone(0);
    emerald_crop = new BlockCropEmerald(0);
    diamond_crop = new BlockCropDiamond(0);
    certus_crop = new BlockCropCertus(0);
    certuslvl2_crop = new BlockCropLvl2(0);
    
    
    amorpha_crop = new AmorphaCrop().setBlockName("coal_crops").setBlockTextureName(Ardium.MOD_ID +":amorpha_crop");
    GameRegistry.registerBlock(amorpha_crop, amorpha_crop.getUnlocalizedName().substring(5));
    
    
    GameRegistry.registerBlock(fertilized_crop, fertilized_crop.getUnlocalizedName().substring(5));
    GameRegistry.registerBlock(superium_crops, superium_crops.getUnlocalizedName().substring(5));
    GameRegistry.registerBlock(supremium_crops, supremium_crops.getUnlocalizedName().substring(5));
    GameRegistry.registerBlock(inferium_crop, inferium_crop.getUnlocalizedName().substring(5));
    GameRegistry.registerBlock(intermidium_crop, intermidium_crop.getUnlocalizedName().substring(5));
    GameRegistry.registerBlock(diamond_crop, diamond_crop.getUnlocalizedName().substring(5));
    GameRegistry.registerBlock(certus_crop, certus_crop.getUnlocalizedName().substring(5));
    GameRegistry.registerBlock(certuslvl2_crop, certuslvl2_crop.getUnlocalizedName().substring(5));
    GameRegistry.registerBlock(earth_crop, earth_crop.getUnlocalizedName().substring(5));
    GameRegistry.registerBlock(fire_crop, fire_crop.getUnlocalizedName().substring(5));
    GameRegistry.registerBlock(water_crop, water_crop.getUnlocalizedName().substring(5));
    GameRegistry.registerBlock(iron_crop, iron_crop.getUnlocalizedName().substring(5));
    GameRegistry.registerBlock(coal_crop, coal_crop.getUnlocalizedName().substring(5));
    GameRegistry.registerBlock(lapis_crop, lapis_crop.getUnlocalizedName().substring(5));
    GameRegistry.registerBlock(gold_crop, gold_crop.getUnlocalizedName().substring(5));
    GameRegistry.registerBlock(emerald_crop, emerald_crop.getUnlocalizedName().substring(5));
    GameRegistry.registerBlock(redstone_crop, redstone_crop.getUnlocalizedName().substring(5));
    GameRegistry.registerBlock(air_crop, air_crop.getUnlocalizedName().substring(5));
    
    ardium_stairs = new BlockStairsMod(ardium_block, 0).setBlockName("ardium_stairs").setCreativeTab(Ardium.ArdiumCreativeTab);
	ardium_fences = new BlockFenceMod("ardium:ardium_block", Material.rock).setBlockName("ardium_fences").setCreativeTab(Ardium.ArdiumCreativeTab).setHardness(5.0F);
	
	GameRegistry.registerBlock(ardium_stairs, ardium_stairs.getUnlocalizedName().substring(5));
	GameRegistry.registerBlock(ardium_fences, ardium_fences.getUnlocalizedName().substring(5));
	
	fertilizer = new BlockFertilizer().setBlockName("fertilizer");
	GameRegistry.registerBlock(fertilizer, fertilizer.getUnlocalizedName().substring(5));
     
     cleome_crop = new CleomeCrop().setBlockName("iron_crop").setBlockTextureName(Ardium.MOD_ID +":cleome_crop");
     GameRegistry.registerBlock(cleome_crop, cleome_crop.getUnlocalizedName().substring(5));
	}
 
}
