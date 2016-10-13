package com.inuyasha10121.chemicraft.recipe;

import com.inuyasha10121.chemicraft.block.ModBlocks;
import com.inuyasha10121.chemicraft.item.ModItems;
import com.inuyasha10121.chemicraft.item.crafting.ChemistryBenchManager;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	public static void registerRecipes()
	{
		//Native Minecraft Recipes
		GameRegistry.addSmelting(ModBlocks.blockPlatinumOre, new ItemStack(ModItems.itemPlatinumIngot), 1f);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.itemEmptyFlask), " G ","G G","GGG",'G',Blocks.GLASS_PANE);
		
		//Chemistry Bench Recipes
		ChemistryBenchManager chemBenchManager = ChemistryBenchManager.getInstance();
		chemBenchManager.addShapelessRecipe(new ItemStack(Blocks.DIRT,4), new Object[] {Blocks.COBBLESTONE});
	}
}
