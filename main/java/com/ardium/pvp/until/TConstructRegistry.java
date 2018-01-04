package com.ardium.pvp.until;

import java.util.ArrayList;

class TConstructRegistry {
	public static ArrayList<ActiveToolMod> activeModifiers = new ArrayList();
	  
	  public static void registerActiveToolMod(ActiveToolMod mod)
	  {
	    activeModifiers.add(mod);
	  }
}
