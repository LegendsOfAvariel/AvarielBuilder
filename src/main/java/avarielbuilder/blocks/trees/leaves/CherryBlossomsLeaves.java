package avarielbuilder.blocks.trees.leaves;

import avarielbuilder.templates.AAvarielLeaves;
import net.minecraft.item.ItemBlock;

public class CherryBlossomsLeaves extends AAvarielLeaves {

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
