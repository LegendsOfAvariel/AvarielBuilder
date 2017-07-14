package avarielbuilder.blocks.decoration.rotatable;

import avarielbuilder.templates.AAvarielDecoRotatable;
import avarielbuilder.templates.IAvarielBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public class MeathookMutton extends AAvarielDecoRotatable {

	private final ItemBlock meathookMuttonItem;
	
	public MeathookMutton() {
		super("meathook_mutton", Material.IRON);
		meathookMuttonItem = (ItemBlock) new ItemBlock(this).setRegistryName("meathook_mutton");
	}

	@Override
	public ItemBlock getItemBlock() {
		return meathookMuttonItem;
	}

}
