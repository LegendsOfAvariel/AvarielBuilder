package avarielbuilder.blocks.decoration.rotatable;

import avarielbuilder.templates.AAvarielDecoRotatable;
import avarielbuilder.templates.IAvarielBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public class DisplayCase extends AAvarielDecoRotatable {

	private final ItemBlock displayCaseItem;
	
	public DisplayCase() {
		super("display_case", Material.WOOD);
		displayCaseItem = (ItemBlock) new ItemBlock(this).setRegistryName("display_case");
	}

	@Override
	public ItemBlock getItemBlock() {
		return displayCaseItem;
	}

}
