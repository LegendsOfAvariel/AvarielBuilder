package avarielbuilder.blocks.planks;

import avarielbuilder.templates.AvarielAbstractPlanks;
import net.minecraft.item.ItemBlock;

public class WhiteAlderPlanks extends AvarielAbstractPlanks {

	private final ItemBlock whiteAlderPlanksItem;
	
	public WhiteAlderPlanks() {
		super("white_alder_planks");
		whiteAlderPlanksItem = (ItemBlock) new ItemBlock(this).setRegistryName("white_alder_planks");
	}

	@Override
	public ItemBlock getItemBlock() {
		return whiteAlderPlanksItem;
	}

}
