package avarielbuilder.blocks.leaves;

import avarielbuilder.templates.AvarielAbstractLeaves;
import net.minecraft.item.ItemBlock;

public class JuniperLeaves extends AvarielAbstractLeaves {

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
