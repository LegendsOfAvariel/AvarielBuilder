package avarielbuilder.blocks.trees.leaves;

import avarielbuilder.templates.AAvarielLeaves;
import net.minecraft.item.ItemBlock;

public class CedarLeaves extends AAvarielLeaves {

	private final ItemBlock cedarLeavesBlock;
	
	public CedarLeaves() {
		super("cedar_leaves");
		cedarLeavesBlock = (ItemBlock) new ItemBlock(this).setRegistryName("cedar_leaves");
	}

	@Override
	public ItemBlock getItemBlock() {
		return cedarLeavesBlock;
	}

}
