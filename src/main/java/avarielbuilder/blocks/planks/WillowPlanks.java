package avarielbuilder.blocks.planks;

import avarielbuilder.templates.AvarielAbstractPlanks;
import net.minecraft.item.ItemBlock;

public class WillowPlanks extends AvarielAbstractPlanks {

	private final ItemBlock willowPlanksItem;
	
	public WillowPlanks() {
		super("willow_planks");
		willowPlanksItem = (ItemBlock) new ItemBlock(this).setRegistryName("willow_planks");
	}

	@Override
	public ItemBlock getItemBlock() {
		return willowPlanksItem;
	}

}
