package avarielbuilder.templates;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public abstract class AvarielAbstractItem extends Item {
	
	public AvarielAbstractItem(String name) {
		this.setRegistryName(name);
		this.setUnlocalizedName(this.getRegistryName().toString());
	}
	
	//Render the item
	public void render() {
		ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(this.getRegistryName(), "inventory"));
	}
	
}
