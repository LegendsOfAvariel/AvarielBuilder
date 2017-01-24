package avarielbuilder.blocks.planks;

import avarielbuilder.templates.AvarielAbstractPlanks;
import net.minecraft.item.ItemBlock;

public class SugarMaplePlanks extends AvarielAbstractPlanks {

	private final ItemBlock sugarMaplePlanksItem;
	
	public SugarMaplePlanks() {
		super("sugar_maple_planks");
		sugarMaplePlanksItem = (ItemBlock) new ItemBlock(this).setRegistryName("sugar_maple_planks");
	}

	@Override
	public ItemBlock getItemBlock() {
		return sugarMaplePlanksItem;
	}

}
