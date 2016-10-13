package com.inuyasha10121.chemicraft.block;

import javax.annotation.Nullable;

import com.inuyasha10121.chemicraft.Chemicraft;
import com.inuyasha10121.chemicraft.network.ModGuiHandler;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockChemistryBench extends BlockBase
{
	protected BlockChemistryBench()
    {
        super(Material.ROCK,"blockChemistryBench");
        this.setCreativeTab(CreativeTabs.MATERIALS);
    }

    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, @Nullable ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ)
    {
        if (worldIn.isRemote)
        {
            return true;
        }
        else
        {
        	playerIn.openGui(Chemicraft.instance, ModGuiHandler.CHEMICRAFT_CHEMISTRYBENCH_GUI, worldIn, pos.getX(), pos.getY(), pos.getZ());
            return true;
        }
    }
}
