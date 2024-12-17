package sammy.sammys_dump;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import sammy.sammys_dump.datagen.ModBlockTagProvider;
import sammy.sammys_dump.datagen.ModItemTagProvider;
import sammy.sammys_dump.datagen.ModModelProvider;
import sammy.sammys_dump.datagen.ModRecipeProvider;

public class SammysDumpDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
			FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

			pack.addProvider(ModBlockTagProvider::new);
			pack.addProvider(ModItemTagProvider::new);
			pack.addProvider(ModBlockTagProvider::new);
			pack.addProvider(ModModelProvider::new);
			pack.addProvider(ModRecipeProvider::new);
	}
}
