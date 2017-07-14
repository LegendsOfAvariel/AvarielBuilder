package avarielbuilder.blocks.trees.leaves;

import avarielbuilder.templates.AAvarielLeaves;
import net.minecraft.item.ItemBlock;

public class SequoiaLeaves extends AAvarielLeaves {

	private final ItemBlock sequoiaLeavesItem;
	
	public SequoiaLeaves() {
		super("sequoia_leaves");
		sequoiaLeavesItem = (ItemBlock) new ItemBlock(this).setRegistryName("sequoia_leaves");
	}

	@Override
	public ItemBlock getItemBlock() {
		return sequoiaLeavesItem;
	}

}
