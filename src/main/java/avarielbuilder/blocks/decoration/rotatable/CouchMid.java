package avarielbuilder.blocks.decoration.rotatable;

import avarielbuilder.templates.AAvarielDecoRotatable;
import avarielbuilder.templates.IAvarielBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public class CouchMid extends AAvarielDecoRotatable {

	private final ItemBlock couchMidItem;
	
	public CouchMid() {
		super("couch_mid", Material.WOOD);
		couchMidItem = (ItemBlock) new ItemBlock(this).setRegistryName("couch_mid");
	}

	@Override
	public ItemBlock getItemBlock() {
		return couchMidItem;
	}

}
