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

public class SpectralBasilisk implements ModCreature, CreatureTypes {
    public static int templateId;
    /**
     * Create the ghost basilisk with settings below
     */
    @Override
    public CreatureTemplateBuilder createCreateTemplateBuilder() {
        final int[] types = (GhostBasiliskCreatureTypes);//0, 4, 9, 12, 14, 27, 30, 32, 41, 43, 62 int
        final CreatureTemplateBuilder builder = new CreatureTemplateBuilder(
                "mod.creature.SpectralBasilisk", "Spectral Basilisk", GhostBasiliskDesc/*This docile ghost basilisk looks happy as it sits ready to ride.*/,
                "model.creature.basilisk." + GhostBasiliskModelColor,
                types, (byte) 1,
                (short) GhostBasiliskVision/* 3 */,
                (byte) 0,
                (short) 180, (short) 50, (short) 250,
                "sound.death.dragon", "sound.death.dragon", "sound.combat.hit.dragon", "sound.combat.hit.dragon",
                GhostBasiliskNaturalArmour/* 1.0F */,
                GhostBasiliskHandDamage/* 20.0F */, GhostBasiliskKickDamage/* 26.0F */, GhostBasiliskBiteDamage/* 56.0F */, GhostBasiliskHeadDamage/* 58.0F */, GhostBasiliskBreathDamage/* 0.0F */,
                GhostBasiliskMoveSpeed/* 4.0F */,
                GhostBasiliskMoveRate/* 10 */,
                GhostBasiliskItemsButchered,
                GhostBasiliskMaxHuntRange/* 5 */,
                GhostBasiliskAggression/* 0 */,
                ItemMaterials.MATERIAL_MEAT_DRAGON
        );
        templateId = builder.getTemplateId();

        builder.skill(SkillList.BODY_STRENGTH, GhostBasiliskBodyStrength);//BODY_STRENGTH 50.0F
        builder.skill(SkillList.BODY_CONTROL, GhostBasiliskBodyControl);//BODY_CONTROL 75.0F
        builder.skill(SkillList.BODY_STAMINA, GhostBasiliskBodyStamina);//BODY_STAMINA 70.0F
        builder.skill(SkillList.MIND_LOGICAL, GhostBasiliskMindLogic);//MIND_LOGICAL 27.0F
        builder.skill(SkillList.MIND_SPEED, GhostBasiliskMindSpeed);//MIND_SPEED 37.0F
        builder.skill(SkillList.SOUL_STRENGTH, GhostBasiliskSoulStrength); //SOUL_STRENGTH 55.0F
        builder.skill(SkillList.SOUL_DEPTH, GhostBasiliskSoulDepth); //SOUL_DEPTH 29.0F
        builder.skill(SkillList.WEAPONLESS_FIGHTING, GhostBasiliskWeaponlessFighting);//WEAPONLESS_FIGHTING 85.0F
        builder.skill(SkillList.GROUP_FIGHTING, GhostBasiliskGroupFighting);//FIGHTING 80.0F

        builder.baseCombatRating(GhostBasiliskBaseCombatRating);//70.0F
        builder.combatDamageType((byte) GhostBasiliskCombatDamageType); //2 int
        builder.alignment(GhostBasiliskAlignment);//100.0f
        builder.sizeModifier(GhostBasiliskSizeX, GhostBasiliskSizeY, GhostBasiliskSizeZ);
        if (BasiliskEggLayer) { builder.eggLayer(templateId); }
        builder.kickDamString(GhostBasiliskKickDamString);//wingbuff
        builder.headbuttDamString(GhostBasiliskHeadbuttDamString);//tailwhip
        builder.armourType(GhostBasiliskArmourType);//9 int
        builder.setCombatMoves(GhostBasiliskCombatMoves);//1, 2, 6
        builder.maxPopulationOfCreatures(GhostBasiliskMaxPop);

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
                vehicle.setSeatOffset(0, 0.0F, 0.0F, GhostBasiliskZaxisOffset);//-0.01F
                vehicle.setCreature(true);
                vehicle.setSkillNeeded(GhostBasiliskVehicleSkill);//35.0F
                vehicle.setName(creature.getName());
                vehicle.setMaxDepth(GhostBasiliskVehicleDepth);//-0.7F
                vehicle.setMaxHeightDiff(GhostBasiliskSetMaxHeightDiff);
                vehicle.setMaxSpeed(GhostBasiliskVehicleSpeed);//80.0F
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
        if (GhostBasiliskEnabled) {

            if (GhostBasiliskSpawnTree) {
                new EncounterBuilder(Tiles.Tile.TILE_TREE.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (GhostBasiliskSpawnSteppe) {
                new EncounterBuilder(Tiles.Tile.TILE_STEPPE.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (GhostBasiliskSpawnGrass) {
                new EncounterBuilder(Tiles.Tile.TILE_GRASS.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (GhostBasiliskSpawnTundra) {
                new EncounterBuilder(Tiles.Tile.TILE_TUNDRA.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (GhostBasiliskSpawnDirt) {
                new EncounterBuilder(Tiles.Tile.TILE_DIRT.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (GhostBasiliskSpawnSand) {
                new EncounterBuilder(Tiles.Tile.TILE_SAND.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (GhostBasiliskSpawnSnow) {
                new EncounterBuilder(Tiles.Tile.TILE_SNOW.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (GhostBasiliskSpawnMarsh) {
                new EncounterBuilder(Tiles.Tile.TILE_MARSH.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (GhostBasiliskSpawnCave) {
                new EncounterBuilder(Tiles.Tile.TILE_CAVE.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (GhostBasiliskSpawnPeat) {
                new EncounterBuilder(Tiles.Tile.TILE_PEAT.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
        }
    }
}