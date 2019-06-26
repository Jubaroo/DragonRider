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

public class BlackDrake implements ModCreature, CreatureTypes {
    public static int templateId;

    /**
     * Create the black drake with settings below
     */
    @Override
    public CreatureTemplateBuilder createCreateTemplateBuilder() {
        final int[] types = (Constants.BlackDrakeCreatureTypes);//0, 4, 9, 12, 14, 27, 30, 32, 41, 43, 62 int
        final CreatureTemplateBuilder builder = new CreatureTemplateBuilder(
                "mod.creature.BlackDrake", "Black Drake", Constants.BlackDrakeDesc/*This docile black drake looks happy as it sits ready to ride.*/,
                "model.creature.drake.black",
                types, BodyTemplate.TYPE_DRAGON,
                (short) Constants.BlackDrakeVision/* 3 */,
                MiscConstants.SEX_MALE,
                (short) 180, (short) 50, (short) 250,
                "sound.death.dragon", "sound.death.dragon", "sound.combat.hit.dragon", "sound.combat.hit.dragon",
                Constants.BlackDrakeNaturalArmour/* 1.0F */, Constants.BlackDrakeHandDamage/* 20.0F */, Constants.BlackDrakeKickDamage/* 26.0F */, Constants.BlackDrakeBiteDamage/* 56.0F */, Constants.BlackDrakeHeadDamage/* 58.0F */, Constants.BlackDrakeBreathDamage/* 0.0F */,
                Constants.BlackDrakeMoveSpeed/* 4.0F */,
                Constants.BlackDrakeMoveRate/* 10 */,
                Constants.BlackDrakeItemsButchered,
                Constants.BlackDrakeMaxHuntRange/* 5 */,
                Constants.BlackDrakeAggression/* 0 */,
                ItemMaterials.MATERIAL_MEAT_DRAGON
        );
        templateId = builder.getTemplateId();

        builder.skill(SkillList.BODY_STRENGTH, Constants.BlackDrakeBodyStrength);//BODY_STRENGTH 50.0F
        builder.skill(SkillList.BODY_CONTROL, Constants.BlackDrakeBodyControl);//BODY_CONTROL 75.0F
        builder.skill(SkillList.BODY_STAMINA, Constants.BlackDrakeBodyStamina);//BODY_STAMINA 70.0F
        builder.skill(SkillList.MIND_LOGICAL, Constants.BlackDrakeMindLogic);//MIND_LOGICAL 27.0F
        builder.skill(SkillList.MIND_SPEED, Constants.BlackDrakeMindSpeed);//MIND_SPEED 37.0F
        builder.skill(SkillList.SOUL_STRENGTH, Constants.BlackDrakeSoulStrength); //SOUL_STRENGTH 55.0F
        builder.skill(SkillList.SOUL_DEPTH, Constants.BlackDrakeSoulDepth); //SOUL_DEPTH 29.0F
        builder.skill(SkillList.WEAPONLESS_FIGHTING, Constants.BlackDrakeWeaponlessFighting);//WEAPONLESS_FIGHTING 85.0F
        builder.skill(SkillList.GROUP_FIGHTING, Constants.BlackDrakeGroupFighting);//FIGHTING 80.0F

        builder.baseCombatRating(Constants.BlackDrakeBaseCombatRating);//70.0F
        builder.combatDamageType((byte) Constants.BlackDrakeCombatDamageType); //2 int
        builder.alignment(Constants.BlackDrakeAlignment);//100.0f
        builder.sizeModifier(Constants.BlackDrakeSizeX, Constants.BlackDrakeSizeY, Constants.BlackDrakeSizeZ);
        if (Constants.DrakeEggLayer) { builder.eggLayer(templateId); }
        builder.maxAge(Constants.BlackDrakeMaxAge);
        builder.kickDamString(Constants.BlackDrakeKickDamString);//wingbuff
        builder.headbuttDamString(Constants.BlackDrakeHeadbuttDamString);//tailwhip
        builder.armourType(Constants.BlackDrakeArmourType);//9 int
        builder.setCombatMoves(Constants.BlackDrakeCombatMoves);//1, 2, 6
        builder.maxPopulationOfCreatures(Constants.BlackDrakeMaxPop);

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
                vehicle.setSeatOffset(0, 0.0F, 0.0F, Constants.BlackDrakeZAxisOffset);//-0.01F
                vehicle.setCreature(true);
                vehicle.setSkillNeeded(Constants.BlackDrakeVehicleSkill);//35.0F
                vehicle.setName(creature.getName());
                vehicle.setMaxDepth(Constants.BlackDrakeVehicleDepth);//-0.7F
                vehicle.setMaxHeightDiff(Constants.BlackDrakeSetMaxHeightDiff);
                vehicle.setMaxSpeed(Constants.BlackDrakeVehicleSpeed);//80.0F
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
        if (Constants.BlackDrakeEnabled) {
            if (Constants.BlackDrakeSpawnTree) {
                new EncounterBuilder(Tiles.Tile.TILE_TREE.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (Constants.BlackDrakeSpawnSteppe) {
                new EncounterBuilder(Tiles.Tile.TILE_STEPPE.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (Constants.BlackDrakeSpawnGrass) {
                new EncounterBuilder(Tiles.Tile.TILE_GRASS.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (Constants.BlackDrakeSpawnTundra) {
                new EncounterBuilder(Tiles.Tile.TILE_TUNDRA.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (Constants.BlackDrakeSpawnDirt) {
                new EncounterBuilder(Tiles.Tile.TILE_DIRT.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (Constants.BlackDrakeSpawnSand) {
                new EncounterBuilder(Tiles.Tile.TILE_SAND.id)
                        .addCreatures(templateId, 1
                        ).build(1);
            }
            if (Constants.BlackDrakeSpawnSnow) {
                new EncounterBuilder(Tiles.Tile.TILE_SNOW.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (Constants.BlackDrakeSpawnMarsh) {
                new EncounterBuilder(Tiles.Tile.TILE_MARSH.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (Constants.BlackDrakeSpawnCave) {
                new EncounterBuilder(Tiles.Tile.TILE_CAVE.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (Constants.BlackDrakeSpawnPeat) {
                new EncounterBuilder(Tiles.Tile.TILE_PEAT.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
        }
    }
}