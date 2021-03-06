package fr.ardium.mod.render;

import java.util.ArrayList;
import java.util.List;

public class AABBPool {
	private final int maxNumCleans;
	  private final int numEntriesToRemove;
	  private final List listAABB = new ArrayList();
	  private int nextPoolIndex;
	  private int maxPoolIndex;
	  private int numCleans;
	  private static final String __OBFID = "CL_00000609";
	  
	  public AABBPool(int par1, int par2)
	  {
	    this.maxNumCleans = par1;
	    this.numEntriesToRemove = par2;
	  }
	  
	  public Axis getAABB(double par1, double par3, double par5, double par7, double par9, double par11)
	  {
	    Axis var13 = null;
	    if (this.nextPoolIndex >= this.listAABB.size())
	    {
	      Axis var131 = new Axis(par1, par3, par5, par7, par9, par11);
	      this.listAABB.add(var131);
	    }
	    else
	    {
	      var13 = (Axis)this.listAABB.get(this.nextPoolIndex);
	      var13.setBounds(par1, par3, par5, par7, par9, par11);
	    }
	    this.nextPoolIndex += 1;
	    return var13;
	  }
	  
	  public void cleanPool()
	  {
	    if (this.nextPoolIndex > this.maxPoolIndex) {
	      this.maxPoolIndex = this.nextPoolIndex;
	    }
	    if (this.numCleans++ == this.maxNumCleans)
	    {
	      int var1 = Math.max(this.maxPoolIndex, this.listAABB.size() - this.numEntriesToRemove);
	      while (this.listAABB.size() > var1) {
	        this.listAABB.remove(var1);
	      }
	      this.maxPoolIndex = 0;
	      this.numCleans = 0;
	    }
	    this.nextPoolIndex = 0;
	  }
	  
	  public void clearPool()
	  {
	    this.nextPoolIndex = 0;
	    this.listAABB.clear();
	  }
	  
	  public int getlistAABBsize()
	  {
	    return this.listAABB.size();
	  }
	  
	  public int getnextPoolIndex()
	  {
	    return this.nextPoolIndex;
	  }
}
