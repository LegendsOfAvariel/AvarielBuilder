package avarielbuilder.blocks.decoration.rotatable;

import avarielbuilder.templates.AAvarielDecoRotatable;
import avarielbuilder.templates.IAvarielBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public class MeathookCod extends AAvarielDecoRotatable {

	private final ItemBlock meathookCodItem;
	
	public MeathookCod() {
		super("meathook_cod", Material.IRON);
		meathookCodItem = (ItemBlock) new ItemBlock(this).setRegistryName("meathook_cod");
	}

	@Override
	public ItemBlock getItemBlock() {
		return meathookCodItem;
	}

}
