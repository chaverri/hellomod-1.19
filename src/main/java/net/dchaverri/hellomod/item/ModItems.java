package net.dchaverri.hellomod.item;

import net.dchaverri.hellomod.HelloMod;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.dchaverri.hellomod.tab.ModTabs.HELLO_MOD_TAB;

public class ModItems {
  public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, HelloMod.MOD_ID);


  public static final RegistryObject<Item> RUPEE = ITEMS.register("rupee",
          () -> new Item(new Item.Properties().tab(HELLO_MOD_TAB)));

  public static final RegistryObject<Item> KOIN = ITEMS.register("koin",
          () -> new Item(new Item.Properties().tab(HELLO_MOD_TAB)));

  public static final RegistryObject<Item> NOT_ALONE_SWORD = ITEMS.register("notalonesword",
          () -> new SwordItem(Tiers.DIAMOND,10, 5f, new Item.Properties().tab(HELLO_MOD_TAB)));

  public static void register(IEventBus eventBus) {
    ITEMS.register(eventBus);
  }

}
