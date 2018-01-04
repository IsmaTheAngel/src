package com.ardium.pvp.world;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class WorldRegister 
{
	 public static void mainRegistry()
	    {
	    	registerWorldGen(new WorldGenArdium(), -1);
	    	registerWorldGen(new WorldGenArdium(), 0);
	    	registerWorldGen(new WorldGenArdium(), 1);
	    }

    private static void registerWorldGen(IWorldGenerator iGenerator, int probability)
	    {
	    	GameRegistry.registerWorldGenerator(iGenerator, probability);
	    }
	}
