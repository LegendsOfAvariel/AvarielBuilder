package avarielbuilder.templates;

import net.minecraft.item.ItemBlock;

public interface AvarielBlock {
    void register();
    void render();
    ItemBlock getItemBlock();
}
