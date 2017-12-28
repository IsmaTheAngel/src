package fr.ardium.mod.api;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.ardium.mod.Ardium;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.StatCollector;
import tconstruct.library.util.IToolPart;

public class Part    extends Item
implements IToolPart
{
protected String defaultIconTexture;
protected int defaultMaterialID;
protected String unlocalizedPartName;
protected HashMap<Integer, String> unlocalizedMaterialNames = new HashMap();
protected HashMap<Integer, String> textures = new HashMap();
protected HashMap<Integer, IIcon> icons = new HashMap();
protected static final String pathToTextures = "ardium".toLowerCase(Locale.ENGLISH) + ":" + "parts/";

public Part(String defaultUnlocalizedPartName, int defaultMaterialID, String defaultTexture)
{
  setCreativeTab(Ardium.ArdiumCreativeTab);
  setMaxStackSize(64);
  setMaxDamage(0);
  setHasSubtypes(true);
  
  setUnlocalizedName("default." + defaultUnlocalizedPartName);
  this.unlocalizedPartName = defaultUnlocalizedPartName;
  this.defaultMaterialID = defaultMaterialID;
  this.defaultIconTexture = (pathToTextures + defaultTexture);
}

@SideOnly(Side.CLIENT)
public void registerIcons(IIconRegister icon)
{
  this.itemIcon = icon.registerIcon(this.defaultIconTexture);
  for (Map.Entry<Integer, String> texture : this.textures.entrySet())
  {
    int matrialID = ((Integer)texture.getKey()).intValue();
    String texutreName = (String)texture.getValue();
    
    IIcon _icon = icon.registerIcon(pathToTextures + texutreName);
    
    this.icons.put(Integer.valueOf(matrialID), _icon);
  }
}

public int getMaterialID(ItemStack itemStack)
{
  int damageValue = itemStack.getItemDamage();
  if (damageValue >= 100) {
    return itemStack.getItemDamage();
  }
  return this.defaultMaterialID;
}

public void addMaterial(int materialId, String unlocalizedName, String texture)
{
  this.unlocalizedMaterialNames.put(Integer.valueOf(materialId), unlocalizedName);
  this.textures.put(Integer.valueOf(materialId), texture);
}

public IIcon getIconFromDamage(int damageValue)
{
  if (this.icons.containsKey(Integer.valueOf(damageValue))) {
    return (IIcon)this.icons.get(Integer.valueOf(damageValue));
  }
  return this.itemIcon;
}

public void getSubItems(Item item, CreativeTabs tab, List itemStackList)
{
  if (!this.unlocalizedMaterialNames.isEmpty()) {
    for (Map.Entry<Integer, String> subItem : this.unlocalizedMaterialNames.entrySet())
    {
      int matrialId = ((Integer)subItem.getKey()).intValue();
      itemStackList.add(new ItemStack(item, 1, matrialId));
    }
  } else {
    itemStackList.add(new ItemStack(this, 1));
  }
}

public String getUnlocalizedName(ItemStack itemStack)
{
  int damageValue = itemStack.getItemDamage();
  if (this.unlocalizedMaterialNames.containsKey(Integer.valueOf(damageValue))) {
    return "item." + (String)this.unlocalizedMaterialNames.get(Integer.valueOf(damageValue)) + "." + this.unlocalizedPartName;
  }
  return getUnlocalizedName();
}

public String getItemStackDisplayName(ItemStack itemStack)
{
  int damageValue = itemStack.getItemDamage();
  String displayName;
  if (this.unlocalizedMaterialNames.containsKey(Integer.valueOf(damageValue)))
  {
    String unlocalizedMaterialName = (String)this.unlocalizedMaterialNames.get(Integer.valueOf(damageValue));
    
    String unlocalizedSpecific = "part." + this.unlocalizedPartName + "." + unlocalizedMaterialName;
    if (StatCollector.canTranslate(unlocalizedSpecific))
    {
      String localizedSpecific = StatCollector.translateToLocal(unlocalizedSpecific);
      return localizedSpecific;
    }
    String unlocalizedGeneral = "part.material." + unlocalizedMaterialName;
    if ((StatCollector.canTranslate("part." + this.unlocalizedPartName)) && 
      (StatCollector.canTranslate(unlocalizedGeneral)))
    {
      String localizedPartName = StatCollector.translateToLocal("part." + this.unlocalizedPartName);
      
      String localizedGeneralMaterial = StatCollector.translateToLocal(unlocalizedGeneral);
      
      return localizedPartName.replaceAll("@material@", localizedGeneralMaterial);
    }
    if ((StatCollector.canTranslate("part." + this.unlocalizedPartName)) && 
      (StatCollector.canTranslate("material." + unlocalizedMaterialName)))
    {
      String localizedPartName = StatCollector.translateToLocal("part." + this.unlocalizedPartName);
      
      String localizedMaterialName = StatCollector.translateToLocal("material." + unlocalizedMaterialName);
      
      displayName = localizedPartName.replaceAll("@material@", localizedMaterialName);
    }
    else
    {
      displayName = getUnlocalizedName(itemStack) + ".name";
    }
  }
  else
  {
    displayName = getUnlocalizedName() + ".name";
  }
  return displayName;
}
}
