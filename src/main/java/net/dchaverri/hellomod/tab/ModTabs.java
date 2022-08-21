package net.dchaverri.hellomod.tab;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import static net.dchaverri.hellomod.item.ModItems.KOIN;

public class ModTabs {
  public static final CreativeModeTab HELLO_MOD_TAB = new CreativeModeTab("hellomod_tab") {
    @Override
    public ItemStack makeIcon() {
      return new ItemStack(KOIN.get());
    }
  };
}
