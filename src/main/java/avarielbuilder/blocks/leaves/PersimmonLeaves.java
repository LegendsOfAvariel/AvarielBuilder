package avarielbuilder.blocks.leaves;

import avarielbuilder.templates.AvarielAbstractLeaves;
import net.minecraft.item.ItemBlock;

public class PersimmonLeaves extends AvarielAbstractLeaves {

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
