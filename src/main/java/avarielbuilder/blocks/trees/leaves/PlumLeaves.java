package avarielbuilder.blocks.trees.leaves;

import avarielbuilder.templates.AAvarielLeaves;
import net.minecraft.item.ItemBlock;

public class PlumLeaves extends AAvarielLeaves {

	private final ItemBlock plumLeavesItem;
	
	public PlumLeaves() {
		super("plum_leaves");
		plumLeavesItem = (ItemBlock) new ItemBlock(this).setRegistryName("plum_leaves");
	}

	@Override
	public ItemBlock getItemBlock() {
		return plumLeavesItem;
	}

}
