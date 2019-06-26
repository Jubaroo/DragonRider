package org.requiem.mods.dragonmountmod.creatures.basilisks;

import com.wurmonline.mesh.Tiles;
import com.wurmonline.server.MiscConstants;
import com.wurmonline.server.behaviours.Vehicle;
import com.wurmonline.server.bodys.BodyTemplate;
import com.wurmonline.server.creatures.Creature;
import com.wurmonline.server.items.Item;
import com.wurmonline.server.skills.SkillList;
import com.wurmonline.shared.constants.CreatureTypes;
import com.wurmonline.shared.constants.ItemMaterials;
import com.wurmonline.shared.constants.ProtoConstants;
import org.gotti.wurmunlimited.modsupport.CreatureTemplateBuilder;
import org.gotti.wurmunlimited.modsupport.creatures.EncounterBuilder;
import org.gotti.wurmunlimited.modsupport.creatures.ModCreature;
import org.gotti.wurmunlimited.modsupport.vehicles.ModVehicleBehaviour;
import org.gotti.wurmunlimited.modsupport.vehicles.VehicleFacade;
import org.requiem.mods.dragonmountmod.Constants;

public class SpectralBasilisk implements ModCreature, CreatureTypes {
    public static int templateId;
    /**
     * Create the ghost basilisk with settings below
     */
    @Override
    public CreatureTemplateBuilder createCreateTemplateBuilder() {
        final int[] types = (Constants.GhostBasiliskCreatureTypes);//0, 4, 9, 12, 14, 27, 30, 32, 41, 43, 62 int
        final CreatureTemplateBuilder builder = new CreatureTemplateBuilder(
                "mod.creature.basilisk.spectral", "Spectral Basilisk", Constants.GhostBasiliskDesc/*This docile ghost basilisk looks happy as it sits ready to ride.*/,
                "model.creature.dragon." + Constants.GhostBasiliskModelColor,
                types, BodyTemplate.TYPE_DRAGON,
                (short) Constants.GhostBasiliskVision,
                MiscConstants.SEX_MALE,
                (short) 280, (short)210, (short)666,
                "sound.death.dragon", "sound.death.dragon", "sound.combat.hit.dragon", "sound.combat.hit.dragon",
                Constants.GhostBasiliskNaturalArmour/* 1.0F */,
                Constants.GhostBasiliskHandDamage/* 20.0F */, Constants.GhostBasiliskKickDamage/* 26.0F */, Constants.GhostBasiliskBiteDamage/* 56.0F */, Constants.GhostBasiliskHeadDamage/* 58.0F */, Constants.GhostBasiliskBreathDamage/* 0.0F */,
                Constants.GhostBasiliskMoveSpeed/* 4.0F */,
                Constants.GhostBasiliskMoveRate/* 10 */,
                Constants.GhostBasiliskItemsButchered,
                Constants.GhostBasiliskMaxHuntRange/* 5 */,
                Constants.GhostBasiliskAggression/* 0 */,
                ItemMaterials.MATERIAL_MEAT_DRAGON
        );
        templateId = builder.getTemplateId();

        builder.skill(SkillList.BODY_STRENGTH, Constants.GhostBasiliskBodyStrength);//BODY_STRENGTH 50.0F
        builder.skill(SkillList.BODY_CONTROL, Constants.GhostBasiliskBodyControl);//BODY_CONTROL 75.0F
        builder.skill(SkillList.BODY_STAMINA, Constants.GhostBasiliskBodyStamina);//BODY_STAMINA 70.0F
        builder.skill(SkillList.MIND_LOGICAL, Constants.GhostBasiliskMindLogic);//MIND_LOGICAL 27.0F
        builder.skill(SkillList.MIND_SPEED, Constants.GhostBasiliskMindSpeed);//MIND_SPEED 37.0F
        builder.skill(SkillList.SOUL_STRENGTH, Constants.GhostBasiliskSoulStrength); //SOUL_STRENGTH 55.0F
        builder.skill(SkillList.SOUL_DEPTH, Constants.GhostBasiliskSoulDepth); //SOUL_DEPTH 29.0F
        builder.skill(SkillList.WEAPONLESS_FIGHTING, Constants.GhostBasiliskWeaponlessFighting);//WEAPONLESS_FIGHTING 85.0F
        builder.skill(SkillList.GROUP_FIGHTING, Constants.GhostBasiliskGroupFighting);//FIGHTING 80.0F

        builder.baseCombatRating(Constants.GhostBasiliskBaseCombatRating);//70.0F
        builder.combatDamageType((byte) Constants.GhostBasiliskCombatDamageType); //2 int
        builder.alignment(Constants.GhostBasiliskAlignment);//100.0f
        builder.sizeModifier(Constants.GhostBasiliskSizeX, Constants.GhostBasiliskSizeY, Constants.GhostBasiliskSizeZ);
        if (Constants.BasiliskEggLayer) { builder.eggLayer(templateId); }
        builder.kickDamString(Constants.GhostBasiliskKickDamString);//wingbuff
        builder.headbuttDamString(Constants.GhostBasiliskHeadbuttDamString);//tailwhip
        builder.armourType(Constants.GhostBasiliskArmourType);//9 int
        builder.setCombatMoves(Constants.GhostBasiliskCombatMoves);//1, 2, 6
        builder.maxPopulationOfCreatures(Constants.GhostBasiliskMaxPop);
        builder.maxAge(Constants.GhostBasiliskMaxAge);

        return builder;
    }

