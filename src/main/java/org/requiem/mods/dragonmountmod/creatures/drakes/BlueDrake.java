
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

public class BlueDrake implements ModCreature, CreatureTypes {
    public static int templateId;

    /**
     * Create the blue drake with settings below
     */
    @Override
    public CreatureTemplateBuilder createCreateTemplateBuilder() {
        final int[] types = (BlueDrakeCreatureTypes);//0, 4, 9, 12, 14, 27, 30, 32, 41, 43, 62 int
        final CreatureTemplateBuilder builder = new CreatureTemplateBuilder(
                "mod.creature.BlueDrake",
                "Blue Drake",
                BlueDrakeDesc/*This docile blue drake looks happy as it sits ready to ride.*/,
                "model.creature.drake.blue",
                types, (byte) 1,
                (short) BlueDrakeVision/* 3 */,
                (byte) 0,
                (short) 180, (short) 50, (short) 250,
                "sound.death.dragon", "sound.death.dragon", "sound.combat.hit.dragon", "sound.combat.hit.dragon",
                BlueDrakeNaturalArmour/* 1.0F */, BlueDrakeHandDamage/* 20.0F */, BlueDrakeKickDamage/* 26.0F */, BlueDrakeBiteDamage/* 56.0F */, BlueDrakeHeadDamage/* 58.0F */, BlueDrakeBreathDamage/* 0.0F */,
                BlueDrakeMoveSpeed/* 4.0F */,
                BlueDrakeMoveRate/* 10 */,
                BlueDrakeItemsButchered,
                BlueDrakeMaxHuntRange/* 5 */,
                BlueDrakeAggression/* 0 */,
                ItemMaterials.MATERIAL_MEAT_DRAGON
        );
        templateId = builder.getTemplateId();

        builder.skill(SkillList.BODY_STRENGTH, BlueDrakeBodyStrength);//BODY_STRENGTH 50.0F
        builder.skill(SkillList.BODY_CONTROL, BlueDrakeBodyControl);//BODY_CONTROL 75.0F
        builder.skill(SkillList.BODY_STAMINA, BlueDrakeBodyStamina);//BODY_STAMINA 70.0F
        builder.skill(SkillList.MIND_LOGICAL, BlueDrakeMindLogic);//MIND_LOGICAL 27.0F
        builder.skill(SkillList.MIND_SPEED, BlueDrakeMindSpeed);//MIND_SPEED 37.0F
        builder.skill(SkillList.SOUL_STRENGTH, BlueDrakeSoulStrength); //SOUL_STRENGTH 55.0F
        builder.skill(SkillList.SOUL_DEPTH, BlueDrakeSoulDepth); //SOUL_DEPTH 29.0F
        builder.skill(SkillList.WEAPONLESS_FIGHTING, BlueDrakeWeaponlessFighting);//WEAPONLESS_FIGHTING 85.0F
        builder.skill(SkillList.GROUP_FIGHTING, BlueDrakeGroupFighting);//FIGHTING 80.0F

        builder.baseCombatRating(BlueDrakeBaseCombatRating);//70.0F
        builder.combatDamageType((byte) BlueDrakeCombatDamageType); //2 int
        builder.alignment(BlueDrakeAlignment);//100.0f
        builder.sizeModifier(BlueDrakeSizeX, BlueDrakeSizeY, BlueDrakeSizeZ);
        if (DrakeEggLayer) { builder.eggLayer(templateId); }
        builder.maxAge(BlueDrakeMaxAge);
        builder.kickDamString(BlueDrakeKickDamString);//wingbuff
        builder.headbuttDamString(BlueDrakeHeadbuttDamString);//tailwhip
        builder.armourType(BlueDrakeArmourType);//9 int
        builder.setCombatMoves(BlueDrakeCombatMoves);//1, 2, 6
        builder.maxPopulationOfCreatures(BlueDrakeMaxPop);

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
                vehicle.setSeatOffset(0, 0.0F, 0.0F, BlueDrakeZaxisOffset);//-0.01F
                vehicle.setCreature(true);
                vehicle.setSkillNeeded(BlueDrakeVehicleSkill);//35.0F
                vehicle.setName(creature.getName());
                vehicle.setMaxDepth(BlueDrakeVehicleDepth);//-0.7F
                vehicle.setMaxHeightDiff(BlueDrakeSetMaxHeightDiff);
                vehicle.setMaxSpeed(BlueDrakeVehicleSpeed);//80.0F
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
        if (BlueDrakeEnabled) {

            if (BlueDrakeSpawnTree) {
                new EncounterBuilder(Tiles.Tile.TILE_TREE.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (BlueDrakeSpawnSteppe) {
                new EncounterBuilder(Tiles.Tile.TILE_STEPPE.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (BlueDrakeSpawnGrass) {
                new EncounterBuilder(Tiles.Tile.TILE_GRASS.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (BlueDrakeSpawnTundra) {
                new EncounterBuilder(Tiles.Tile.TILE_TUNDRA.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (BlueDrakeSpawnDirt) {
                new EncounterBuilder(Tiles.Tile.TILE_DIRT.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (BlueDrakeSpawnSand) {
                new EncounterBuilder(Tiles.Tile.TILE_SAND.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (BlueDrakeSpawnSnow) {
                new EncounterBuilder(Tiles.Tile.TILE_SNOW.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (BlueDrakeSpawnMarsh) {
                new EncounterBuilder(Tiles.Tile.TILE_MARSH.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (BlueDrakeSpawnCave) {
                new EncounterBuilder(Tiles.Tile.TILE_CAVE.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (BlueDrakeSpawnPeat) {
                new EncounterBuilder(Tiles.Tile.TILE_PEAT.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
        }
    }
}