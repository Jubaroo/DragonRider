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

public class GreenBasilisk implements ModCreature, CreatureTypes {
    public static int templateId;
    /**
     * Create the green basilisk with settings below
     */
    @Override
    public CreatureTemplateBuilder createCreateTemplateBuilder() {
        final int[] types = (GreenBasiliskCreatureTypes);//0, 4, 9, 12, 14, 27, 30, 32, 41, 43, 62 int
        final CreatureTemplateBuilder builder = new CreatureTemplateBuilder(
                "mod.creature.GreenBasilisk", "Green Basilisk", GreenBasiliskDesc/*This docile green basilisk looks happy as it sits ready to ride.*/,
                "model.creature.basilisk.green",
                types, (byte) 1,
                (short) GreenBasiliskVision/* 3 */,
                (byte) 0,
                (short) 180, (short) 50, (short) 250,
                "sound.death.dragon", "sound.death.dragon", "sound.combat.hit.dragon", "sound.combat.hit.dragon",
                GreenBasiliskNaturalArmour/* 1.0F */, GreenBasiliskHandDamage/* 20.0F */, GreenBasiliskKickDamage/* 26.0F */, GreenBasiliskBiteDamage/* 56.0F */, GreenBasiliskHeadDamage/* 58.0F */, GreenBasiliskBreathDamage/* 0.0F */,
                GreenBasiliskMoveSpeed/* 4.0F */,
                GreenBasiliskMoveRate/* 10 */,
                GreenBasiliskItemsButchered,
                GreenBasiliskMaxHuntRange/* 5 */,
                GreenBasiliskAggression/* 0 */,
                ItemMaterials.MATERIAL_MEAT_DRAGON
        );
        templateId = builder.getTemplateId();

        builder.skill(SkillList.BODY_STRENGTH, GreenBasiliskBodyStrength);//BODY_STRENGTH 50.0F
        builder.skill(SkillList.BODY_CONTROL, GreenBasiliskBodyControl);//BODY_CONTROL 75.0F
        builder.skill(SkillList.BODY_STAMINA, GreenBasiliskBodyStamina);//BODY_STAMINA 70.0F
        builder.skill(SkillList.MIND_LOGICAL, GreenBasiliskMindLogic);//MIND_LOGICAL 27.0F
        builder.skill(SkillList.MIND_SPEED, GreenBasiliskMindSpeed);//MIND_SPEED 37.0F
        builder.skill(SkillList.SOUL_STRENGTH, GreenBasiliskSoulStrength); //SOUL_STRENGTH 55.0F
        builder.skill(SkillList.SOUL_DEPTH, GreenBasiliskSoulDepth); //SOUL_DEPTH 29.0F
        builder.skill(SkillList.WEAPONLESS_FIGHTING, GreenBasiliskWeaponlessFighting);//WEAPONLESS_FIGHTING 85.0F
        builder.skill(SkillList.GROUP_FIGHTING, GreenBasiliskGroupFighting);//FIGHTING 80.0F

        builder.baseCombatRating(GreenBasiliskBaseCombatRating);//70.0F
        builder.combatDamageType((byte) GreenBasiliskCombatDamageType); //2 int
        builder.alignment(GreenBasiliskAlignment);//100.0f
        builder.sizeModifier(GreenBasiliskSizeX, GreenBasiliskSizeY, GreenBasiliskSizeZ);
        if (BasiliskEggLayer) { builder.eggLayer(templateId); }
        builder.kickDamString(GreenBasiliskKickDamString);//wingbuff
        builder.headbuttDamString(GreenBasiliskHeadbuttDamString);//tailwhip
        builder.armourType(GreenBasiliskArmourType);//9 int
        builder.setCombatMoves(GreenBasiliskCombatMoves);//1, 2, 6
        builder.maxPopulationOfCreatures(GreenBasiliskMaxPop);

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
                vehicle.setSeatOffset(0, 0.0F, 0.0F, GreenBasiliskZaxisOffset);//-0.01F
                vehicle.setCreature(true);
                vehicle.setSkillNeeded(GreenBasiliskVehicleSkill);//35.0F
                vehicle.setName(creature.getName());
                vehicle.setMaxDepth(GreenBasiliskVehicleDepth);//-0.7F
                vehicle.setMaxHeightDiff(GreenBasiliskSetMaxHeightDiff);
                vehicle.setMaxSpeed(GreenBasiliskVehicleSpeed);//80.0F
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
        if (GreenBasiliskEnabled) {

            if (GreenBasiliskSpawnTree) {
                new EncounterBuilder(Tiles.Tile.TILE_TREE.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (GreenBasiliskSpawnSteppe) {
                new EncounterBuilder(Tiles.Tile.TILE_STEPPE.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (GreenBasiliskSpawnGrass) {
                new EncounterBuilder(Tiles.Tile.TILE_GRASS.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (GreenBasiliskSpawnTundra) {
                new EncounterBuilder(Tiles.Tile.TILE_TUNDRA.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (GreenBasiliskSpawnDirt) {
                new EncounterBuilder(Tiles.Tile.TILE_DIRT.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (GreenBasiliskSpawnSand) {
                new EncounterBuilder(Tiles.Tile.TILE_SAND.id)
                        .addCreatures(templateId, 1
                        ).build(1);
            }
            if (GreenBasiliskSpawnSnow) {
                new EncounterBuilder(Tiles.Tile.TILE_SNOW.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (GreenBasiliskSpawnMarsh) {
                new EncounterBuilder(Tiles.Tile.TILE_MARSH.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (GreenBasiliskSpawnCave) {
                new EncounterBuilder(Tiles.Tile.TILE_CAVE.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (GreenBasiliskSpawnPeat) {
                new EncounterBuilder(Tiles.Tile.TILE_PEAT.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
        }
    }
}