package avarielbuilder.blocks.trees.leaves;

import avarielbuilder.templates.AAvarielLeaves;
import net.minecraft.item.ItemBlock;

public class EbonyLeaves extends AAvarielLeaves {

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
