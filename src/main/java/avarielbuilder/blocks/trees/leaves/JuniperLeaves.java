package avarielbuilder.blocks.trees.leaves;

import avarielbuilder.templates.AAvarielLeaves;
import net.minecraft.item.ItemBlock;

public class JuniperLeaves extends AAvarielLeaves {

	private final ItemBlock juniperLeavesItem;
	
	public JuniperLeaves() {
		super("juniper_leaves");
		juniperLeavesItem = (ItemBlock) new ItemBlock(this).setRegistryName("juniper_leaves");
	}

	@Override
	public ItemBlock getItemBlock() {
		return juniperLeavesItem;
	}

}
