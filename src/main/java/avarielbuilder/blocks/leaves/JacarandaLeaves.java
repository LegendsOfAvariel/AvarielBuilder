package avarielbuilder.blocks.leaves;

import avarielbuilder.templates.AvarielAbstractLeaves;
import net.minecraft.item.ItemBlock;

public class JacarandaLeaves extends AvarielAbstractLeaves {

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
