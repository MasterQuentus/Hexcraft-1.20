package net.masterquentus.hexcraftmod.platform.services;

import com.mojang.serialization.Codec;
import net.minecraft.core.Registry;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.SimpleJsonResourceReloadListener;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.item.*;
import net.minecraft.world.item.CreativeModeTab.DisplayItemsGenerator;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import org.apache.commons.lang3.function.TriFunction;

import java.util.function.Supplier;

public interface ICommonRegistryHelper {

    /**
     * Register an object into either A.) A vanilla registry (fabric) or B.) A deferred registry (forge).
     *
     * @param registry The registry to be used for this object.
     * @param name The name of the object. This will automatically use Enchanted's namespace.
     * @param entry A supplier providing a *new* instance of the object.
     *
     * @return A {@link Supplier} providing the registered object.
     */
    <T> Supplier<T> register(Registry<? super T> registry, String name, Supplier<T> entry);

    /**
     * Create a {@link MenuType} and register it via {@link ICommonRegistryHelper#register(Registry, String, Supplier)}.
     * This is necessary because Forge and Fabric implement their extra data differently when opening a Menu.
     *
     * @param create TriFunction used to create the menu, on Fabric this matches ExtendedScreenHandlerType, on Forge it
     *               matches IForgeMenuType.
     *
     * @return A {@link Supplier} for a {@link MenuType} implementation, depending on the platform.
     */
    <T extends AbstractContainerMenu> Supplier<MenuType<T>> registerMenu(String name, TriFunction<Integer, Inventory, FriendlyByteBuf, T> create);

    /**
     * Register a {@link SimpleJsonResourceReloadListener}, necessary because Fabric requires ReloadListeners to provide
     * an ID (god knows why).
     *
     * <p>Implementations of {@link SimpleJsonResourceReloadListener} should not store data, they should only be used
     * to load data to be used in common.</p>
     *
     * @param id {@link ResourceLocation} ID of the loader, only used by Fabric.
     * @param loader An instance of the ReloadListener.
     */
    void register(ResourceLocation id, SimpleJsonResourceReloadListener loader);

    /**
     * Create a new {@link SoundType}, this is necessary because Forge's deferred registers cause crashes when the
     * {@link SoundType} tries to load it's {@link SoundEvent}s.
     *
     * @param volume volume of the new {@link SoundType}.
     * @param pitch pitch of the new {@link SoundType}
     * @param breakSound {@link SoundEvent} used for break sound.
     * @param stepSound {@link SoundEvent} used for step sound.
     * @param placeSound {@link SoundEvent} used for place sound.
     * @param hitSound {@link SoundEvent} used for hit sound.
     * @param fallSound {@link SoundEvent} used for fall sound.
     *
     * @return A new instance of {@link SoundType} with the provided properties.
     */
    SoundType getSoundType(float volume, float pitch, Supplier<SoundEvent> breakSound, Supplier<SoundEvent> stepSound,
                           Supplier<SoundEvent> placeSound, Supplier<SoundEvent> hitSound, Supplier<SoundEvent> fallSound);

    /**
     * Creates a new {@link CreativeModeTab} and registers it. On Forge, this calls the coremodded constructor. On
     * Fabric, this uses the API's tab builder.
     *
     * @param name The name of the tab.
     * @param iconSupplier A {@link Supplier} returning the icon of the tab.
     * @param itemsGenerator A {@link DisplayItemsGenerator} used to add items to the tab.
     *
     * @return A new {@link CreativeModeTab} with the specified icon and generator.
     */
    Supplier<CreativeModeTab> registerCreativeTab(String name, Supplier<ItemStack> iconSupplier, DisplayItemsGenerator itemsGenerator);

    /**
     * Register a block as flammable (i.e. can catch on fire).
     *
     * @param block The {@link Block} to make flammable.
     * @param igniteOdds
     * @param burnOdds
     */
    void setFlammable(Block block, int igniteOdds, int burnOdds);


}