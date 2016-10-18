package com.inuyasha10121.chemicraft.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

public class ItemEmptyFlask extends ItemBase{

	public ItemEmptyFlask() {
		super("itemEmptyFlask");
	}
	
	public boolean onDroppedByPlayer(ItemStack item, EntityPlayer player)
    {
		player.addChatComponentMessage(new TextComponentString("derp"));
        return true;
    }
	
	public void onCreated(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
	    if( par1ItemStack.stackTagCompound == null )
	        par1ItemStack.setTagCompound( new NBTTagCompound( ) );
	}
}
