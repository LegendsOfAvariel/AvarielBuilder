package avarielbuilder.blocks.planks;

import avarielbuilder.templates.AvarielAbstractPlanks;
import net.minecraft.item.ItemBlock;

public class WalnutPlanks extends AvarielAbstractPlanks {

	private final ItemBlock walnutPlanksItem;
	
	public WalnutPlanks() {
		super("walnut_planks");
		walnutPlanksItem = (ItemBlock) new ItemBlock(this).setRegistryName("walnut_planks");
	}

	@Override
	public ItemBlock getItemBlock() {
		return walnutPlanksItem;
	}

}
