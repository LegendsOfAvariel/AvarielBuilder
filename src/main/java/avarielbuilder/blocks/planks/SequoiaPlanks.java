package avarielbuilder.blocks.planks;

import avarielbuilder.templates.AvarielAbstractPlanks;
import net.minecraft.item.ItemBlock;

public class SequoiaPlanks extends AvarielAbstractPlanks {

	private final ItemBlock sequoiaPlanksItem;
	
	public SequoiaPlanks() {
		super("sequoia_planks");
		sequoiaPlanksItem = (ItemBlock) new ItemBlock(this).setRegistryName("sequoia_planks");
	}

	@Override
	public ItemBlock getItemBlock() {
		return sequoiaPlanksItem;
	}

}
