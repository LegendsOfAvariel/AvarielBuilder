package avarielbuilder.blocks.leaves;

import avarielbuilder.templates.AvarielAbstractLeaves;
import net.minecraft.item.ItemBlock;

public class EbonyLeaves extends AvarielAbstractLeaves {

	private final ItemBlock ebonyLeavesItem;
	
	public EbonyLeaves() {
		super("ebony_leaves");
		ebonyLeavesItem = (ItemBlock) new ItemBlock(this).setRegistryName("ebony_leaves");
	}

	@Override
	public ItemBlock getItemBlock() {
		return ebonyLeavesItem;
	}

}
