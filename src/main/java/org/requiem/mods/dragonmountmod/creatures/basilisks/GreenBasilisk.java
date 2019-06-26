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

public class GreenBasilisk implements ModCreature, CreatureTypes {
    public static int templateId;
    /**
     * Create the green basilisk with settings below
     */
    @Override
    public CreatureTemplateBuilder createCreateTemplateBuilder() {
        final int[] types = (Constants.GreenBasiliskCreatureTypes);//0, 4, 9, 12, 14, 27, 30, 32, 41, 43, 62 int
        final CreatureTemplateBuilder builder = new CreatureTemplateBuilder(
                "mod.creature.basilisk.green", "Green Basilisk", Constants.GreenBasiliskDesc/*This docile green basilisk looks happy as it sits ready to ride.*/,
                "model.creature.dragon.green",
                types, BodyTemplate.TYPE_DRAGON,
                (short) Constants.GreenBasiliskVision/* 3 */,
                MiscConstants.SEX_MALE,
                (short) 280, (short)210, (short)666,
                "sound.death.dragon", "sound.death.dragon", "sound.combat.hit.dragon", "sound.combat.hit.dragon",
                Constants.GreenBasiliskNaturalArmour/* 1.0F */, Constants.GreenBasiliskHandDamage/* 20.0F */, Constants.GreenBasiliskKickDamage/* 26.0F */, Constants.GreenBasiliskBiteDamage/* 56.0F */, Constants.GreenBasiliskHeadDamage/* 58.0F */, Constants.GreenBasiliskBreathDamage/* 0.0F */,
                Constants.GreenBasiliskMoveSpeed/* 4.0F */,
                Constants.GreenBasiliskMoveRate/* 10 */,
                Constants.GreenBasiliskItemsButchered,
                Constants.GreenBasiliskMaxHuntRange/* 5 */,
                Constants.GreenBasiliskAggression/* 0 */,
                ItemMaterials.MATERIAL_MEAT_DRAGON
        );
        templateId = builder.getTemplateId();

        builder.skill(SkillList.BODY_STRENGTH, Constants.GreenBasiliskBodyStrength);//BODY_STRENGTH 50.0F
        builder.skill(SkillList.BODY_CONTROL, Constants.GreenBasiliskBodyControl);//BODY_CONTROL 75.0F
        builder.skill(SkillList.BODY_STAMINA, Constants.GreenBasiliskBodyStamina);//BODY_STAMINA 70.0F
        builder.skill(SkillList.MIND_LOGICAL, Constants.GreenBasiliskMindLogic);//MIND_LOGICAL 27.0F
        builder.skill(SkillList.MIND_SPEED, Constants.GreenBasiliskMindSpeed);//MIND_SPEED 37.0F
        builder.skill(SkillList.SOUL_STRENGTH, Constants.GreenBasiliskSoulStrength); //SOUL_STRENGTH 55.0F
        builder.skill(SkillList.SOUL_DEPTH, Constants.GreenBasiliskSoulDepth); //SOUL_DEPTH 29.0F
        builder.skill(SkillList.WEAPONLESS_FIGHTING, Constants.GreenBasiliskWeaponlessFighting);//WEAPONLESS_FIGHTING 85.0F
        builder.skill(SkillList.GROUP_FIGHTING, Constants.GreenBasiliskGroupFighting);//FIGHTING 80.0F

        builder.baseCombatRating(Constants.GreenBasiliskBaseCombatRating);//70.0F
        builder.combatDamageType((byte) Constants.GreenBasiliskCombatDamageType); //2 int
        builder.alignment(Constants.GreenBasiliskAlignment);//100.0f
        builder.sizeModifier(Constants.GreenBasiliskSizeX, Constants.GreenBasiliskSizeY, Constants.GreenBasiliskSizeZ);
        if (Constants.BasiliskEggLayer) { builder.eggLayer(templateId); }
        builder.kickDamString(Constants.GreenBasiliskKickDamString);//wingbuff
        builder.headbuttDamString(Constants.GreenBasiliskHeadbuttDamString);//tailwhip
        builder.armourType(Constants.GreenBasiliskArmourType);//9 int
        builder.setCombatMoves(Constants.GreenBasiliskCombatMoves);//1, 2, 6
        builder.maxPopulationOfCreatures(Constants.GreenBasiliskMaxPop);
        builder.maxAge(Constants.GreenBasiliskMaxAge);

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
                vehicle.setSeatOffset(0, 0.0F, 0.0F, Constants.GreenBasiliskZAxisOffset);//-0.01F
                vehicle.setCreature(true);
                vehicle.setSkillNeeded(Constants.GreenBasiliskVehicleSkill);//35.0F
                vehicle.setName(creature.getName());
                vehicle.setMaxDepth(Constants.GreenBasiliskVehicleDepth);//-0.7F
                vehicle.setMaxHeightDiff(Constants.GreenBasiliskSetMaxHeightDiff);
                vehicle.setMaxSpeed(Constants.GreenBasiliskVehicleSpeed);//80.0F
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
        if (Constants.GreenBasiliskEnabled) {

            if (Constants.GreenBasiliskSpawnTree) {
                new EncounterBuilder(Tiles.Tile.TILE_TREE.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (Constants.GreenBasiliskSpawnSteppe) {
                new EncounterBuilder(Tiles.Tile.TILE_STEPPE.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (Constants.GreenBasiliskSpawnGrass) {
                new EncounterBuilder(Tiles.Tile.TILE_GRASS.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (Constants.GreenBasiliskSpawnTundra) {
                new EncounterBuilder(Tiles.Tile.TILE_TUNDRA.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (Constants.GreenBasiliskSpawnDirt) {
                new EncounterBuilder(Tiles.Tile.TILE_DIRT.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (Constants.GreenBasiliskSpawnSand) {
                new EncounterBuilder(Tiles.Tile.TILE_SAND.id)
                        .addCreatures(templateId, 1
                        ).build(1);
            }
            if (Constants.GreenBasiliskSpawnSnow) {
                new EncounterBuilder(Tiles.Tile.TILE_SNOW.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (Constants.GreenBasiliskSpawnMarsh) {
                new EncounterBuilder(Tiles.Tile.TILE_MARSH.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (Constants.GreenBasiliskSpawnCave) {
                new EncounterBuilder(Tiles.Tile.TILE_CAVE.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (Constants.GreenBasiliskSpawnPeat) {
                new EncounterBuilder(Tiles.Tile.TILE_PEAT.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
        }
    }
}