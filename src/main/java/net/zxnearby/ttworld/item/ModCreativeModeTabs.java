package net.zxnearby.ttworld.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.zxnearby.ttworld.TTWORLD;
import net.zxnearby.ttworld.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TTWORLD.MOD_ID);

    public static final RegistryObject<CreativeModeTab> Titti_Tab = CREATIVE_MODE_TABS.register("ttworld_tab", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SCIORDA.get()))
            .title(Component.translatable("creativetab.ttworld_tab"))
            .displayItems((itemDisplayParameters, output) -> {
                output.accept(ModItems.SCIORDA.get());
                output.accept(ModBlocks.blocco_sciorda.get());
            } )
            .build());

    public static void register(IEventBus eventbus){
        CREATIVE_MODE_TABS.register(eventbus);
    }
}
