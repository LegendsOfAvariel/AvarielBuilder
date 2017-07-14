package avarielbuilder.blocks.decoration.rotatable;

import avarielbuilder.templates.AAvarielDecoRotatable;
import avarielbuilder.templates.IAvarielBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public class MeathookChicken extends AAvarielDecoRotatable {

	private final ItemBlock meathookChickenItem;
	
	public MeathookChicken() {
		super("meathook_chicken", Material.IRON);
		meathookChickenItem = (ItemBlock) new ItemBlock(this).setRegistryName("meathook_chicken");
	}

	@Override
	public ItemBlock getItemBlock() {
		return meathookChickenItem;
	}

}
