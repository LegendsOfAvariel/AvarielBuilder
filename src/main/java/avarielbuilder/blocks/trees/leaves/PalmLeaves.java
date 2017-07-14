package avarielbuilder.blocks.trees.leaves;

import avarielbuilder.templates.AAvarielLeaves;
import net.minecraft.item.ItemBlock;

public class PalmLeaves extends AAvarielLeaves {

	private final ItemBlock palmLeavesItem;
	
	public PalmLeaves() {
		super("palm_leaves");
		palmLeavesItem = (ItemBlock) new ItemBlock(this).setRegistryName("palm_leaves");
	}

	@Override
	public ItemBlock getItemBlock() {
		return palmLeavesItem;
	}

}
