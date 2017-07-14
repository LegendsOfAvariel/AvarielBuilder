package avarielbuilder.blocks.trees.leaves;

import avarielbuilder.templates.AAvarielLeaves;
import net.minecraft.item.ItemBlock;

public class PersimmonLeaves extends AAvarielLeaves {

	private final ItemBlock persimmonLeavesItem;
	
	public PersimmonLeaves() {
		super("persimmon_leaves");
		persimmonLeavesItem = (ItemBlock) new ItemBlock(this).setRegistryName("persimmon_leaves");
	}

	@Override
	public ItemBlock getItemBlock() {
		return persimmonLeavesItem;
	}

}
