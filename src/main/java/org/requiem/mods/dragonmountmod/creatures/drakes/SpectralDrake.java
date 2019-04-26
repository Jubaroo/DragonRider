
package org.requiem.mods.dragonmountmod.creatures.drakes;

import com.wurmonline.mesh.Tiles;
import com.wurmonline.server.behaviours.Vehicle;
import com.wurmonline.server.creatures.Creature;
import com.wurmonline.server.items.Item;
import com.wurmonline.server.skills.SkillList;
import com.wurmonline.shared.constants.CreatureTypes;
import com.wurmonline.shared.constants.ItemMaterials;
import org.gotti.wurmunlimited.modsupport.CreatureTemplateBuilder;
import org.gotti.wurmunlimited.modsupport.creatures.EncounterBuilder;
import org.gotti.wurmunlimited.modsupport.creatures.ModCreature;
import org.gotti.wurmunlimited.modsupport.vehicles.ModVehicleBehaviour;
import org.gotti.wurmunlimited.modsupport.vehicles.VehicleFacade;

import static org.requiem.mods.dragonmountmod.configurator.Constants.*;

public class SpectralDrake implements ModCreature, CreatureTypes {
    public static int templateId;

    /**
     * Create the ghost drake with settings below
     */
    @Override
    public CreatureTemplateBuilder createCreateTemplateBuilder() {
        final int[] types = (GhostDrakeCreatureTypes);//0, 4, 9, 12, 14, 27, 30, 32, 41, 43, 62 int
        final CreatureTemplateBuilder builder = new CreatureTemplateBuilder(
                "mod.creature.SpectralDrake",
                "Spectral Drake",
                GhostDrakeDesc/*This docile ghost drake looks happy as it sits ready to ride.*/,
                "model.creature.drake." + GhostDrakeModelColor,
                types, (byte) 1,
                (short) GhostDrakeVision/* 3 */,
                (byte) 0,
                (short) 180, (short) 50, (short) 250,
                "sound.death.dragon", "sound.death.dragon", "sound.combat.hit.dragon", "sound.combat.hit.dragon",
                GhostDrakeNaturalArmour/* 1.0F */,
                GhostDrakeHandDamage/* 20.0F */, GhostDrakeKickDamage/* 26.0F */, GhostDrakeBiteDamage/* 56.0F */, GhostDrakeHeadDamage/* 58.0F */, GhostDrakeBreathDamage/* 0.0F */,
                GhostDrakeMoveSpeed/* 4.0F */,
                GhostDrakeMoveRate/* 10 */,
                GhostDrakeItemsButchered,
                GhostDrakeMaxHuntRange/* 5 */,
                GhostDrakeAggression/* 0 */,
                ItemMaterials.MATERIAL_MEAT_DRAGON
        );
        templateId = builder.getTemplateId();

        builder.skill(SkillList.BODY_STRENGTH, GhostDrakeBodyStrength);//BODY_STRENGTH 50.0F
        builder.skill(SkillList.BODY_CONTROL, GhostDrakeBodyControl);//BODY_CONTROL 75.0F
        builder.skill(SkillList.BODY_STAMINA, GhostDrakeBodyStamina);//BODY_STAMINA 70.0F
        builder.skill(SkillList.MIND_LOGICAL, GhostDrakeMindLogic);//MIND_LOGICAL 27.0F
        builder.skill(SkillList.MIND_SPEED, GhostDrakeMindSpeed);//MIND_SPEED 37.0F
        builder.skill(SkillList.SOUL_STRENGTH, GhostDrakeSoulStrength); //SOUL_STRENGTH 55.0F
        builder.skill(SkillList.SOUL_DEPTH, GhostDrakeSoulDepth); //SOUL_DEPTH 29.0F
        builder.skill(SkillList.WEAPONLESS_FIGHTING, GhostDrakeWeaponlessFighting);//WEAPONLESS_FIGHTING 85.0F
        builder.skill(SkillList.GROUP_FIGHTING, GhostDrakeGroupFighting);//FIGHTING 80.0F

        builder.baseCombatRating(GhostDrakeBaseCombatRating);//70.0F
        builder.combatDamageType((byte) GhostDrakeCombatDamageType); //2 int
        builder.alignment(GhostDrakeAlignment);//100.0f
        builder.sizeModifier(GhostDrakeSizeX, GhostDrakeSizeY, GhostDrakeSizeZ);
        if (DrakeEggLayer) { builder.eggLayer(templateId); }
        builder.maxAge(GhostDrakeMaxAge);
        builder.kickDamString(GhostDrakeKickDamString);//wingbuff
        builder.headbuttDamString(GhostDrakeHeadbuttDamString);//tailwhip
        builder.armourType(GhostDrakeArmourType);//9 int
        builder.setCombatMoves(GhostDrakeCombatMoves);//1, 2, 6
        builder.maxPopulationOfCreatures(GhostDrakeMaxPop);

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
                vehicle.setSeatOffset(0, 0.0F, 0.0F, GhostDrakeZaxisOffset);//-0.01F
                vehicle.setCreature(true);
                vehicle.setSkillNeeded(GhostDrakeVehicleSkill);//35.0F
                vehicle.setName(creature.getName());
                vehicle.setMaxDepth(GhostDrakeVehicleDepth);//-0.7F
                vehicle.setMaxHeightDiff(GhostDrakeSetMaxHeightDiff);
                vehicle.setMaxSpeed(GhostDrakeVehicleSpeed);//80.0F
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
        if (GhostDrakeEnabled) {

            if (GhostDrakeSpawnTree) {
                new EncounterBuilder(Tiles.Tile.TILE_TREE.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (GhostDrakeSpawnSteppe) {
                new EncounterBuilder(Tiles.Tile.TILE_STEPPE.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (GhostDrakeSpawnGrass) {
                new EncounterBuilder(Tiles.Tile.TILE_GRASS.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (GhostDrakeSpawnTundra) {
                new EncounterBuilder(Tiles.Tile.TILE_TUNDRA.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (GhostDrakeSpawnDirt) {
                new EncounterBuilder(Tiles.Tile.TILE_DIRT.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (GhostDrakeSpawnSand) {
                new EncounterBuilder(Tiles.Tile.TILE_SAND.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (GhostDrakeSpawnSnow) {
                new EncounterBuilder(Tiles.Tile.TILE_SNOW.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (GhostDrakeSpawnMarsh) {
                new EncounterBuilder(Tiles.Tile.TILE_MARSH.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (GhostDrakeSpawnCave) {
                new EncounterBuilder(Tiles.Tile.TILE_CAVE.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (GhostDrakeSpawnPeat) {
                new EncounterBuilder(Tiles.Tile.TILE_PEAT.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
        }
    }
}