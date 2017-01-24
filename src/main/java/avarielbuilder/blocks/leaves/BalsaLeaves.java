package avarielbuilder.blocks.leaves;

import avarielbuilder.templates.AvarielAbstractLeaves;
import net.minecraft.item.ItemBlock;

public class BalsaLeaves extends AvarielAbstractLeaves {

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
