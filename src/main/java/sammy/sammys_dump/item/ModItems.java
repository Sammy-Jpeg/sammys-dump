package sammy.sammys_dump.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import sammy.sammys_dump.SammysDump;

public class ModItems {

    public static final Item Gold_Coin = registeritems("gold_coin", new Item(new Item.Settings()));
    public static final Item Silver_Coin = registeritems("silver_coin", new Item(new Item.Settings()));
    public static final Item Copper_Coin = registeritems("copper_coin", new Item(new Item.Settings()));

    private static Item registeritems(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(SammysDump.MOD_ID, name), item);
    }

    public static void registerModItems() {
        SammysDump.LOGGER.info("Registering items for " +SammysDump.MOD_ID);

        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            //entries.add(Gold_Coin);
           // entries.add(Silver_Coin);
           // entries.add();
       // });
    }
}
