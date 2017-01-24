package avarielbuilder.blocks.leaves;

import avarielbuilder.templates.AvarielAbstractLeaves;
import net.minecraft.item.ItemBlock;

public class WillowLeaves extends AvarielAbstractLeaves {

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
