package avarielbuilder.blocks.trees.leaves;

import avarielbuilder.templates.AAvarielLeaves;
import net.minecraft.item.ItemBlock;

public class WalnutLeaves extends AAvarielLeaves {

	private final ItemBlock walnutLeavesItem;
	
	public WalnutLeaves() {
		super("walnut_leaves");
		walnutLeavesItem = (ItemBlock) new ItemBlock(this).setRegistryName("walnut_leaves");
	}

	@Override
	public ItemBlock getItemBlock() {
		return walnutLeavesItem;
	}

}
