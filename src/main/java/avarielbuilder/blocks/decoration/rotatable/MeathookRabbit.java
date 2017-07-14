package avarielbuilder.blocks.decoration.rotatable;

import avarielbuilder.templates.AAvarielDecoRotatable;
import avarielbuilder.templates.IAvarielBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public class MeathookRabbit extends AAvarielDecoRotatable {

	private final ItemBlock meathookRabbitItem;
	
	public MeathookRabbit() {
		super("meathook_rabbit", Material.IRON);
		meathookRabbitItem = (ItemBlock) new ItemBlock(this).setRegistryName("meathook_rabbit");
	}

	@Override
	public ItemBlock getItemBlock() {
		return meathookRabbitItem;
	}

}
