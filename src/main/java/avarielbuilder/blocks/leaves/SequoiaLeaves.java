package avarielbuilder.blocks.leaves;

import avarielbuilder.templates.AvarielAbstractLeaves;
import net.minecraft.item.ItemBlock;

public class SequoiaLeaves extends AvarielAbstractLeaves {

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
