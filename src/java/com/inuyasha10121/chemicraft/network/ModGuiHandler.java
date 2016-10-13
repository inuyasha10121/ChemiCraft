package com.inuyasha10121.chemicraft.network;

import com.inuyasha10121.chemicraft.client.gui.inventory.GuiChemistryBench;
import com.inuyasha10121.chemicraft.inventory.ContainerChemistryBench;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class ModGuiHandler implements IGuiHandler{
	public static int CHEMICRAFT_CHEMISTRYBENCH_GUI = 0;
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == CHEMICRAFT_CHEMISTRYBENCH_GUI)
			return new ContainerChemistryBench(player.inventory, world, new BlockPos(x, y, z));
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if (ID == CHEMICRAFT_CHEMISTRYBENCH_GUI)
			return new GuiChemistryBench(player.inventory, world);
		return null;
	}

}
