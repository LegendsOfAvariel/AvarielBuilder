package avarielbuilder.blocks.planks;

import avarielbuilder.templates.AvarielAbstractPlanks;
import net.minecraft.item.ItemBlock;

public class BalsaPlanks extends AvarielAbstractPlanks {

	private final ItemBlock balsaPlanksItem;
	
	public BalsaPlanks() {
		super("balsa_planks");
		balsaPlanksItem = (ItemBlock) new ItemBlock(this).setRegistryName("balsa_planks");
	}

	@Override
	public ItemBlock getItemBlock() {
		return balsaPlanksItem;
	}

}
