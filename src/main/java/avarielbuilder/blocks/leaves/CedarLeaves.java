package avarielbuilder.blocks.leaves;

import avarielbuilder.templates.AvarielAbstractLeaves;
import net.minecraft.item.ItemBlock;

public class CedarLeaves extends AvarielAbstractLeaves {

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
