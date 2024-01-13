
package net.mcreator.bitmining.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.bitmining.item.ItemBitcoin;
import net.mcreator.bitmining.ElementsBitMining;

@ElementsBitMining.ModElement.Tag
public class TabBitMining extends ElementsBitMining.ModElement {
	public TabBitMining(ElementsBitMining instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabbitmining") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemBitcoin.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
