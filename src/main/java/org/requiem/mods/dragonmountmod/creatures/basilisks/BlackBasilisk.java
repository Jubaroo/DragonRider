package org.requiem.mods.dragonmountmod.creatures.basilisks;

import com.wurmonline.mesh.Tiles;
import com.wurmonline.server.MiscConstants;
import com.wurmonline.server.behaviours.Vehicle;
import com.wurmonline.server.bodys.BodyTemplate;
import com.wurmonline.server.creatures.Creature;
import com.wurmonline.server.items.Item;
import com.wurmonline.server.skills.SkillList;
import com.wurmonline.shared.constants.CreatureTypes;
import com.wurmonline.shared.constants.ItemMaterials;
import com.wurmonline.shared.constants.ProtoConstants;
import org.gotti.wurmunlimited.modsupport.CreatureTemplateBuilder;
import org.gotti.wurmunlimited.modsupport.creatures.EncounterBuilder;
import org.gotti.wurmunlimited.modsupport.creatures.ModCreature;
import org.gotti.wurmunlimited.modsupport.vehicles.ModVehicleBehaviour;
import org.gotti.wurmunlimited.modsupport.vehicles.VehicleFacade;
import org.requiem.mods.dragonmountmod.Constants;

public class BlackBasilisk implements ModCreature, CreatureTypes {
    public static int templateId;

