
package org.requiem.mods.dragonmountmod;

import com.wurmonline.server.creatures.CreatureTemplate;
import com.wurmonline.server.creatures.CreatureTemplateFactory;
import com.wurmonline.server.creatures.NoSuchCreatureTemplateException;
import org.gotti.wurmunlimited.modloader.ReflectionUtil;
import org.requiem.mods.dragonmountmod.configurator.Constants;
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
            setCorpseModel(BlackDrake.templateId, "blackdrakehatchling.");
            setCorpseModel(BlueDrake.templateId, "bluedrakehatchling.");
            setCorpseModel(GreenDrake.templateId, "greendrakehatchling.");
            setCorpseModel(RedDrake.templateId, "reddrakehatchling.");
            setCorpseModel(SpectralDrake.templateId, Constants.GhostDrakeModelColor+"drakehatchling.");
            setCorpseModel(WhiteDrake.templateId, "whitedrakehatchling.");
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
