package org.requiem.mods.dragonmountmod.utilities;

import com.wurmonline.server.creatures.CreatureTemplate;
import com.wurmonline.server.creatures.CreatureTemplateFactory;
import com.wurmonline.server.creatures.NoSuchCreatureTemplateException;
import org.gotti.wurmunlimited.modloader.ReflectionUtil;
import org.requiem.mods.dragonmountmod.Constants;
import org.requiem.mods.dragonmountmod.creatures.basilisks.*;
import org.requiem.mods.dragonmountmod.creatures.drakes.*;

public class CorpseModifier {

    private static void setCorpseModel(int templateId, String model){
        try{
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(templateId);
            if(template != null){
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "corpsename"), model);
            }
        } catch (NoSuchCreatureTemplateException | IllegalArgumentException | IllegalAccessException | ClassCastException | NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    public static void setTemplateVariables() {
        try {
            // Set corpse models
            setCorpseModel(BlackDrake.templateId, "blackdragonhatchling.");
            setCorpseModel(BlueDrake.templateId, "bluedragonhatchling.");
            setCorpseModel(GreenDrake.templateId, "greendragonhatchling.");
            setCorpseModel(RedDrake.templateId, "reddragonhatchling.");
            setCorpseModel(SpectralDrake.templateId, Constants.GhostDrakeModelColor+"dragonhatchling.");
            setCorpseModel(WhiteDrake.templateId, "whitedragonhatchling.");
            setCorpseModel(BlackBasilisk.templateId, "blackdragon.");
            setCorpseModel(BlueBasilisk.templateId, "bluedragon.");
            setCorpseModel(GreenBasilisk.templateId, "greendragon.");
            setCorpseModel(RedBasilisk.templateId, "reddragon.");
            setCorpseModel(SpectralBasilisk.templateId, Constants.GhostBasiliskModelColor+"dragon.");
            setCorpseModel(WhiteBasilisk.templateId, "whitedragon.");
        } catch ( IllegalArgumentException | ClassCastException e) {
            e.printStackTrace();
        }
    }

}