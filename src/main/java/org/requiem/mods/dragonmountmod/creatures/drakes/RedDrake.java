
package org.requiem.mods.dragonmountmod.creatures.drakes;

import com.wurmonline.mesh.Tiles;
import com.wurmonline.server.behaviours.Vehicle;
import com.wurmonline.server.creatures.Creature;
import com.wurmonline.server.items.Item;
import com.wurmonline.shared.constants.CreatureTypes;
import com.wurmonline.shared.constants.ItemMaterials;
import org.gotti.wurmunlimited.modsupport.CreatureTemplateBuilder;
import org.gotti.wurmunlimited.modsupport.creatures.EncounterBuilder;
import org.gotti.wurmunlimited.modsupport.creatures.ModCreature;
import org.gotti.wurmunlimited.modsupport.vehicles.ModVehicleBehaviour;
import org.gotti.wurmunlimited.modsupport.vehicles.VehicleFacade;

import static org.requiem.mods.dragonmountmod.configurator.Constants.*;

public class RedDrake implements ModCreature, CreatureTypes {
    public static int templateId;

    /**
     * Create the red drake with settings below
     */
    @Override
    public CreatureTemplateBuilder createCreateTemplateBuilder() {
        final int[] types = (RedDrakeCreatureTypes);//0, 4, 9, 12, 14, 27, 30, 32, 41, 43, 62 int
        final CreatureTemplateBuilder builder = new CreatureTemplateBuilder(
                "mod.creature.RedDrake",
                "Red Drake",
                RedDrakeDesc/*This docile red drake looks happy as it sits ready to ride.*/,
                "model.creature.drake.red",
                types, (byte) 1,
                (short) RedDrakeVision/* 3 */,
                (byte) 0,
                (short) 180, (short) 50, (short) 250,
                "sound.death.dragon", "sound.death.dragon", "sound.combat.hit.dragon", "sound.combat.hit.dragon",
                RedDrakeNaturalArmour/* 1.0F */,
                RedDrakeHandDamage/* 20.0F */, RedDrakeKickDamage/* 26.0F */, RedDrakeBiteDamage/* 56.0F */, RedDrakeHeadDamage/* 58.0F */, RedDrakeBreathDamage/* 0.0F */,
                RedDrakeMoveSpeed/* 4.0F */,
                RedDrakeMoveRate/* 10 */,
                RedDrakeItemsButchered,
                RedDrakeMaxHuntRange/* 5 */,
                RedDrakeAggression/* 0 */,
                ItemMaterials.MATERIAL_MEAT_DRAGON
        );
        templateId = builder.getTemplateId();

        builder.skill(102, RedDrakeBodyStrength);//BODY_STRENGTH 50.0F
        builder.skill(104, RedDrakeBodyControl);//BODY_CONTROL 75.0F
        builder.skill(103, RedDrakeBodyStamina);//BODY_STAMINA 70.0F
        builder.skill(100, RedDrakeMindLogic);//MIND_LOGICAL 27.0F
        builder.skill(101, RedDrakeMindSpeed);//MIND_SPEED 37.0F
        builder.skill(105, RedDrakeSoulStrength); //SOUL_STRENGTH 55.0F
        builder.skill(106, RedDrakeSoulDepth); //SOUL_DEPTH 29.0F
        builder.skill(10052, RedDrakeWeaponlessFighting);//WEAPONLESS_FIGHTING 85.0F
        builder.skill(1023, RedDrakeGroupFighting);//FIGHTING 80.0F

        builder.baseCombatRating(RedDrakeBaseCombatRating);//70.0F
        builder.combatDamageType((byte) RedDrakeCombatDamageType); //2 int
        builder.alignment(RedDrakeAlignment);//100.0f
        builder.sizeModifier(RedDrakeSizeX, RedDrakeSizeY, RedDrakeSizeZ);
        if (DrakeEggLayer) { builder.eggLayer(templateId); }
        builder.maxAge(RedDrakeMaxAge);
        builder.kickDamString(RedDrakeKickDamString);//wingbuff
        builder.headbuttDamString(RedDrakeHeadbuttDamString);//tailwhip
        builder.armourType(RedDrakeArmourType);//9 int
        builder.setCombatMoves(RedDrakeCombatMoves);//1, 2, 6
        builder.maxPopulationOfCreatures(RedDrakeMaxPop);

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
                vehicle.setSeatOffset(0, 0.0F, 0.0F, RedDrakeZaxisOffset);//-0.01F
                vehicle.setCreature(true);
                vehicle.setSkillNeeded(RedDrakeVehicleSkill);//35.0F
                vehicle.setName(creature.getName());
                vehicle.setMaxDepth(RedDrakeVehicleDepth);//-0.7F
                vehicle.setMaxHeightDiff(RedDrakeSetMaxHeightDiff);
                vehicle.setMaxSpeed(RedDrakeVehicleSpeed);//80.0F
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
        if (RedDrakeEnabled) {

            if (RedDrakeSpawnTree) {
                new EncounterBuilder(Tiles.Tile.TILE_TREE.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (RedDrakeSpawnSteppe) {
                new EncounterBuilder(Tiles.Tile.TILE_STEPPE.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (RedDrakeSpawnGrass) {
                new EncounterBuilder(Tiles.Tile.TILE_GRASS.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (RedDrakeSpawnTundra) {
                new EncounterBuilder(Tiles.Tile.TILE_TUNDRA.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (RedDrakeSpawnDirt) {
                new EncounterBuilder(Tiles.Tile.TILE_DIRT.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (RedDrakeSpawnSand) {
                new EncounterBuilder(Tiles.Tile.TILE_SAND.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (RedDrakeSpawnSnow) {
                new EncounterBuilder(Tiles.Tile.TILE_SNOW.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (RedDrakeSpawnMarsh) {
                new EncounterBuilder(Tiles.Tile.TILE_MARSH.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (RedDrakeSpawnCave) {
                new EncounterBuilder(Tiles.Tile.TILE_CAVE.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (RedDrakeSpawnPeat) {
                new EncounterBuilder(Tiles.Tile.TILE_PEAT.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
        }
    }
}
