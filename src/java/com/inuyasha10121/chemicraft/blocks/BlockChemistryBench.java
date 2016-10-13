package com.inuyasha10121.chemicraft.blocks;

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

    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ)
    {
        if (worldIn.isRemote)
        {
            return true;
        }
        else
        {
            //playerIn.displayGui(new BlockChemistryBench.InterfaceCraftingTable(worldIn, pos));
            //playerIn.addStat(StatList.CRAFTING_TABLE_INTERACTION);
        	playerIn.openGui(Chemicraft.instance, ModGuiHandler.CHEMICRAFT_CHEMISTRYBENCH_GUI, worldIn, pos.getX(), pos.getY(), pos.getZ());
            return true;
        }
    }
/*
    public static class InterfaceCraftingTable implements IInteractionObject
        {
            private final World world;
            private final BlockPos position;

            public InterfaceCraftingTable(World worldIn, BlockPos pos)
            {
                this.world = worldIn;
                this.position = pos;
            }

            public String getName()
            {
                return null;
            }

            public boolean hasCustomName()
            {
                return false;
            }

            public ITextComponent getDisplayName()
            {
                return new TextComponentTranslation(Blocks.CRAFTING_TABLE.getUnlocalizedName() + ".name", new Object[0]);
            }

            public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn)
            {
                return new ContainerChemistryBench(playerInventory, this.world, this.position);
            }
            
            
            //assets.minecraft.models.item
            //assets.minecraft.models.block
            //assets.minecraft.blockstates
            //minecraft.client.gui.inventory.GuiCrafting
            //
            public String getGuiID()
            {
                return "minecraft:crafting_table";
            	//return "chemicraft:ChemistryBench";
            }
        }
*/
}
