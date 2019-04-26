
package org.requiem.mods.dragonmountmod.creatures.drakes;

import com.wurmonline.mesh.Tiles;
import com.wurmonline.server.behaviours.Vehicle;
import com.wurmonline.server.creatures.Creature;
import com.wurmonline.server.items.Item;
import com.wurmonline.shared.constants.CreatureTypes;
import org.gotti.wurmunlimited.modsupport.CreatureTemplateBuilder;
import org.gotti.wurmunlimited.modsupport.creatures.EncounterBuilder;
import org.gotti.wurmunlimited.modsupport.creatures.ModCreature;
import org.gotti.wurmunlimited.modsupport.vehicles.ModVehicleBehaviour;
import org.gotti.wurmunlimited.modsupport.vehicles.VehicleFacade;

import static com.wurmonline.server.skills.SkillList.*;
import static com.wurmonline.shared.constants.ItemMaterials.MATERIAL_MEAT_DRAGON;
import static org.requiem.mods.dragonmountmod.configurator.Constants.*;

public class BlackDrake implements ModCreature, CreatureTypes {
    public static int templateId;

    /**
     * Create the black drake with settings below
     */
    @Override
    public CreatureTemplateBuilder createCreateTemplateBuilder() {
        final int[] types = (BlackDrakeCreatureTypes);//0, 4, 9, 12, 14, 27, 30, 32, 41, 43, 62 int
        final CreatureTemplateBuilder builder = new CreatureTemplateBuilder(
                "mod.creature.BlackDrake", "Black Drake", BlackDrakeDesc/*This docile black drake looks happy as it sits ready to ride.*/,
                "model.creature.drake.black",
                types, (byte) 1,
                (short) BlackDrakeVision/* 3 */,
                (byte) 0,
                (short) 180, (short) 50, (short) 250,
                "sound.death.dragon", "sound.death.dragon", "sound.combat.hit.dragon", "sound.combat.hit.dragon",
                BlackDrakeNaturalArmour/* 1.0F */, BlackDrakeHandDamage/* 20.0F */, BlackDrakeKickDamage/* 26.0F */, BlackDrakeBiteDamage/* 56.0F */, BlackDrakeHeadDamage/* 58.0F */, BlackDrakeBreathDamage/* 0.0F */,
                BlackDrakeMoveSpeed/* 4.0F */,
                BlackDrakeMoveRate/* 10 */,
                BlackDrakeItemsButchered,
                BlackDrakeMaxHuntRange/* 5 */,
                BlackDrakeAggression/* 0 */,
                MATERIAL_MEAT_DRAGON
        );
        templateId = builder.getTemplateId();

        builder.skill(BODY_STRENGTH, BlackDrakeBodyStrength);//BODY_STRENGTH 50.0F
        builder.skill(BODY_CONTROL, BlackDrakeBodyControl);//BODY_CONTROL 75.0F
        builder.skill(BODY_STAMINA, BlackDrakeBodyStamina);//BODY_STAMINA 70.0F
        builder.skill(MIND_LOGICAL, BlackDrakeMindLogic);//MIND_LOGICAL 27.0F
        builder.skill(MIND_SPEED, BlackDrakeMindSpeed);//MIND_SPEED 37.0F
        builder.skill(SOUL_STRENGTH, BlackDrakeSoulStrength); //SOUL_STRENGTH 55.0F
        builder.skill(SOUL_DEPTH, BlackDrakeSoulDepth); //SOUL_DEPTH 29.0F
        builder.skill(WEAPONLESS_FIGHTING, BlackDrakeWeaponlessFighting);//WEAPONLESS_FIGHTING 85.0F
        builder.skill(GROUP_FIGHTING, BlackDrakeGroupFighting);//FIGHTING 80.0F

        builder.baseCombatRating(BlackDrakeBaseCombatRating);//70.0F
        builder.combatDamageType((byte) BlackDrakeCombatDamageType); //2 int
        builder.alignment(BlackDrakeAlignment);//100.0f
        builder.sizeModifier(BlackDrakeSizeX, BlackDrakeSizeY, BlackDrakeSizeZ);
        if (DrakeEggLayer) { builder.eggLayer(templateId); }
        builder.maxAge(BlackDrakeMaxAge);
        builder.kickDamString(BlackDrakeKickDamString);//wingbuff
        builder.headbuttDamString(BlackDrakeHeadbuttDamString);//tailwhip
        builder.armourType(BlackDrakeArmourType);//9 int
        builder.setCombatMoves(BlackDrakeCombatMoves);//1, 2, 6
        builder.maxPopulationOfCreatures(BlackDrakeMaxPop);

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
                vehicle.setSeatOffset(0, 0.0F, 0.0F, BlackDrakeZaxisOffset);//-0.01F
                vehicle.setCreature(true);
                vehicle.setSkillNeeded(BlackDrakeVehicleSkill);//35.0F
                vehicle.setName(creature.getName());
                vehicle.setMaxDepth(BlackDrakeVehicleDepth);//-0.7F
                vehicle.setMaxHeightDiff(BlackDrakeSetMaxHeightDiff);
                vehicle.setMaxSpeed(BlackDrakeVehicleSpeed);//80.0F
                vehicle.setCommandType((byte) 3);
                vehicle.setCanHaveEquipment(true);
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
        if (BlackDrakeEnabled) {

            if (BlackDrakeSpawnTree) {
                new EncounterBuilder(Tiles.Tile.TILE_TREE.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (BlackDrakeSpawnSteppe) {
                new EncounterBuilder(Tiles.Tile.TILE_STEPPE.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (BlackDrakeSpawnGrass) {
                new EncounterBuilder(Tiles.Tile.TILE_GRASS.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (BlackDrakeSpawnTundra) {
                new EncounterBuilder(Tiles.Tile.TILE_TUNDRA.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (BlackDrakeSpawnDirt) {
                new EncounterBuilder(Tiles.Tile.TILE_DIRT.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (BlackDrakeSpawnSand) {
                new EncounterBuilder(Tiles.Tile.TILE_SAND.id)
                        .addCreatures(templateId, 1
                        ).build(1);
            }
            if (BlackDrakeSpawnSnow) {
                new EncounterBuilder(Tiles.Tile.TILE_SNOW.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (BlackDrakeSpawnMarsh) {
                new EncounterBuilder(Tiles.Tile.TILE_MARSH.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (BlackDrakeSpawnCave) {
                new EncounterBuilder(Tiles.Tile.TILE_CAVE.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (BlackDrakeSpawnPeat) {
                new EncounterBuilder(Tiles.Tile.TILE_PEAT.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
        }
    }
}