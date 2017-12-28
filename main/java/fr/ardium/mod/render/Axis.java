package fr.ardium.mod.render;

import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;

public class Axis {
	 private static final ThreadLocal theAABBLocalPool = new ThreadLocal()
	  {
	    private static final String __OBFID = "CL_00000608";
	    
	    protected AABBPool initialValue()
	    {
	      return new AABBPool(300, 2000);
	    }
	  };
	  public double minX;
	  public double minY;
	  public double minZ;
	  public double maxX;
	  public double maxY;
	  public double maxZ;
	  private static final String __OBFID = "CL_00000607";
	  
	  public static Axis getBoundingBox(double par0, double par2, double par4, double par6, double par8, double par10)
	  {
	    return new Axis(par0, par2, par4, par6, par8, par10);
	  }
	  
	  public static AABBPool getAABBPool()
	  {
	    return (AABBPool)theAABBLocalPool.get();
	  }
	  
	  public Axis(double par1, double par3, double par5, double par7, double par9, double par11)
	  {
	    this.minX = par1;
	    this.minY = par3;
	    this.minZ = par5;
	    this.maxX = par7;
	    this.maxY = par9;
	    this.maxZ = par11;
	  }
	  
	  public Axis setBounds(double par1, double par3, double par5, double par7, double par9, double par11)
	  {
	    this.minX = par1;
	    this.minY = par3;
	    this.minZ = par5;
	    this.maxX = par7;
	    this.maxY = par9;
	    this.maxZ = par11;
	    return this;
	  }
	  
	  public Axis addCoord(double par1, double par3, double par5)
	  {
	    double var7 = this.minX;
	    double var9 = this.minY;
	    double var11 = this.minZ;
	    double var13 = this.maxX;
	    double var15 = this.maxY;
	    double var17 = this.maxZ;
	    if (par1 < 0.0D) {
	      var7 += par1;
	    }
	    if (par1 > 0.0D) {
	      var13 += par1;
	    }
	    if (par3 < 0.0D) {
	      var9 += par3;
	    }
	    if (par3 > 0.0D) {
	      var15 += par3;
	    }
	    if (par5 < 0.0D) {
	      var11 += par5;
	    }
	    if (par5 > 0.0D) {
	      var17 += par5;
	    }
	    return getAABBPool().getAABB(var7, var9, var11, var13, var15, var17);
	  }
	  
	  public Axis expand(double par1, double par3, double par5)
	  {
	    double var7 = this.minX - par1;
	    double var9 = this.minY - par3;
	    double var11 = this.minZ - par5;
	    double var13 = this.maxX + par1;
	    double var15 = this.maxY + par3;
	    double var17 = this.maxZ + par5;
	    return getAABBPool().getAABB(var7, var9, var11, var13, var15, var17);
	  }
	  
	  public Axis func_111270_a(Axis par1AxisAlignedBB)
	  {
	    double var2 = Math.min(this.minX, par1AxisAlignedBB.minX);
	    double var4 = Math.min(this.minY, par1AxisAlignedBB.minY);
	    double var6 = Math.min(this.minZ, par1AxisAlignedBB.minZ);
	    double var8 = Math.max(this.maxX, par1AxisAlignedBB.maxX);
	    double var10 = Math.max(this.maxY, par1AxisAlignedBB.maxY);
	    double var12 = Math.max(this.maxZ, par1AxisAlignedBB.maxZ);
	    return getAABBPool().getAABB(var2, var4, var6, var8, var10, var12);
	  }
	  
	  public Axis getOffsetBoundingBox(double par1, double par3, double par5)
	  {
	    return getAABBPool().getAABB(this.minX + par1, this.minY + par3, this.minZ + par5, this.maxX + par1, this.maxY + par3, this.maxZ + par5);
	  }
	  
