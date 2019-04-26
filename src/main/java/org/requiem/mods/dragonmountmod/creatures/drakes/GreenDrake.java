
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

public class GreenDrake implements ModCreature, CreatureTypes {
    public static int templateId;

    /**
     * Create the green drake with settings below
     */
    @Override
    public CreatureTemplateBuilder createCreateTemplateBuilder() {
        final int[] types = (GreenDrakeCreatureTypes);//0, 4, 9, 12, 14, 27, 30, 32, 41, 43, 62 int
        final CreatureTemplateBuilder builder = new CreatureTemplateBuilder(
                "mod.creature.GreenDrake",
                "Green Drake",
                GreenDrakeDesc/*This docile green drake looks happy as it sits ready to ride.*/,
                "model.creature.drake.green",
                types, (byte) 1,
                (short) GreenDrakeVision/* 3 */,
                (byte) 0,
                (short) 180, (short) 50, (short) 250,
                "sound.death.dragon", "sound.death.dragon", "sound.combat.hit.dragon", "sound.combat.hit.dragon",
                GreenDrakeNaturalArmour/* 1.0F */,
                GreenDrakeHandDamage/* 20.0F */, GreenDrakeKickDamage/* 26.0F */, GreenDrakeBiteDamage/* 56.0F */, GreenDrakeHeadDamage/* 58.0F */, GreenDrakeBreathDamage/* 0.0F */,
                GreenDrakeMoveSpeed/* 4.0F */,
                GreenDrakeMoveRate/* 10 */,
                GreenDrakeItemsButchered,
                GreenDrakeMaxHuntRange/* 5 */,
                GreenDrakeAggression/* 0 */,
                ItemMaterials.MATERIAL_MEAT_DRAGON
        );
        templateId = builder.getTemplateId();

        builder.skill(SkillList.BODY_STRENGTH, GreenDrakeBodyStrength);//BODY_STRENGTH 50.0F
        builder.skill(SkillList.BODY_CONTROL, GreenDrakeBodyControl);//BODY_CONTROL 75.0F
        builder.skill(SkillList.BODY_STAMINA, GreenDrakeBodyStamina);//BODY_STAMINA 70.0F
        builder.skill(SkillList.MIND_LOGICAL, GreenDrakeMindLogic);//MIND_LOGICAL 27.0F
        builder.skill(SkillList.MIND_SPEED, GreenDrakeMindSpeed);//MIND_SPEED 37.0F
        builder.skill(SkillList.SOUL_STRENGTH, GreenDrakeSoulStrength); //SOUL_STRENGTH 55.0F
        builder.skill(SkillList.SOUL_DEPTH, GreenDrakeSoulDepth); //SOUL_DEPTH 29.0F
        builder.skill(SkillList.WEAPONLESS_FIGHTING, GreenDrakeWeaponlessFighting);//WEAPONLESS_FIGHTING 85.0F
        builder.skill(SkillList.GROUP_FIGHTING, GreenDrakeGroupFighting);//FIGHTING 80.0F

        builder.baseCombatRating(GreenDrakeBaseCombatRating);//70.0F
        builder.combatDamageType((byte) GreenDrakeCombatDamageType); //2 int
        builder.alignment(GreenDrakeAlignment);//100.0f
        builder.sizeModifier(GreenDrakeSizeX, GreenDrakeSizeY, GreenDrakeSizeZ);
        if (DrakeEggLayer) { builder.eggLayer(templateId); }
        builder.maxAge(GreenDrakeMaxAge);
        builder.kickDamString(GreenDrakeKickDamString);//wingbuff
        builder.headbuttDamString(GreenDrakeHeadbuttDamString);//tailwhip
        builder.armourType(GreenDrakeArmourType);//9 int
        builder.setCombatMoves(GreenDrakeCombatMoves);//1, 2, 6
        builder.maxPopulationOfCreatures(GreenDrakeMaxPop);

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
                vehicle.setSeatOffset(0, 0.0F, 0.0F, GreenDrakeZaxisOffset);//-0.01F
                vehicle.setCreature(true);
                vehicle.setSkillNeeded(GreenDrakeVehicleSkill);//35.0F
                vehicle.setName(creature.getName());
                vehicle.setMaxDepth(GreenDrakeVehicleDepth);//-0.7F
                vehicle.setMaxHeightDiff(GreenDrakeSetMaxHeightDiff);
                vehicle.setMaxSpeed(GreenDrakeVehicleSpeed);//80.0F
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
        if (GreenDrakeEnabled) {

            if (GreenDrakeSpawnTree) {
                new EncounterBuilder(Tiles.Tile.TILE_TREE.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (GreenDrakeSpawnSteppe) {
                new EncounterBuilder(Tiles.Tile.TILE_STEPPE.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (GreenDrakeSpawnGrass) {
                new EncounterBuilder(Tiles.Tile.TILE_GRASS.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (GreenDrakeSpawnTundra) {
                new EncounterBuilder(Tiles.Tile.TILE_TUNDRA.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (GreenDrakeSpawnDirt) {
                new EncounterBuilder(Tiles.Tile.TILE_DIRT.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (GreenDrakeSpawnSand) {
                new EncounterBuilder(Tiles.Tile.TILE_SAND.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (GreenDrakeSpawnSnow) {
                new EncounterBuilder(Tiles.Tile.TILE_SNOW.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (GreenDrakeSpawnMarsh) {
                new EncounterBuilder(Tiles.Tile.TILE_MARSH.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (GreenDrakeSpawnCave) {
                new EncounterBuilder(Tiles.Tile.TILE_CAVE.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (GreenDrakeSpawnPeat) {
                new EncounterBuilder(Tiles.Tile.TILE_PEAT.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
        }
    }
}
