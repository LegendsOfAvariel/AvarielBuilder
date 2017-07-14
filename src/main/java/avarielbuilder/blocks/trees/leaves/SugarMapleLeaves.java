package avarielbuilder.blocks.trees.leaves;

import avarielbuilder.templates.AAvarielLeaves;
import net.minecraft.item.ItemBlock;

public class SugarMapleLeaves extends AAvarielLeaves {

	private final ItemBlock sugarMapleLeavesItem;
	
	public SugarMapleLeaves() {
		super("sugar_maple_leaves");
		sugarMapleLeavesItem = (ItemBlock) new ItemBlock(this).setRegistryName("sugar_maple_leaves");
	}

	@Override
	public ItemBlock getItemBlock() {
		return sugarMapleLeavesItem;
	}

}
