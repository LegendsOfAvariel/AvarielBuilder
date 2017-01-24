package avarielbuilder.blocks.planks;

import avarielbuilder.templates.AvarielAbstractPlanks;
import net.minecraft.item.ItemBlock;

public class JuniperPlanks extends AvarielAbstractPlanks {

	private final ItemBlock juniperPlanksItem;
	
	public JuniperPlanks() {
		super("juniper_planks");
		juniperPlanksItem = (ItemBlock) new ItemBlock(this).setRegistryName("juniper_planks");
	}

	@Override
	public ItemBlock getItemBlock() {
		return juniperPlanksItem;
	}

}
