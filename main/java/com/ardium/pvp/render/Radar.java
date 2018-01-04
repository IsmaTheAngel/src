package com.ardium.pvp.render;

import net.minecraft.client.renderer.Tessellator;
import org.lwjgl.opengl.GL11;

public class Radar {

	  public static void drawChestESP(double d, double d1, double d2)
	  {
	    GL11.glEnable(3042);
	    GL11.glBlendFunc(770, 771);
	    GL11.glLineWidth(0.5F);
	    GL11.glDisable(3553);
	    GL11.glDepthMask(false);
	    GL11.glEnable(2848);
	    GL11.glBlendFunc(770, 771);
	    GL11.glDisable(3553);
	    GL11.glDisable(2929);
	    GL11.glDepthMask(false);
	    GL11.glEnable(2848);
	    GL11.glColor4f(1.0F, 1.0F, 0.0F, 0.2F);
	    drawBoundingBox(new Axis(d + 1.0D, d1 + 1.0D, d2 + 1.0D, d, d1, d2));
	    GL11.glColor4f(0.0F, 0.0F, 0.0F, 0.2F);
	    drawOutlinedBoundingBox(new Axis(d + 1.0D, d1 + 1.0D, d2 + 1.0D, d, d1, d2));
	    GL11.glDepthMask(true);
	    GL11.glEnable(3553);
	    GL11.glEnable(2929);
	  }
	  
	  public static void drawTrappedChestESP(double d, double d1, double d2)
	  {
	    GL11.glEnable(3042);
	    GL11.glBlendFunc(770, 771);
	    GL11.glLineWidth(0.5F);
	    GL11.glDisable(3553);
	    GL11.glDepthMask(false);
	    GL11.glEnable(2848);
	    GL11.glBlendFunc(770, 771);
	    GL11.glDisable(3553);
	    GL11.glDisable(2929);
	    GL11.glDepthMask(false);
	    GL11.glEnable(2848);
	    GL11.glColor4f(0.0F, 1.0F, 1.0F, 0.2F);
	    drawBoundingBox(new Axis(d + 1.0D, d1 + 1.0D, d2 + 1.0D, d, d1, d2));
	    GL11.glColor4f(0.0F, 0.0F, 0.0F, 0.2F);
	    drawOutlinedBoundingBox(new Axis(d + 1.0D, d1 + 1.0D, d2 + 1.0D, d, d1, d2));
	    GL11.glDepthMask(true);
	    GL11.glEnable(3553);
	    GL11.glEnable(2929);
	  }
	  
	  public static void drawEnderChestESP(double d, double d1, double d2)
	  {
	    GL11.glEnable(3042);
	    GL11.glBlendFunc(770, 771);
	    GL11.glLineWidth(0.5F);
	    GL11.glDisable(3553);
	    GL11.glDepthMask(false);
	    GL11.glEnable(2848);
	    GL11.glBlendFunc(770, 771);
	    GL11.glDisable(3553);
	    GL11.glDisable(2929);
	    GL11.glDepthMask(false);
	    GL11.glEnable(2848);
	    GL11.glColor4f(0.0F, 0.0F, 255.0F, 0.2F);
	    drawBoundingBox(new Axis(d + 1.0D, d1 + 1.0D, d2 + 1.0D, d, d1, d2));
	    GL11.glColor4f(0.0F, 0.0F, 0.0F, 0.2F);
	    drawOutlinedBoundingBox(new Axis(d + 1.0D, d1 + 1.0D, d2 + 1.0D, d, d1, d2));
	    GL11.glDepthMask(true);
	    GL11.glEnable(3553);
	    GL11.glEnable(2929);
	  }

    private static void drawOutlinedBoundingBox(Axis aa)
	  {
	    Tessellator tessellator = Tessellator.instance;
	    
	    tessellator.startDrawing(3);
	    tessellator.addVertex(aa.minX, aa.minY, aa.minZ);
	    tessellator.addVertex(aa.maxX, aa.minY, aa.minZ);
	    tessellator.addVertex(aa.maxX, aa.minY, aa.maxZ);
	    tessellator.addVertex(aa.minX, aa.minY, aa.maxZ);
	    tessellator.addVertex(aa.minX, aa.minY, aa.minZ);
	    tessellator.draw();
	    
	    tessellator.startDrawing(3);
	    tessellator.addVertex(aa.minX, aa.maxY, aa.minZ);
	    tessellator.addVertex(aa.maxX, aa.maxY, aa.minZ);
	    tessellator.addVertex(aa.maxX, aa.maxY, aa.maxZ);
	    tessellator.addVertex(aa.minX, aa.maxY, aa.maxZ);
	    tessellator.addVertex(aa.minX, aa.maxY, aa.minZ);
	    tessellator.draw();
	    
	    tessellator.startDrawing(1);
	    tessellator.addVertex(aa.minX, aa.minY, aa.minZ);
	    tessellator.addVertex(aa.minX, aa.maxY, aa.minZ);
	    tessellator.addVertex(aa.maxX, aa.minY, aa.minZ);
	    tessellator.addVertex(aa.maxX, aa.maxY, aa.minZ);
	    tessellator.addVertex(aa.maxX, aa.minY, aa.maxZ);
	    tessellator.addVertex(aa.maxX, aa.maxY, aa.maxZ);
	    tessellator.addVertex(aa.minX, aa.minY, aa.maxZ);
	    tessellator.addVertex(aa.minX, aa.maxY, aa.maxZ);
	    tessellator.draw();
	  }

