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

public class RedBasilisk implements ModCreature, CreatureTypes {
    public static int templateId;
    /**
     * Create the red basilisk with settings below
     */
    @Override
    public CreatureTemplateBuilder createCreateTemplateBuilder() {
        final int[] types = (RedBasiliskCreatureTypes);//0, 4, 9, 12, 14, 27, 30, 32, 41, 43, 62 int
        final CreatureTemplateBuilder builder = new CreatureTemplateBuilder(
                "mod.creature.RedBasilisk", "Red Basilisk", RedBasiliskDesc/*This docile red basilisk looks happy as it sits ready to ride.*/,
                "model.creature.basilisk.red",
                types, (byte) 1,
                (short) RedBasiliskVision/* 3 */,
                (byte) 0,
                (short) 180, (short) 50, (short) 250,
                "sound.death.dragon", "sound.death.dragon", "sound.combat.hit.dragon", "sound.combat.hit.dragon",
                RedBasiliskNaturalArmour/* 1.0F */, RedBasiliskHandDamage/* 20.0F */, RedBasiliskKickDamage/* 26.0F */, RedBasiliskBiteDamage/* 56.0F */, RedBasiliskHeadDamage/* 58.0F */, RedBasiliskBreathDamage/* 0.0F */,
                RedBasiliskMoveSpeed/* 4.0F */,
                RedBasiliskMoveRate/* 10 */,
                RedBasiliskItemsButchered,
                RedBasiliskMaxHuntRange/* 5 */,
                RedBasiliskAggression/* 0 */,
                ItemMaterials.MATERIAL_MEAT_DRAGON
        );
        templateId = builder.getTemplateId();

        builder.skill(SkillList.BODY_STRENGTH, RedBasiliskBodyStrength);//BODY_STRENGTH 50.0F
        builder.skill(SkillList.BODY_CONTROL, RedBasiliskBodyControl);//BODY_CONTROL 75.0F
        builder.skill(SkillList.BODY_STAMINA, RedBasiliskBodyStamina);//BODY_STAMINA 70.0F
        builder.skill(SkillList.MIND_LOGICAL, RedBasiliskMindLogic);//MIND_LOGICAL 27.0F
        builder.skill(SkillList.MIND_SPEED, RedBasiliskMindSpeed);//MIND_SPEED 37.0F
        builder.skill(SkillList.SOUL_STRENGTH, RedBasiliskSoulStrength); //SOUL_STRENGTH 55.0F
        builder.skill(SkillList.SOUL_DEPTH, RedBasiliskSoulDepth); //SOUL_DEPTH 29.0F
        builder.skill(SkillList.WEAPONLESS_FIGHTING, RedBasiliskWeaponlessFighting);//WEAPONLESS_FIGHTING 85.0F
        builder.skill(SkillList.GROUP_FIGHTING, RedBasiliskGroupFighting);//FIGHTING 80.0F

        builder.baseCombatRating(RedBasiliskBaseCombatRating);//70.0F
        builder.combatDamageType((byte) RedBasiliskCombatDamageType); //2 int
        builder.alignment(RedBasiliskAlignment);//100.0f
        builder.sizeModifier(RedBasiliskSizeX, RedBasiliskSizeY, RedBasiliskSizeZ);
        if (BasiliskEggLayer) { builder.eggLayer(templateId); }
        builder.kickDamString(RedBasiliskKickDamString);//wingbuff
        builder.headbuttDamString(RedBasiliskHeadbuttDamString);//tailwhip
        builder.armourType(RedBasiliskArmourType);//9 int
        builder.setCombatMoves(RedBasiliskCombatMoves);//1, 2, 6
        builder.maxPopulationOfCreatures(RedBasiliskMaxPop);

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
                vehicle.setSeatOffset(0, 0.0F, 0.0F, RedBasiliskZaxisOffset);//-0.01F
                vehicle.setCreature(true);
                vehicle.setSkillNeeded(RedBasiliskVehicleSkill);//35.0F
                vehicle.setName(creature.getName());
                vehicle.setMaxDepth(RedBasiliskVehicleDepth);//-0.7F
                vehicle.setMaxHeightDiff(RedBasiliskSetMaxHeightDiff);
                vehicle.setMaxSpeed(RedBasiliskVehicleSpeed);//80.0F
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
        if (RedBasiliskEnabled) {

            if (RedBasiliskSpawnTree) {
                new EncounterBuilder(Tiles.Tile.TILE_TREE.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (RedBasiliskSpawnSteppe) {
                new EncounterBuilder(Tiles.Tile.TILE_STEPPE.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (RedBasiliskSpawnGrass) {
                new EncounterBuilder(Tiles.Tile.TILE_GRASS.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (RedBasiliskSpawnTundra) {
                new EncounterBuilder(Tiles.Tile.TILE_TUNDRA.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (RedBasiliskSpawnDirt) {
                new EncounterBuilder(Tiles.Tile.TILE_DIRT.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (RedBasiliskSpawnSand) {
                new EncounterBuilder(Tiles.Tile.TILE_SAND.id)
                        .addCreatures(templateId, 1
                        ).build(1);
            }
            if (RedBasiliskSpawnSnow) {
                new EncounterBuilder(Tiles.Tile.TILE_SNOW.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (RedBasiliskSpawnMarsh) {
                new EncounterBuilder(Tiles.Tile.TILE_MARSH.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (RedBasiliskSpawnCave) {
                new EncounterBuilder(Tiles.Tile.TILE_CAVE.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (RedBasiliskSpawnPeat) {
                new EncounterBuilder(Tiles.Tile.TILE_PEAT.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
        }
    }
}