	  public double calculateXOffset(Axis par1AxisAlignedBB, double par2)
	  {
	    if ((par1AxisAlignedBB.maxY > this.minY) && (par1AxisAlignedBB.minY < this.maxY))
	    {
	      if ((par1AxisAlignedBB.maxZ > this.minZ) && (par1AxisAlignedBB.minZ < this.maxZ))
	      {
	        if ((par2 > 0.0D) && (par1AxisAlignedBB.maxX <= this.minX))
	        {
	          double var4 = this.minX - par1AxisAlignedBB.maxX;
	          if (var4 < par2) {
	            par2 = var4;
	          }
	        }
	        if ((par2 < 0.0D) && (par1AxisAlignedBB.minX >= this.maxX))
	        {
	          double var4 = this.maxX - par1AxisAlignedBB.minX;
	          if (var4 > par2) {
	            par2 = var4;
	          }
	        }
	        return par2;
	      }
	      return par2;
	    }
	    return par2;
	  }
	  
	  public double calculateYOffset(Axis par1AxisAlignedBB, double par2)
	  {
	    if ((par1AxisAlignedBB.maxX > this.minX) && (par1AxisAlignedBB.minX < this.maxX))
	    {
	      if ((par1AxisAlignedBB.maxZ > this.minZ) && (par1AxisAlignedBB.minZ < this.maxZ))
	      {
	        if ((par2 > 0.0D) && (par1AxisAlignedBB.maxY <= this.minY))
	        {
	          double var4 = this.minY - par1AxisAlignedBB.maxY;
	          if (var4 < par2) {
	            par2 = var4;
	          }
	        }
	        if ((par2 < 0.0D) && (par1AxisAlignedBB.minY >= this.maxY))
	        {
	          double var4 = this.maxY - par1AxisAlignedBB.minY;
	          if (var4 > par2) {
	            par2 = var4;
	          }
	        }
	        return par2;
	      }
	      return par2;
	    }
	    return par2;
	  }
	  
	  public double calculateZOffset(Axis par1AxisAlignedBB, double par2)
	  {
	    if ((par1AxisAlignedBB.maxX > this.minX) && (par1AxisAlignedBB.minX < this.maxX))
	    {
	      if ((par1AxisAlignedBB.maxY > this.minY) && (par1AxisAlignedBB.minY < this.maxY))
	      {
	        if ((par2 > 0.0D) && (par1AxisAlignedBB.maxZ <= this.minZ))
	        {
	          double var4 = this.minZ - par1AxisAlignedBB.maxZ;
	          if (var4 < par2) {
	            par2 = var4;
	          }
	        }
	        if ((par2 < 0.0D) && (par1AxisAlignedBB.minZ >= this.maxZ))
	        {
	          double var4 = this.maxZ - par1AxisAlignedBB.minZ;
	          if (var4 > par2) {
	            par2 = var4;
	          }
	        }
	        return par2;
	      }
	      return par2;
	    }
	    return par2;
	  }
	  
	  public boolean intersectsWith(Axis par1AxisAlignedBB)
	  {
	    return (par1AxisAlignedBB.maxZ > this.minZ) && (par1AxisAlignedBB.minZ < this.maxZ);
	  }
	  
	  public Axis offset(double par1, double par3, double par5)
	  {
	    this.minX += par1;
	    this.minY += par3;
	    this.minZ += par5;
	    this.maxX += par1;
	    this.maxY += par3;
	    this.maxZ += par5;
	    return this;
	  }
	  
	  public boolean isVecInside(Vec3 par1Vec3)
	  {
	    return (par1Vec3.zCoord > this.minZ) && (par1Vec3.zCoord < this.maxZ);
	  }
	  
	  public double getAverageEdgeLength()
	  {
	    double var1 = this.maxX - this.minX;
	    double var3 = this.maxY - this.minY;
	    double var5 = this.maxZ - this.minZ;
	    return (var1 + var3 + var5) / 3.0D;
	  }
	  
	  public Axis contract(double par1, double par3, double par5)
	  {
	    double var7 = this.minX + par1;
	    double var9 = this.minY + par3;
	    double var11 = this.minZ + par5;
	    double var13 = this.maxX - par1;
	    double var15 = this.maxY - par3;
	    double var17 = this.maxZ - par5;
	    return getAABBPool().getAABB(var7, var9, var11, var13, var15, var17);
	  }
	  
	  public Axis copy()
	  {
	    return getAABBPool().getAABB(this.minX, this.minY, this.minZ, this.maxX, this.maxY, this.maxZ);
	  }
	  
