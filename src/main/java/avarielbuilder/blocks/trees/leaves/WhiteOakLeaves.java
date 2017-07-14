package avarielbuilder.blocks.trees.leaves;

import avarielbuilder.templates.AAvarielLeaves;
import net.minecraft.item.ItemBlock;

public class WhiteOakLeaves extends AAvarielLeaves {

	private final ItemBlock whiteOakLeavesItem;
	
	public WhiteOakLeaves() {
		super("white_oak_leaves");
		whiteOakLeavesItem = (ItemBlock) new ItemBlock(this).setRegistryName("white_oak_leaves");
	}

	@Override
	public ItemBlock getItemBlock() {
		return whiteOakLeavesItem;
	}

}
