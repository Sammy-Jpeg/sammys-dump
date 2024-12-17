package sammy.sammys_dump.block;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.apache.commons.compress.compressors.lz77support.LZ77Compressor;
import sammy.sammys_dump.SammysDump;

public class ModBlocks {

    public static void registerModItems(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(SammysDump.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        SammysDump.LOGGER.info("registering blocks for " +SammysDump.MOD_ID);
    }
}
