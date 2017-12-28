package fr.ardium.mod.world;

import java.util.Random;

import cpw.mods.fml.common.IWorldGenerator;
import fr.ardium.mod.blocks.RegistryBlocks;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class WorldGenArdium implements IWorldGenerator
{
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator,
			IChunkProvider chunkProvider) 
	{
		switch (world.provider.dimensionId)
		{
		case -1:
		   GenerateNether(world, chunkX *16, chunkZ *16, random);
		case 0:
			generateSurface(world, random, chunkX * 16, chunkZ * 16);
		      break;
		case 1:
			   GenerateEnd(world, chunkX *16, chunkZ *16, random);
		}
		}
		 public void addOreSpawn(Block block, int metadata, Block target, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY)
		  {
		    assert (maxY > minY) : "La position Y maximum doit etre superieure a la position Y minimum.";
		    assert ((maxX > 0) && (maxX <= 16)) : "X doit se trouver entre 0 et 16.";
		    assert (minY > 0) : "La position Y minimum doit etre superieure a 0.";
		    assert ((maxY < 256) && (maxY > 0)) : "La position Y maximum doit se trouver entre 0 et 256.";
		    assert ((maxZ > 0) && (maxZ <= 16)) : "Z doit se trouver entre 0 et 16.";
		    for (int i = 0; i < chancesToSpawn; i++)
		    {
		      int posY = random.nextInt(128);
		      if ((posY <= maxY) && (posY >= minY)) {
		        new WorldGenMinable(block, metadata, maxVeinSize, target).generate(world, random, blockXPos + random.nextInt(16), posY, blockZPos + random.nextInt(16));
		      
		      }
		      }
		
	}
    private void addOre(Block block, Block blockSpawn, Random random, World world, int posX, int posZ, int minY, int maxY, int minV, int maxV, int spawnChance)
    {
        for(int i = 0; i < spawnChance; i++)
        {
            int chunkSize = 16;
            int Xpos = posX + random.nextInt(chunkSize);
            int Ypos = minY + random.nextInt(maxY - minY);
            int Zpos = posZ + random.nextInt(chunkSize);
            
            new WorldGenMinable(block, maxV, blockSpawn).generate(world, random, Xpos, Ypos, Zpos);
            }
    }       
        private void addStructure(String string,  Random random, World world, int posX, int posZ, int minY, int maxY, int spawnChance)
        {
            for(int i = 0; i < spawnChance; i++)
            {
                int chunkSize = 16;
                int Xpos = posX + random.nextInt(chunkSize);
                int Ypos = minY + random.nextInt(maxY - minY);
                int Zpos = posZ + random.nextInt(chunkSize);
                
        

        }       
    }
	private void GenerateEnd(World world, int i, int j, Random random) 
	{
		
	}

	 private void generateSurface(World world, Random random, int x, int z)
	  {
		 addOreSpawn(RegistryBlocks.ardium_ore, 0, Blocks.stone, world, random, x, z, 16, 16, 10, 5, 15, 30);
		 addOreSpawn(RegistryBlocks.oxium_ore, 0, Blocks.stone, world, random, x, z, 16, 16, 10, 2, 15, 30);
			

			}
		
	

	private void GenerateNether(World world, int i, int j, Random random) 
	{
	   
	}
	}


