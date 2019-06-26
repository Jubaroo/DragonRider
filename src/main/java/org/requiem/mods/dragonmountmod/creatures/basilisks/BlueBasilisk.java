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

public class BlueBasilisk implements ModCreature, CreatureTypes {
    public static int templateId;

    /**
     * Create the blue basilisk with settings below
     */
    @Override
    public CreatureTemplateBuilder createCreateTemplateBuilder() {
        final int[] types = (Constants.BlueBasiliskCreatureTypes);//0, 4, 9, 12, 14, 27, 30, 32, 41, 43, 62 int
        final CreatureTemplateBuilder builder = new CreatureTemplateBuilder(
                "mod.creature.basilisk.blue", "Blue Basilisk", Constants.BlueBasiliskDesc/*This docile blue basilisk looks happy as it sits ready to ride.*/,
                "model.creature.dragon.blue",
                types, BodyTemplate.TYPE_DRAGON,
                (short) Constants.BlueBasiliskVision/* 3 */,
                MiscConstants.SEX_MALE,
                (short) 280, (short)210, (short)666,
                "sound.death.dragon", "sound.death.dragon", "sound.combat.hit.dragon", "sound.combat.hit.dragon",
                Constants.BlueBasiliskNaturalArmour/* 1.0F */, Constants.BlueBasiliskHandDamage/* 20.0F */, Constants.BlueBasiliskKickDamage/* 26.0F */, Constants.BlueBasiliskBiteDamage/* 56.0F */, Constants.BlueBasiliskHeadDamage/* 58.0F */, Constants.BlueBasiliskBreathDamage/* 0.0F */,
                Constants.BlueBasiliskMoveSpeed/* 4.0F */,
                Constants.BlueBasiliskMoveRate/* 10 */,
                Constants.BlueBasiliskItemsButchered,
                Constants.BlueBasiliskMaxHuntRange/* 5 */,
                Constants.BlueBasiliskAggression/* 0 */,
                ItemMaterials.MATERIAL_MEAT_DRAGON
        );
        templateId = builder.getTemplateId();

        builder.skill(SkillList.BODY_STRENGTH, Constants.BlueBasiliskBodyStrength);//BODY_STRENGTH 50.0F
        builder.skill(SkillList.BODY_CONTROL, Constants.BlueBasiliskBodyControl);//BODY_CONTROL 75.0F
        builder.skill(SkillList.BODY_STAMINA, Constants.BlueBasiliskBodyStamina);//BODY_STAMINA 70.0F
        builder.skill(SkillList.MIND_LOGICAL, Constants.BlueBasiliskMindLogic);//MIND_LOGICAL 27.0F
        builder.skill(SkillList.MIND_SPEED, Constants.BlueBasiliskMindSpeed);//MIND_SPEED 37.0F
        builder.skill(SkillList.SOUL_STRENGTH, Constants.BlueBasiliskSoulStrength); //SOUL_STRENGTH 55.0F
        builder.skill(SkillList.SOUL_DEPTH, Constants.BlueBasiliskSoulDepth); //SOUL_DEPTH 29.0F
        builder.skill(SkillList.WEAPONLESS_FIGHTING, Constants.BlueBasiliskWeaponlessFighting);//WEAPONLESS_FIGHTING 85.0F
        builder.skill(SkillList.GROUP_FIGHTING, Constants.BlueBasiliskGroupFighting);//FIGHTING 80.0F

        builder.baseCombatRating(Constants.BlueBasiliskBaseCombatRating);//70.0F
        builder.combatDamageType((byte) Constants.BlueBasiliskCombatDamageType); //2 int
        builder.alignment(Constants.BlueBasiliskAlignment);//100.0f
        builder.sizeModifier(Constants.BlueBasiliskSizeX, Constants.BlueBasiliskSizeY, Constants.BlueBasiliskSizeZ);
        if (Constants.BasiliskEggLayer) { builder.eggLayer(templateId); }
        builder.kickDamString(Constants.BlueBasiliskKickDamString);//wingbuff
        builder.headbuttDamString(Constants.BlueBasiliskHeadbuttDamString);//tailwhip
        builder.armourType(Constants.BlueBasiliskArmourType);//9 int
        builder.setCombatMoves(Constants.BlueBasiliskCombatMoves);//1, 2, 6
        builder.maxPopulationOfCreatures(Constants.BlueBasiliskMaxPop);
        builder.maxAge(Constants.BlueBasiliskMaxAge);

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
                vehicle.setSeatOffset(0, 0.0F, 0.0F, Constants.BlueBasiliskZAxisOffset);//-0.01F
                vehicle.setCreature(true);
                vehicle.setSkillNeeded(Constants.BlueBasiliskVehicleSkill);//35.0F
                vehicle.setName(creature.getName());
                vehicle.setMaxDepth(Constants.BlueBasiliskVehicleDepth);//-0.7F
                vehicle.setMaxHeightDiff(Constants.BlueBasiliskSetMaxHeightDiff);
                vehicle.setMaxSpeed(Constants.BlueBasiliskVehicleSpeed);//80.0F
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
        if (Constants.BlueBasiliskEnabled) {

            if (Constants.BlueBasiliskSpawnTree) {
                new EncounterBuilder(Tiles.Tile.TILE_TREE.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (Constants.BlueBasiliskSpawnSteppe) {
                new EncounterBuilder(Tiles.Tile.TILE_STEPPE.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (Constants.BlueBasiliskSpawnGrass) {
                new EncounterBuilder(Tiles.Tile.TILE_GRASS.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (Constants.BlueBasiliskSpawnTundra) {
                new EncounterBuilder(Tiles.Tile.TILE_TUNDRA.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (Constants.BlueBasiliskSpawnDirt) {
                new EncounterBuilder(Tiles.Tile.TILE_DIRT.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (Constants.BlueBasiliskSpawnSand) {
                new EncounterBuilder(Tiles.Tile.TILE_SAND.id)
                        .addCreatures(templateId, 1
                        ).build(1);
            }
            if (Constants.BlueBasiliskSpawnSnow) {
                new EncounterBuilder(Tiles.Tile.TILE_SNOW.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (Constants.BlueBasiliskSpawnMarsh) {
                new EncounterBuilder(Tiles.Tile.TILE_MARSH.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (Constants.BlueBasiliskSpawnCave) {
                new EncounterBuilder(Tiles.Tile.TILE_CAVE.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
            if (Constants.BlueBasiliskSpawnPeat) {
                new EncounterBuilder(Tiles.Tile.TILE_PEAT.id)
                        .addCreatures(templateId, 1)
                        .build(1);
            }
        }
    }
}