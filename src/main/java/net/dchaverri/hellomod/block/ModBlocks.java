package net.dchaverri.hellomod.block;

import net.dchaverri.hellomod.HelloMod;
import net.dchaverri.hellomod.item.ModItems;
import net.dchaverri.hellomod.tab.ModTabs;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
  public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, HelloMod.MOD_ID);

  public static final RegistryObject<Block> QUESTION_BLOCK = registerBlock("question_block",
          () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(6f).requiresCorrectToolForDrops())
          , ModTabs.HELLO_MOD_TAB);

  public static final RegistryObject<Block> EXCLAMATION_BLOCK = registerBlock("exclamation_block",
          () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.METAL).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3,7))
          , ModTabs.HELLO_MOD_TAB);

  private static  <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> blockSupplier, CreativeModeTab tab) {
    RegistryObject<T> newBlock = BLOCKS.register(name, blockSupplier);
    registerBlockItem(name, newBlock, tab);
    return newBlock;
  }

  private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
    return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
  }
  public static void register(IEventBus eventBus) {
    BLOCKS.register(eventBus);
  }

}
