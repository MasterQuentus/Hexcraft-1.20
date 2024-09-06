package net.masterquentus.hexcraftmod.datagen;

import net.masterquentus.hexcraftmod.HexcraftMod;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = HexcraftMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeServer(),
                new HexcraftRecipeProvider(packOutput));

        generator.addProvider(event.includeServer(),
                HexcraftLootTableProvider.create(packOutput));

        generator.addProvider(event.includeClient(),
                new HexcraftBlockStateProvider(packOutput, existingFileHelper));

        generator.addProvider(event.includeClient(),
                new HexcraftItemModelProvider(packOutput, existingFileHelper));

        HexcraftBlockTagGenerator blockTagGenerator = generator.addProvider(event.includeServer(),
                new HexcraftBlockTagGenerator(packOutput, lookupProvider, existingFileHelper));

        generator.addProvider(event.includeServer(),
                new HexcraftItemTagGenerator(packOutput, lookupProvider, blockTagGenerator.contentsGetter(), existingFileHelper));

        generator.addProvider(true,
                new EntityTypeTagProvider(packOutput, lookupProvider, existingFileHelper));

        generator.addProvider(event.includeServer(),
                new HexcraftGlobalLootModifiersProvider(packOutput));

        generator.addProvider(event.includeClient(),
                new HexcraftFluidTagProvider(packOutput, lookupProvider, existingFileHelper));

        generator.addProvider(event.includeServer(),
                new HexcraftWorldGenProvider(packOutput, lookupProvider));

        generator.addProvider(event.includeServer(),
                new HexcraftRegistrySets(packOutput, lookupProvider));
    }
}