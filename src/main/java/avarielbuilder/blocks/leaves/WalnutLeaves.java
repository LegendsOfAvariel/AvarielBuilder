package avarielbuilder.blocks.leaves;

import avarielbuilder.templates.AvarielAbstractLeaves;
import net.minecraft.item.ItemBlock;

public class WalnutLeaves extends AvarielAbstractLeaves {

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
