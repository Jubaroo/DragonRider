package org.requiem.mods.dragonmountmod;

import org.gotti.wurmunlimited.modloader.interfaces.Configurable;
import org.gotti.wurmunlimited.modloader.interfaces.PreInitable;
import org.gotti.wurmunlimited.modloader.interfaces.ServerStartedListener;
import org.gotti.wurmunlimited.modloader.interfaces.WurmServerMod;
import org.gotti.wurmunlimited.modsupport.creatures.ModCreatures;
import org.requiem.mods.dragonmountmod.creatures.basilisks.*;
import org.requiem.mods.dragonmountmod.creatures.drakes.*;
import org.requiem.mods.dragonmountmod.utilities.Config;
import org.requiem.mods.dragonmountmod.utilities.CorpseModifier;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Initiator implements PreInitable, WurmServerMod, Configurable, ServerStartedListener {
    private static Logger logger = Logger.getLogger(Initiator.class.getName() + Constants.VERSION);

    public static void logException(String msg, Throwable e) {
        if (logger != null)
            logger.log(Level.SEVERE, msg, e);
    }

    public static void logWarning(String msg) {
        if (logger != null)
            logger.log(Level.WARNING, msg);
    }

    public static void logInfo(String msg) {
        if (logger != null)
            logger.log(Level.INFO, msg);
    }

    @Override
    public void preInit() {
        ModCreatures.init();
        ModCreatures.addCreature(new BlackDrake());
        ModCreatures.addCreature(new BlueDrake());
        ModCreatures.addCreature(new GreenDrake());
        ModCreatures.addCreature(new RedDrake());
        ModCreatures.addCreature(new WhiteDrake());
        ModCreatures.addCreature(new SpectralDrake());
        ModCreatures.addCreature(new BlackBasilisk());
        ModCreatures.addCreature(new BlueBasilisk());
        ModCreatures.addCreature(new GreenBasilisk());
        ModCreatures.addCreature(new RedBasilisk());
        ModCreatures.addCreature(new WhiteBasilisk());
        ModCreatures.addCreature(new SpectralBasilisk());
    }

    @Override
    public void onServerStarted() {
        try {
            logInfo("Setting drake and basilisk corpse models...");
            CorpseModifier.setTemplateVariables();
        } catch (Throwable throwable) {
            logException("Error In onServerStarted", throwable);
        }
    }

    public static int[] getPropertyArray(String str) {
        String[] arr = str.split(",");
        int[] ret = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ret[i] = Integer.valueOf(arr[i].trim());
        }
        return ret;
    }

    @Override
    public void configure(final Properties properties) {
        Config.doConfig(properties);
    }

    public String getVersion() {
        return Constants.VERSION;
    }

    //TODO
    // Make huge eggs for each drake/basilisk
    // Make eggs appear on vendors
    // make config options for new eggs to toggle being on traders or only GM spawn
    // Add more logging for settings
}
