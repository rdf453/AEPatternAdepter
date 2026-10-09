/*
 * This file contains modified code from Applied Energistics 2.
 * Original code Copyright (c) 2013-2020 AlgorithmX2 et al.
 * 
 * Licensed under the GNU Lesser General Public License v3.0 (LGPLv3).
 * Modifications by [rdf453]
 */

package dev.rdf453.PatternAdepter.master;

import appeng.api.storage.IPatternAccessTermMenuHost;
import appeng.menu.implementations.MenuTypeBuilder;
import appeng.menu.implementations.PatternAccessTermMenu;
import dev.rdf453.PatternAdepter.AEPatternAdepter;
import dev.rdf453.PatternAdepter.mixin.PatternLogicAccessor;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.MenuType;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class AdepterMenu extends PatternAccessTermMenu {
    public static final MenuType<AdepterMenu> TYPE = MenuTypeBuilder
            .create(AdepterMenu::new, IPatternAccessTermMenuHost.class).build("adeptermenu");

    public AdepterMenu(MenuType<?> menuType, int id, Inventory inv, IPatternAccessTermMenuHost host,
            boolean bindInventory) {
        super(menuType, id, inv, host, true);

    }

    public AdepterMenu(int id, Inventory ip, IPatternAccessTermMenuHost anchor) {
        this(TYPE, id, ip, anchor, true);
    }

    public static final DeferredRegister<MenuType<?>> MENUS = DeferredRegister.create(Registries.MENU,
            AEPatternAdepter.MODID);

    public static final DeferredHolder<MenuType<?>, MenuType<AdepterMenu>> ADEPTER_MENU = MENUS.register(
            "ae_adepter_menu",
            () -> TYPE);
    
}
// https://github.com/AppliedEnergistics/Applied-Energistics-2/blob/main/src/main/java/appeng/menu/implementations/PatternAccessTermMenu.java