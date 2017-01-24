package avarielbuilder.blocks.leaves;

import avarielbuilder.templates.AvarielAbstractLeaves;
import net.minecraft.item.ItemBlock;

public class PalmLeaves extends AvarielAbstractLeaves {

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
