package com.inuyasha10121.chemicraft.proxy;

import com.inuyasha10121.chemicraft.Chemicraft;
import com.inuyasha10121.chemicraft.block.ModBlocks;
import com.inuyasha10121.chemicraft.item.ModItems;
import com.inuyasha10121.chemicraft.network.ModGuiHandler;
import com.inuyasha10121.chemicraft.recipe.ModRecipes;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class CommonProxy {
	public void preInit(FMLPreInitializationEvent e)
	{
        ModItems.registerItems();
        ModBlocks.registerBlocks();
	}
	
	public void init(FMLInitializationEvent e)
	{
		NetworkRegistry.INSTANCE.registerGuiHandler(Chemicraft.instance, new ModGuiHandler());
		ModRecipes.registerRecipes();
	}
	
	public void postInit(FMLPostInitializationEvent e)
	{
		
	}
	
	public void registerItemRenderer(Item item, int meta, String id)
	{
		
	}
}
