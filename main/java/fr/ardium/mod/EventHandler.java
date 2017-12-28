package fr.ardium.mod;

import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.ardium.mod.api.BucketHandler;
import fr.ardium.mod.blocks.RegistryBlocks;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.event.entity.player.FillBucketEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

public class EventHandler {

	public Minecraft mc;
	

	 public static final String[] directions = { "South", "West", "North", "East" };
	 @SideOnly(Side.CLIENT) 
	 @SubscribeEvent
	 public void onRenderPre(RenderGameOverlayEvent.Pre event)
	 {
		
		 if(event.type == RenderGameOverlayEvent.ElementType.DEBUG)
		 {
			 FontRenderer f = Minecraft.getMinecraft().fontRenderer;
			 
		             event.setCanceled(true);
		             drawString(Minecraft.getMinecraft().fontRenderer,EnumChatFormatting.GOLD+"Ardium Special Edition"+EnumChatFormatting.DARK_RED+ " / " +EnumChatFormatting.GOLD+Minecraft.getMinecraft().debug.split(",", 2)[0], 2, 2, 16777215);
		             drawString(Minecraft.getMinecraft().fontRenderer,EnumChatFormatting.GOLD+"X : "+EnumChatFormatting.DARK_RED+(int)mc.getMinecraft().thePlayer.posX + " / " +EnumChatFormatting.GOLD+"Y : "+EnumChatFormatting.DARK_RED+(int)mc.getMinecraft().thePlayer.posY+ " / " +EnumChatFormatting.GOLD+"Z : "+EnumChatFormatting.DARK_RED+(int)mc.getMinecraft().thePlayer.posZ,2, 12, 16777215);
		             
		             drawString(Minecraft.getMinecraft().fontRenderer,EnumChatFormatting.GOLD+"Direction: " + EnumChatFormatting.DARK_RED+directions[
		                                                                (net.minecraft.util.MathHelper.floor_double(
		                                                                Minecraft.getMinecraft().thePlayer.rotationYaw * 4.0F / 360.0F + 0.5D) & 0x3)], 2, 22, 16777215);

		 }
		
		 
		 
	 }
	     
	 public void drawString(FontRenderer par1FontRenderer, String par2Str, int par3, int par4, int par5)
	 {
	         par1FontRenderer.drawStringWithShadow(par2Str, par3, par4, par5);
	 }
	 @SubscribeEvent
	  public void onClick(PlayerInteractEvent e)
	  {

		    EntityPlayer player = e.entityPlayer;
	    if ((e.action == PlayerInteractEvent.Action.RIGHT_CLICK_AIR) && 
	      (player.getHeldItem() != null) && (player.getHeldItem().equals(new ItemStack(RegistryBlocks.barrier)))) {
	    	RegistryBlocks.barrier.setBlockTextureName("ardium:barrier");
	    }
	  }
	 @SideOnly(Side.CLIENT)
	  @SubscribeEvent(priority=EventPriority.HIGHEST)
	  public void openGuiEvent(GuiOpenEvent v1)
	  {
	   
	    if ((v1.gui instanceof net.minecraft.client.gui.GuiMainMenu)) {
	      v1.gui = new GuiCustomMainMenu();
	    }
}
	 @SubscribeEvent
	  public void onFillBucket(FillBucketEvent event)
	  {
	    BucketHandler.getInstance().fillEvent(event);
	  }
}
