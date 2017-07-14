package avarielbuilder.blocks.trees.leaves;

import avarielbuilder.templates.AAvarielLeaves;
import net.minecraft.item.ItemBlock;

public class WillowLeaves extends AAvarielLeaves {

	private final ItemBlock willowLeavesItem;
	
	public WillowLeaves() {
		super("willow_leaves");
		willowLeavesItem = (ItemBlock) new ItemBlock(this).setRegistryName("willow_leaves");
	}

	@Override
	public ItemBlock getItemBlock() {
		return willowLeavesItem;
	}

}
