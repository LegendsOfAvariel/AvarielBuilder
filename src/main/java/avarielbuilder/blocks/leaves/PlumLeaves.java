package avarielbuilder.blocks.leaves;

import avarielbuilder.templates.AvarielAbstractLeaves;
import net.minecraft.item.ItemBlock;

public class PlumLeaves extends AvarielAbstractLeaves {

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
