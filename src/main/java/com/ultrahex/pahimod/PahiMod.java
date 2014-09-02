package com.ultrahex.pahimod;

import com.ultrahex.pahimod.config.ConfigHandler;
import com.ultrahex.pahimod.proxy.IProxy;
import com.ultrahex.pahimod.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Reference.MOD_ID, name=Reference.MOD_NAME, version = Reference.VERSION)
public class PahiMod
{

    @Mod.Instance(Reference.MOD_ID)
    public static PahiMod instance;

    @SidedProxy(clientSide = "com.ultrahex.pahimod.proxy.ClientProxy", serverSide = "com.ultrahex.pahimod.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigHandler.init(event.getSuggestedConfigurationFile());
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
