package org.requiem.mods.dragonmountmod.creatures.drakes;

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

public class RedDrake implements ModCreature, CreatureTypes {
    public static int templateId;

    /**
     * Create the red drake with settings below
     */
    @Override
    public CreatureTemplateBuilder createCreateTemplateBuilder() {
        final int[] types = (Constants.RedDrakeCreatureTypes);//0, 4, 9, 12, 14, 27, 30, 32, 41, 43, 62 int
        final CreatureTemplateBuilder builder = new CreatureTemplateBuilder(
                "mod.creature.RedDrake",
                "Red Drake",
                Constants.RedDrakeDesc/*This docile red drake looks happy as it sits ready to ride.*/,
                "model.creature.drake.red",
                types, BodyTemplate.TYPE_DRAGON,
                (short) Constants.RedDrakeVision/* 3 */,
                MiscConstants.SEX_MALE,
                (short) 180, (short) 50, (short) 250,
                "sound.death.dragon", "sound.death.dragon", "sound.combat.hit.dragon", "sound.combat.hit.dragon",
                Constants.RedDrakeNaturalArmour/* 1.0F */,
                Constants.RedDrakeHandDamage/* 20.0F */, Constants.RedDrakeKickDamage/* 26.0F */, Constants.RedDrakeBiteDamage/* 56.0F */, Constants.RedDrakeHeadDamage/* 58.0F */, Constants.RedDrakeBreathDamage/* 0.0F */,
                Constants.RedDrakeMoveSpeed/* 4.0F */,
                Constants.RedDrakeMoveRate/* 10 */,
                Constants.RedDrakeItemsButchered,
                Constants.RedDrakeMaxHuntRange/* 5 */,
                Constants.RedDrakeAggression/* 0 */,
                ItemMaterials.MATERIAL_MEAT_DRAGON
        );
        templateId = builder.getTemplateId();

        builder.skill(SkillList.BODY_STRENGTH, Constants.RedBasiliskBodyStrength);//BODY_STRENGTH 50.0F
        builder.skill(SkillList.BODY_CONTROL, Constants.RedBasiliskBodyControl);//BODY_CONTROL 75.0F
        builder.skill(SkillList.BODY_STAMINA, Constants.RedBasiliskBodyStamina);//BODY_STAMINA 70.0F
        builder.skill(SkillList.MIND_LOGICAL, Constants.RedBasiliskMindLogic);//MIND_LOGICAL 27.0F
        builder.skill(SkillList.MIND_SPEED, Constants.RedBasiliskMindSpeed);//MIND_SPEED 37.0F
        builder.skill(SkillList.SOUL_STRENGTH, Constants.RedBasiliskSoulStrength); //SOUL_STRENGTH 55.0F
        builder.skill(SkillList.SOUL_DEPTH, Constants.RedBasiliskSoulDepth); //SOUL_DEPTH 29.0F
        builder.skill(SkillList.WEAPONLESS_FIGHTING, Constants.RedBasiliskWeaponlessFighting);//WEAPONLESS_FIGHTING 85.0F
        builder.skill(SkillList.GROUP_FIGHTING, Constants.RedBasiliskGroupFighting);//FIGHTING 80.0F

        builder.baseCombatRating(Constants.RedDrakeBaseCombatRating);//70.0F
        builder.combatDamageType((byte) Constants.RedDrakeCombatDamageType); //2 int
        builder.alignment(Constants.RedDrakeAlignment);//100.0f
        builder.sizeModifier(Constants.RedDrakeSizeX, Constants.RedDrakeSizeY, Constants.RedDrakeSizeZ);
        if (Constants.DrakeEggLayer) { builder.eggLayer(templateId); }
        builder.maxAge(Constants.RedDrakeMaxAge);
        builder.kickDamString(Constants.RedDrakeKickDamString);//wingbuff
        builder.headbuttDamString(Constants.RedDrakeHeadbuttDamString);//tailwhip
        builder.armourType(Constants.RedDrakeArmourType);//9 int
        builder.setCombatMoves(Constants.RedDrakeCombatMoves);//1, 2, 6
        builder.maxPopulationOfCreatures(Constants.RedDrakeMaxPop);

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
                vehicle.setSeatOffset(0, 0.0F, 0.0F, Constants.RedDrakeZAxisOffset);//-0.01F
                vehicle.setCreature(true);
                vehicle.setSkillNeeded(Constants.RedDrakeVehicleSkill);//35.0F
                vehicle.setName(creature.getName());
                vehicle.setMaxDepth(Constants.RedDrakeVehicleDepth);//-0.7F
                vehicle.setMaxHeightDiff(Constants.RedDrakeSetMaxHeightDiff);
                vehicle.setMaxSpeed(Constants.RedDrakeVehicleSpeed);//80.0F
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
        if (Constants.RedDrakeEnabled) {

            if (Constants.RedDrakeSpawnTree) {
                new EncounterBuilder(Tiles.Tile.TILE_TREE.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (Constants.RedDrakeSpawnSteppe) {
                new EncounterBuilder(Tiles.Tile.TILE_STEPPE.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (Constants.RedDrakeSpawnGrass) {
                new EncounterBuilder(Tiles.Tile.TILE_GRASS.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (Constants.RedDrakeSpawnTundra) {
                new EncounterBuilder(Tiles.Tile.TILE_TUNDRA.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (Constants.RedDrakeSpawnDirt) {
                new EncounterBuilder(Tiles.Tile.TILE_DIRT.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (Constants.RedDrakeSpawnSand) {
                new EncounterBuilder(Tiles.Tile.TILE_SAND.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (Constants.RedDrakeSpawnSnow) {
                new EncounterBuilder(Tiles.Tile.TILE_SNOW.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (Constants.RedDrakeSpawnMarsh) {
                new EncounterBuilder(Tiles.Tile.TILE_MARSH.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (Constants.RedDrakeSpawnCave) {
                new EncounterBuilder(Tiles.Tile.TILE_CAVE.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (Constants.RedDrakeSpawnPeat) {
                new EncounterBuilder(Tiles.Tile.TILE_PEAT.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
        }
    }
}
