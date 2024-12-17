package sammy.sammys_dump;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sammy.sammys_dump.block.ModBlocks;
import sammy.sammys_dump.item.ModItemGroups;
import sammy.sammys_dump.item.ModItems;

public class SammysDump implements ModInitializer {
	public static final String MOD_ID = "sammys-random-emporium";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");

		ModItemGroups.registerItemGroups();

		ModBlocks.registerModBlocks();
		ModItems.registerModItems();
	}
}