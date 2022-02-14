package net.onryo.additions.item.custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class PickleItem extends Item {
    public PickleItem(Settings settings) {
        super(settings);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}
