package avarielbuilder.blocks.planks;

import avarielbuilder.templates.AvarielAbstractPlanks;
import net.minecraft.item.ItemBlock;

public class EbonyPlanks extends AvarielAbstractPlanks {

	private final ItemBlock ebonyPlanksItem;
	
	public EbonyPlanks() {
		super("ebony_planks");
		ebonyPlanksItem = (ItemBlock) new ItemBlock(this).setRegistryName("ebony_planks");
	}

	@Override
	public ItemBlock getItemBlock() {
		return ebonyPlanksItem;
	}

}
