package avarielbuilder.blocks.decoration.fixed;

import avarielbuilder.templates.AAvarielDecoFixed;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public class Barrel extends AAvarielDecoFixed {

	private final ItemBlock barrelItem;
	
	public Barrel() {
		super("barrel", Material.WOOD);
		barrelItem = (ItemBlock) new ItemBlock(this).setRegistryName("barrel");
	}

	@Override
	public ItemBlock getItemBlock() {
		return barrelItem;
	}

}
