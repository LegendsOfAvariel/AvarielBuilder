package avarielbuilder.blocks.leaves;

import avarielbuilder.templates.AvarielAbstractLeaves;
import net.minecraft.item.ItemBlock;

public class CherryBlossomsLeaves extends AvarielAbstractLeaves {

	private final ItemBlock cherryBlossomsLeavesItem;
	
	public CherryBlossomsLeaves() {
		super("cherry_blossoms");
		cherryBlossomsLeavesItem = (ItemBlock) new ItemBlock(this).setRegistryName("cherry_blossoms");
	}

	@Override
	public ItemBlock getItemBlock() {
		return cherryBlossomsLeavesItem;
	}

}
