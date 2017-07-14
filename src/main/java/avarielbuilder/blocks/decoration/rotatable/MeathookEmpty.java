package avarielbuilder.blocks.decoration.rotatable;

import avarielbuilder.templates.AAvarielDecoRotatable;
import avarielbuilder.templates.IAvarielBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public class MeathookEmpty extends AAvarielDecoRotatable {

	private final ItemBlock meathookEmptyItem;
	
	public MeathookEmpty() {
		super("meathook_empty", Material.IRON);
		meathookEmptyItem = (ItemBlock) new ItemBlock(this).setRegistryName("meathook_empty");
	}

	@Override
	public ItemBlock getItemBlock() {
		return meathookEmptyItem;
	}

}