    private static void drawBoundingBox(Axis aa)
	  {
	    Tessellator tessellator = Tessellator.instance;
	    
	    tessellator.startDrawingQuads();
	    tessellator.addVertex(aa.minX, aa.minY, aa.minZ);
	    tessellator.addVertex(aa.minX, aa.maxY, aa.minZ);
	    tessellator.addVertex(aa.maxX, aa.minY, aa.minZ);
	    tessellator.addVertex(aa.maxX, aa.maxY, aa.minZ);
	    tessellator.addVertex(aa.maxX, aa.minY, aa.maxZ);
	    tessellator.addVertex(aa.maxX, aa.maxY, aa.maxZ);
	    tessellator.addVertex(aa.minX, aa.minY, aa.maxZ);
	    tessellator.addVertex(aa.minX, aa.maxY, aa.maxZ);
	    tessellator.draw();
	    
	    tessellator.startDrawingQuads();
	    tessellator.addVertex(aa.maxX, aa.maxY, aa.minZ);
	    tessellator.addVertex(aa.maxX, aa.minY, aa.minZ);
	    tessellator.addVertex(aa.minX, aa.maxY, aa.minZ);
	    tessellator.addVertex(aa.minX, aa.minY, aa.minZ);
	    tessellator.addVertex(aa.minX, aa.maxY, aa.maxZ);
	    tessellator.addVertex(aa.minX, aa.minY, aa.maxZ);
	    tessellator.addVertex(aa.maxX, aa.maxY, aa.maxZ);
	    tessellator.addVertex(aa.maxX, aa.minY, aa.maxZ);
	    tessellator.draw();
	    
	    tessellator.startDrawingQuads();
	    tessellator.addVertex(aa.minX, aa.maxY, aa.minZ);
	    tessellator.addVertex(aa.maxX, aa.maxY, aa.minZ);
	    tessellator.addVertex(aa.maxX, aa.maxY, aa.maxZ);
	    tessellator.addVertex(aa.minX, aa.maxY, aa.maxZ);
	    tessellator.addVertex(aa.minX, aa.maxY, aa.minZ);
	    tessellator.addVertex(aa.minX, aa.maxY, aa.maxZ);
	    tessellator.addVertex(aa.maxX, aa.maxY, aa.maxZ);
	    tessellator.addVertex(aa.maxX, aa.maxY, aa.minZ);
	    tessellator.draw();
	    
	    tessellator.startDrawingQuads();
	    tessellator.addVertex(aa.minX, aa.minY, aa.minZ);
	    tessellator.addVertex(aa.maxX, aa.minY, aa.minZ);
	    tessellator.addVertex(aa.maxX, aa.minY, aa.maxZ);
	    tessellator.addVertex(aa.minX, aa.minY, aa.maxZ);
	    tessellator.addVertex(aa.minX, aa.minY, aa.minZ);
	    tessellator.addVertex(aa.minX, aa.minY, aa.maxZ);
	    tessellator.addVertex(aa.maxX, aa.minY, aa.maxZ);
	    tessellator.addVertex(aa.maxX, aa.minY, aa.minZ);
	    tessellator.draw();
	    
	    tessellator.startDrawingQuads();
	    tessellator.addVertex(aa.minX, aa.minY, aa.minZ);
	    tessellator.addVertex(aa.minX, aa.maxY, aa.minZ);
	    tessellator.addVertex(aa.minX, aa.minY, aa.maxZ);
	    tessellator.addVertex(aa.minX, aa.maxY, aa.maxZ);
	    tessellator.addVertex(aa.maxX, aa.minY, aa.maxZ);
	    tessellator.addVertex(aa.maxX, aa.maxY, aa.maxZ);
	    tessellator.addVertex(aa.maxX, aa.minY, aa.minZ);
	    tessellator.addVertex(aa.maxX, aa.maxY, aa.minZ);
	    tessellator.draw();
	    
	    tessellator.startDrawingQuads();
	    tessellator.addVertex(aa.minX, aa.maxY, aa.maxZ);
	    tessellator.addVertex(aa.minX, aa.minY, aa.maxZ);
	    tessellator.addVertex(aa.minX, aa.maxY, aa.minZ);
	    tessellator.addVertex(aa.minX, aa.minY, aa.minZ);
	    tessellator.addVertex(aa.maxX, aa.maxY, aa.minZ);
	    tessellator.addVertex(aa.maxX, aa.minY, aa.minZ);
	    tessellator.addVertex(aa.maxX, aa.maxY, aa.maxZ);
	    tessellator.addVertex(aa.maxX, aa.minY, aa.maxZ);
	    tessellator.draw();
	  }
	}
