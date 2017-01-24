package avarielbuilder.blocks.planks;

import avarielbuilder.templates.AvarielAbstractPlanks;
import net.minecraft.item.ItemBlock;

public class AshPlanks extends AvarielAbstractPlanks {

	private final ItemBlock ashPlanksItem;
	
	public AshPlanks() {
		super("ash_planks");
		ashPlanksItem = (ItemBlock) new ItemBlock(this).setRegistryName("ash_planks");
	}

	@Override
	public ItemBlock getItemBlock() {
		return ashPlanksItem;
	}

}