	  public MovingObjectPosition calculateIntercept(Vec3 par1Vec3, Vec3 par2Vec3)
	  {
	    Vec3 var3 = par1Vec3.getIntermediateWithXValue(par2Vec3, this.minX);
	    Vec3 var4 = par1Vec3.getIntermediateWithXValue(par2Vec3, this.maxX);
	    Vec3 var5 = par1Vec3.getIntermediateWithYValue(par2Vec3, this.minY);
	    Vec3 var6 = par1Vec3.getIntermediateWithYValue(par2Vec3, this.maxY);
	    Vec3 var7 = par1Vec3.getIntermediateWithZValue(par2Vec3, this.minZ);
	    Vec3 var8 = par1Vec3.getIntermediateWithZValue(par2Vec3, this.maxZ);
	    if (!isVecInYZ(var3)) {
	      var3 = null;
	    }
	    if (!isVecInYZ(var4)) {
	      var4 = null;
	    }
	    if (!isVecInXZ(var5)) {
	      var5 = null;
	    }
	    if (!isVecInXZ(var6)) {
	      var6 = null;
	    }
	    if (!isVecInXY(var7)) {
	      var7 = null;
	    }
	    if (!isVecInXY(var8)) {
	      var8 = null;
	    }
	    Vec3 var9 = null;
	    if ((var3 != null) && ((var9 == null) || (par1Vec3.squareDistanceTo(var3) < par1Vec3.squareDistanceTo(var9)))) {
	      var9 = var3;
	    }
	    if ((var4 != null) && ((var9 == null) || (par1Vec3.squareDistanceTo(var4) < par1Vec3.squareDistanceTo(var9)))) {
	      var9 = var4;
	    }
	    if ((var5 != null) && ((var9 == null) || (par1Vec3.squareDistanceTo(var5) < par1Vec3.squareDistanceTo(var9)))) {
	      var9 = var5;
	    }
	    if ((var6 != null) && ((var9 == null) || (par1Vec3.squareDistanceTo(var6) < par1Vec3.squareDistanceTo(var9)))) {
	      var9 = var6;
	    }
	    if ((var7 != null) && ((var9 == null) || (par1Vec3.squareDistanceTo(var7) < par1Vec3.squareDistanceTo(var9)))) {
	      var9 = var7;
	    }
	    if ((var8 != null) && ((var9 == null) || (par1Vec3.squareDistanceTo(var8) < par1Vec3.squareDistanceTo(var9)))) {
	      var9 = var8;
	    }
	    if (var9 == null) {
	      return null;
	    }
	    byte var10 = -1;
	    if (var9 == var3) {
	      var10 = 4;
	    }
	    if (var9 == var4) {
	      var10 = 5;
	    }
	    if (var9 == var5) {
	      var10 = 0;
	    }
	    if (var9 == var6) {
	      var10 = 1;
	    }
	    if (var9 == var7) {
	      var10 = 2;
	    }
	    if (var9 == var8) {
	      var10 = 3;
	    }
	    return new MovingObjectPosition(0, 0, 0, var10, var9);
	  }
	  
	  private boolean isVecInYZ(Vec3 par1Vec3)
	  {
	    return par1Vec3 != null;
	  }
	  
	  private boolean isVecInXZ(Vec3 par1Vec3)
	  {
	    return par1Vec3 != null;
	  }
	  
	  private boolean isVecInXY(Vec3 par1Vec3)
	  {
	    return par1Vec3 != null;
	  }
	  
	  public void setBB(Axis par1AxisAlignedBB)
	  {
	    this.minX = par1AxisAlignedBB.minX;
	    this.minY = par1AxisAlignedBB.minY;
	    this.minZ = par1AxisAlignedBB.minZ;
	    this.maxX = par1AxisAlignedBB.maxX;
	    this.maxY = par1AxisAlignedBB.maxY;
	    this.maxZ = par1AxisAlignedBB.maxZ;
	  }
	  
	  public String toString()
	  {
	    return "box[" + this.minX + ", " + this.minY + ", " + this.minZ + " -> " + this.maxX + ", " + this.maxY + ", " + this.maxZ + "]";
	  }
}
