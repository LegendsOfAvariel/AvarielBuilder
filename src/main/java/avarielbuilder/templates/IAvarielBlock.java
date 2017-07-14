package avarielbuilder.templates;

import net.minecraft.item.ItemBlock;

public interface IAvarielBlock {
    void register();
    void render();
    ItemBlock getItemBlock();
}
