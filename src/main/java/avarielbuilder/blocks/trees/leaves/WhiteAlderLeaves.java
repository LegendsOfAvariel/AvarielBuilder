package avarielbuilder.blocks.trees.leaves;

import avarielbuilder.templates.AAvarielLeaves;
import net.minecraft.item.ItemBlock;

public class WhiteAlderLeaves extends AAvarielLeaves {

	private final ItemBlock whiteAlderLeavesItem;
	
	public WhiteAlderLeaves() {
		super("white_alder_leaves");
		whiteAlderLeavesItem = (ItemBlock) new ItemBlock(this).setRegistryName("white_alder_leaves");
	}

	@Override
	public ItemBlock getItemBlock() {
		return whiteAlderLeavesItem;
	}

}
