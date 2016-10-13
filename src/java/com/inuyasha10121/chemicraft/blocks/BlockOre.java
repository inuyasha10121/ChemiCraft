package com.inuyasha10121.chemicraft.blocks;

import net.minecraft.block.material.Material;

public class BlockOre extends BlockBase{
	public BlockOre(String name)
	{
		super(Material.ROCK, name);
		
		this.setHardness(3f);
		this.setResistance(5f);
	}
}
