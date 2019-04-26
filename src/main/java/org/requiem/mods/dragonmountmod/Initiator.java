
package org.requiem.mods.dragonmountmod;

import org.gotti.wurmunlimited.modloader.interfaces.Configurable;
import org.gotti.wurmunlimited.modloader.interfaces.PreInitable;
import org.gotti.wurmunlimited.modloader.interfaces.ServerStartedListener;
import org.gotti.wurmunlimited.modloader.interfaces.WurmServerMod;
import org.gotti.wurmunlimited.modsupport.creatures.ModCreatures;
import org.requiem.mods.dragonmountmod.configurator.Config;
import org.requiem.mods.dragonmountmod.creatures.drakes.*;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.gotti.wurmunlimited.modsupport.creatures.ModCreatures.addCreature;
import static org.requiem.mods.dragonmountmod.configurator.Constants.*;

public class Initiator implements PreInitable, WurmServerMod, Configurable, ServerStartedListener {
    private static Logger logger = Logger.getLogger(Initiator.class.getName());

    public static void logInfo(String msg) {
        if (logger != null) {
            logger.log(Level.INFO, msg);
        }
    }

    private static void debug(String msg) {
        if (DEBUG) {
            logger.info(msg);
        }
    }

    @Override
    public void preInit() {
        ModCreatures.init();
        addCreature(new BlackDrake());
        addCreature(new BlueDrake());
        addCreature(new GreenDrake());
        addCreature(new RedDrake());
        addCreature(new WhiteDrake());
        addCreature(new SpectralDrake());
        //addCreature(new BlackBasilisk());
        //addCreature(new BlueBasilisk());
        //addCreature(new GreenBasilisk());
        //addCreature(new RedBasilisk());
        //addCreature(new WhiteBasilisk());
        //addCreature(new SpectralBasilisk());
    }

    @Override
    public void onServerStarted() {
        try {
            logger.info("Setting drake and basilisk corpse models...");
            CorpseModifier.setTemplateVariables();
        } catch (Throwable throwable) {
            logger.log(Level.SEVERE, "Error In onServerStarted", throwable);
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

    public static void creatureLogging() {
        debug("Black_Drake_Vehicle_Max_Height_Diff = " + BlackDrakeSetMaxHeightDiff);
        debug("Black_Drake_Max_Pop = " + BlackDrakeMaxPop);
        debug("Black_Drake_Max_Age = " + BlackDrakeMaxAge);
        debug("Black_Drake_Vehicle_Max_Speed = " + BlackDrakeVehicleSpeed);
        debug("Black_Drake_Vehicle_Skill_Required = " + BlackDrakeVehicleSkill);
        debug("Black_Drake_Vehicle_Max_Depth = " + BlackDrakeVehicleDepth);
        debug("Black_Drake_Vehicle_Zaxis_Offset = " + BlackDrakeZaxisOffset);
        debug("Black_Drake_Enabled = " + BlackDrakeEnabled);

        debug("Blue_Drake_Vehicle_Max_Height_Diff = " + BlueDrakeSetMaxHeightDiff);
        debug("Blue_Drake_Max_Pop = " + BlueDrakeMaxPop);
        debug("Blue_Drake_Max_Age = " + BlueDrakeMaxAge);
        debug("Blue_Drake_Vehicle_Max_Speed = " + BlueDrakeVehicleSpeed);
        debug("Blue_Drake_Vehicle_Skill_Required = " + BlueDrakeVehicleSkill);
        debug("Blue_Drake_Vehicle_Max_Depth = " + BlueDrakeVehicleDepth);
        debug("Blue_Drake_Vehicle_Zaxis_Offset = " + BlueDrakeZaxisOffset);
        debug("Blue_Drake_Enabled = " + BlueDrakeEnabled);

        debug("Spectral_Drake_Vehicle_Max_Height_Diff = " + GhostDrakeSetMaxHeightDiff);
        debug("Spectral_Drake_Max_Pop = " + GhostDrakeMaxPop);
        debug("Spectral_Drake_Max_Age = " + GhostDrakeMaxAge);
        debug("Spectral_Drake_Vehicle_Max_Speed = " + GhostDrakeVehicleSpeed);
        debug("Spectral_Drake_Vehicle_Skill_Required = " + GhostDrakeVehicleSkill);
        debug("Spectral_Drake_Vehicle_Max_Depth = " + GhostDrakeVehicleDepth);
        debug("Spectral_Drake_Vehicle_Zaxis_Offset = " + GhostDrakeZaxisOffset);
        debug("Spectral_Drake_Enabled = " + GhostDrakeEnabled);

        debug("Green_Drake_Vehicle_Max_Height_Diff = " + GreenDrakeSetMaxHeightDiff);
        debug("Green_Drake_Max_Pop = " + GreenDrakeMaxPop);
        debug("Green_Drake_Max_Age = " + GreenDrakeMaxAge);
        debug("Green_Drake_Vehicle_Max_Speed = " + GreenDrakeVehicleSpeed);
        debug("Green_Drake_Vehicle_Skill_Required = " + GreenDrakeVehicleSkill);
        debug("Green_Drake_Vehicle_Max_Depth = " + GreenDrakeVehicleDepth);
        debug("Green_Drake_Vehicle_Zaxis_Offset = " + GreenDrakeZaxisOffset);
        debug("Green_Drake_Enabled = " + GreenDrakeEnabled);

        debug("Red_Drake_Vehicle_Max_Height_Diff = " + RedDrakeSetMaxHeightDiff);
        debug("Red_Drake_Max_Pop = " + RedDrakeMaxPop);
        debug("Red_Drake_Max_Age = " + RedDrakeMaxAge);
        debug("Red_Drake_Vehicle_Max_Speed = " + RedDrakeVehicleSpeed);
        debug("Red_Drake_Vehicle_Skill_Required = " + RedDrakeVehicleSkill);
        debug("Red_Drake_Vehicle_Max_Depth = " + RedDrakeVehicleDepth);
        debug("Red_Drake_Vehicle_Zaxis_Offset = " + RedDrakeZaxisOffset);
        debug("Red_Drake_Enabled = " + RedDrakeEnabled);

        debug("White_Drake_Vehicle_Max_Height_Diff = " + WhiteDrakeSetMaxHeightDiff);
        debug("White_Drake_Max_Pop = " + WhiteDrakeMaxPop);
        debug("White_Drake_Max_Age = " + WhiteDrakeMaxAge);
        debug("White_Drake_Vehicle_Max_Speed = " + WhiteDrakeVehicleSpeed);
        debug("White_Drake_Vehicle_Skill_Required = " + WhiteDrakeVehicleSkill);
        debug("White_Drake_Vehicle_Max_Depth = " + WhiteDrakeVehicleDepth);
        debug("White_Drake_Vehicle_Zaxis_Offset = " + WhiteDrakeZaxisOffset);
        debug("White_Drake_Enabled = " + WhiteDrakeEnabled);
    }

    public String getVersion() {
        return "v1.4";
    }

}
