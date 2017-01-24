package avarielbuilder.blocks.planks;

import avarielbuilder.templates.AvarielAbstractPlanks;
import net.minecraft.item.ItemBlock;

public class JacarandaPlanks extends AvarielAbstractPlanks {

	private final ItemBlock jacarandaPlanksItem;
	
	public JacarandaPlanks() {
		super("jacaranda_planks");
		jacarandaPlanksItem = (ItemBlock) new ItemBlock(this).setRegistryName("jacaranda_planks");
	}

	@Override
	public ItemBlock getItemBlock() {
		return jacarandaPlanksItem;
	}

}
