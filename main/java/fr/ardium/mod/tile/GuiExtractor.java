package fr.ardium.mod.tile;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;

public class GuiExtractor extends GuiContainer
{
	  private static final ResourceLocation texture = new ResourceLocation("ardium:textures/gui/container/GuiExtractor.png");
	  private TileExtractor tile;
	  private IInventory playerInv;
	  
	  public GuiExtractor(TileExtractor tileEntityScientificMachine, InventoryPlayer inventory)
	  {
	    super(new ContainerExtractor(tileEntityScientificMachine, inventory));
	    this.tile = tileEntityScientificMachine;
	    this.playerInv = inventory;
	    this.allowUserInput = true;
	    this.ySize = 340;
	    this.xSize = 200;
	  }
	  
	  protected void drawGuiContainerBackgroundLayer(float partialRenderTick, int x, int y)
	  {
	    GL11.glColor4f(1.0F, 1.5F, 1.0F, 1.0F);
	    this.mc.getTextureManager().bindTexture(texture);
	    int k = (this.width - this.xSize) / 2;
	    int l = (this.height - this.ySize) / 2;
	    drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
	    if (this.tile.isBurning())
	    {
	      int i = this.tile.getCookProgress();
	      drawTexturedModalRect(k + 88, l + 122, 231, 128, 30, i);
	    }
	  }
	  
	  protected void drawGuiContainerForegroundLayer(int x, int y)
	  {
	    this.fontRendererObj.drawString(this.playerInv.hasCustomInventoryName() ? this.playerInv.getInventoryName() : I18n.format(this.playerInv.getInventoryName(), new Object[0]), 15, this.ySize - 180, 4210752);
	  }
	}
