package com.fizzware.dramaticdoors.compat;

import net.minecraftforge.fml.ModList;

public class Compats
{
    public static final boolean AUTOMATIC_DOORS_INSTALLED;
	public static final boolean CURIOS_INSTALLED;
    public static final boolean DOUBLE_DOORS_INSTALLED;
    public static final boolean CHIPPED_INSTALLED;
    public static final boolean MACAWS_DOORS_INSTALLED;
    public static final boolean MANYIDEAS_DOORS_INSTALLED;
    public static final boolean QUARK_INSTALLED;
    public static final boolean SUPPLEMENTARIES_INSTALLED;
    public static final boolean STATEMENT_INSTALLED;
    
    static {
    	AUTOMATIC_DOORS_INSTALLED = ModList.get().isLoaded("automaticdoors");
    	CURIOS_INSTALLED = ModList.get().isLoaded("curios");
    	DOUBLE_DOORS_INSTALLED = ModList.get().isLoaded("doubledoors");
    	CHIPPED_INSTALLED = ModList.get().isLoaded("chipped");
    	MACAWS_DOORS_INSTALLED = ModList.get().isLoaded("mcwdoors");
    	MANYIDEAS_DOORS_INSTALLED = ModList.get().isLoaded("manyideas_doors");
    	QUARK_INSTALLED = ModList.get().isLoaded("quark");
    	SUPPLEMENTARIES_INSTALLED = ModList.get().isLoaded("supplementaries");
    	STATEMENT_INSTALLED = ModList.get().isLoaded("statement");
    }
}
