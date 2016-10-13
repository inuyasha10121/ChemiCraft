package com.inuyasha10121.chemicraft.recipe;

import com.inuyasha10121.chemicraft.blocks.ModBlocks;
import com.inuyasha10121.chemicraft.items.ModItems;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	public static void registerRecipes()
	{
		GameRegistry.addSmelting(ModBlocks.blockPlatinumOre, new ItemStack(ModItems.itemPlatinumIngot), 1f);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.itemEmptyFlask), " G ","G G","GGG",'G',Blocks.GLASS_PANE);
	}
}
