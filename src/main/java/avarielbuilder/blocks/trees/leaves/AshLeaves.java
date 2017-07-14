package avarielbuilder.blocks.trees.leaves;

import avarielbuilder.templates.AAvarielLeaves;
import net.minecraft.item.ItemBlock;

public class AshLeaves extends AAvarielLeaves {

	private final ItemBlock ashLeavesItem;
	
	public AshLeaves() {
		super("ash_leaves");
		ashLeavesItem = (ItemBlock) new ItemBlock(this).setRegistryName("ash_leaves");
	}

	@Override
	public ItemBlock getItemBlock() {
		return ashLeavesItem;
	}

}
