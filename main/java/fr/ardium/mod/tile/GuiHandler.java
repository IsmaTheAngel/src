package fr.ardium.mod.tile;

import cpw.mods.fml.common.network.IGuiHandler;
import fr.ardium.mod.items.ItemBackpack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class GuiHandler implements IGuiHandler
{
	  public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	  {
		  switch (ID)
		    {
		    case 0: 
			      return new ContainerExtractor((TileExtractor)world.getTileEntity(x, y, z), player.inventory);
	  case 1:
			// The last parameter must be a multiple of 9 (e.g: 9, 18, 27, 54)
			// Condition to check if the player has the right item in hand
			if (player.getHeldItem() == null || !(player.getHeldItem().getItem() instanceof ItemBackpack)) return null;
			return new ContainerBackpack(player.inventory, new InventoryBackpack(player.getHeldItem()));
	  case 5:

	      TileEntityArdiumFurnace tileEntityArdiumFurnace = (TileEntityArdiumFurnace)world.getTileEntity(x, y, z);
	      return new ContainerArdiumFurnace(player.inventory, tileEntityArdiumFurnace);
		    
	  case 6:

	      TileEntityOxiumFurnace tileEntityOxiumFurnace = (TileEntityOxiumFurnace)world.getTileEntity(x, y, z);
	      return new ContainerOxiumFurnace(player.inventory, tileEntityOxiumFurnace);
	  case 50: 
	      return new ContainerAdminChest(world.getTileEntity(x, y, z));
	  case 36: 
	      return new ContainerFertilizer((TileEntityFertilizer)world.getTileEntity(x, y, z), player.inventory);
		
	  
		    
		    }
		return null;
	  }

	  
	  public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	  {
		  switch (ID)
		    {
		    case 0: 
			      return new GuiExtractor((TileExtractor)world.getTileEntity(x, y, z), player.inventory);
		    case 1:
				// The last parameter must be a multiple of 9 (e.g: 9, 18, 27, 54)
				// Condition to check if the player has the right item in hand
				if (player.getHeldItem() == null || !(player.getHeldItem().getItem() instanceof ItemBackpack)) return null;
				return new GuiBackpack(player.inventory, new InventoryBackpack(player.getHeldItem()));
		    case 5:

		        TileEntityArdiumFurnace tileEntityArdiumFurnace = (TileEntityArdiumFurnace)world.getTileEntity(x, y, z);
		        return new GuiArdiumFurnace(player.inventory, tileEntityArdiumFurnace);
		    case 6:

		        TileEntityOxiumFurnace tileEntityOxiumFurnace = (TileEntityOxiumFurnace)world.getTileEntity(x, y, z);
		        return new GuiOxiumFurnace(player.inventory, tileEntityOxiumFurnace);
		    case 50: 
			      return new GuiAdminChest(world.getTileEntity(x, y, z));
		    case 36: 
			      return new GuiFertilizer((TileEntityFertilizer)world.getTileEntity(x, y, z), player.inventory);
		 
			}
			return null;
		}
	 
}
	


