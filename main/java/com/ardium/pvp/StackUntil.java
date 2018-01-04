package com.ardium.pvp;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class StackUntil {
    private static List<ItemStack> split(ItemStack stack) {
        if ( (stack == null) || (stack.stackSize == 0) ) {
            return null;
        }
        List<ItemStack> ret = new ArrayList ();
        if ( stack.stackSize == 1 ) {
            ret.add (stack);
            return ret;
        }
        int remain = stack.stackSize % 2;
        int split = (int) (stack.stackSize / 2.0F);

        ret.add (size (stack, split + remain));
        ret.add (size (stack, split));

        return ret;
    }

    public static Item getItem(ItemStack stack) {
        if ( stack == null ) {
            return null;
        }
        return stack.getItem ();
    }

    public static boolean diffIgnoreNull(ItemStack stack1, ItemStack stack2) {
        return (stack1 != null) && (stack2 != null) && ((stack1.getItem () != stack2.getItem ()) || (stack1.getItemDamage () != stack2.getItemDamage ()));
    }

    public static boolean equalsWildcard(ItemStack wild, ItemStack check) {
        if ( (wild == null) || (check == null) ) {
            return check == wild;
        }
        return (wild.getItem () == check.getItem ()) && ((wild.getItemDamage () == 32767) || (wild.getItemDamage () == check.getItemDamage ()));
    }

    private static boolean equalsWildcardWithNBT(ItemStack wild, ItemStack check) {
        return (equalsWildcard (wild, check)) && (wild.stackTagCompound == null ? check.stackTagCompound != null : (wild.stackTagCompound == check.stackTagCompound) || (wild.stackTagCompound.equals (check.stackTagCompound)));
    }

    public static List<ItemStack> even(ItemStack stack1, ItemStack stack2) {
        ArrayList<ItemStack> ret = new ArrayList ();
        if ( (getSize (stack1) == getSize (stack2)) || (Math.abs (getSize (stack1) - getSize (stack2)) == 1) ) {
            ret.add (stack1);
            ret.add (stack2);

            return ret;
        }
        if ( getSize (stack1) > getSize (stack2) ) {
            int diff = getSize (stack1) - getSize (stack2);

            List<ItemStack> split = split (size (stack1, diff));

            ret.add (subtract (stack1, split.get (0)));
            ret.add (add (stack2, split.get (0)));
        } else if ( getSize (stack2) > getSize (stack1) ) {
            int diff = getSize (stack2) - getSize (stack1);

            List<ItemStack> split = split (size (stack2, diff));

            ret.add (subtract (stack2, split.get (0)));
            ret.add (add (stack1, split.get (0)));
        }
        return ret;
    }

    private static ItemStack add(ItemStack stack1, ItemStack stack2) {
        if ( stack1 == null ) {
            return stack2;
        }
        if ( stack2 == null ) {
            return stack1;
        }
        return size (stack1, getSize (stack1) + getSize (stack2));
    }

    private static ItemStack subtract(ItemStack stack1, ItemStack stack2) {
        if ( stack1 == null ) {
            return null;
        }
        if ( stack2 == null ) {
            return stack1;
        }
        return size (stack1, getSize (stack1) - getSize (stack2));
    }

    private static ItemStack size(ItemStack stack, int size) {
        if ( (size <= 0) || (stack == null) ) {
            return null;
        }
        ItemStack ret = stack.copy ();
        ret.stackSize = size;
        return ret;
    }

    public static ItemStack copy(ItemStack stack) {
        if ( stack == null ) {
            return null;
        }
        return stack.copy ();
    }

    private static int getSize(ItemStack stack) {
        return stack != null ? stack.stackSize : 0;
    }

    public static List<ItemStack> getMergeRejects(ItemStack[] orig, ItemStack[] toAdd) {
        List<ItemStack> ret = new ArrayList ();
        for (int i = 0; i < toAdd.length; i++) {
            if ( toAdd[i] != null ) {
                ItemStack reject = getMergeReject (orig[i], toAdd[i]);
                if ( reject != null ) {
                    ret.add (reject);
                }
            }
        }
        return ret;
    }

    public static void merge(ItemStack[] orig, ItemStack[] toAdd) {
        for (int i = 0; i < toAdd.length; i++) {
            if ( toAdd[i] != null ) {
                orig[i] = merge (orig[i], toAdd[i]);
            }
        }
    }

    private static ItemStack merge(ItemStack orig, ItemStack toAdd) {
        if ( orig == null ) {
            return toAdd;
        }
        if ( toAdd == null ) {
            return orig;
        }
        if ( (!orig.isItemEqual (toAdd)) || (!ItemStack.areItemStackTagsEqual (orig, toAdd)) ) {
            return orig;
        }
        return size (orig, Math.min (orig.getMaxStackSize (), orig.stackSize + toAdd.stackSize));
    }

    private static ItemStack getMergeReject(ItemStack orig, ItemStack toAdd) {
        if ( orig == null ) {
            return null;
        }
        if ( toAdd == null ) {
            return orig;
        }
        if ( (!orig.isItemEqual (toAdd)) || (!ItemStack.areItemStackTagsEqual (orig, toAdd)) ) {
            return orig;
        }
        int newSize = orig.stackSize + toAdd.stackSize;
        if ( newSize > orig.getMaxStackSize () ) {
            return size (orig, newSize - orig.getMaxStackSize ());
        }
        return size (orig, newSize);
    }

    public static boolean contains(ItemStack container, ItemStack contained) {
        return (equalsWildcardWithNBT (contained, container)) && (container.stackSize >= contained.stackSize);
    }

    public static int hashItemStack(ItemStack stack) {
        if ( (stack == null) || (stack.getItem () == null) ) {
            return -1;
        }
        String name = stack.getItemDamage () == 32767 ? stack.getItem ().getUnlocalizedName () : stack.getItem ().getUnlocalizedName (stack);
        return name.hashCode () << 8 | stack.getItemDamage ();
    }
}
