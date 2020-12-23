package org.maxgamer.quickshop.Util;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class ItemData {

    private final Material material;
    private final short data;

    public ItemData(Material material) {
        this.material = material;
        data = 0;
    }

    public ItemData(Material material, short data) {
        this.material = material;
        this.data = data;
    }

    public ItemData(ItemStack item) {
        this(item.getType(), item.getDurability());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ItemData itemData = (ItemData) o;

        if (data != itemData.data) return false;
        return material == itemData.material;
    }

    @Override
    public int hashCode() {
        int result = material != null ? material.hashCode() : 0;
        result = 31 * result + (int) data;
        return result;
    }

}
