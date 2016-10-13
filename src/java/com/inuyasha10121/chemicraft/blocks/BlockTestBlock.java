package com.inuyasha10121.chemicraft.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockTestBlock extends BlockBase{
	public BlockTestBlock(String name)
	{
		super(Material.IRON, name);
		
		this.setHardness(3f);
		this.setResistance(5f);
	}
	
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ)
    {
		playerIn.setFire(1);
        return false;
    }
}
