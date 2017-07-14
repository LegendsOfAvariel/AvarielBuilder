package avarielbuilder.blocks.decoration.rotatable;

import avarielbuilder.templates.AAvarielDecoRotatable;
import avarielbuilder.templates.IAvarielBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public class MeathookSalmon extends AAvarielDecoRotatable {

	private final ItemBlock meathookSalmonItem;
	
	public MeathookSalmon() {
		super("meathook_salmon", Material.IRON);
		meathookSalmonItem = (ItemBlock) new ItemBlock(this).setRegistryName("meathook_salmon");
	}

	@Override
	public ItemBlock getItemBlock() {
		return meathookSalmonItem;
	}

}
