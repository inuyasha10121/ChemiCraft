package com.inuyasha10121.chemicraft.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	public static BlockBase blockTestBlock, blockPlatinumOre;
	public static BlockChemistryBench blockChemistryBench;
	public static BlockAnaerobicFurnace blockAnaerobicFurnace;
	
	public static void registerBlocks()
	{
		blockPlatinumOre = register(new BlockOre("blockPlatinumOre"));
		blockTestBlock = register(new BlockTestBlock("blockTestBlock"));
		blockChemistryBench = register(new BlockChemistryBench());
		//blockAnaerobicFurnace = register(new BlockAnaerobicFurnace(false));
	}
	
	private static <T extends Block> T register(T block, ItemBlock itemBlock)
	{
		GameRegistry.register(block);
		GameRegistry.register(itemBlock);
		
		if(block instanceof BlockBase)
		{
			((BlockBase)block).registerItemModel(itemBlock);
		}
		
		return block;
	}
	
	private static <T extends Block> T register(T block)
	{
		ItemBlock itemBlock = new ItemBlock(block);
		itemBlock.setRegistryName(block.getRegistryName());
		return register(block,itemBlock);
	}
}
