package com.inuyasha10121.chemicraft.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item itemEmptyFlask, itemPlatinumIngot;
	
	public static void registerItems()
	{
		itemEmptyFlask = register(new ItemBase("itemEmptyFlask"));
		itemPlatinumIngot = register(new ItemBase("itemPlatinumIngot"));
	}
	
	public static <T extends Item> T register(T item)
	{
		GameRegistry.register(item);
		if (item instanceof ItemBase) {
			((ItemBase)item).registerItemModel();
		}
		return item;
	}
}
