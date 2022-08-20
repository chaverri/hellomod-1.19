package net.dchaverri.hellomod.item;

import net.dchaverri.hellomod.HelloMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
  public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, HelloMod.MOD_ID);

  public static final CreativeModeTab HELLO_MOD_TAB = new CreativeModeTab("currencytab") {
    @Override
    public ItemStack makeIcon() {
      return new ItemStack(KOIN.get());
    }
  };

  public static final RegistryObject<Item> RUPEE = ITEMS.register("rupee",
          () -> new Item(new Item.Properties().tab(HELLO_MOD_TAB)));

  public static final RegistryObject<Item> KOIN = ITEMS.register("koin",
          () -> new Item(new Item.Properties().tab(HELLO_MOD_TAB)));

  public static void register(IEventBus eventBus) {
    ITEMS.register(eventBus);
  }

}
