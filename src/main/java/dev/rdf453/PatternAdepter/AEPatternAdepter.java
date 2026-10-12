package dev.rdf453.PatternAdepter;

import dev.rdf453.PatternAdepter.master.AdepterScreen;
import dev.rdf453.PatternAdepter.registry.Register;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;

@EventBusSubscriber (modid = AEPatternAdepter.MODID)
@Mod(AEPatternAdepter.MODID)
public class AEPatternAdepter {
    public static final String MODID = "ae2pa";


    

    public AEPatternAdepter(IEventBus bus) {
        Register.BLOCKS.register(bus);
        Register.BLOCK_ENTITIES.register(bus);
        Register.ITEMS.register(bus);
        Register.MENUS.register(bus);

        bus.addListener(AdepterScreen::registerScreens);
    }

    //나중에 블럭 텍스처 작업 및 적용 필요
}
