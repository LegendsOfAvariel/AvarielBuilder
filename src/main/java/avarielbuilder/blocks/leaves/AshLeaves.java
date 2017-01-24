package avarielbuilder.blocks.leaves;

import avarielbuilder.templates.AvarielAbstractLeaves;
import net.minecraft.item.ItemBlock;

public class AshLeaves extends AvarielAbstractLeaves {

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
