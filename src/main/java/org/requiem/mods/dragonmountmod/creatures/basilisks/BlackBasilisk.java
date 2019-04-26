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

public class BlackBasilisk implements ModCreature, CreatureTypes {
    public static int templateId;

    /**
     * Create the black basilisk with settings below
     */
    @Override
    public CreatureTemplateBuilder createCreateTemplateBuilder() {
        final int[] types = (BlackBasiliskCreatureTypes);//0, 4, 9, 12, 14, 27, 30, 32, 41, 43, 62 int
        final CreatureTemplateBuilder builder = new CreatureTemplateBuilder(
                "mod.creature.BlackBasilisk", "Black Basilisk", BlackBasiliskDesc/*This docile black basilisk looks happy as it sits ready to ride.*/,
                "model.creature.basilisk.black",
                types, (byte) 1,
                (short) BlackBasiliskVision/* 3 */,
                (byte) 0,
                (short) 180, (short) 50, (short) 250,
                "sound.death.dragon", "sound.death.dragon", "sound.combat.hit.dragon", "sound.combat.hit.dragon",
                BlackBasiliskNaturalArmour/* 1.0F */, BlackBasiliskHandDamage/* 20.0F */, BlackBasiliskKickDamage/* 26.0F */, BlackBasiliskBiteDamage/* 56.0F */, BlackBasiliskHeadDamage/* 58.0F */, BlackBasiliskBreathDamage/* 0.0F */,
                BlackBasiliskMoveSpeed/* 4.0F */,
                BlackBasiliskMoveRate/* 10 */,
                BlackBasiliskItemsButchered,
                BlackBasiliskMaxHuntRange/* 5 */,
                BlackBasiliskAggression/* 0 */,
                ItemMaterials.MATERIAL_MEAT_DRAGON
        );
        templateId = builder.getTemplateId();

        builder.skill(SkillList.BODY_STRENGTH, BlackBasiliskBodyStrength);//BODY_STRENGTH 50.0F
        builder.skill(SkillList.BODY_CONTROL, BlackBasiliskBodyControl);//BODY_CONTROL 75.0F
        builder.skill(SkillList.BODY_STAMINA, BlackBasiliskBodyStamina);//BODY_STAMINA 70.0F
        builder.skill(SkillList.MIND_LOGICAL, BlackBasiliskMindLogic);//MIND_LOGICAL 27.0F
        builder.skill(SkillList.MIND_SPEED, BlackBasiliskMindSpeed);//MIND_SPEED 37.0F
        builder.skill(SkillList.SOUL_STRENGTH, BlackBasiliskSoulStrength); //SOUL_STRENGTH 55.0F
        builder.skill(SkillList.SOUL_DEPTH, BlackBasiliskSoulDepth); //SOUL_DEPTH 29.0F
        builder.skill(SkillList.WEAPONLESS_FIGHTING, BlackBasiliskWeaponlessFighting);//WEAPONLESS_FIGHTING 85.0F
        builder.skill(SkillList.GROUP_FIGHTING, BlackBasiliskGroupFighting);//FIGHTING 80.0F

        builder.baseCombatRating(BlackBasiliskBaseCombatRating);//70.0F
        builder.combatDamageType((byte) BlackBasiliskCombatDamageType); //2 int
        builder.alignment(BlackBasiliskAlignment);//100.0f
        builder.sizeModifier(BlackBasiliskSizeX, BlackBasiliskSizeY, BlackBasiliskSizeZ);
        if (BasiliskEggLayer) { builder.eggLayer(templateId); }
        builder.kickDamString(BlackBasiliskKickDamString);//wingbuff
        builder.headbuttDamString(BlackBasiliskHeadbuttDamString);//tailwhip
        builder.armourType(BlackBasiliskArmourType);//9 int
        builder.setCombatMoves(BlackBasiliskCombatMoves);//1, 2, 6
        builder.maxPopulationOfCreatures(BlackBasiliskMaxPop);

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
                vehicle.setSeatOffset(0, 0.0F, 0.0F, BlackBasiliskZaxisOffset);//-0.01F
                vehicle.setCreature(true);
                vehicle.setSkillNeeded(BlackBasiliskVehicleSkill);//35.0F
                vehicle.setName(creature.getName());
                vehicle.setMaxDepth(BlackBasiliskVehicleDepth);//-0.7F
                vehicle.setMaxHeightDiff(BlackBasiliskSetMaxHeightDiff);
                vehicle.setMaxSpeed(BlackBasiliskVehicleSpeed);//80.0F
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
        if (BlackBasiliskEnabled) {
            if (BlackBasiliskSpawnTree) {
                new EncounterBuilder(Tiles.Tile.TILE_TREE.id).addCreatures(templateId, 1).build(1);
            }
            if (BlackBasiliskSpawnSteppe) {
                new EncounterBuilder(Tiles.Tile.TILE_STEPPE.id).addCreatures(templateId, 1).build(1);
            }
            if (BlackBasiliskSpawnGrass) {
                new EncounterBuilder(Tiles.Tile.TILE_GRASS.id).addCreatures(templateId, 1).build(1);
            }
            if (BlackBasiliskSpawnTundra) {
                new EncounterBuilder(Tiles.Tile.TILE_TUNDRA.id).addCreatures(templateId, 1).build(1);
            }
            if (BlackBasiliskSpawnDirt) {
                new EncounterBuilder(Tiles.Tile.TILE_DIRT.id).addCreatures(templateId, 1).build(1);
            }
            if (BlackBasiliskSpawnSand) {
                new EncounterBuilder(Tiles.Tile.TILE_SAND.id).addCreatures(templateId, 1).build(1);
            }
            if (BlackBasiliskSpawnSnow) {
                new EncounterBuilder(Tiles.Tile.TILE_SNOW.id).addCreatures(templateId, 1).build(1);
            }
            if (BlackBasiliskSpawnMarsh) {
                new EncounterBuilder(Tiles.Tile.TILE_MARSH.id).addCreatures(templateId, 1).build(1);
            }
            if (BlackBasiliskSpawnCave) {
                new EncounterBuilder(Tiles.Tile.TILE_CAVE.id).addCreatures(templateId, 1).build(1);
            }
            if (BlackBasiliskSpawnPeat) {
                new EncounterBuilder(Tiles.Tile.TILE_PEAT.id).addCreatures(templateId, 1).build(1);
            }
        }
    }
}