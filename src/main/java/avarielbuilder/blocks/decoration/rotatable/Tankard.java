package avarielbuilder.blocks.decoration.rotatable;

import avarielbuilder.templates.AAvarielDecoRotatable;
import avarielbuilder.templates.IAvarielBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public class Tankard extends AAvarielDecoRotatable {

	private final ItemBlock tankardItem;
	
	public Tankard() {
		super("tankard", Material.WOOD);
		tankardItem = (ItemBlock) new ItemBlock(this).setRegistryName("tankard");
	}

	@Override
	public ItemBlock getItemBlock() {
		return tankardItem;
	}

}
