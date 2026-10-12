package dev.rdf453.PatternAdepter.registry;

import dev.rdf453.PatternAdepter.AEPatternAdepter;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredRegister;

public class Register {

        public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister
                        .create(Registries.BLOCK_ENTITY_TYPE, AEPatternAdepter.MODID);

        public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(AEPatternAdepter.MODID);
        public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AEPatternAdepter.MODID);
        public static final DeferredRegister<MenuType<?>> MENUS = DeferredRegister.create(Registries.MENU,
                        AEPatternAdepter.MODID);
}
