package avarielbuilder.templates;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class AvarielBlock extends Block {

	public AvarielBlock(String name, Material material, Float hardness) {
		super(material);
		
		this.setHardness(hardness);
		
		this.setRegistryName(name);
		this.setUnlocalizedName(this.getRegistryName().toString());
	}
	
	//Applies textures and models to a given block and it's item form.
	public void render(Block block) {
		Item item = Item.getItemFromBlock(block);
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
		
	//Registers a block and itemblock pair. This exists for the sake of compactness.
	public void register(Block block, ItemBlock itemBlock) {
		GameRegistry.register(block);
		GameRegistry.register(itemBlock);
	}

}
