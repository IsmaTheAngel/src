package com.ardium.pvp.recipies;

import com.ardium.pvp.ArdiumFuncs;
import com.ardium.pvp.armors.RegistryArmors;
import com.ardium.pvp.blocks.RegistryBlocks;
import com.ardium.pvp.blocks.RegistryFluid;
import com.ardium.pvp.items.RegistryItems;
import com.ardium.pvp.tools.RegistryTools;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class RegistryRecipies 
{
	public static void register()
	{

        GameRegistry.addRecipe (new ItemStack (RegistryBlocks.ardium_block, 1), "###", "###", "###", '#', RegistryItems.ardium_ingot);
    GameRegistry.addShapelessRecipe(new ItemStack(RegistryItems.ardium_ingot,9), new ItemStack(RegistryBlocks.ardium_block));

        GameRegistry.addRecipe (new ItemStack (RegistryBlocks.big_ardium_block, 1), "###", "###", "###", '#', RegistryBlocks.ardium_block);
    GameRegistry.addShapelessRecipe(new ItemStack(RegistryBlocks.ardium_block,9), new ItemStack(RegistryBlocks.big_ardium_block));
	    
    GameRegistry.addSmelting(RegistryBlocks.ardium_ore, new ItemStack(RegistryItems.ardium_ingot), 5f);

        GameRegistry.addRecipe (new ItemStack (RegistryTools.ardium_sword, 1), " # ", " # ", " y ", '#', RegistryItems.ardium_ingot, 'y', Items.stick);
        GameRegistry.addRecipe (new ItemStack (RegistryTools.ardium_sword, 1), "  #", "  #", "  y", '#', RegistryItems.ardium_ingot, 'y', Items.stick);
        GameRegistry.addRecipe (new ItemStack (RegistryTools.ardium_axe, 1), "## ", "#y ", " y ", '#', RegistryItems.ardium_ingot, 'y', Items.stick);
        GameRegistry.addRecipe (new ItemStack (RegistryTools.ardium_axe, 1), "  ##", "  y#", "  y", '#', RegistryItems.ardium_ingot, 'y', Items.stick);
        GameRegistry.addRecipe (new ItemStack (RegistryTools.ardium_shovel, 1), "#  ", "y  ", "y  ", '#', RegistryItems.ardium_ingot, 'y', Items.stick);
        GameRegistry.addRecipe (new ItemStack (RegistryTools.ardium_shovel, 1), " # ", " y ", " y ", '#', RegistryItems.ardium_ingot, 'y', Items.stick);
        GameRegistry.addRecipe (new ItemStack (RegistryTools.ardium_shovel, 1), "  #", "  y", "  y", '#', RegistryItems.ardium_ingot, 'y', Items.stick);
        GameRegistry.addRecipe (new ItemStack (RegistryTools.ardium_pickaxe, 1), "###", " y ", " y ", '#', RegistryItems.ardium_ingot, 'y', Items.stick);

        GameRegistry.addRecipe (new ItemStack (RegistryArmors.ardium_helmet, 1), "###", "# #", "   ", '#', RegistryItems.ardium_ingot);
        GameRegistry.addRecipe (new ItemStack (RegistryArmors.ardium_helmet, 1), "   ", "###", "# #", '#', RegistryItems.ardium_ingot);
        GameRegistry.addRecipe (new ItemStack (RegistryArmors.ardium_chestplate, 1), "# #", "###", "###", '#', RegistryItems.ardium_ingot);
        GameRegistry.addRecipe (new ItemStack (RegistryArmors.ardium_leggings, 1), "###", "# #", "# #", '#', RegistryItems.ardium_ingot);
        GameRegistry.addRecipe (new ItemStack (RegistryArmors.ardium_boots, 1), "# #", "# #", "   ", '#', RegistryItems.ardium_ingot);
        GameRegistry.addRecipe (new ItemStack (RegistryArmors.ardium_boots, 1), "   ", "# #", "# #", '#', RegistryItems.ardium_ingot);

        GameRegistry.addRecipe (new ItemStack (RegistryItems.dynamite, 1), " # ", " 1 ", " 1 ", '#', Items.string, '1', Blocks.tnt);

        GameRegistry.addRecipe (new ItemStack (RegistryItems.ardium_apple, 1), "###", "#1#", "###", '#', RegistryItems.ardium_ingot, '1', Items.apple);

        GameRegistry.addRecipe (new ItemStack (RegistryFluid.FakeWaterBucket, 1), "O", "X", 'X', new ItemStack (Items.water_bucket), 'O', new ItemStack (Items.spider_eye));

        GameRegistry.addRecipe (new ItemStack (RegistryItems.backpack, 1), "XXX", "YZY", "YYY", 'X', new ItemStack (RegistryItems.ardium_ingot), 'Z', new ItemStack (Blocks.chest), 'Y', new ItemStack (Items.leather));

        GameRegistry.addRecipe (new ItemStack (RegistryItems.wand_explorer, 1), " X ", "YZY", " X ", 'X', new ItemStack (RegistryBlocks.ardium_block), 'Y', new ItemStack (RegistryItems.ardium_ingot), 'Z', new ItemStack (Blocks.chest));

        GameRegistry.addRecipe (new ItemStack (RegistryBlocks.ardium_furnace), "XXX", "X X", "XXX", 'X', new ItemStack (RegistryItems.ardium_ingot));

        GameRegistry.addRecipe (new ItemStack (RegistryBlocks.spruce_trapdoor, 9), "###", "###", "###", '#', new ItemStack (Blocks.planks, 1, 1));
        GameRegistry.addRecipe (new ItemStack (RegistryBlocks.birch_trapdoor, 9), "###", "###", "###", '#', new ItemStack (Blocks.planks, 1, 2));
        GameRegistry.addRecipe (new ItemStack (RegistryBlocks.jungle_trapdoor, 9), "###", "###", "###", '#', new ItemStack (Blocks.planks, 1, 3));
        GameRegistry.addRecipe (new ItemStack (RegistryBlocks.acacia_trapdoor, 9), "###", "###", "###", '#', new ItemStack (Blocks.planks, 1, 4));
        GameRegistry.addRecipe (new ItemStack (RegistryBlocks.dark_oak_trapdoor, 9), "###", "###", "###", '#', new ItemStack (Blocks.planks, 1, 5));

        GameRegistry.addRecipe (new ItemStack (RegistryItems.spruce_door, 9), "###", "#L#", "###", '#', new ItemStack (Blocks.planks, 1, 1), 'L', new ItemStack (Items.wooden_door));
        GameRegistry.addRecipe (new ItemStack (RegistryItems.birch_door, 9), "###", "#L#", "###", '#', new ItemStack (Blocks.planks, 1, 2), 'L', new ItemStack (Items.wooden_door));
        GameRegistry.addRecipe (new ItemStack (RegistryItems.jungle_door, 9), "###", "#L#", "###", '#', new ItemStack (Blocks.planks, 1, 3), 'L', new ItemStack (Items.wooden_door));
        GameRegistry.addRecipe (new ItemStack (RegistryItems.acacia_door, 9), "###", "#L#", "###", '#', new ItemStack (Blocks.planks, 1, 4), 'L', new ItemStack (Items.wooden_door));
        GameRegistry.addRecipe (new ItemStack (RegistryItems.dark_oak_door, 9), "###", "#L#", "###", '#', new ItemStack (Blocks.planks, 1, 5), 'L', new ItemStack (Items.wooden_door));
	    
	ArdiumFuncs.removeCraft(new ItemStack(Items.dye,15));

        GameRegistry.addRecipe (new ItemStack (RegistryItems.gold_seed, 1), "WXW", "XZX", "WXW", 'X', new ItemStack (Items.gold_ingot), 'Z', new ItemStack (RegistryItems.infused_fragment, 1, 2), 'W', new ItemStack (RegistryItems.magical_essences, 1, 2));
        GameRegistry.addRecipe (new ItemStack (RegistryItems.emerald_seed, 1), "WXW", "XZX", "WXW", 'X', new ItemStack (Items.emerald), 'Z', new ItemStack (RegistryItems.infused_fragment, 1, 2), 'W', new ItemStack (RegistryItems.magical_essences, 1, 2));
        GameRegistry.addRecipe (new ItemStack (RegistryItems.redstone_seed, 1), "WXW", "XZX", "WXW", 'X', new ItemStack (Items.redstone), 'Z', new ItemStack (RegistryItems.infused_fragment, 1, 2), 'W', new ItemStack (RegistryItems.magical_essences, 1, 2));
        GameRegistry.addRecipe (new ItemStack (RegistryItems.gold_seed, 1), "WXW", "XZX", "WXW", 'X', new ItemStack (Items.gold_ingot), 'Z', new ItemStack (RegistryItems.infused_fragment, 1, 4), 'W', new ItemStack (RegistryItems.magical_essences, 1, 2));
        GameRegistry.addRecipe (new ItemStack (RegistryItems.emerald_seed, 1), "WXW", "XZX", "WXW", 'X', new ItemStack (Items.emerald), 'Z', new ItemStack (RegistryItems.infused_fragment, 1, 4), 'W', new ItemStack (RegistryItems.magical_essences, 1, 2));
        GameRegistry.addRecipe (new ItemStack (RegistryItems.redstone_seed, 1), "WXW", "XZX", "WXW", 'X', new ItemStack (Items.redstone), 'Z', new ItemStack (RegistryItems.infused_fragment, 1, 4), 'W', new ItemStack (RegistryItems.magical_essences, 1, 2));
        GameRegistry.addRecipe (new ItemStack (RegistryItems.magical_essences, 1, 3), " X ", "XZX", " X ", 'X', new ItemStack (RegistryItems.magical_essences, 1, 2), 'Z', new ItemStack (RegistryItems.infused_fragment, 1, 3));
        GameRegistry.addRecipe (new ItemStack (RegistryItems.magical_essences, 1, 3), " X ", "XZX", " X ", 'X', new ItemStack (RegistryItems.magical_essences, 1, 2), 'Z', new ItemStack (RegistryItems.infused_fragment, 1, 4));
        GameRegistry.addRecipe (new ItemStack (RegistryItems.infused_fragment, 1, 0), "XXX", "XZX", "XXX", 'X', new ItemStack (RegistryItems.magical_essences, 1, 0), 'Z', Items.diamond);
        GameRegistry.addRecipe (new ItemStack (RegistryItems.infused_fragment, 1, 0), "XXX", "XZX", "XXX", 'X', new ItemStack (RegistryItems.magical_essences, 1, 0), 'Z', Items.emerald);
        GameRegistry.addRecipe (new ItemStack (RegistryItems.infused_fragment, 1, 1), "XXX", "XZX", "XXX", 'X', new ItemStack (RegistryItems.element_essences, 1, 0), 'Z', new ItemStack (RegistryItems.infused_fragment, 1, 0));
        GameRegistry.addRecipe (new ItemStack (RegistryItems.infused_fragment, 1, 1), "XXX", "XZX", "XXX", 'X', new ItemStack (RegistryItems.element_essences, 1, 1), 'Z', new ItemStack (RegistryItems.infused_fragment, 1, 0));
        GameRegistry.addRecipe (new ItemStack (RegistryItems.infused_fragment, 1, 1), "XXX", "XZX", "XXX", 'X', new ItemStack (RegistryItems.element_essences, 1, 2), 'Z', new ItemStack (RegistryItems.infused_fragment, 1, 0));
        GameRegistry.addRecipe (new ItemStack (RegistryItems.infused_fragment, 1, 1), "XXX", "XZX", "XXX", 'X', new ItemStack (RegistryItems.element_essences, 1, 3), 'Z', new ItemStack (RegistryItems.infused_fragment, 1, 0));
        GameRegistry.addRecipe (new ItemStack (RegistryItems.infused_fragment, 1, 1), "XXX", "XZX", "XXX", 'X', new ItemStack (RegistryItems.element_essences, 1, 0), 'Z', new ItemStack (RegistryItems.infused_fragment, 1, 4));
        GameRegistry.addRecipe (new ItemStack (RegistryItems.infused_fragment, 1, 1), "XXX", "XZX", "XXX", 'X', new ItemStack (RegistryItems.element_essences, 1, 1), 'Z', new ItemStack (RegistryItems.infused_fragment, 1, 4));
        GameRegistry.addRecipe (new ItemStack (RegistryItems.infused_fragment, 1, 1), "XXX", "XZX", "XXX", 'X', new ItemStack (RegistryItems.element_essences, 1, 2), 'Z', new ItemStack (RegistryItems.infused_fragment, 1, 4));
        GameRegistry.addRecipe (new ItemStack (RegistryItems.infused_fragment, 1, 1), "XXX", "XZX", "XXX", 'X', new ItemStack (RegistryItems.element_essences, 1, 3), 'Z', new ItemStack (RegistryItems.infused_fragment, 1, 4));
        GameRegistry.addRecipe (new ItemStack (RegistryItems.infused_fragment, 1, 2), "XXX", "XZX", "XXX", 'X', new ItemStack (RegistryItems.CropEssencesT1, 1, 0), 'Z', new ItemStack (RegistryItems.infused_fragment, 1, 1));
        GameRegistry.addRecipe (new ItemStack (RegistryItems.infused_fragment, 1, 2), "XXX", "XZX", "XXX", 'X', new ItemStack (RegistryItems.CropEssencesT1, 1, 1), 'Z', new ItemStack (RegistryItems.infused_fragment, 1, 1));
        GameRegistry.addRecipe (new ItemStack (RegistryItems.infused_fragment, 1, 2), "XXX", "XZX", "XXX", 'X', new ItemStack (RegistryItems.CropEssencesT1, 1, 2), 'Z', new ItemStack (RegistryItems.infused_fragment, 1, 1));
        GameRegistry.addRecipe (new ItemStack (RegistryItems.infused_fragment, 1, 2), "XXX", "XZX", "XXX", 'X', new ItemStack (RegistryItems.CropEssencesT1, 1, 0), 'Z', new ItemStack (RegistryItems.infused_fragment, 1, 4));
        GameRegistry.addRecipe (new ItemStack (RegistryItems.infused_fragment, 1, 2), "XXX", "XZX", "XXX", 'X', new ItemStack (RegistryItems.CropEssencesT1, 1, 1), 'Z', new ItemStack (RegistryItems.infused_fragment, 1, 4));
        GameRegistry.addRecipe (new ItemStack (RegistryItems.infused_fragment, 1, 2), "XXX", "XZX", "XXX", 'X', new ItemStack (RegistryItems.CropEssencesT1, 1, 2), 'Z', new ItemStack (RegistryItems.infused_fragment, 1, 4));
        GameRegistry.addRecipe (new ItemStack (RegistryItems.infused_fragment, 1, 3), "XXX", "XZX", "XXX", 'X', new ItemStack (RegistryItems.CropEssencesT2, 1, 0), 'Z', new ItemStack (RegistryItems.infused_fragment, 1, 2));
        GameRegistry.addRecipe (new ItemStack (RegistryItems.infused_fragment, 1, 3), "XXX", "XZX", "XXX", 'X', new ItemStack (RegistryItems.CropEssencesT2, 1, 1), 'Z', new ItemStack (RegistryItems.infused_fragment, 1, 2));
        GameRegistry.addRecipe (new ItemStack (RegistryItems.infused_fragment, 1, 3), "XXX", "XZX", "XXX", 'X', new ItemStack (RegistryItems.CropEssencesT2, 1, 2), 'Z', new ItemStack (RegistryItems.infused_fragment, 1, 2));
        GameRegistry.addRecipe (new ItemStack (RegistryItems.infused_fragment, 1, 3), "XXX", "XZX", "XXX", 'X', new ItemStack (RegistryItems.CropEssencesT2, 1, 0), 'Z', new ItemStack (RegistryItems.infused_fragment, 1, 4));
        GameRegistry.addRecipe (new ItemStack (RegistryItems.infused_fragment, 1, 3), "XXX", "XZX", "XXX", 'X', new ItemStack (RegistryItems.CropEssencesT2, 1, 1), 'Z', new ItemStack (RegistryItems.infused_fragment, 1, 4));
        GameRegistry.addRecipe (new ItemStack (RegistryItems.infused_fragment, 1, 3), "XXX", "XZX", "XXX", 'X', new ItemStack (RegistryItems.CropEssencesT2, 1, 2), 'Z', new ItemStack (RegistryItems.infused_fragment, 1, 4));
        GameRegistry.addRecipe (new ItemStack (RegistryItems.infused_fragment, 1, 4), "XXX", "XZX", "XXX", 'X', new ItemStack (RegistryItems.CropEssencesT3, 1, 0), 'Z', new ItemStack (RegistryItems.infused_fragment, 1, 3));
        GameRegistry.addRecipe (new ItemStack (RegistryItems.infused_fragment, 1, 4), "XXX", "XZX", "XXX", 'X', new ItemStack (RegistryItems.CropEssencesT3, 1, 1), 'Z', new ItemStack (RegistryItems.infused_fragment, 1, 3));
        GameRegistry.addRecipe (new ItemStack (RegistryItems.infused_fragment, 1, 4), "XXX", "XZX", "XXX", 'X', new ItemStack (RegistryItems.CropEssencesT3, 1, 2), 'Z', new ItemStack (RegistryItems.infused_fragment, 1, 3));
        GameRegistry.addRecipe (new ItemStack (RegistryItems.water_seed, 1), "WXW", "XZX", "WXW", 'X', new ItemStack (Items.water_bucket), 'Z', new ItemStack (RegistryItems.infused_fragment, 1, 0), 'W', new ItemStack (RegistryItems.magical_essences, 1, 0));
        GameRegistry.addRecipe (new ItemStack (RegistryItems.fire_seed, 1), "WXW", "XZX", "WXW", 'X', new ItemStack (Items.lava_bucket), 'Z', new ItemStack (RegistryItems.infused_fragment, 1, 0), 'W', new ItemStack (RegistryItems.magical_essences, 1, 0));
        GameRegistry.addRecipe (new ItemStack (RegistryItems.air_seed, 1), "WXW", "XZX", "WXW", 'X', new ItemStack (Items.apple), 'Z', new ItemStack (RegistryItems.infused_fragment, 1, 0), 'W', new ItemStack (RegistryItems.magical_essences, 1, 0));
        GameRegistry.addRecipe (new ItemStack (RegistryItems.earth_seed, 1), "WXW", "XZX", "WXW", 'X', new ItemStack (Blocks.dirt), 'Z', new ItemStack (RegistryItems.infused_fragment, 1, 0), 'W', new ItemStack (RegistryItems.magical_essences, 1, 0));
        GameRegistry.addRecipe (new ItemStack (RegistryItems.diamond_seed, 1), "WXW", "XZX", "WXW", 'X', new ItemStack (Items.diamond), 'Z', new ItemStack (RegistryItems.infused_fragment, 1, 3), 'W', new ItemStack (RegistryItems.magical_essences, 1, 3));
        GameRegistry.addRecipe (new ItemStack (RegistryItems.diamond_seed, 1), "WXW", "XZX", "WXW", 'X', new ItemStack (Items.diamond), 'Z', new ItemStack (RegistryItems.infused_fragment, 1, 4), 'W', new ItemStack (RegistryItems.magical_essences, 1, 3));
        GameRegistry.addRecipe (new ItemStack (RegistryItems.iron_seed, 1), "WXW", "XZX", "WXW", 'X', new ItemStack (Items.iron_ingot), 'Z', new ItemStack (RegistryItems.infused_fragment, 1, 1), 'W', new ItemStack (RegistryItems.magical_essences, 1, 1));
        GameRegistry.addRecipe (new ItemStack (RegistryItems.coal_seed, 1), "WXW", "XZX", "WXW", 'X', new ItemStack (Items.coal), 'Z', new ItemStack (RegistryItems.infused_fragment, 1, 1), 'W', new ItemStack (RegistryItems.magical_essences, 1, 1));
        GameRegistry.addRecipe (new ItemStack (RegistryItems.lapis_seed, 1), "WXW", "XZX", "WXW", 'X', new ItemStack (Items.dye, 1, 4), 'Z', new ItemStack (RegistryItems.infused_fragment, 1, 1), 'W', new ItemStack (RegistryItems.magical_essences, 1, 1));
        GameRegistry.addRecipe (new ItemStack (RegistryItems.iron_seed, 1), "WXW", "XZX", "WXW", 'X', new ItemStack (Items.iron_ingot), 'Z', new ItemStack (RegistryItems.infused_fragment, 1, 4), 'W', new ItemStack (RegistryItems.magical_essences, 1, 1));
        GameRegistry.addRecipe (new ItemStack (RegistryItems.coal_seed, 1), "WXW", "XZX", "WXW", 'X', new ItemStack (Items.coal), 'Z', new ItemStack (RegistryItems.infused_fragment, 1, 4), 'W', new ItemStack (RegistryItems.magical_essences, 1, 1));
        GameRegistry.addRecipe (new ItemStack (RegistryItems.lapis_seed, 1), "WXW", "XZX", "WXW", 'X', new ItemStack (Items.dye, 1, 4), 'Z', new ItemStack (RegistryItems.infused_fragment, 1, 4), 'W', new ItemStack (RegistryItems.magical_essences, 1, 1));
        GameRegistry.addRecipe (new ItemStack (RegistryItems.inferium_seed, 1), "WXW", "XZX", "WXW", 'X', new ItemStack (Items.wheat_seeds), 'Z', new ItemStack (RegistryItems.infused_fragment, 1, 4), 'W', new ItemStack (RegistryItems.magical_essences, 1, 0));
        GameRegistry.addRecipe (new ItemStack (RegistryItems.inferium_seed, 1), "WXW", "XZX", "WXW", 'X', new ItemStack (Items.wheat_seeds), 'Z', new ItemStack (RegistryItems.infused_fragment, 1, 0), 'W', new ItemStack (RegistryItems.magical_essences, 1, 0));
        GameRegistry.addRecipe (new ItemStack (RegistryItems.magical_essences, 1, 1), " X ", "XZX", " X ", 'X', new ItemStack (RegistryItems.magical_essences, 1, 0), 'Z', new ItemStack (RegistryItems.infused_fragment, 1, 1));
        GameRegistry.addRecipe (new ItemStack (RegistryItems.magical_essences, 1, 1), " X ", "XZX", " X ", 'X', new ItemStack (RegistryItems.magical_essences, 1, 0), 'Z', new ItemStack (RegistryItems.infused_fragment, 1, 4));
        GameRegistry.addRecipe (new ItemStack (RegistryItems.magical_essences, 1, 2), " X ", "XZX", " X ", 'X', new ItemStack (RegistryItems.magical_essences, 1, 1), 'Z', new ItemStack (RegistryItems.infused_fragment, 1, 2));
        GameRegistry.addRecipe (new ItemStack (RegistryItems.magical_essences, 1, 2), " X ", "XZX", " X ", 'X', new ItemStack (RegistryItems.magical_essences, 1, 1), 'Z', new ItemStack (RegistryItems.infused_fragment, 1, 4));
        GameRegistry.addRecipe (new ItemStack (RegistryItems.magical_essences, 8, 0), "XXX", "XZX", "XXX", 'X', new ItemStack (Items.gunpowder, 1, 0), 'Z', Items.diamond);
        GameRegistry.addRecipe (new ItemStack (RegistryItems.magical_essences, 8, 0), "XXX", "XZX", "XXX", 'X', new ItemStack (Items.gunpowder, 1, 0), 'Z', Items.emerald);

        GameRegistry.addRecipe (new ItemStack (RegistryBlocks.ardium_extractor, 1), "AAA", "AFA", "AAA", 'A', RegistryItems.ardium_ingot, 'F', Blocks.furnace);
        GameRegistry.addRecipe (new ItemStack (RegistryBlocks.fertilizer, 1), "AAA", "AFA", "AAA", 'A', RegistryItems.ardium_ingot, 'F', Items.wheat_seeds);
    
	
	}
}
