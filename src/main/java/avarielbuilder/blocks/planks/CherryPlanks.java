package avarielbuilder.blocks.planks;

import avarielbuilder.templates.AvarielAbstractPlanks;
import net.minecraft.item.ItemBlock;

public class CherryPlanks extends AvarielAbstractPlanks {

	private final ItemBlock cherryPlanksItem;
	
	public CherryPlanks() {
		super("cherry_planks");
		cherryPlanksItem = (ItemBlock) new ItemBlock(this).setRegistryName("cherry_planks");
	}

	@Override
	public ItemBlock getItemBlock() {
		return cherryPlanksItem;
	}

}
