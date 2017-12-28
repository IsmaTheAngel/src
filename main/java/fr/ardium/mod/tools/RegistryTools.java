package fr.ardium.mod.tools;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class RegistryTools 
{
	public static Item ardium_sword , ardium_pickaxe , ardium_shovel , ardium_axe ,ardium_multitool; 
	public static Item oxium_sword , oxium_pickaxe , oxium_shovel , oxium_axe ,oxium_multitool; 
	public static Item atomic_dissasembler , drill;
	public static ToolMaterial Oxium = EnumHelper.addToolMaterial("Oxium",3, 2000, 20.0F, 5.0F, 25);
	public static ToolMaterial Ardium = EnumHelper.addToolMaterial("Ardium",3, 1561, 8.0F, 3.0F, 10);
	public static void init() 
	{
		ardium_sword = new ToolSword(Ardium).setCreativeTab(fr.ardium.mod.Ardium.ArdiumCreativeTab).setTextureName(fr.ardium.mod.Ardium.MODID + ":ardium_sword").setUnlocalizedName("ardium_sword");
		GameRegistry.registerItem(ardium_sword,"ardium_sword");
		
		ardium_pickaxe = new ToolPickaxe(Ardium).setCreativeTab(fr.ardium.mod.Ardium.ArdiumCreativeTab).setTextureName(fr.ardium.mod.Ardium.MODID + ":ardium_pickaxe").setUnlocalizedName("ardium_pickaxe");
		GameRegistry.registerItem(ardium_pickaxe,"ardium_pickaxe");
		
        ardium_shovel = new ToolShovel(Ardium).setCreativeTab(fr.ardium.mod.Ardium.ArdiumCreativeTab).setTextureName(fr.ardium.mod.Ardium.MODID + ":ardium_shovel").setUnlocalizedName("ardium_shovel");
		GameRegistry.registerItem(ardium_shovel,"ardium_shovel");
		
        ardium_multitool = new ToolMultitool(Ardium).setCreativeTab(fr.ardium.mod.Ardium.ArdiumCreativeTab).setTextureName(fr.ardium.mod.Ardium.MODID + ":ardium_multitool").setUnlocalizedName("ardium_multitool");
		GameRegistry.registerItem(ardium_multitool,"ardium_multitool");
		
        ardium_axe = new ToolAxe(Ardium).setCreativeTab(fr.ardium.mod.Ardium.ArdiumCreativeTab).setTextureName(fr.ardium.mod.Ardium.MODID + ":ardium_axe").setUnlocalizedName("ardium_axe");
		GameRegistry.registerItem(ardium_axe,"ardium_axe");
		
		oxium_sword = new ToolSword(Oxium).setCreativeTab(fr.ardium.mod.Ardium.ArdiumCreativeTab).setTextureName(fr.ardium.mod.Ardium.MODID + ":oxium_sword").setUnlocalizedName("oxium_sword");
		GameRegistry.registerItem(oxium_sword,"oxium_sword");
		
		oxium_pickaxe = new ToolPickaxe(Oxium).setCreativeTab(fr.ardium.mod.Ardium.ArdiumCreativeTab).setTextureName(fr.ardium.mod.Ardium.MODID + ":oxium_pickaxe").setUnlocalizedName("oxium_pickaxe");
		GameRegistry.registerItem(oxium_pickaxe,"oxium_pickaxe");
		
        oxium_shovel = new ToolShovel(Oxium).setCreativeTab(fr.ardium.mod.Ardium.ArdiumCreativeTab).setTextureName(fr.ardium.mod.Ardium.MODID + ":oxium_shovel").setUnlocalizedName("oxium_shovel");
		GameRegistry.registerItem(oxium_shovel,"oxium_shovel");
		
        oxium_multitool = new ToolMultitool(Oxium).setCreativeTab(fr.ardium.mod.Ardium.ArdiumCreativeTab).setTextureName(fr.ardium.mod.Ardium.MODID + ":oxium_multitool").setUnlocalizedName("oxium_multitool");
		GameRegistry.registerItem(oxium_multitool,"oxium_multitool");
		
        oxium_axe = new ToolAxe(Oxium).setCreativeTab(fr.ardium.mod.Ardium.ArdiumCreativeTab).setTextureName(fr.ardium.mod.Ardium.MODID + ":oxium_axe").setUnlocalizedName("oxium_axe");
		GameRegistry.registerItem(oxium_axe,"oxium_axe");
		
		atomic_dissasembler = new ToolAtomicDissasembler(Oxium).setCreativeTab(fr.ardium.mod.Ardium.ArdiumCreativeTab).setUnlocalizedName("atomic_dissasembler");
		GameRegistry.registerItem(atomic_dissasembler,"atomic_dissasembler");
		drill = new ToolDrill(Oxium).setCreativeTab(fr.ardium.mod.Ardium.ArdiumCreativeTab).setUnlocalizedName("drill");
		GameRegistry.registerItem(drill,"drill");
	}
}