    @Override
    public ModVehicleBehaviour getVehicleBehaviour() {
        return new ModVehicleBehaviour() {

            @Override
            public void setSettingsForVehicle(final Item item, final Vehicle vehicle) {
            }

            /**
             * Settings for the creature. Skill needed, max Depth in the water, HeightDiff for going up hills while riding or hitched, max speed of animal
             */
            @Override
            public void setSettingsForVehicle(final Creature creature, final Vehicle v) {
                final VehicleFacade vehicle = this.wrap(v);
                vehicle.createPassengerSeats(0);
                vehicle.setSeatFightMod(0, 0.6F, 1.3F);
                vehicle.setSeatOffset(0, 0.0F, 0.0F, Constants.GhostBasiliskZAxisOffset);//-0.01F
                vehicle.setCreature(true);
                vehicle.setSkillNeeded(Constants.GhostBasiliskVehicleSkill);//35.0F
                vehicle.setName(creature.getName());
                vehicle.setMaxDepth(Constants.GhostBasiliskVehicleDepth);//-0.7F
                vehicle.setMaxHeightDiff(Constants.GhostBasiliskSetMaxHeightDiff);
                vehicle.setMaxSpeed(Constants.GhostBasiliskVehicleSpeed);//80.0F
                vehicle.setCommandType(ProtoConstants.TELE_START_COMMAND_CREATURE);
                vehicle.setCanHaveEquipment(false);
            }
        };
    }

    /**
     * Add/configure tile that the creature will spawn on in the world
     */
    @Override
    public void addEncounters() {
        if (templateId == 0) {
            return;
        }
        if (Constants.GhostBasiliskEnabled) {

            if (Constants.GhostBasiliskSpawnTree) {
                new EncounterBuilder(Tiles.Tile.TILE_TREE.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (Constants.GhostBasiliskSpawnSteppe) {
                new EncounterBuilder(Tiles.Tile.TILE_STEPPE.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (Constants.GhostBasiliskSpawnGrass) {
                new EncounterBuilder(Tiles.Tile.TILE_GRASS.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (Constants.GhostBasiliskSpawnTundra) {
                new EncounterBuilder(Tiles.Tile.TILE_TUNDRA.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (Constants.GhostBasiliskSpawnDirt) {
                new EncounterBuilder(Tiles.Tile.TILE_DIRT.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (Constants.GhostBasiliskSpawnSand) {
                new EncounterBuilder(Tiles.Tile.TILE_SAND.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (Constants.GhostBasiliskSpawnSnow) {
                new EncounterBuilder(Tiles.Tile.TILE_SNOW.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (Constants.GhostBasiliskSpawnMarsh) {
                new EncounterBuilder(Tiles.Tile.TILE_MARSH.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (Constants.GhostBasiliskSpawnCave) {
                new EncounterBuilder(Tiles.Tile.TILE_CAVE.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (Constants.GhostBasiliskSpawnPeat) {
                new EncounterBuilder(Tiles.Tile.TILE_PEAT.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
        }
    }
}