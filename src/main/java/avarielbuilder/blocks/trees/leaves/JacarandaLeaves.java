package avarielbuilder.blocks.trees.leaves;

import avarielbuilder.templates.AAvarielLeaves;
import net.minecraft.item.ItemBlock;

public class JacarandaLeaves extends AAvarielLeaves {

	private final ItemBlock jacarandaLeavesItem;
	
	public JacarandaLeaves() {
		super("jacaranda_leaves");
		jacarandaLeavesItem = (ItemBlock) new ItemBlock(this).setRegistryName("jacaranda_leaves");
	}

	@Override
	public ItemBlock getItemBlock() {
		return jacarandaLeavesItem;
	}

}
