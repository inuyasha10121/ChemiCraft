package com.inuyasha10121.chemicraft.item;

import com.inuyasha10121.chemicraft.Chemicraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item{
	
	protected String unlocalizedName;
	
	public ItemBase(String unlocalizedName)
	{
		super();
		
		this.unlocalizedName = unlocalizedName;
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(unlocalizedName);
		this.setCreativeTab(CreativeTabs.MATERIALS);
	}
	
	public void registerItemModel()
	{
		Chemicraft.proxy.registerItemRenderer(this, 0, unlocalizedName);
	}
}