    /**
     * Create the black basilisk with settings below
     */
    @Override
    public CreatureTemplateBuilder createCreateTemplateBuilder() {
        final int[] types = (Constants.BlackBasiliskCreatureTypes);//0, 4, 9, 12, 14, 27, 30, 32, 41, 43, 62 int
        final CreatureTemplateBuilder builder = new CreatureTemplateBuilder(
                "mod.creature.basilisk.black", "Black Basilisk", Constants.BlackBasiliskDesc/*This docile black basilisk looks happy as it sits ready to ride.*/,
                "model.creature.dragon.black",
                types, BodyTemplate.TYPE_DRAGON,
                (short) Constants.BlackBasiliskVision/* 3 */,
                MiscConstants.SEX_MALE,
                (short) 280, (short)210, (short)666,
                "sound.death.dragon", "sound.death.dragon", "sound.combat.hit.dragon", "sound.combat.hit.dragon",
                Constants.BlackBasiliskNaturalArmour/* 1.0F */, Constants.BlackBasiliskHandDamage/* 20.0F */, Constants.BlackBasiliskKickDamage/* 26.0F */, Constants.BlackBasiliskBiteDamage/* 56.0F */, Constants.BlackBasiliskHeadDamage/* 58.0F */, Constants.BlackBasiliskBreathDamage/* 0.0F */,
                Constants.BlackBasiliskMoveSpeed/* 4.0F */,
                Constants.BlackBasiliskMoveRate/* 10 */,
                Constants.BlackBasiliskItemsButchered,
                Constants.BlackBasiliskMaxHuntRange/* 5 */,
                Constants.BlackBasiliskAggression/* 0 */,
                ItemMaterials.MATERIAL_MEAT_DRAGON
        );
        templateId = builder.getTemplateId();

        builder.skill(SkillList.BODY_STRENGTH, Constants.BlackBasiliskBodyStrength);//BODY_STRENGTH 50.0F
        builder.skill(SkillList.BODY_CONTROL, Constants.BlackBasiliskBodyControl);//BODY_CONTROL 75.0F
        builder.skill(SkillList.BODY_STAMINA, Constants.BlackBasiliskBodyStamina);//BODY_STAMINA 70.0F
        builder.skill(SkillList.MIND_LOGICAL, Constants.BlackBasiliskMindLogic);//MIND_LOGICAL 27.0F
        builder.skill(SkillList.MIND_SPEED, Constants.BlackBasiliskMindSpeed);//MIND_SPEED 37.0F
        builder.skill(SkillList.SOUL_STRENGTH, Constants.BlackBasiliskSoulStrength); //SOUL_STRENGTH 55.0F
        builder.skill(SkillList.SOUL_DEPTH, Constants.BlackBasiliskSoulDepth); //SOUL_DEPTH 29.0F
        builder.skill(SkillList.WEAPONLESS_FIGHTING, Constants.BlackBasiliskWeaponlessFighting);//WEAPONLESS_FIGHTING 85.0F
        builder.skill(SkillList.GROUP_FIGHTING, Constants.BlackBasiliskGroupFighting);//FIGHTING 80.0F

        builder.baseCombatRating(Constants.BlackBasiliskBaseCombatRating);//70.0F
        builder.combatDamageType((byte) Constants.BlackBasiliskCombatDamageType); //2 int
        builder.alignment(Constants.BlackBasiliskAlignment);//100.0f
        builder.sizeModifier(Constants.BlackBasiliskSizeX, Constants.BlackBasiliskSizeY, Constants.BlackBasiliskSizeZ);
        if (Constants.BasiliskEggLayer) { builder.eggLayer(templateId); }
        builder.kickDamString(Constants.BlackBasiliskKickDamString);//wingbuff
        builder.headbuttDamString(Constants.BlackBasiliskHeadbuttDamString);//tailwhip
        builder.armourType(Constants.BlackBasiliskArmourType);//9 int
        builder.setCombatMoves(Constants.BlackBasiliskCombatMoves);//1, 2, 6
        builder.maxPopulationOfCreatures(Constants.BlackBasiliskMaxPop);
        builder.maxAge(Constants.BlackBasiliskMaxAge);

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
                vehicle.setSeatOffset(0, 0.0F, 0.0F, Constants.BlackBasiliskZAxisOffset);//-0.01F
                vehicle.setCreature(true);
                vehicle.setSkillNeeded(Constants.BlackBasiliskVehicleSkill);//35.0F
                vehicle.setName(creature.getName());
                vehicle.setMaxDepth(Constants.BlackBasiliskVehicleDepth);//-0.7F
                vehicle.setMaxHeightDiff(Constants.BlackBasiliskSetMaxHeightDiff);
                vehicle.setMaxSpeed(Constants.BlackBasiliskVehicleSpeed);//80.0F
                vehicle.setCommandType(ProtoConstants.TELE_START_COMMAND_CREATURE);
                vehicle.setCanHaveEquipment(false);
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
        if (Constants.BlackBasiliskEnabled) {
            if (Constants.BlackBasiliskSpawnTree) {
                new EncounterBuilder(Tiles.Tile.TILE_TREE.id).addCreatures(templateId, 1).build(1);
            }
            if (Constants.BlackBasiliskSpawnSteppe) {
                new EncounterBuilder(Tiles.Tile.TILE_STEPPE.id).addCreatures(templateId, 1).build(1);
            }
            if (Constants.BlackBasiliskSpawnGrass) {
                new EncounterBuilder(Tiles.Tile.TILE_GRASS.id).addCreatures(templateId, 1).build(1);
            }
            if (Constants.BlackBasiliskSpawnTundra) {
                new EncounterBuilder(Tiles.Tile.TILE_TUNDRA.id).addCreatures(templateId, 1).build(1);
            }
            if (Constants.BlackBasiliskSpawnDirt) {
                new EncounterBuilder(Tiles.Tile.TILE_DIRT.id).addCreatures(templateId, 1).build(1);
            }
            if (Constants.BlackBasiliskSpawnSand) {
                new EncounterBuilder(Tiles.Tile.TILE_SAND.id).addCreatures(templateId, 1).build(1);
            }
            if (Constants.BlackBasiliskSpawnSnow) {
                new EncounterBuilder(Tiles.Tile.TILE_SNOW.id).addCreatures(templateId, 1).build(1);
            }
            if (Constants.BlackBasiliskSpawnMarsh) {
                new EncounterBuilder(Tiles.Tile.TILE_MARSH.id).addCreatures(templateId, 1).build(1);
            }
            if (Constants.BlackBasiliskSpawnCave) {
                new EncounterBuilder(Tiles.Tile.TILE_CAVE.id).addCreatures(templateId, 1).build(1);
            }
            if (Constants.BlackBasiliskSpawnPeat) {
                new EncounterBuilder(Tiles.Tile.TILE_PEAT.id).addCreatures(templateId, 1).build(1);
            }
        }
    }
}