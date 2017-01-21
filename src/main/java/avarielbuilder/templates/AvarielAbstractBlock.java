package avarielbuilder.templates;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public abstract class AvarielAbstractBlock extends Block implements AvarielBlock {

	public AvarielAbstractBlock(String name, Material material, Float hardness) {
		super(material);
		
		this.setHardness(hardness);
		
		this.setRegistryName(name);
		this.setUnlocalizedName(this.getRegistryName().toString());
	}
	
	//Applies textures and models to a given block and it's item form.
	@Override
	public void render() {
		Item item = Item.getItemFromBlock(this);
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
		
	//Registers a block and itemblock pair. This exists for the sake of compactness.
	@Override
	public void register() {
		GameRegistry.register(this);
		GameRegistry.register(this.getItemBlock());
	}
}
