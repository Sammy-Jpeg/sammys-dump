package sammy.sammys_dump.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import sammy.sammys_dump.SammysDump;

public class ModItemGroups {
    public static final ItemGroup Coin_Stuffs = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(SammysDump.MOD_ID, "coin_stuffs"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.Silver_Coin))
                    .displayName(Text.translatable("itemgroup.sammys-random-emporium.coin_stuffs"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.Silver_Coin);
                        entries.add(ModItems.Gold_Coin);
                        entries.add(ModItems.Copper_Coin);

                    }).build());


    public static void registerItemGroups() {
        SammysDump.LOGGER.info("Registering items groups for " +SammysDump.MOD_ID);
    }

}
