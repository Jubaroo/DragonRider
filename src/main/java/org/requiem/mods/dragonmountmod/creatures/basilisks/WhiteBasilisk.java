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

public class WhiteBasilisk implements ModCreature, CreatureTypes {
    public static int templateId;

    /**
     * Create the white basilisk with settings below
     */
    @Override
    public CreatureTemplateBuilder createCreateTemplateBuilder() {
        final int[] types = (Constants.WhiteBasiliskCreatureTypes);//0, 4, 9, 12, 14, 27, 30, 32, 41, 43, 62 int
        final CreatureTemplateBuilder builder = new CreatureTemplateBuilder(
                "mod.creature.basilisk.white", "White Basilisk", Constants.WhiteBasiliskDesc/*This docile white basilisk looks happy as it sits ready to ride.*/,
                "model.creature.dragon.white",
                types, BodyTemplate.TYPE_DRAGON,
                (short) Constants.WhiteBasiliskVision/* 3 */,
                MiscConstants.SEX_MALE,
                (short) 280, (short)210, (short)666,
                "sound.death.dragon", "sound.death.dragon", "sound.combat.hit.dragon", "sound.combat.hit.dragon",
                Constants.WhiteBasiliskNaturalArmour/* 1.0F */, Constants.WhiteBasiliskHandDamage/* 20.0F */, Constants.WhiteBasiliskKickDamage/* 26.0F */, Constants.WhiteBasiliskBiteDamage/* 56.0F */, Constants.WhiteBasiliskHeadDamage/* 58.0F */, Constants.WhiteBasiliskBreathDamage/* 0.0F */,
                Constants.WhiteBasiliskMoveSpeed/* 4.0F */,
                Constants.WhiteBasiliskMoveRate/* 10 */,
                Constants.WhiteBasiliskItemsButchered,
                Constants.WhiteBasiliskMaxHuntRange/* 5 */,
                Constants.WhiteBasiliskAggression/* 0 */,
                ItemMaterials.MATERIAL_MEAT_DRAGON
        );
        templateId = builder.getTemplateId();

        builder.skill(SkillList.BODY_STRENGTH, Constants.WhiteBasiliskBodyStrength);//BODY_STRENGTH 50.0F
        builder.skill(SkillList.BODY_CONTROL, Constants.WhiteBasiliskBodyControl);//BODY_CONTROL 75.0F
        builder.skill(SkillList.BODY_STAMINA, Constants.WhiteBasiliskBodyStamina);//BODY_STAMINA 70.0F
        builder.skill(SkillList.MIND_LOGICAL, Constants.WhiteBasiliskMindLogic);//MIND_LOGICAL 27.0F
        builder.skill(SkillList.MIND_SPEED, Constants.WhiteBasiliskMindSpeed);//MIND_SPEED 37.0F
        builder.skill(SkillList.SOUL_STRENGTH, Constants.WhiteBasiliskSoulStrength); //SOUL_STRENGTH 55.0F
        builder.skill(SkillList.SOUL_DEPTH, Constants.WhiteBasiliskSoulDepth); //SOUL_DEPTH 29.0F
        builder.skill(SkillList.WEAPONLESS_FIGHTING, Constants.WhiteBasiliskWeaponlessFighting);//WEAPONLESS_FIGHTING 85.0F
        builder.skill(SkillList.GROUP_FIGHTING, Constants.WhiteBasiliskGroupFighting);//FIGHTING 80.0F

        builder.baseCombatRating(Constants.WhiteBasiliskBaseCombatRating);//70.0F
        builder.combatDamageType((byte) Constants.WhiteBasiliskCombatDamageType); //2 int
        builder.alignment(Constants.WhiteBasiliskAlignment);//100.0f
        builder.sizeModifier(Constants.WhiteBasiliskSizeX, Constants.WhiteBasiliskSizeY, Constants.WhiteBasiliskSizeZ);
        if (Constants.BasiliskEggLayer) { builder.eggLayer(templateId); }
        builder.kickDamString(Constants.WhiteBasiliskKickDamString);//wingbuff
        builder.headbuttDamString(Constants.WhiteBasiliskHeadbuttDamString);//tailwhip
        builder.armourType(Constants.WhiteBasiliskArmourType);//9 int
        builder.setCombatMoves(Constants.WhiteBasiliskCombatMoves);//1, 2, 6
        builder.maxPopulationOfCreatures(Constants.WhiteBasiliskMaxPop);

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
                vehicle.setSeatOffset(0, 0.0F, 0.0F, Constants.WhiteBasiliskZAxisOffset);//-0.01F
                vehicle.setCreature(true);
                vehicle.setSkillNeeded(Constants.WhiteBasiliskVehicleSkill);//35.0F
                vehicle.setName(creature.getName());
                vehicle.setMaxDepth(Constants.WhiteBasiliskVehicleDepth);//-0.7F
                vehicle.setMaxHeightDiff(Constants.WhiteBasiliskSetMaxHeightDiff);
                vehicle.setMaxSpeed(Constants.WhiteBasiliskVehicleSpeed);//80.0F
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
        if (Constants.WhiteBasiliskEnabled) {
            if (Constants.WhiteBasiliskSpawnTree) {
                new EncounterBuilder(Tiles.Tile.TILE_TREE.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (Constants.WhiteBasiliskSpawnSteppe) {
                new EncounterBuilder(Tiles.Tile.TILE_STEPPE.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (Constants.WhiteBasiliskSpawnGrass) {
                new EncounterBuilder(Tiles.Tile.TILE_GRASS.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (Constants.WhiteBasiliskSpawnTundra) {
                new EncounterBuilder(Tiles.Tile.TILE_TUNDRA.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (Constants.WhiteBasiliskSpawnDirt) {
                new EncounterBuilder(Tiles.Tile.TILE_DIRT.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (Constants.WhiteBasiliskSpawnSand) {
                new EncounterBuilder(Tiles.Tile.TILE_SAND.id)
                        .addCreatures(templateId, 1
                        ).build(1);
            }
            if (Constants.WhiteBasiliskSpawnSnow) {
                new EncounterBuilder(Tiles.Tile.TILE_SNOW.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (Constants.WhiteBasiliskSpawnMarsh) {
                new EncounterBuilder(Tiles.Tile.TILE_MARSH.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (Constants.WhiteBasiliskSpawnCave) {
                new EncounterBuilder(Tiles.Tile.TILE_CAVE.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (Constants.WhiteBasiliskSpawnPeat) {
                new EncounterBuilder(Tiles.Tile.TILE_PEAT.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
        }
    }
}