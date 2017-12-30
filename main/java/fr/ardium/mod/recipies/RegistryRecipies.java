package fr.ardium.mod.recipies;

import cpw.mods.fml.common.registry.GameRegistry;
import fr.ardium.mod.ArdiumFuncs;
import fr.ardium.mod.armors.RegistryArmors;
import fr.ardium.mod.blocks.RegistryBlocks;
import fr.ardium.mod.blocks.RegistryFluid;
import fr.ardium.mod.items.RegistryItems;
import fr.ardium.mod.tools.RegistryTools;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class RegistryRecipies 
{
	public static void register()
	{
	
    GameRegistry.addRecipe(new ItemStack (RegistryBlocks.ardium_block , 1), new Object[]{"###" , "###" , "###" ,'#' , RegistryItems.ardium_ingot});
    GameRegistry.addShapelessRecipe(new ItemStack(RegistryItems.ardium_ingot,9), new ItemStack(RegistryBlocks.ardium_block));
	    
    GameRegistry.addRecipe(new ItemStack (RegistryBlocks.big_ardium_block , 1), new Object[]{"###" , "###" , "###" ,'#' , RegistryBlocks.ardium_block});
    GameRegistry.addShapelessRecipe(new ItemStack(RegistryBlocks.ardium_block,9), new ItemStack(RegistryBlocks.big_ardium_block));
	    
    GameRegistry.addSmelting(RegistryBlocks.ardium_ore, new ItemStack(RegistryItems.ardium_ingot), 5f);
	    
    GameRegistry.addRecipe(new ItemStack (RegistryTools.ardium_sword , 1), new Object[]{" # " , " # " , " y " ,'#' , RegistryItems.ardium_ingot ,'y' , Items.stick});
    GameRegistry.addRecipe(new ItemStack (RegistryTools.ardium_sword , 1), new Object[]{"  #" , "  #" , "  y" ,'#' ,RegistryItems.ardium_ingot ,'y' , Items.stick});
    GameRegistry.addRecipe(new ItemStack (RegistryTools.ardium_axe , 1), new Object[]{"## " , "#y " , " y " ,'#' , RegistryItems.ardium_ingot ,'y' , Items.stick});
    GameRegistry.addRecipe(new ItemStack (RegistryTools.ardium_axe , 1), new Object[]{"  ##" , "  y#" , "  y" ,'#' , RegistryItems.ardium_ingot ,'y' , Items.stick});
    GameRegistry.addRecipe(new ItemStack (RegistryTools.ardium_shovel , 1), new Object[]{"#  " , "y  " , "y  " ,'#' , RegistryItems.ardium_ingot ,'y' , Items.stick});
    GameRegistry.addRecipe(new ItemStack (RegistryTools.ardium_shovel, 1), new Object[]{" # " , " y " , " y " ,'#' , RegistryItems.ardium_ingot ,'y' , Items.stick});
    GameRegistry.addRecipe(new ItemStack (RegistryTools.ardium_shovel , 1), new Object[]{"  #" , "  y" , "  y" ,'#' , RegistryItems.ardium_ingot ,'y' , Items.stick});
    GameRegistry.addRecipe(new ItemStack (RegistryTools.ardium_pickaxe , 1), new Object[]{"###" , " y " , " y " ,'#' , RegistryItems.ardium_ingot ,'y' , Items.stick});
	    
    GameRegistry.addRecipe(new ItemStack (RegistryArmors.ardium_helmet , 1), new Object[]{"###" , "# #" , "   " ,'#' ,RegistryItems.ardium_ingot});
    GameRegistry.addRecipe(new ItemStack (RegistryArmors.ardium_helmet , 1), new Object[]{"   " , "###" , "# #" ,'#' , RegistryItems.ardium_ingot});
    GameRegistry.addRecipe(new ItemStack (RegistryArmors.ardium_chestplate , 1), new Object[]{"# #" , "###" , "###" ,'#' , RegistryItems.ardium_ingot});
    GameRegistry.addRecipe(new ItemStack (RegistryArmors.ardium_leggings , 1), new Object[]{"###" , "# #" , "# #" ,'#' , RegistryItems.ardium_ingot});
    GameRegistry.addRecipe(new ItemStack (RegistryArmors.ardium_boots , 1), new Object[]{"# #" , "# #" , "   " ,'#' , RegistryItems.ardium_ingot});
    GameRegistry.addRecipe(new ItemStack (RegistryArmors.ardium_boots , 1), new Object[]{"   " , "# #" , "# #" ,'#' , RegistryItems.ardium_ingot});
		
    GameRegistry.addRecipe(new ItemStack (RegistryItems.dynamite, 1), new Object[]{" # " , " 1 " ," 1 ",'#' ,Items.string ,'1', Blocks.tnt});
	    
    GameRegistry.addRecipe(new ItemStack (RegistryItems.ardium_apple, 1), new Object[]{"###" , "#1#" ,"###",'#' ,RegistryItems.ardium_ingot ,'1', Items.apple});
	    
    GameRegistry.addRecipe(new ItemStack(RegistryFluid.FakeWaterBucket, 1), new Object[] { "O", "X", Character.valueOf('X'), new ItemStack(Items.water_bucket), Character.valueOf('O'), new ItemStack(Items.spider_eye) });
	    
    GameRegistry.addRecipe(new ItemStack(RegistryItems.backpack, 1), new Object[] { "XXX", "YZY", "YYY", Character.valueOf('X'), new ItemStack(RegistryItems.ardium_ingot), Character.valueOf('Z'), new ItemStack(Blocks.chest),  Character.valueOf('Y'), new ItemStack(Items.leather) });
	    
    GameRegistry.addRecipe(new ItemStack(RegistryItems.wand_explorer, 1), new Object[] { " X ", "YZY", " X ", Character.valueOf('X'), new ItemStack(RegistryBlocks.ardium_block), Character.valueOf('Y'), new ItemStack(RegistryItems.ardium_ingot), Character.valueOf('Z'), new ItemStack(Blocks.chest) });
	
    GameRegistry.addRecipe(new ItemStack(RegistryBlocks.ardium_furnace), new Object[] { "XXX", "X X", "XXX", Character.valueOf('X'), new ItemStack(RegistryItems.ardium_ingot) });  
    
	GameRegistry.addRecipe(new ItemStack (RegistryBlocks.spruce_trapdoor , 9), new Object[]{"###" , "###" , "###" ,'#' ,  new ItemStack (Blocks.planks , 1 ,1)});
	GameRegistry.addRecipe(new ItemStack (RegistryBlocks.birch_trapdoor , 9), new Object[]{"###" , "###" , "###" ,'#' ,  new ItemStack (Blocks.planks , 1 ,2)});
	GameRegistry.addRecipe(new ItemStack (RegistryBlocks.jungle_trapdoor , 9), new Object[]{"###" , "###" , "###" ,'#' ,  new ItemStack (Blocks.planks , 1 ,3)});
	GameRegistry.addRecipe(new ItemStack (RegistryBlocks.acacia_trapdoor , 9), new Object[]{"###" , "###" , "###" ,'#' ,  new ItemStack (Blocks.planks , 1 ,4)});
	GameRegistry.addRecipe(new ItemStack (RegistryBlocks.dark_oak_trapdoor , 9), new Object[]{"###" , "###" , "###" ,'#' ,  new ItemStack (Blocks.planks , 1 ,5)});
	    
	GameRegistry.addRecipe(new ItemStack (RegistryItems.spruce_door , 9), new Object[]{"###" , "#L#" , "###" ,'#' ,  new ItemStack (Blocks.planks , 1 ,1),'L' ,  new ItemStack (Items.wooden_door)});   
	GameRegistry.addRecipe(new ItemStack (RegistryItems.birch_door , 9), new Object[]{"###" , "#L#" , "###" ,'#' ,  new ItemStack (Blocks.planks , 1 ,2),'L' ,  new ItemStack (Items.wooden_door)});
	GameRegistry.addRecipe(new ItemStack (RegistryItems.jungle_door , 9), new Object[]{"###" , "#L#" , "###" ,'#' ,  new ItemStack (Blocks.planks , 1 ,3),'L' ,  new ItemStack (Items.wooden_door)});
	GameRegistry.addRecipe(new ItemStack (RegistryItems.acacia_door , 9), new Object[]{"###" , "#L#" , "###" ,'#' ,  new ItemStack (Blocks.planks , 1 ,4),'L' ,  new ItemStack (Items.wooden_door)});
	GameRegistry.addRecipe(new ItemStack (RegistryItems.dark_oak_door , 9), new Object[]{"###" , "#L#" , "###" ,'#' ,  new ItemStack (Blocks.planks , 1 ,5),'L' ,  new ItemStack (Items.wooden_door)});
	    
	ArdiumFuncs.removeCraft(new ItemStack(Items.dye,15));
	    	    
	GameRegistry.addRecipe(new ItemStack(RegistryItems.gold_seed,1), new Object[] { "WXW", "XZX", "WXW", Character.valueOf('X'), new ItemStack(Items.gold_ingot), Character.valueOf('Z'), new ItemStack (RegistryItems.infused_fragment,1,2 ), Character.valueOf('W'), new ItemStack (RegistryItems.magical_essences,1,2 )});
	GameRegistry.addRecipe(new ItemStack(RegistryItems.emerald_seed,1), new Object[] { "WXW", "XZX", "WXW", Character.valueOf('X'), new ItemStack(Items.emerald), Character.valueOf('Z'), new ItemStack (RegistryItems.infused_fragment,1,2 ), Character.valueOf('W'), new ItemStack (RegistryItems.magical_essences,1,2)});
	GameRegistry.addRecipe(new ItemStack(RegistryItems.redstone_seed,1), new Object[] { "WXW", "XZX", "WXW", Character.valueOf('X'), new ItemStack(Items.redstone), Character.valueOf('Z'), new ItemStack (RegistryItems.infused_fragment,1,2 ), Character.valueOf('W'), new ItemStack (RegistryItems.magical_essences,1,2)});
    GameRegistry.addRecipe(new ItemStack(RegistryItems.gold_seed,1), new Object[] { "WXW", "XZX", "WXW", Character.valueOf('X'), new ItemStack(Items.gold_ingot), Character.valueOf('Z'), new ItemStack (RegistryItems.infused_fragment,1,4 ), Character.valueOf('W'), new ItemStack (RegistryItems.magical_essences,1,2 )});
	GameRegistry.addRecipe(new ItemStack(RegistryItems.emerald_seed,1), new Object[] { "WXW", "XZX", "WXW", Character.valueOf('X'), new ItemStack(Items.emerald), Character.valueOf('Z'), new ItemStack (RegistryItems.infused_fragment,1,4), Character.valueOf('W'), new ItemStack (RegistryItems.magical_essences,1,2)});
	GameRegistry.addRecipe(new ItemStack(RegistryItems.redstone_seed,1), new Object[] { "WXW", "XZX", "WXW", Character.valueOf('X'), new ItemStack(Items.redstone), Character.valueOf('Z'), new ItemStack (RegistryItems.infused_fragment,1,4 ), Character.valueOf('W'), new ItemStack (RegistryItems.magical_essences,1,2)});
	GameRegistry.addRecipe(new ItemStack(RegistryItems.magical_essences, 1, 3), new Object[] { " X ", "XZX", " X ", Character.valueOf('X'), new ItemStack(RegistryItems.magical_essences, 1, 2), Character.valueOf('Z'), new ItemStack (RegistryItems.infused_fragment,1,3)});
	GameRegistry.addRecipe(new ItemStack(RegistryItems.magical_essences, 1, 3), new Object[] { " X ", "XZX", " X ", Character.valueOf('X'), new ItemStack(RegistryItems.magical_essences, 1, 2), Character.valueOf('Z'), new ItemStack (RegistryItems.infused_fragment,1,4)});
	GameRegistry.addRecipe(new ItemStack(RegistryItems.infused_fragment, 1, 0), new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), new ItemStack(RegistryItems.magical_essences, 1, 0), Character.valueOf('Z'), Items.diamond });
    GameRegistry.addRecipe(new ItemStack(RegistryItems.infused_fragment, 1, 0), new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), new ItemStack(RegistryItems.magical_essences, 1, 0), Character.valueOf('Z'), Items.emerald });
    GameRegistry.addRecipe(new ItemStack(RegistryItems.infused_fragment, 1, 1), new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), new ItemStack(RegistryItems.element_essences,1,0), Character.valueOf('Z'), new ItemStack (RegistryItems.infused_fragment,1,0)});
    GameRegistry.addRecipe(new ItemStack(RegistryItems.infused_fragment, 1, 1), new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), new ItemStack(RegistryItems.element_essences,1,1), Character.valueOf('Z'), new ItemStack (RegistryItems.infused_fragment,1,0)});
    GameRegistry.addRecipe(new ItemStack(RegistryItems.infused_fragment, 1, 1), new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), new ItemStack(RegistryItems.element_essences,1,2), Character.valueOf('Z'), new ItemStack (RegistryItems.infused_fragment,1,0)});
    GameRegistry.addRecipe(new ItemStack(RegistryItems.infused_fragment, 1, 1), new Object[] { "XXX", "XZX", "XXX", 'X',new ItemStack (RegistryItems.element_essences,1,3), Character.valueOf('Z'), new ItemStack (RegistryItems.infused_fragment,1,0)}); 
    GameRegistry.addRecipe(new ItemStack(RegistryItems.infused_fragment, 1, 1), new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), new ItemStack(RegistryItems.element_essences,1,0), Character.valueOf('Z'), new ItemStack (RegistryItems.infused_fragment,1,4)});
    GameRegistry.addRecipe(new ItemStack(RegistryItems.infused_fragment, 1, 1), new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), new ItemStack(RegistryItems.element_essences,1,1), Character.valueOf('Z'), new ItemStack (RegistryItems.infused_fragment,1,4)});
    GameRegistry.addRecipe(new ItemStack(RegistryItems.infused_fragment, 1, 1), new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), new ItemStack(RegistryItems.element_essences,1,2), Character.valueOf('Z'), new ItemStack (RegistryItems.infused_fragment,1,4)});
    GameRegistry.addRecipe(new ItemStack(RegistryItems.infused_fragment, 1, 1), new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), new ItemStack(RegistryItems.element_essences,1,3), Character.valueOf('Z'), new ItemStack (RegistryItems.infused_fragment,1,4)});
    GameRegistry.addRecipe(new ItemStack(RegistryItems.infused_fragment, 1, 2), new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), new ItemStack(RegistryItems.CropEssencesT1,1,0), Character.valueOf('Z'), new ItemStack (RegistryItems.infused_fragment,1,1)});
    GameRegistry.addRecipe(new ItemStack(RegistryItems.infused_fragment, 1, 2), new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), new ItemStack(RegistryItems.CropEssencesT1,1,1), Character.valueOf('Z'), new ItemStack (RegistryItems.infused_fragment,1,1)});
    GameRegistry.addRecipe(new ItemStack(RegistryItems.infused_fragment, 1, 2), new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), new ItemStack(RegistryItems.CropEssencesT1,1,2), Character.valueOf('Z'), new ItemStack (RegistryItems.infused_fragment,1,1)});
    GameRegistry.addRecipe(new ItemStack(RegistryItems.infused_fragment, 1, 2), new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), new ItemStack(RegistryItems.CropEssencesT1,1,0), Character.valueOf('Z'), new ItemStack (RegistryItems.infused_fragment,1,4)});
    GameRegistry.addRecipe(new ItemStack(RegistryItems.infused_fragment, 1, 2), new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), new ItemStack(RegistryItems.CropEssencesT1,1,1), Character.valueOf('Z'), new ItemStack (RegistryItems.infused_fragment,1,4)});
    GameRegistry.addRecipe(new ItemStack(RegistryItems.infused_fragment, 1, 2), new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), new ItemStack(RegistryItems.CropEssencesT1,1,2), Character.valueOf('Z'), new ItemStack (RegistryItems.infused_fragment,1,4)});
    GameRegistry.addRecipe(new ItemStack(RegistryItems.infused_fragment, 1, 3), new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), new ItemStack(RegistryItems.CropEssencesT2,1,0), Character.valueOf('Z'), new ItemStack (RegistryItems.infused_fragment,1,2)});
    GameRegistry.addRecipe(new ItemStack(RegistryItems.infused_fragment, 1, 3), new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), new ItemStack(RegistryItems.CropEssencesT2,1,1), Character.valueOf('Z'), new ItemStack (RegistryItems.infused_fragment,1,2)});
    GameRegistry.addRecipe(new ItemStack(RegistryItems.infused_fragment, 1, 3), new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), new ItemStack(RegistryItems.CropEssencesT2,1,2), Character.valueOf('Z'), new ItemStack (RegistryItems.infused_fragment,1,2)});
    GameRegistry.addRecipe(new ItemStack(RegistryItems.infused_fragment, 1, 3), new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), new ItemStack(RegistryItems.CropEssencesT2,1,0), Character.valueOf('Z'), new ItemStack (RegistryItems.infused_fragment,1,4)});
    GameRegistry.addRecipe(new ItemStack(RegistryItems.infused_fragment, 1, 3), new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), new ItemStack(RegistryItems.CropEssencesT2,1,1), Character.valueOf('Z'), new ItemStack (RegistryItems.infused_fragment,1,4)});
    GameRegistry.addRecipe(new ItemStack(RegistryItems.infused_fragment, 1, 3), new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), new ItemStack(RegistryItems.CropEssencesT2,1,2), Character.valueOf('Z'), new ItemStack (RegistryItems.infused_fragment,1,4)});
    GameRegistry.addRecipe(new ItemStack(RegistryItems.infused_fragment, 1, 4), new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), new ItemStack(RegistryItems.CropEssencesT3,1,0), Character.valueOf('Z'), new ItemStack (RegistryItems.infused_fragment,1,3)});
    GameRegistry.addRecipe(new ItemStack(RegistryItems.infused_fragment, 1, 4), new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), new ItemStack(RegistryItems.CropEssencesT3,1,1), Character.valueOf('Z'), new ItemStack (RegistryItems.infused_fragment,1,3)});
    GameRegistry.addRecipe(new ItemStack(RegistryItems.infused_fragment, 1, 4), new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), new ItemStack(RegistryItems.CropEssencesT3,1,2), Character.valueOf('Z'), new ItemStack (RegistryItems.infused_fragment,1,3)});
    GameRegistry.addRecipe(new ItemStack(RegistryItems.water_seed,1), new Object[] { "WXW", "XZX", "WXW", Character.valueOf('X'), new ItemStack(Items.water_bucket), Character.valueOf('Z'), new ItemStack (RegistryItems.infused_fragment,1,0 ), Character.valueOf('W'), new ItemStack (RegistryItems.magical_essences,1,0 )});
    GameRegistry.addRecipe(new ItemStack(RegistryItems.fire_seed,1), new Object[] { "WXW", "XZX", "WXW", Character.valueOf('X'), new ItemStack(Items.lava_bucket), Character.valueOf('Z'), new ItemStack (RegistryItems.infused_fragment,1,0 ), Character.valueOf('W'), new ItemStack (RegistryItems.magical_essences,1,0 )});
    GameRegistry.addRecipe(new ItemStack(RegistryItems.air_seed,1), new Object[] { "WXW", "XZX", "WXW", Character.valueOf('X'), new ItemStack(Items.apple), Character.valueOf('Z'), new ItemStack (RegistryItems.infused_fragment,1,0 ), Character.valueOf('W'), new ItemStack (RegistryItems.magical_essences,1,0 )});
    GameRegistry.addRecipe(new ItemStack(RegistryItems.earth_seed,1), new Object[] { "WXW", "XZX", "WXW", Character.valueOf('X'), new ItemStack(Blocks.dirt), Character.valueOf('Z'), new ItemStack (RegistryItems.infused_fragment,1,0 ), Character.valueOf('W'), new ItemStack (RegistryItems.magical_essences,1,0 )});
    GameRegistry.addRecipe(new ItemStack(RegistryItems.diamond_seed,1), new Object[] { "WXW", "XZX", "WXW", Character.valueOf('X'), new ItemStack(Items.diamond), Character.valueOf('Z'), new ItemStack (RegistryItems.infused_fragment,1,3 ), Character.valueOf('W'), new ItemStack (RegistryItems.magical_essences,1,3 )});
    GameRegistry.addRecipe(new ItemStack(RegistryItems.diamond_seed,1), new Object[] { "WXW", "XZX", "WXW", Character.valueOf('X'), new ItemStack(Items.diamond), Character.valueOf('Z'), new ItemStack (RegistryItems.infused_fragment,1,4 ), Character.valueOf('W'), new ItemStack (RegistryItems.magical_essences,1,3 )});
    GameRegistry.addRecipe(new ItemStack(RegistryItems.iron_seed,1), new Object[] { "WXW", "XZX", "WXW", Character.valueOf('X'), new ItemStack(Items.iron_ingot), Character.valueOf('Z'), new ItemStack (RegistryItems.infused_fragment,1,1 ), Character.valueOf('W'), new ItemStack (RegistryItems.magical_essences,1,1 )});
    GameRegistry.addRecipe(new ItemStack(RegistryItems.coal_seed,1), new Object[] { "WXW", "XZX", "WXW", Character.valueOf('X'), new ItemStack(Items.coal), Character.valueOf('Z'), new ItemStack (RegistryItems.infused_fragment,1,1 ), Character.valueOf('W'), new ItemStack (RegistryItems.magical_essences,1,1 )});
    GameRegistry.addRecipe(new ItemStack(RegistryItems.lapis_seed,1), new Object[] { "WXW", "XZX", "WXW", Character.valueOf('X'), new ItemStack(Items.dye,1,4), Character.valueOf('Z'), new ItemStack (RegistryItems.infused_fragment,1,1 ), Character.valueOf('W'), new ItemStack (RegistryItems.magical_essences,1,1 )});
    GameRegistry.addRecipe(new ItemStack(RegistryItems.iron_seed,1), new Object[] { "WXW", "XZX", "WXW", Character.valueOf('X'), new ItemStack(Items.iron_ingot), Character.valueOf('Z'), new ItemStack (RegistryItems.infused_fragment,1,4 ), Character.valueOf('W'), new ItemStack (RegistryItems.magical_essences,1,1 )});
    GameRegistry.addRecipe(new ItemStack(RegistryItems.coal_seed,1), new Object[] { "WXW", "XZX", "WXW", Character.valueOf('X'), new ItemStack(Items.coal), Character.valueOf('Z'), new ItemStack (RegistryItems.infused_fragment,1,4 ), Character.valueOf('W'), new ItemStack (RegistryItems.magical_essences,1,1 )});
    GameRegistry.addRecipe(new ItemStack(RegistryItems.lapis_seed,1), new Object[] { "WXW", "XZX", "WXW", Character.valueOf('X'), new ItemStack(Items.dye,1,4), Character.valueOf('Z'), new ItemStack (RegistryItems.infused_fragment,1,4 ), Character.valueOf('W'), new ItemStack (RegistryItems.magical_essences,1,1 )});
    GameRegistry.addRecipe(new ItemStack(RegistryItems.inferium_seed,1), new Object[] { "WXW", "XZX", "WXW", Character.valueOf('X'), new ItemStack(Items.wheat_seeds), Character.valueOf('Z'), new ItemStack (RegistryItems.infused_fragment,1,4 ), Character.valueOf('W'), new ItemStack (RegistryItems.magical_essences,1,0 )});
    GameRegistry.addRecipe(new ItemStack(RegistryItems.inferium_seed,1), new Object[] { "WXW", "XZX", "WXW", Character.valueOf('X'), new ItemStack(Items.wheat_seeds), Character.valueOf('Z'), new ItemStack (RegistryItems.infused_fragment,1,0 ), Character.valueOf('W'), new ItemStack (RegistryItems.magical_essences,1,0 )});
    GameRegistry.addRecipe(new ItemStack(RegistryItems.magical_essences, 1, 1), new Object[] { " X ", "XZX", " X ", Character.valueOf('X'), new ItemStack(RegistryItems.magical_essences, 1, 0), Character.valueOf('Z'), new ItemStack (RegistryItems.infused_fragment,1,1)});
    GameRegistry.addRecipe(new ItemStack(RegistryItems.magical_essences, 1, 1), new Object[] { " X ", "XZX", " X ", Character.valueOf('X'), new ItemStack(RegistryItems.magical_essences, 1, 0), Character.valueOf('Z'), new ItemStack (RegistryItems.infused_fragment,1,4)});
    GameRegistry.addRecipe(new ItemStack(RegistryItems.magical_essences, 1, 2), new Object[] { " X ", "XZX", " X ", Character.valueOf('X'), new ItemStack(RegistryItems.magical_essences, 1, 1), Character.valueOf('Z'), new ItemStack (RegistryItems.infused_fragment,1,2)});
    GameRegistry.addRecipe(new ItemStack(RegistryItems.magical_essences, 1, 2), new Object[] { " X ", "XZX", " X ", Character.valueOf('X'), new ItemStack(RegistryItems.magical_essences, 1, 1), Character.valueOf('Z'), new ItemStack (RegistryItems.infused_fragment,1,4)});
    GameRegistry.addRecipe(new ItemStack(RegistryItems.magical_essences, 8, 0), new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), new ItemStack(Items.gunpowder, 1, 0), Character.valueOf('Z'), Items.diamond });
    GameRegistry.addRecipe(new ItemStack(RegistryItems.magical_essences, 8, 0), new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), new ItemStack(Items.gunpowder, 1, 0), Character.valueOf('Z'), Items.emerald });
    
    GameRegistry.addRecipe(new ItemStack (RegistryBlocks.ardium_extractor , 1),new Object[]{"AAA","AFA","AAA",'A',RegistryItems.ardium_ingot,'F',Blocks.furnace});
    GameRegistry.addRecipe(new ItemStack (RegistryBlocks.fertilizer , 1),new Object[]{"AAA","AFA","AAA",'A',RegistryItems.ardium_ingot,'F',Items.wheat_seeds});
    
	 GameRegistry.addRecipe(new ItemStack(RegistryItems.itemLantern, 1), new Object[]{" I ", " S ", " I ", 'I', Items.iron_ingot, 'S', Items.glowstone_dust});
	}
}
