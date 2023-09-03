package de.tsgscraft.tutorialmod.item;

import de.tsgscraft.tutorialmod.TutorialMod;
import de.tsgscraft.tutorialmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tutorial_tab", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RUBY.get())).title(Component.translatable("creativetab.tutorial_tab")).displayItems((pParameters, pOutput) -> {
        pOutput.accept(ModItems.RUBY.get());
        pOutput.accept(ModItems.RAW_RUBY.get());

        pOutput.accept(ModBlocks.RUBY_BLOCK.get());
        pOutput.accept(ModBlocks.RAW_RUBY_BLOCK.get());
    }).build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
