package avarielbuilder.blocks.trees.leaves;

import avarielbuilder.templates.AAvarielLeaves;
import net.minecraft.item.ItemBlock;

public class BalsaLeaves extends AAvarielLeaves {

	private final ItemBlock balsaLeavesItem;
	
	public BalsaLeaves() {
		super("balsa_leaves");
		balsaLeavesItem = (ItemBlock) new ItemBlock(this).setRegistryName("balsa_leaves");
	}

	@Override
	public ItemBlock getItemBlock() {
		return balsaLeavesItem;
	}

}
