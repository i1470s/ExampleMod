package com.brayden.example;

import net.minecraft.init.Blocks;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = ExampleMod.MODID, name = ExampleMod.NAME, version = ExampleMod.VERSION)
public class ExampleMod
{
    public static final String MODID = "example";
    public static final String NAME = "Example";
    public static final String VERSION = "1.0";

    private static Logger logger;

    public static ToolMaterial myToolMaterial;
    public static Item mySword;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        
        myToolMaterial = EnumHelper.addToolMaterial("MATERIAL NAME", 4, 10000, 20.0F, 100.0F, 30);
        
        mySword = new CustomSword();
        		
    }
}
