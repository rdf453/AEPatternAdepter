package dev.rdf453.PatternAdepter.master;

import net.minecraft.network.chat.Component;
import appeng.client.InitScreens;
import appeng.client.gui.me.patternaccess.PatternAccessTermScreen;
import appeng.client.gui.style.ScreenStyle;
import net.minecraft.world.entity.player.Inventory;
import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;



public class AdepterScreen extends PatternAccessTermScreen<AdepterMenu> {
    
    public AdepterScreen(AdepterMenu menu, Inventory playerInventory, Component title, ScreenStyle style) {
        super(menu,playerInventory,title,style);
    }

    
    public static void registerScreens(RegisterMenuScreensEvent e) {
        InitScreens.register(e, AdepterMenu.ADEPTER_MENU.get(), AdepterScreen::new, "src/main/resources/assets/ae2/screens/terminals/pattern_access_terminal.json");
    }
}
//https://github.com/AppliedEnergistics/Applied-Energistics-2/blob/main/src/client/java/appeng/client/gui/me/patternaccess/PatternAccessTermScreen.java