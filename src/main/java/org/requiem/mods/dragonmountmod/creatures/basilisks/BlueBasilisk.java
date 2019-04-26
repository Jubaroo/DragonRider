package org.requiem.mods.dragonmountmod.creatures.basilisks;

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

public class BlueBasilisk implements ModCreature, CreatureTypes {

    public static int templateId;

    /**
     * Create the blue basilisk with settings below
     */
    @Override
    public CreatureTemplateBuilder createCreateTemplateBuilder() {
        final int[] types = (BlueBasiliskCreatureTypes);//0, 4, 9, 12, 14, 27, 30, 32, 41, 43, 62 int
        final CreatureTemplateBuilder builder = new CreatureTemplateBuilder(
                "mod.creature.BlueBasilisk", "Blue Basilisk", BlueBasiliskDesc/*This docile blue basilisk looks happy as it sits ready to ride.*/,
                "model.creature.basilisk.blue",
                types, (byte) 1,
                (short) BlueBasiliskVision/* 3 */,
                (byte) 0,
                (short) 180, (short) 50, (short) 250,
                "sound.death.dragon", "sound.death.dragon", "sound.combat.hit.dragon", "sound.combat.hit.dragon",
                BlueBasiliskNaturalArmour/* 1.0F */, BlueBasiliskHandDamage/* 20.0F */, BlueBasiliskKickDamage/* 26.0F */, BlueBasiliskBiteDamage/* 56.0F */, BlueBasiliskHeadDamage/* 58.0F */, BlueBasiliskBreathDamage/* 0.0F */,
                BlueBasiliskMoveSpeed/* 4.0F */,
                BlueBasiliskMoveRate/* 10 */,
                BlueBasiliskItemsButchered,
                BlueBasiliskMaxHuntRange/* 5 */,
                BlueBasiliskAggression/* 0 */,
                ItemMaterials.MATERIAL_MEAT_DRAGON
        );
        templateId = builder.getTemplateId();

        builder.skill(SkillList.BODY_STRENGTH, BlueBasiliskBodyStrength);//BODY_STRENGTH 50.0F
        builder.skill(SkillList.BODY_CONTROL, BlueBasiliskBodyControl);//BODY_CONTROL 75.0F
        builder.skill(SkillList.BODY_STAMINA, BlueBasiliskBodyStamina);//BODY_STAMINA 70.0F
        builder.skill(SkillList.MIND_LOGICAL, BlueBasiliskMindLogic);//MIND_LOGICAL 27.0F
        builder.skill(SkillList.MIND_SPEED, BlueBasiliskMindSpeed);//MIND_SPEED 37.0F
        builder.skill(SkillList.SOUL_STRENGTH, BlueBasiliskSoulStrength); //SOUL_STRENGTH 55.0F
        builder.skill(SkillList.SOUL_DEPTH, BlueBasiliskSoulDepth); //SOUL_DEPTH 29.0F
        builder.skill(SkillList.WEAPONLESS_FIGHTING, BlueBasiliskWeaponlessFighting);//WEAPONLESS_FIGHTING 85.0F
        builder.skill(SkillList.GROUP_FIGHTING, BlueBasiliskGroupFighting);//FIGHTING 80.0F

        builder.baseCombatRating(BlueBasiliskBaseCombatRating);//70.0F
        builder.combatDamageType((byte) BlueBasiliskCombatDamageType); //2 int
        builder.alignment(BlueBasiliskAlignment);//100.0f
        builder.sizeModifier(BlueBasiliskSizeX, BlueBasiliskSizeY, BlueBasiliskSizeZ);
        if (BasiliskEggLayer) { builder.eggLayer(templateId); }
        builder.kickDamString(BlueBasiliskKickDamString);//wingbuff
        builder.headbuttDamString(BlueBasiliskHeadbuttDamString);//tailwhip
        builder.armourType(BlueBasiliskArmourType);//9 int
        builder.setCombatMoves(BlueBasiliskCombatMoves);//1, 2, 6
        builder.maxPopulationOfCreatures(BlueBasiliskMaxPop);

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
                vehicle.setSeatOffset(0, 0.0F, 0.0F, BlueBasiliskZaxisOffset);//-0.01F
                vehicle.setCreature(true);
                vehicle.setSkillNeeded(BlueBasiliskVehicleSkill);//35.0F
                vehicle.setName(creature.getName());
                vehicle.setMaxDepth(BlueBasiliskVehicleDepth);//-0.7F
                vehicle.setMaxHeightDiff(BlueBasiliskSetMaxHeightDiff);
                vehicle.setMaxSpeed(BlueBasiliskVehicleSpeed);//80.0F
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
        if (BlueBasiliskEnabled) {

            if (BlueBasiliskSpawnTree) {
                new EncounterBuilder(Tiles.Tile.TILE_TREE.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (BlueBasiliskSpawnSteppe) {
                new EncounterBuilder(Tiles.Tile.TILE_STEPPE.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (BlueBasiliskSpawnGrass) {
                new EncounterBuilder(Tiles.Tile.TILE_GRASS.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (BlueBasiliskSpawnTundra) {
                new EncounterBuilder(Tiles.Tile.TILE_TUNDRA.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (BlueBasiliskSpawnDirt) {
                new EncounterBuilder(Tiles.Tile.TILE_DIRT.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (BlueBasiliskSpawnSand) {
                new EncounterBuilder(Tiles.Tile.TILE_SAND.id)
                        .addCreatures(templateId, 1
                        ).build(1);
            }
            if (BlueBasiliskSpawnSnow) {
                new EncounterBuilder(Tiles.Tile.TILE_SNOW.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (BlueBasiliskSpawnMarsh) {
                new EncounterBuilder(Tiles.Tile.TILE_MARSH.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (BlueBasiliskSpawnCave) {
                new EncounterBuilder(Tiles.Tile.TILE_CAVE.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (BlueBasiliskSpawnPeat) {
                new EncounterBuilder(Tiles.Tile.TILE_PEAT.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
        }
    }
}