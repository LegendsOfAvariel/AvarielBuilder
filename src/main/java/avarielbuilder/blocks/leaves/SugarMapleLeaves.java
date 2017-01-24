package avarielbuilder.blocks.leaves;

import avarielbuilder.templates.AvarielAbstractLeaves;
import net.minecraft.item.ItemBlock;

public class SugarMapleLeaves extends AvarielAbstractLeaves {

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
