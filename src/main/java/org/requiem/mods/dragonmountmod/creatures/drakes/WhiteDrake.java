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

import static org.requiem.mods.dragonmountmod.Constants.*;

public class WhiteDrake implements ModCreature, CreatureTypes {
    public static int templateId;

    /**
     * Create the white drake with settings below
     */
    @Override
    public CreatureTemplateBuilder createCreateTemplateBuilder() {
        final int[] types = (WhiteDrakeCreatureTypes);//0, 4, 9, 12, 14, 27, 30, 32, 41, 43, 62 int
        final CreatureTemplateBuilder builder = new CreatureTemplateBuilder(
                "mod.creature.WhiteDrake",
                "White Drake",
                WhiteDrakeDesc/*This docile white drake looks happy as it sits ready to ride.*/,
                "model.creature.drake.white",
                types, BodyTemplate.TYPE_DRAGON,
                (short) WhiteDrakeVision/* 3 */,
                MiscConstants.SEX_MALE,
                (short) 180, (short) 50, (short) 250,
                "sound.death.dragon", "sound.death.dragon", "sound.combat.hit.dragon", "sound.combat.hit.dragon",
                WhiteDrakeNaturalArmour/* 1.0F */,
                WhiteDrakeHandDamage/* 20.0F */, WhiteDrakeKickDamage/* 26.0F */, WhiteDrakeBiteDamage/* 56.0F */, WhiteDrakeHeadDamage/* 58.0F */, WhiteDrakeBreathDamage/* 0.0F */,
                WhiteDrakeMoveSpeed/* 4.0F */,
                WhiteDrakeMoveRate/* 10 */,
                WhiteDrakeItemsButchered,
                WhiteDrakeMaxHuntRange/* 5 */,
                WhiteDrakeAggression/* 0 */,
                ItemMaterials.MATERIAL_MEAT_DRAGON
        );
        templateId = builder.getTemplateId();

        builder.skill(SkillList.BODY_STRENGTH, WhiteDrakeBodyStrength);//BODY_STRENGTH 50.0F
        builder.skill(SkillList.BODY_CONTROL, WhiteDrakeBodyControl);//BODY_CONTROL 75.0F
        builder.skill(SkillList.BODY_STAMINA, WhiteDrakeBodyStamina);//BODY_STAMINA 70.0F
        builder.skill(SkillList.MIND_LOGICAL, WhiteDrakeMindLogic);//MIND_LOGICAL 27.0F
        builder.skill(SkillList.MIND_SPEED, WhiteDrakeMindSpeed);//MIND_SPEED 37.0F
        builder.skill(SkillList.SOUL_STRENGTH, WhiteDrakeSoulStrength); //SOUL_STRENGTH 55.0F
        builder.skill(SkillList.SOUL_DEPTH, WhiteDrakeSoulDepth); //SOUL_DEPTH 29.0F
        builder.skill(SkillList.WEAPONLESS_FIGHTING, WhiteDrakeWeaponlessFighting);//WEAPONLESS_FIGHTING 85.0F
        builder.skill(SkillList.GROUP_FIGHTING, WhiteDrakeGroupFighting);//FIGHTING 80.0F

        builder.baseCombatRating(WhiteDrakeBaseCombatRating);//70.0F
        builder.combatDamageType((byte) WhiteDrakeCombatDamageType); //2 int
        builder.alignment(WhiteDrakeAlignment);//100.0f
        builder.sizeModifier(WhiteDrakeSizeX, WhiteDrakeSizeY, WhiteDrakeSizeZ);
        if (DrakeEggLayer) { builder.eggLayer(templateId); }
        builder.maxAge(WhiteDrakeMaxAge);
        builder.kickDamString(WhiteDrakeKickDamString);//wingbuff
        builder.headbuttDamString(WhiteDrakeHeadbuttDamString);//tailwhip
        builder.armourType(WhiteDrakeArmourType);//9 int
        builder.setCombatMoves(WhiteDrakeCombatMoves);//1, 2, 6
        builder.maxPopulationOfCreatures(WhiteDrakeMaxPop);

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
            public void setSettingsForVehicle(final Creature creature, final Vehicle v) {
                final VehicleFacade vehicle = this.wrap(v);
                vehicle.createPassengerSeats(0);
                vehicle.setSeatFightMod(0, 0.6F, 1.3F);
                vehicle.setSeatOffset(0, 0.0F, 0.0F, WhiteDrakeZAxisOffset);//-0.01F
                vehicle.setCreature(true);
                vehicle.setSkillNeeded(WhiteDrakeVehicleSkill);//35.0F
                vehicle.setName(creature.getName());
                vehicle.setMaxDepth(WhiteDrakeVehicleDepth);//-0.7F
                vehicle.setMaxHeightDiff(WhiteDrakeSetMaxHeightDiff);
                vehicle.setMaxSpeed(WhiteDrakeVehicleSpeed);//80.0F
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
        if (WhiteDrakeEnabled) {

            if (WhiteDrakeSpawnTree) {
                new EncounterBuilder(Tiles.Tile.TILE_TREE.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (WhiteDrakeSpawnSteppe) {
                new EncounterBuilder(Tiles.Tile.TILE_STEPPE.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (WhiteDrakeSpawnGrass) {
                new EncounterBuilder(Tiles.Tile.TILE_GRASS.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (WhiteDrakeSpawnTundra) {
                new EncounterBuilder(Tiles.Tile.TILE_TUNDRA.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (WhiteDrakeSpawnDirt) {
                new EncounterBuilder(Tiles.Tile.TILE_DIRT.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (WhiteDrakeSpawnSand) {
                new EncounterBuilder(Tiles.Tile.TILE_SAND.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (WhiteDrakeSpawnSnow) {
                new EncounterBuilder(Tiles.Tile.TILE_SNOW.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (WhiteDrakeSpawnMarsh) {
                new EncounterBuilder(Tiles.Tile.TILE_MARSH.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (WhiteDrakeSpawnCave) {
                new EncounterBuilder(Tiles.Tile.TILE_CAVE.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (WhiteDrakeSpawnPeat) {
                new EncounterBuilder(Tiles.Tile.TILE_PEAT.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
        }
    }
}