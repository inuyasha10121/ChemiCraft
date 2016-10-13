package com.inuyasha10121.chemicraft;

import com.inuyasha10121.chemicraft.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Chemicraft.MODID, name = Chemicraft.MODNAME, version = Chemicraft.VERSION)
public class Chemicraft {
	@SidedProxy(clientSide="com.inuyasha10121.chemicraft.proxy.ClientProxy", serverSide="com.inuyasha10121.chemicraft.proxy.ServerProxy")
	public static CommonProxy proxy;
	
	public static final String MODID = "chemicraft";
	public static final String MODNAME = "Chemicraft";
	public static final String VERSION = "0.1.0";
	
	@Instance
	public static Chemicraft instance = new Chemicraft();
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e)
	{
		proxy.preInit(e);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent e)
	{
		proxy.init(e);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent e)
	{
		proxy.postInit(e);
	}
}