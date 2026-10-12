package dev.rdf453.PatternAdepter.master;

import dev.rdf453.PatternAdepter.registry.Register;
import appeng.block.AEBaseEntityBlock;
import net.minecraft.world.item.BlockItem;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;

public class ProviderAdepterBlock extends AEBaseEntityBlock<ProviderAdepterBlockEntity>{
    
    public ProviderAdepterBlock(Properties props) {
        super(props);
    }

    

    public static final DeferredBlock<ProviderAdepterBlock> BLOCK_HOLDER = Register.BLOCKS.registerBlock(
        "pattern_provider_adepter",
        ProviderAdepterBlock::new,
        properties -> properties.destroyTime(2.5f));

    public static final DeferredItem<BlockItem> BLOCK_ITEM = Register.ITEMS.registerSimpleBlockItem("pattern_provider_adepter",BLOCK_HOLDER);

}
//https://github.com/AppliedEnergistics/Applied-Energistics-2/blob/main/src/main/java/appeng/block/AEBaseEntityBlock.java