package sammy.sammys_dump;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sammy.sammys_dump.item.tutorialItems;

public class SammysDump implements ModInitializer {
	public static final String MOD_ID = "sammys-random-emporium";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		tutorialItems.registerModItems();
	}
}