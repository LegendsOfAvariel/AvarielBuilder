package avarielbuilder.blocks.planks;

import avarielbuilder.templates.AvarielAbstractPlanks;
import net.minecraft.item.ItemBlock;

public class CedarPlanks extends AvarielAbstractPlanks {

	private final ItemBlock cedarPlanksItem;
	
	public CedarPlanks() {
		super("cedar_planks");
		cedarPlanksItem = (ItemBlock) new ItemBlock(this).setRegistryName("cedar_planks");
	}

	@Override
	public ItemBlock getItemBlock() {
		return cedarPlanksItem;
	}

}
