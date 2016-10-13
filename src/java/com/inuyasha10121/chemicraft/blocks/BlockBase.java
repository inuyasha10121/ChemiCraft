package com.inuyasha10121.chemicraft.blocks;

import com.inuyasha10121.chemicraft.Chemicraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block{
	protected String name;
	
	public BlockBase(Material material, String name)
	{
		super(material);
		
		this.name = name;
		
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(CreativeTabs.MATERIALS);
	}
	
	public void registerItemModel(ItemBlock itemBlock)
	{
		Chemicraft.proxy.registerItemRenderer(itemBlock, 0, name);
	}
}
