package org.requiem.mods.dragonmountmod.utilities;

import org.requiem.mods.dragonmountmod.Constants;
import org.requiem.mods.dragonmountmod.Initiator;

import java.util.Properties;

public class Config {

    public static void doConfig(Properties properties) {
        /*
          Toggle Egg Layer
         */
        Constants.DrakeEggLayer = Boolean.valueOf(properties.getProperty("Toggle_Egg_Layers", String.valueOf(Constants.DrakeEggLayer)));
        Initiator.logInfo("Toggle_Egg_Layers = " + Constants.DrakeEggLayer);
        //=====================================================================================================================================
        //======================================================== Drakes =====================================================================
        //=====================================================================================================================================
        /*
          Black Drake
         */
        //============================ MAIN ===========================
        Constants.BlackDrakeEnabled = Boolean.valueOf(properties.getProperty("Black_Drake_Enabled", String.valueOf(Constants.BlackDrakeEnabled)));
        Constants.BlackDrakeDesc = String.valueOf(properties.getProperty("Black_Drake_Desc", String.valueOf(Constants.BlackDrakeDesc)));
        Constants.BlackDrakeCreatureTypes = Initiator.getPropertyArray(String.valueOf(properties.getProperty("Black_Drake_Creature_Types")));
        //============================ SIZE ===========================
        Constants.BlackDrakeSizeX =  Integer.valueOf(properties.getProperty("Black_Drake_SizeX", String.valueOf(Constants.BlackDrakeSizeX)));
        Constants.BlackDrakeSizeY =  Integer.valueOf(properties.getProperty("Black_Drake_SizeY", String.valueOf(Constants.BlackDrakeSizeY)));
        Constants.BlackDrakeSizeZ =  Integer.valueOf(properties.getProperty("Black_Drake_SizeZ", String.valueOf(Constants.BlackDrakeSizeZ)));
        //============================ MISC ===========================
        Constants.BlackDrakeMaxPop =  Integer.valueOf(properties.getProperty("Black_Drake_Max_Population", String.valueOf(Constants.BlackDrakeMaxPop)));
        Constants.BlackDrakeMaxAge =  Integer.valueOf(properties.getProperty("Black_Drake_Max_Age", String.valueOf(Constants.BlackDrakeMaxAge)));
        Constants.BlackDrakeItemsButchered = Initiator.getPropertyArray(String.valueOf(properties.getProperty("Black_Drake_Items_Butchered")));
        Constants.BlackDrakeMoveRate =  Integer.valueOf(properties.getProperty("Black_Drake_MoveRate", String.valueOf(Constants.BlackDrakeMoveRate)));
        //============================ ATTITUDE ===========================
        Constants.BlackDrakeAggression =  Integer.valueOf(properties.getProperty("Black_Drake_Aggression", String.valueOf(Constants.BlackDrakeAggression)));
        Constants.BlackDrakeAlignment = Float.valueOf(properties.getProperty("Black_Drake_Alignment", String.valueOf(Constants.BlackDrakeAlignment)));
        Constants.BlackDrakeVision =  Integer.valueOf(properties.getProperty("Black_Drake_Vision", String.valueOf(Constants.BlackDrakeVision)));
        Constants.BlackDrakeMaxHuntRange =  Integer.valueOf(properties.getProperty("Black_Drake_Max_Hunt_Range", String.valueOf(Constants.BlackDrakeMaxHuntRange)));
        //============================ VEHICLE ===========================
        Constants.BlackDrakeSetMaxHeightDiff = Float.valueOf(properties.getProperty("Black_Drake_Vehicle_Max_Height_Diff", String.valueOf(Constants.BlackDrakeSetMaxHeightDiff)));
        Constants.BlackDrakeVehicleSpeed = Float.valueOf(properties.getProperty("Black_Drake_Vehicle_Max_Speed", String.valueOf(Constants.BlackDrakeVehicleSpeed)));
        Constants.BlackDrakeVehicleSkill = Float.valueOf(properties.getProperty("Black_Drake_Vehicle_Skill_Required", String.valueOf(Constants.BlackDrakeVehicleSkill)));
        Constants.BlackDrakeVehicleDepth = Float.valueOf(properties.getProperty("Black_Drake_Vehicle_Max_Depth", String.valueOf(Constants.BlackDrakeVehicleDepth)));
        Constants.BlackDrakeZAxisOffset = Float.valueOf(properties.getProperty("Black_Drake_Vehicle_ZAxis_Offset", String.valueOf(Constants.BlackDrakeZAxisOffset)));
        Constants.BlackDrakeMoveSpeed = Float.valueOf(properties.getProperty("Black_Drake_Move_Speed", String.valueOf(Constants.BlackDrakeMoveSpeed)));
        //============================ OFFENSE ===========================
        Constants.BlackDrakeBaseCombatRating = Float.valueOf(properties.getProperty("Black_Drake_Base_Combat_Rating", String.valueOf(Constants.BlackDrakeBaseCombatRating)));
        Constants.BlackDrakeCombatDamageType =  Integer.valueOf(properties.getProperty("Black_Drake_Combat_Damage_Type", String.valueOf(Constants.BlackDrakeCombatDamageType)));
        Constants.BlackDrakeCombatMoves = Initiator.getPropertyArray(String.valueOf(properties.getProperty("Black_Drake_Combat_Moves")));
        Constants.BlackDrakeHeadbuttDamString = String.valueOf(properties.getProperty("Black_Drake_Head_butt_Dam_String", String.valueOf(Constants.BlackDrakeHeadbuttDamString)));
        Constants.BlackDrakeKickDamString = String.valueOf(properties.getProperty("Black_Drake_Kick_Dam_String", String.valueOf(Constants.BlackDrakeKickDamString)));
        Constants.BlackDrakeHandDamage = Float.valueOf(properties.getProperty("Black_Drake_Hand_Damage", String.valueOf(Constants.BlackDrakeHandDamage)));
        Constants.BlackDrakeKickDamage = Float.valueOf(properties.getProperty("Black_Drake_Kick_Damage", String.valueOf(Constants.BlackDrakeKickDamage)));
        Constants.BlackDrakeBiteDamage = Float.valueOf(properties.getProperty("Black_Drake_Bite_Damage", String.valueOf(Constants.BlackDrakeBiteDamage)));
        Constants.BlackDrakeHeadDamage = Float.valueOf(properties.getProperty("Black_Drake_Head_Damage", String.valueOf(Constants.BlackDrakeHeadDamage)));
        Constants.BlackDrakeBreathDamage = Float.valueOf(properties.getProperty("Black_Drake_Breath_Damage", String.valueOf(Constants.BlackDrakeBreathDamage)));
        //============================ DEFENSE ===========================
        Constants.BlackDrakeNaturalArmour = Float.valueOf(properties.getProperty("Black_Drake_Natural_Armour", String.valueOf(Constants.BlackDrakeNaturalArmour)));
        //Constants.BlackDrakeArmourType =  Integer.valueOf(properties.getProperty("Black_Drake_Armour_Type", String.valueOf(Constants.BlackDrakeArmourType)));
        //============================ SKILLS ===========================
        Constants.BlackDrakeBodyStrength = Float.valueOf(properties.getProperty("Black_Drake_Body_Strength", String.valueOf(Constants.BlackDrakeBodyStrength)));
        Constants.BlackDrakeBodyControl = Float.valueOf(properties.getProperty("Black_Drake_Body_Control", String.valueOf(Constants.BlackDrakeBodyControl)));
        Constants.BlackDrakeBodyStamina = Float.valueOf(properties.getProperty("Black_Drake_Body_Stamina", String.valueOf(Constants.BlackDrakeBodyStamina)));
        Constants.BlackDrakeMindLogic = Float.valueOf(properties.getProperty("Black_Drake_Mind_Logic", String.valueOf(Constants.BlackDrakeMindLogic)));
        Constants.BlackDrakeMindSpeed = Float.valueOf(properties.getProperty("Black_Drake_Mind_Speed", String.valueOf(Constants.BlackDrakeMindSpeed)));
        Constants.BlackDrakeSoulStrength = Float.valueOf(properties.getProperty("Black_Drake_Soul_Strength", String.valueOf(Constants.BlackDrakeSoulStrength)));
        Constants.BlackDrakeSoulDepth = Float.valueOf(properties.getProperty("Black_Drake_Soul_Depth", String.valueOf(Constants.BlackDrakeSoulDepth)));
        Constants.BlackDrakeWeaponlessFighting = Float.valueOf(properties.getProperty("Black_Drake_Weaponless_Fighting", String.valueOf(Constants.BlackDrakeWeaponlessFighting)));
        Constants.BlackDrakeGroupFighting = Float.valueOf(properties.getProperty("Black_Drake_Group_Fighting", String.valueOf(Constants.BlackDrakeGroupFighting)));
        //============================ SPAWN ===========================
        Constants.BlackDrakeSpawnTree = Boolean.valueOf(properties.getProperty("Black_Drake_Spawn_Tree", String.valueOf(Constants.BlackDrakeSpawnTree)));
        Constants.BlackDrakeSpawnSteppe = Boolean.valueOf(properties.getProperty("Black_Drake_Spawn_Steppe", String.valueOf(Constants.BlackDrakeSpawnSteppe)));
        Constants.BlackDrakeSpawnGrass = Boolean.valueOf(properties.getProperty("Black_Drake_Spawn_Grass", String.valueOf(Constants.BlackDrakeSpawnGrass)));
        Constants.BlackDrakeSpawnTundra = Boolean.valueOf(properties.getProperty("Black_Drake_Spawn_Tundra", String.valueOf(Constants.BlackDrakeSpawnTundra)));
        Constants.BlackDrakeSpawnDirt = Boolean.valueOf(properties.getProperty("Black_Drake_Spawn_Dirt", String.valueOf(Constants.BlackDrakeSpawnDirt)));
        Constants.BlackDrakeSpawnSand = Boolean.valueOf(properties.getProperty("Black_Drake_Spawn_Sand", String.valueOf(Constants.BlackDrakeSpawnSand)));
        Constants.BlackDrakeSpawnSnow = Boolean.valueOf(properties.getProperty("Black_Drake_Spawn_Snow", String.valueOf(Constants.BlackDrakeSpawnSnow)));
        Constants.BlackDrakeSpawnMarsh = Boolean.valueOf(properties.getProperty("Black_Drake_Spawn_Marsh", String.valueOf(Constants.BlackDrakeSpawnMarsh)));
        Constants.BlackDrakeSpawnCave = Boolean.valueOf(properties.getProperty("Black_Drake_Spawn_Cave", String.valueOf(Constants.BlackDrakeSpawnCave)));
        Constants.BlackDrakeSpawnPeat = Boolean.valueOf(properties.getProperty("Black_Drake_Spawn_Peat", String.valueOf(Constants.BlackDrakeSpawnPeat)));
        /*
          Blue Drake
         */
        //============================ MAIN ===========================
        Constants.BlueDrakeEnabled = Boolean.valueOf(properties.getProperty("Blue_Drake_Enabled", String.valueOf(Constants.BlueDrakeEnabled)));
        Constants.BlueDrakeDesc = String.valueOf(properties.getProperty("Blue_Drake_Desc", String.valueOf(Constants.BlueDrakeDesc)));
        Constants.BlueDrakeCreatureTypes = Initiator.getPropertyArray(String.valueOf(properties.getProperty("Blue_Drake_Creature_Types")));
        //============================ SIZE ===========================
        Constants.BlueDrakeSizeX =  Integer.valueOf(properties.getProperty("Blue_Drake_SizeX", String.valueOf(Constants.BlueDrakeSizeX)));
        Constants.BlueDrakeSizeY =  Integer.valueOf(properties.getProperty("Blue_Drake_SizeY", String.valueOf(Constants.BlueDrakeSizeY)));
        Constants.BlueDrakeSizeZ =  Integer.valueOf(properties.getProperty("Blue_Drake_SizeZ", String.valueOf(Constants.BlueDrakeSizeZ)));
        //============================ MISC ===========================
        Constants.BlueDrakeMaxPop =  Integer.valueOf(properties.getProperty("Blue_Drake_Max_Population", String.valueOf(Constants.BlueDrakeMaxPop)));
        Constants.BlueDrakeMaxAge =  Integer.valueOf(properties.getProperty("Blue_Drake_Max_Age", String.valueOf(Constants.BlueDrakeMaxAge)));
        Constants.BlueDrakeItemsButchered = Initiator.getPropertyArray(String.valueOf(properties.getProperty("Blue_Drake_Items_Butchered")));
        Constants.BlueDrakeMoveRate =  Integer.valueOf(properties.getProperty("Blue_Drake_MoveRate", String.valueOf(Constants.BlueDrakeMoveRate)));
        //============================ ATTITUDE ===========================
        Constants.BlueDrakeAggression =  Integer.valueOf(properties.getProperty("Blue_Drake_Aggression", String.valueOf(Constants.BlueDrakeAggression)));
        Constants.BlueDrakeAlignment = Float.valueOf(properties.getProperty("Blue_Drake_Alignment", String.valueOf(Constants.BlueDrakeAlignment)));
        Constants.BlueDrakeVision =  Integer.valueOf(properties.getProperty("Blue_Drake_Vision", String.valueOf(Constants.BlueDrakeVision)));
        Constants.BlueDrakeMaxHuntRange =  Integer.valueOf(properties.getProperty("Blue_Drake_Max_Hunt_Range", String.valueOf(Constants.BlueDrakeMaxHuntRange)));
        //============================ VEHICLE ===========================
        Constants.BlueDrakeSetMaxHeightDiff = Float.valueOf(properties.getProperty("Blue_Drake_Vehicle_Max_Height_Diff", String.valueOf(Constants.BlueDrakeSetMaxHeightDiff)));
        Constants.BlueDrakeVehicleSpeed = Float.valueOf(properties.getProperty("Blue_Drake_Vehicle_Max_Speed", String.valueOf(Constants.BlueDrakeVehicleSpeed)));
        Constants.BlueDrakeVehicleSkill = Float.valueOf(properties.getProperty("Blue_Drake_Vehicle_Skill_Required", String.valueOf(Constants.BlueDrakeVehicleSkill)));
        Constants.BlueDrakeVehicleDepth = Float.valueOf(properties.getProperty("Blue_Drake_Vehicle_Max_Depth", String.valueOf(Constants.BlueDrakeVehicleDepth)));
        Constants.BlueDrakeZAxisOffset = Float.valueOf(properties.getProperty("Blue_Drake_Vehicle_ZAxis_Offset", String.valueOf(Constants.BlueDrakeZAxisOffset)));
        Constants.BlueDrakeMoveSpeed = Float.valueOf(properties.getProperty("Blue_Drake_Move_Speed", String.valueOf(Constants.BlueDrakeMoveSpeed)));
        //============================ OFFENSE ===========================
        Constants.BlueDrakeBaseCombatRating = Float.valueOf(properties.getProperty("Blue_Drake_Base_Combat_Rating", String.valueOf(Constants.BlueDrakeBaseCombatRating)));
        Constants.BlueDrakeCombatDamageType =  Integer.valueOf(properties.getProperty("Blue_Drake_Combat_Damage_Type", String.valueOf(Constants.BlueDrakeCombatDamageType)));
        Constants.BlueDrakeCombatMoves = Initiator.getPropertyArray(String.valueOf(properties.getProperty("Blue_Drake_Combat_Moves")));
        Constants.BlueDrakeHeadbuttDamString = String.valueOf(properties.getProperty("Blue_Drake_Head_butt_Dam_String", String.valueOf(Constants.BlueDrakeHeadbuttDamString)));
        Constants.BlueDrakeKickDamString = String.valueOf(properties.getProperty("Blue_Drake_Kick_Dam_String", String.valueOf(Constants.BlueDrakeKickDamString)));
        Constants.BlueDrakeHandDamage = Float.valueOf(properties.getProperty("Blue_Drake_Hand_Damage", String.valueOf(Constants.BlueDrakeHandDamage)));
        Constants.BlueDrakeKickDamage = Float.valueOf(properties.getProperty("Blue_Drake_Kick_Damage", String.valueOf(Constants.BlueDrakeKickDamage)));
        Constants.BlueDrakeBiteDamage = Float.valueOf(properties.getProperty("Blue_Drake_Bite_Damage", String.valueOf(Constants.BlueDrakeBiteDamage)));
        Constants.BlueDrakeHeadDamage = Float.valueOf(properties.getProperty("Blue_Drake_Head_Damage", String.valueOf(Constants.BlueDrakeHeadDamage)));
        Constants.BlueDrakeBreathDamage = Float.valueOf(properties.getProperty("Blue_Drake_Breath_Damage", String.valueOf(Constants.BlueDrakeBreathDamage)));
        //============================ DEFENSE ===========================
        Constants.BlueDrakeNaturalArmour = Float.valueOf(properties.getProperty("Blue_Drake_Natural_Armour", String.valueOf(Constants.BlueDrakeNaturalArmour)));
        //Constants.BlueDrakeArmourType =  ArmourTemplate.ArmourType.(properties.getProperty("Blue_Drake_Armour_Type"));
        //============================ SKILLS ===========================
        Constants.BlueDrakeBodyStrength = Float.valueOf(properties.getProperty("Blue_Drake_Body_Strength", String.valueOf(Constants.BlueDrakeBodyStrength)));
        Constants.BlueDrakeBodyControl = Float.valueOf(properties.getProperty("Blue_Drake_Body_Control", String.valueOf(Constants.BlueDrakeBodyControl)));
        Constants.BlueDrakeBodyStamina = Float.valueOf(properties.getProperty("Blue_Drake_Body_Stamina", String.valueOf(Constants.BlueDrakeBodyStamina)));
        Constants.BlueDrakeMindLogic = Float.valueOf(properties.getProperty("Blue_Drake_Mind_Logic", String.valueOf(Constants.BlueDrakeMindLogic)));
        Constants.BlueDrakeMindSpeed = Float.valueOf(properties.getProperty("Blue_Drake_Mind_Speed", String.valueOf(Constants.BlueDrakeMindSpeed)));
        Constants.BlueDrakeSoulStrength = Float.valueOf(properties.getProperty("Blue_Drake_Soul_Strength", String.valueOf(Constants.BlueDrakeSoulStrength)));
        Constants.BlueDrakeSoulDepth = Float.valueOf(properties.getProperty("Blue_Drake_Soul_Depth", String.valueOf(Constants.BlueDrakeSoulDepth)));
        Constants.BlueDrakeWeaponlessFighting = Float.valueOf(properties.getProperty("Blue_Drake_Weaponless_Fighting", String.valueOf(Constants.BlueDrakeWeaponlessFighting)));
        Constants.BlueDrakeGroupFighting = Float.valueOf(properties.getProperty("Blue_Drake_Group_Fighting", String.valueOf(Constants.BlueDrakeGroupFighting)));
        //============================ SPAWN ===========================
        Constants.BlueDrakeSpawnTree = Boolean.valueOf(properties.getProperty("Blue_Drake_Spawn_Tree", String.valueOf(Constants.BlueDrakeSpawnTree)));
        Constants.BlueDrakeSpawnSteppe = Boolean.valueOf(properties.getProperty("Blue_Drake_Spawn_Steppe", String.valueOf(Constants.BlueDrakeSpawnSteppe)));
        Constants.BlueDrakeSpawnGrass = Boolean.valueOf(properties.getProperty("Blue_Drake_Spawn_Grass", String.valueOf(Constants.BlueDrakeSpawnGrass)));
        Constants.BlueDrakeSpawnTundra = Boolean.valueOf(properties.getProperty("Blue_Drake_Spawn_Tundra", String.valueOf(Constants.BlueDrakeSpawnTundra)));
        Constants.BlueDrakeSpawnDirt = Boolean.valueOf(properties.getProperty("Blue_Drake_Spawn_Dirt", String.valueOf(Constants.BlueDrakeSpawnDirt)));
        Constants.BlueDrakeSpawnSand = Boolean.valueOf(properties.getProperty("Blue_Drake_Spawn_Sand", String.valueOf(Constants.BlueDrakeSpawnSand)));
        Constants.BlueDrakeSpawnSnow = Boolean.valueOf(properties.getProperty("Blue_Drake_Spawn_Snow", String.valueOf(Constants.BlueDrakeSpawnSnow)));
        Constants.BlueDrakeSpawnMarsh = Boolean.valueOf(properties.getProperty("Blue_Drake_Spawn_Marsh", String.valueOf(Constants.BlueDrakeSpawnMarsh)));
        Constants.BlueDrakeSpawnCave = Boolean.valueOf(properties.getProperty("Blue_Drake_Spawn_Cave", String.valueOf(Constants.BlueDrakeSpawnCave)));
        Constants.BlueDrakeSpawnPeat = Boolean.valueOf(properties.getProperty("Blue_Drake_Spawn_Peat", String.valueOf(Constants.BlueDrakeSpawnPeat)));
        /*
          Ghost Drake
         */
        //============================ MAIN ===========================
        Constants.GhostDrakeEnabled = Boolean.valueOf(properties.getProperty("Spectral_Drake_Enabled", String.valueOf(Constants.GhostDrakeEnabled)));
        Constants.GhostDrakeDesc = String.valueOf(properties.getProperty("Spectral_Drake_Desc", String.valueOf(Constants.GhostDrakeDesc)));
        Constants.GhostDrakeCreatureTypes = Initiator.getPropertyArray(String.valueOf(properties.getProperty("Spectral_Drake_Creature_Types")));
        Constants.GhostDrakeModelColor = String.valueOf(properties.getProperty("Ghost_Drake_Model_Color", String.valueOf(Constants.GhostDrakeModelColor)));
        //============================ SIZE ===========================
        Constants.GhostDrakeSizeX =  Integer.valueOf(properties.getProperty("Spectral_Drake_SizeX", String.valueOf(Constants.GhostDrakeSizeX)));
        Constants.GhostDrakeSizeY =  Integer.valueOf(properties.getProperty("Spectral_Drake_SizeY", String.valueOf(Constants.GhostDrakeSizeY)));
        Constants.GhostDrakeSizeZ =  Integer.valueOf(properties.getProperty("Spectral_Drake_SizeZ", String.valueOf(Constants.GhostDrakeSizeZ)));
        //============================ MISC ===========================
        Constants.GhostDrakeMaxPop =  Integer.valueOf(properties.getProperty("Spectral_Drake_Max_Population", String.valueOf(Constants.GhostDrakeMaxPop)));
        Constants.GhostDrakeMaxAge =  Integer.valueOf(properties.getProperty("Spectral_Drake_Max_Age", String.valueOf(Constants.GhostDrakeMaxAge)));
        Constants.GhostDrakeItemsButchered = Initiator.getPropertyArray(String.valueOf(properties.getProperty("Spectral_Drake_Items_Butchered")));
        Constants.GhostDrakeMoveRate =  Integer.valueOf(properties.getProperty("Spectral_Drake_MoveRate", String.valueOf(Constants.GhostDrakeMoveRate)));
        //============================ ATTITUDE ===========================
        Constants.GhostDrakeAggression =  Integer.valueOf(properties.getProperty("Spectral_Drake_Aggression", String.valueOf(Constants.GhostDrakeAggression)));
        Constants.GhostDrakeAlignment = Float.valueOf(properties.getProperty("Spectral_Drake_Alignment", String.valueOf(Constants.GhostDrakeAlignment)));
        Constants.GhostDrakeVision =  Integer.valueOf(properties.getProperty("Spectral_Drake_Vision", String.valueOf(Constants.GhostDrakeVision)));
        Constants.GhostDrakeMaxHuntRange =  Integer.valueOf(properties.getProperty("Spectral_Drake_Max_Hunt_Range", String.valueOf(Constants.GhostDrakeMaxHuntRange)));
        //============================ VEHICLE ===========================
        Constants.GhostDrakeSetMaxHeightDiff = Float.valueOf(properties.getProperty("Spectral_Drake_Vehicle_Max_Height_Diff", String.valueOf(Constants.GhostDrakeSetMaxHeightDiff)));
        Constants.GhostDrakeVehicleSpeed = Float.valueOf(properties.getProperty("Spectral_Drake_Vehicle_Max_Speed", String.valueOf(Constants.GhostDrakeVehicleSpeed)));
        Constants.GhostDrakeVehicleSkill = Float.valueOf(properties.getProperty("Spectral_Drake_Vehicle_Skill_Required", String.valueOf(Constants.GhostDrakeVehicleSkill)));
        Constants.GhostDrakeVehicleDepth = Float.valueOf(properties.getProperty("Spectral_Drake_Vehicle_Max_Depth", String.valueOf(Constants.GhostDrakeVehicleDepth)));
        Constants.GhostDrakeZAxisOffset = Float.valueOf(properties.getProperty("Spectral_Drake_Vehicle_ZAxis_Offset", String.valueOf(Constants.GhostDrakeZAxisOffset)));
        Constants.GhostDrakeMoveSpeed = Float.valueOf(properties.getProperty("Spectral_Drake_Move_Speed", String.valueOf(Constants.GhostDrakeMoveSpeed)));
        //============================ OFFENSE ===========================
        Constants.GhostDrakeBaseCombatRating = Float.valueOf(properties.getProperty("Spectral_Drake_Base_Combat_Rating", String.valueOf(Constants.GhostDrakeBaseCombatRating)));
        Constants.GhostDrakeCombatDamageType =  Integer.valueOf(properties.getProperty("Spectral_Drake_Combat_Damage_Type", String.valueOf(Constants.GhostDrakeCombatDamageType)));
        Constants.GhostDrakeCombatMoves = Initiator.getPropertyArray(String.valueOf(properties.getProperty("Spectral_Drake_Combat_Moves")));
        Constants.GhostDrakeHeadbuttDamString = String.valueOf(properties.getProperty("Spectral_Drake_Head_butt_Dam_String", String.valueOf(Constants.GhostDrakeHeadbuttDamString)));
        Constants.GhostDrakeKickDamString = String.valueOf(properties.getProperty("Spectral_Drake_Kick_Dam_String", String.valueOf(Constants.GhostDrakeKickDamString)));
        Constants.GhostDrakeHandDamage = Float.valueOf(properties.getProperty("Spectral_Drake_Hand_Damage", String.valueOf(Constants.GhostDrakeHandDamage)));
        Constants.GhostDrakeKickDamage = Float.valueOf(properties.getProperty("Spectral_Drake_Kick_Damage", String.valueOf(Constants.GhostDrakeKickDamage)));
        Constants.GhostDrakeBiteDamage = Float.valueOf(properties.getProperty("Spectral_Drake_Bite_Damage", String.valueOf(Constants.GhostDrakeBiteDamage)));
        Constants.GhostDrakeHeadDamage = Float.valueOf(properties.getProperty("Spectral_Drake_Head_Damage", String.valueOf(Constants.GhostDrakeHeadDamage)));
        Constants.GhostDrakeBreathDamage = Float.valueOf(properties.getProperty("Spectral_Drake_Breath_Damage", String.valueOf(Constants.GhostDrakeBreathDamage)));
        //============================ DEFENSE ===========================
        Constants.GhostDrakeNaturalArmour = Float.valueOf(properties.getProperty("Spectral_Drake_Natural_Armour", String.valueOf(Constants.GhostDrakeNaturalArmour)));
        ////Constants.GhostDrakeArmourType =  Integer.valueOf(properties.getProperty("Spectral_Drake_Armour_Type", String.valueOf(Constants.DrakeEggLayer)));
        //============================ SKILLS ===========================
        Constants.GhostDrakeBodyStrength = Float.valueOf(properties.getProperty("Spectral_Drake_Body_Strength", String.valueOf(Constants.GhostDrakeBodyStrength)));
        Constants.GhostDrakeBodyControl = Float.valueOf(properties.getProperty("Spectral_Drake_Body_Control", String.valueOf(Constants.GhostDrakeBodyControl)));
        Constants.GhostDrakeBodyStamina = Float.valueOf(properties.getProperty("Spectral_Drake_Body_Stamina", String.valueOf(Constants.GhostDrakeBodyStamina)));
        Constants.GhostDrakeMindLogic = Float.valueOf(properties.getProperty("Spectral_Drake_Mind_Logic", String.valueOf(Constants.GhostDrakeMindLogic)));
        Constants.GhostDrakeMindSpeed = Float.valueOf(properties.getProperty("Spectral_Drake_Mind_Speed", String.valueOf(Constants.GhostDrakeMindSpeed)));
        Constants.GhostDrakeSoulStrength = Float.valueOf(properties.getProperty("Spectral_Drake_Soul_Strength", String.valueOf(Constants.GhostDrakeSoulStrength)));
        Constants.GhostDrakeSoulDepth = Float.valueOf(properties.getProperty("Spectral_Drake_Soul_Depth", String.valueOf(Constants.GhostDrakeSoulDepth)));
        Constants.GhostDrakeWeaponlessFighting = Float.valueOf(properties.getProperty("Spectral_Drake_Weaponless_Fighting", String.valueOf(Constants.GhostDrakeWeaponlessFighting)));
        Constants.GhostDrakeGroupFighting = Float.valueOf(properties.getProperty("Spectral_Drake_Group_Fighting", String.valueOf(Constants.GhostDrakeGroupFighting)));
        //============================ SPAWN ===========================
        Constants.GhostDrakeSpawnTree = Boolean.valueOf(properties.getProperty("Spectral_Drake_Spawn_Tree", String.valueOf(Constants.GhostDrakeSpawnTree)));
        Constants.GhostDrakeSpawnSteppe = Boolean.valueOf(properties.getProperty("Spectral_Drake_Spawn_Steppe", String.valueOf(Constants.GhostDrakeSpawnSteppe)));
        Constants.GhostDrakeSpawnGrass = Boolean.valueOf(properties.getProperty("Spectral_Drake_Spawn_Grass", String.valueOf(Constants.GhostDrakeSpawnGrass)));
        Constants.GhostDrakeSpawnTundra = Boolean.valueOf(properties.getProperty("Spectral_Drake_Spawn_Tundra", String.valueOf(Constants.GhostDrakeSpawnTundra)));
        Constants.GhostDrakeSpawnDirt = Boolean.valueOf(properties.getProperty("Spectral_Drake_Spawn_Dirt", String.valueOf(Constants.GhostDrakeSpawnDirt)));
        Constants.GhostDrakeSpawnSand = Boolean.valueOf(properties.getProperty("Spectral_Drake_Spawn_Sand", String.valueOf(Constants.GhostDrakeSpawnSand)));
        Constants.GhostDrakeSpawnSnow = Boolean.valueOf(properties.getProperty("Spectral_Drake_Spawn_Snow", String.valueOf(Constants.GhostDrakeSpawnSnow)));
        Constants.GhostDrakeSpawnMarsh = Boolean.valueOf(properties.getProperty("Spectral_Drake_Spawn_Marsh", String.valueOf(Constants.GhostDrakeSpawnMarsh)));
        Constants.GhostDrakeSpawnCave = Boolean.valueOf(properties.getProperty("Spectral_Drake_Spawn_Cave", String.valueOf(Constants.GhostDrakeSpawnCave)));
        Constants.GhostDrakeSpawnPeat = Boolean.valueOf(properties.getProperty("Spectral_Drake_Spawn_Peat", String.valueOf(Constants.GhostDrakeSpawnPeat)));
        /*
          Green Drake
         */
        //============================ MAIN ===========================
        Constants.GreenDrakeEnabled = Boolean.valueOf(properties.getProperty("Green_Drake_Enabled", String.valueOf(Constants.GreenDrakeEnabled)));
        Constants.GreenDrakeDesc = String.valueOf(properties.getProperty("Green_Drake_Desc", String.valueOf(Constants.GreenDrakeDesc)));
        Constants.GreenDrakeCreatureTypes = Initiator.getPropertyArray(String.valueOf(properties.getProperty("Green_Drake_Creature_Types")));
        //============================ SIZE ===========================
        Constants.GreenDrakeSizeX =  Integer.valueOf(properties.getProperty("Green_Drake_SizeX", String.valueOf(Constants.GreenDrakeSizeX)));
        Constants.GreenDrakeSizeY =  Integer.valueOf(properties.getProperty("Green_Drake_SizeY", String.valueOf(Constants.GreenDrakeSizeY)));
        Constants.GreenDrakeSizeZ =  Integer.valueOf(properties.getProperty("Green_Drake_SizeZ", String.valueOf(Constants.GreenDrakeSizeZ)));
        //============================ MISC ===========================
        Constants.GreenDrakeMaxPop =  Integer.valueOf(properties.getProperty("Green_Drake_Max_Population", String.valueOf(Constants.GreenDrakeMaxPop)));
        Constants.GreenDrakeMaxAge =  Integer.valueOf(properties.getProperty("Green_Drake_Max_Age", String.valueOf(Constants.GreenDrakeMaxAge)));
        Constants.GreenDrakeItemsButchered = Initiator.getPropertyArray(String.valueOf(properties.getProperty("Green_Drake_Items_Butchered")));
        Constants.GreenDrakeMoveRate =  Integer.valueOf(properties.getProperty("Green_Drake_MoveRate", String.valueOf(Constants.GreenDrakeMoveRate)));
        //============================ ATTITUDE ===========================
        Constants.GreenDrakeAggression =  Integer.valueOf(properties.getProperty("Green_Drake_Aggression", String.valueOf(Constants.GreenDrakeAggression)));
        Constants.GreenDrakeAlignment = Float.valueOf(properties.getProperty("Green_Drake_Alignment", String.valueOf(Constants.GreenDrakeAlignment)));
        Constants.GreenDrakeVision =  Integer.valueOf(properties.getProperty("Green_Drake_Vision", String.valueOf(Constants.GreenDrakeVision)));
        Constants.GreenDrakeMaxHuntRange =  Integer.valueOf(properties.getProperty("Green_Drake_Max_Hunt_Range", String.valueOf(Constants.GreenDrakeMaxHuntRange)));
        //============================ VEHICLE ===========================
        Constants.GreenDrakeSetMaxHeightDiff = Float.valueOf(properties.getProperty("Green_Drake_Vehicle_Max_Height_Diff", String.valueOf(Constants.GreenDrakeSetMaxHeightDiff)));
        Constants.GreenDrakeVehicleSpeed = Float.valueOf(properties.getProperty("Green_Drake_Vehicle_Max_Speed", String.valueOf(Constants.GreenDrakeVehicleSpeed)));
        Constants.GreenDrakeVehicleSkill = Float.valueOf(properties.getProperty("Green_Drake_Vehicle_Skill_Required", String.valueOf(Constants.GreenDrakeVehicleSkill)));
        Constants.GreenDrakeVehicleDepth = Float.valueOf(properties.getProperty("Green_Drake_Vehicle_Max_Depth", String.valueOf(Constants.GreenDrakeVehicleDepth)));
        Constants.GreenDrakeZAxisOffset = Float.valueOf(properties.getProperty("Green_Drake_Vehicle_ZAxis_Offset", String.valueOf(Constants.GreenDrakeZAxisOffset)));
        Constants.GreenDrakeMoveSpeed = Float.valueOf(properties.getProperty("Green_Drake_Move_Speed", String.valueOf(Constants.GreenDrakeMoveSpeed)));
        //============================ OFFENSE ===========================
        Constants.GreenDrakeBaseCombatRating = Float.valueOf(properties.getProperty("Green_Drake_Base_Combat_Rating", String.valueOf(Constants.GreenDrakeBaseCombatRating)));
        Constants.GreenDrakeCombatDamageType =  Integer.valueOf(properties.getProperty("Green_Drake_Combat_Damage_Type", String.valueOf(Constants.GreenDrakeCombatDamageType)));
        Constants.GreenDrakeCombatMoves = Initiator.getPropertyArray(String.valueOf(properties.getProperty("Green_Drake_Combat_Moves")));
        Constants.GreenDrakeHeadbuttDamString = String.valueOf(properties.getProperty("Green_Drake_Head_butt_Dam_String", String.valueOf(Constants.GreenDrakeHeadbuttDamString)));
        Constants.GreenDrakeKickDamString = String.valueOf(properties.getProperty("Green_Drake_Kick_Dam_String", String.valueOf(Constants.GreenDrakeKickDamString)));
        Constants.GreenDrakeHandDamage = Float.valueOf(properties.getProperty("Green_Drake_Hand_Damage", String.valueOf(Constants.GreenDrakeHandDamage)));
        Constants.GreenDrakeKickDamage = Float.valueOf(properties.getProperty("Green_Drake_Kick_Damage", String.valueOf(Constants.GreenDrakeKickDamage)));
        Constants.GreenDrakeBiteDamage = Float.valueOf(properties.getProperty("Green_Drake_Bite_Damage", String.valueOf(Constants.GreenDrakeBiteDamage)));
        Constants.GreenDrakeHeadDamage = Float.valueOf(properties.getProperty("Green_Drake_Head_Damage", String.valueOf(Constants.GreenDrakeHeadDamage)));
        Constants.GreenDrakeBreathDamage = Float.valueOf(properties.getProperty("Green_Drake_Breath_Damage", String.valueOf(Constants.GreenDrakeBreathDamage)));
        //============================ DEFENSE ===========================
        Constants.GreenDrakeNaturalArmour = Float.valueOf(properties.getProperty("Green_Drake_Natural_Armour", String.valueOf(Constants.GreenDrakeNaturalArmour)));
        ////Constants.GreenDrakeArmourType =  Integer.valueOf(properties.getProperty("Green_Drake_Armour_Type", String.valueOf(Constants.DrakeEggLayer)));
        //============================ SKILLS ===========================
        Constants.GreenDrakeBodyStrength = Float.valueOf(properties.getProperty("Green_Drake_Body_Strength", String.valueOf(Constants.GreenDrakeBodyStrength)));
        Constants.GreenDrakeBodyControl = Float.valueOf(properties.getProperty("Green_Drake_Body_Control", String.valueOf(Constants.GreenDrakeBodyControl)));
        Constants.GreenDrakeBodyStamina = Float.valueOf(properties.getProperty("Green_Drake_Body_Stamina", String.valueOf(Constants.GreenDrakeBodyStamina)));
        Constants.GreenDrakeMindLogic = Float.valueOf(properties.getProperty("Green_Drake_Mind_Logic", String.valueOf(Constants.GreenDrakeMindLogic)));
        Constants.GreenDrakeMindSpeed = Float.valueOf(properties.getProperty("Green_Drake_Mind_Speed", String.valueOf(Constants.GreenDrakeMindSpeed)));
        Constants.GreenDrakeSoulStrength = Float.valueOf(properties.getProperty("Green_Drake_Soul_Strength", String.valueOf(Constants.GreenDrakeSoulStrength)));
        Constants.GreenDrakeSoulDepth = Float.valueOf(properties.getProperty("Green_Drake_Soul_Depth", String.valueOf(Constants.GreenDrakeSoulDepth)));
        Constants.GreenDrakeWeaponlessFighting = Float.valueOf(properties.getProperty("Green_Drake_Weaponless_Fighting", String.valueOf(Constants.GreenDrakeWeaponlessFighting)));
        Constants.GreenDrakeGroupFighting = Float.valueOf(properties.getProperty("Green_Drake_Group_Fighting", String.valueOf(Constants.GreenDrakeGroupFighting)));
        //============================ SPAWN ===========================
        Constants.GreenDrakeSpawnTree = Boolean.valueOf(properties.getProperty("Green_Drake_Spawn_Tree", String.valueOf(Constants.GreenDrakeSpawnTree)));
        Constants.GreenDrakeSpawnSteppe = Boolean.valueOf(properties.getProperty("Green_Drake_Spawn_Steppe", String.valueOf(Constants.GreenDrakeSpawnSteppe)));
        Constants.GreenDrakeSpawnGrass = Boolean.valueOf(properties.getProperty("Green_Drake_Spawn_Grass", String.valueOf(Constants.GreenDrakeSpawnGrass)));
        Constants.GreenDrakeSpawnTundra = Boolean.valueOf(properties.getProperty("Green_Drake_Spawn_Tundra", String.valueOf(Constants.GreenDrakeSpawnTundra)));
        Constants.GreenDrakeSpawnDirt = Boolean.valueOf(properties.getProperty("Green_Drake_Spawn_Dirt", String.valueOf(Constants.GreenDrakeSpawnDirt)));
        Constants.GreenDrakeSpawnSand = Boolean.valueOf(properties.getProperty("Green_Drake_Spawn_Sand", String.valueOf(Constants.GreenDrakeSpawnSand)));
        Constants.GreenDrakeSpawnSnow = Boolean.valueOf(properties.getProperty("Green_Drake_Spawn_Snow", String.valueOf(Constants.GreenDrakeSpawnSnow)));
        Constants.GreenDrakeSpawnMarsh = Boolean.valueOf(properties.getProperty("Green_Drake_Spawn_Marsh", String.valueOf(Constants.GreenDrakeSpawnMarsh)));
        Constants.GreenDrakeSpawnCave = Boolean.valueOf(properties.getProperty("Green_Drake_Spawn_Cave", String.valueOf(Constants.GreenDrakeSpawnCave)));
        Constants.GreenDrakeSpawnPeat = Boolean.valueOf(properties.getProperty("Green_Drake_Spawn_Peat", String.valueOf(Constants.GreenDrakeSpawnPeat)));
        /*
          Red Drake
         */
        //============================ MAIN ===========================
        Constants.RedDrakeEnabled = Boolean.valueOf(properties.getProperty("Red_Drake_Enabled", String.valueOf(Constants.RedDrakeEnabled)));
        Constants.RedDrakeDesc = String.valueOf(properties.getProperty("Red_Drake_Desc", String.valueOf(Constants.RedDrakeDesc)));
        Constants.RedDrakeCreatureTypes = Initiator.getPropertyArray(String.valueOf(properties.getProperty("Red_Drake_Creature_Types")));
        //============================ SIZE ===========================
        Constants.RedDrakeSizeX =  Integer.valueOf(properties.getProperty("Red_Drake_SizeX", String.valueOf(Constants.RedDrakeSizeX)));
        Constants.RedDrakeSizeY =  Integer.valueOf(properties.getProperty("Red_Drake_SizeY", String.valueOf(Constants.RedDrakeSizeY)));
        Constants.RedDrakeSizeZ =  Integer.valueOf(properties.getProperty("Red_Drake_SizeZ", String.valueOf(Constants.RedDrakeSizeZ)));
        //============================ MISC ===========================
        Constants.RedDrakeMaxPop =  Integer.valueOf(properties.getProperty("Red_Drake_Max_Population", String.valueOf(Constants.RedDrakeMaxPop)));
        Constants.RedDrakeMaxAge =  Integer.valueOf(properties.getProperty("Red_Drake_Max_Age", String.valueOf(Constants.RedDrakeMaxAge)));
        Constants.RedDrakeItemsButchered = Initiator.getPropertyArray(String.valueOf(properties.getProperty("Red_Drake_Items_Butchered")));
        Constants.RedDrakeMoveRate =  Integer.valueOf(properties.getProperty("Red_Drake_MoveRate", String.valueOf(Constants.RedDrakeMoveRate)));
        //============================ ATTITUDE ===========================
        Constants.RedDrakeAggression =  Integer.valueOf(properties.getProperty("Red_Drake_Aggression", String.valueOf(Constants.RedDrakeAggression)));
        Constants.RedDrakeAlignment = Float.valueOf(properties.getProperty("Red_Drake_Alignment", String.valueOf(Constants.RedDrakeAlignment)));
        Constants.RedDrakeVision =  Integer.valueOf(properties.getProperty("Red_Drake_Vision", String.valueOf(Constants.RedDrakeVision)));
        Constants.RedDrakeMaxHuntRange =  Integer.valueOf(properties.getProperty("Red_Drake_Max_Hunt_Range", String.valueOf(Constants.RedDrakeMaxHuntRange)));
        //============================ VEHICLE ===========================
        Constants.RedDrakeSetMaxHeightDiff = Float.valueOf(properties.getProperty("Red_Drake_Vehicle_Max_Height_Diff", String.valueOf(Constants.RedDrakeSetMaxHeightDiff)));
        Constants.RedDrakeVehicleSpeed = Float.valueOf(properties.getProperty("Red_Drake_Vehicle_Max_Speed", String.valueOf(Constants.RedDrakeVehicleSpeed)));
        Constants.RedDrakeVehicleSkill = Float.valueOf(properties.getProperty("Red_Drake_Vehicle_Skill_Required", String.valueOf(Constants.RedDrakeVehicleSkill)));
        Constants.RedDrakeVehicleDepth = Float.valueOf(properties.getProperty("Red_Drake_Vehicle_Max_Depth", String.valueOf(Constants.RedDrakeVehicleDepth)));
        Constants.RedDrakeZAxisOffset = Float.valueOf(properties.getProperty("Red_Drake_Vehicle_ZAxis_Offset", String.valueOf(Constants.RedDrakeZAxisOffset)));
        Constants.RedDrakeMoveSpeed = Float.valueOf(properties.getProperty("Red_Drake_Move_Speed", String.valueOf(Constants.RedDrakeMoveSpeed)));
        //============================ OFFENSE ===========================
        Constants.RedDrakeBaseCombatRating = Float.valueOf(properties.getProperty("Red_Drake_Base_Combat_Rating", String.valueOf(Constants.RedDrakeBaseCombatRating)));
        Constants.RedDrakeCombatDamageType =  Integer.valueOf(properties.getProperty("Red_Drake_Combat_Damage_Type", String.valueOf(Constants.RedDrakeCombatDamageType)));
        Constants.RedDrakeCombatMoves = Initiator.getPropertyArray(String.valueOf(properties.getProperty("Red_Drake_Combat_Moves")));
        Constants.RedDrakeHeadbuttDamString = String.valueOf(properties.getProperty("Red_Drake_Head_butt_Dam_String", String.valueOf(Constants.RedDrakeHeadbuttDamString)));
        Constants.RedDrakeKickDamString = String.valueOf(properties.getProperty("Red_Drake_Kick_Dam_String", String.valueOf(Constants.RedDrakeKickDamString)));
        Constants.RedDrakeHandDamage = Float.valueOf(properties.getProperty("Red_Drake_Hand_Damage", String.valueOf(Constants.RedDrakeHandDamage)));
        Constants.RedDrakeKickDamage = Float.valueOf(properties.getProperty("Red_Drake_Kick_Damage", String.valueOf(Constants.RedDrakeKickDamage)));
        Constants.RedDrakeBiteDamage = Float.valueOf(properties.getProperty("Red_Drake_Bite_Damage", String.valueOf(Constants.RedDrakeBiteDamage)));
        Constants.RedDrakeHeadDamage = Float.valueOf(properties.getProperty("Red_Drake_Head_Damage", String.valueOf(Constants.RedDrakeHeadDamage)));
        Constants.RedDrakeBreathDamage = Float.valueOf(properties.getProperty("Red_Drake_Breath_Damage", String.valueOf(Constants.RedDrakeBreathDamage)));
        //============================ DEFENSE ===========================
        Constants.RedDrakeNaturalArmour = Float.valueOf(properties.getProperty("Red_Drake_Natural_Armour", String.valueOf(Constants.RedDrakeNaturalArmour)));
        ////Constants.RedDrakeArmourType =  Integer.valueOf(properties.getProperty("Red_Drake_Armour_Type", String.valueOf(Constants.RedDrakeArmourType)));
        //============================ SKILLS ===========================
        Constants.RedDrakeBodyStrength = Float.valueOf(properties.getProperty("Red_Drake_Body_Strength", String.valueOf(Constants.RedDrakeBodyStrength)));
        Constants.RedDrakeBodyControl = Float.valueOf(properties.getProperty("Red_Drake_Body_Control", String.valueOf(Constants.RedDrakeBodyControl)));
        Constants.RedDrakeBodyStamina = Float.valueOf(properties.getProperty("Red_Drake_Body_Stamina", String.valueOf(Constants.RedDrakeBodyStamina)));
        Constants.RedDrakeMindLogic = Float.valueOf(properties.getProperty("Red_Drake_Mind_Logic", String.valueOf(Constants.RedDrakeMindLogic)));
        Constants.RedDrakeMindSpeed = Float.valueOf(properties.getProperty("Red_Drake_Mind_Speed", String.valueOf(Constants.RedDrakeMindSpeed)));
        Constants.RedDrakeSoulStrength = Float.valueOf(properties.getProperty("Red_Drake_Soul_Strength", String.valueOf(Constants.RedDrakeSoulStrength)));
        Constants.RedDrakeSoulDepth = Float.valueOf(properties.getProperty("Red_Drake_Soul_Depth", String.valueOf(Constants.RedDrakeSoulDepth)));
        Constants.RedDrakeWeaponlessFighting = Float.valueOf(properties.getProperty("Red_Drake_Weaponless_Fighting", String.valueOf(Constants.RedDrakeWeaponlessFighting)));
        Constants.RedDrakeGroupFighting = Float.valueOf(properties.getProperty("Red_Drake_Group_Fighting", String.valueOf(Constants.RedDrakeGroupFighting)));
        //============================ SPAWN ===========================
        Constants.RedDrakeSpawnTree = Boolean.valueOf(properties.getProperty("Red_Drake_Spawn_Tree", String.valueOf(Constants.RedDrakeSpawnTree)));
        Constants.RedDrakeSpawnSteppe = Boolean.valueOf(properties.getProperty("Red_Drake_Spawn_Steppe", String.valueOf(Constants.RedDrakeSpawnSteppe)));
        Constants.RedDrakeSpawnGrass = Boolean.valueOf(properties.getProperty("Red_Drake_Spawn_Grass", String.valueOf(Constants.RedDrakeSpawnGrass)));
        Constants.RedDrakeSpawnTundra = Boolean.valueOf(properties.getProperty("Red_Drake_Spawn_Tundra", String.valueOf(Constants.RedDrakeSpawnTundra)));
        Constants.RedDrakeSpawnDirt = Boolean.valueOf(properties.getProperty("Red_Drake_Spawn_Dirt", String.valueOf(Constants.RedDrakeSpawnDirt)));
        Constants.RedDrakeSpawnSand = Boolean.valueOf(properties.getProperty("Red_Drake_Spawn_Sand", String.valueOf(Constants.RedDrakeSpawnSand)));
        Constants.RedDrakeSpawnSnow = Boolean.valueOf(properties.getProperty("Red_Drake_Spawn_Snow", String.valueOf(Constants.RedDrakeSpawnSnow)));
        Constants.RedDrakeSpawnMarsh = Boolean.valueOf(properties.getProperty("Red_Drake_Spawn_Marsh", String.valueOf(Constants.RedDrakeSpawnMarsh)));
        Constants.RedDrakeSpawnCave = Boolean.valueOf(properties.getProperty("Red_Drake_Spawn_Cave", String.valueOf(Constants.RedDrakeSpawnCave)));
        Constants.RedDrakeSpawnPeat = Boolean.valueOf(properties.getProperty("Red_Drake_Spawn_Peat", String.valueOf(Constants.RedDrakeSpawnPeat)));
        /*
          White Drake
         */
        //============================ MAIN ===========================
        Constants.WhiteDrakeEnabled = Boolean.valueOf(properties.getProperty("White_Drake_Enabled", String.valueOf(Constants.WhiteDrakeEnabled)));
        Constants.WhiteDrakeDesc = String.valueOf(properties.getProperty("White_Drake_Desc", String.valueOf(Constants.WhiteDrakeDesc)));
        Constants.WhiteDrakeCreatureTypes = Initiator.getPropertyArray(String.valueOf(properties.getProperty("White_Drake_Creature_Types")));
        //============================ SIZE ===========================
        Constants.WhiteDrakeSizeX =  Integer.valueOf(properties.getProperty("White_Drake_SizeX", String.valueOf(Constants.WhiteDrakeSizeX)));
        Constants.WhiteDrakeSizeY =  Integer.valueOf(properties.getProperty("White_Drake_SizeY", String.valueOf(Constants.WhiteDrakeSizeY)));
        Constants.WhiteDrakeSizeZ =  Integer.valueOf(properties.getProperty("White_Drake_SizeZ", String.valueOf(Constants.WhiteDrakeSizeZ)));
        //============================ MISC ===========================
        Constants.WhiteDrakeMaxPop =  Integer.valueOf(properties.getProperty("White_Drake_Max_Population", String.valueOf(Constants.WhiteDrakeMaxPop)));
        Constants.WhiteDrakeMaxAge =  Integer.valueOf(properties.getProperty("White_Drake_Max_Age", String.valueOf(Constants.WhiteDrakeMaxAge)));
        Constants.WhiteDrakeItemsButchered = Initiator.getPropertyArray(String.valueOf(properties.getProperty("White_Drake_Items_Butchered")));
        Constants.WhiteDrakeMoveRate =  Integer.valueOf(properties.getProperty("White_Drake_MoveRate", String.valueOf(Constants.WhiteDrakeMoveRate)));
        //============================ ATTITUDE ===========================
        Constants.WhiteDrakeAggression =  Integer.valueOf(properties.getProperty("White_Drake_Aggression", String.valueOf(Constants.WhiteDrakeAggression)));
        Constants.WhiteDrakeAlignment = Float.valueOf(properties.getProperty("White_Drake_Alignment", String.valueOf(Constants.WhiteDrakeAlignment)));
        Constants.WhiteDrakeVision =  Integer.valueOf(properties.getProperty("White_Drake_Vision", String.valueOf(Constants.WhiteDrakeVision)));
        Constants.WhiteDrakeMaxHuntRange =  Integer.valueOf(properties.getProperty("White_Drake_Max_Hunt_Range", String.valueOf(Constants.WhiteDrakeMaxHuntRange)));
        //============================ VEHICLE ===========================
        Constants.WhiteDrakeSetMaxHeightDiff = Float.valueOf(properties.getProperty("White_Drake_Vehicle_Max_Height_Diff", String.valueOf(Constants.WhiteDrakeSetMaxHeightDiff)));
        Constants.WhiteDrakeVehicleSpeed = Float.valueOf(properties.getProperty("White_Drake_Vehicle_Max_Speed", String.valueOf(Constants.WhiteDrakeVehicleSpeed)));
        Constants.WhiteDrakeVehicleSkill = Float.valueOf(properties.getProperty("White_Drake_Vehicle_Skill_Required", String.valueOf(Constants.WhiteDrakeVehicleSkill)));
        Constants.WhiteDrakeVehicleDepth = Float.valueOf(properties.getProperty("White_Drake_Vehicle_Max_Depth", String.valueOf(Constants.WhiteDrakeVehicleDepth)));
        Constants.WhiteDrakeZAxisOffset = Float.valueOf(properties.getProperty("White_Drake_Vehicle_ZAxis_Offset", String.valueOf(Constants.WhiteDrakeZAxisOffset)));
        Constants.WhiteDrakeMoveSpeed = Float.valueOf(properties.getProperty("White_Drake_Move_Speed", String.valueOf(Constants.WhiteDrakeMoveSpeed)));
        //============================ OFFENSE ===========================
        Constants.WhiteDrakeBaseCombatRating = Float.valueOf(properties.getProperty("White_Drake_Base_Combat_Rating", String.valueOf(Constants.WhiteDrakeBaseCombatRating)));
        Constants.WhiteDrakeCombatDamageType =  Integer.valueOf(properties.getProperty("White_Drake_Combat_Damage_Type", String.valueOf(Constants.WhiteDrakeCombatDamageType)));
        Constants.WhiteDrakeCombatMoves = Initiator.getPropertyArray(String.valueOf(properties.getProperty("White_Drake_Combat_Moves")));
        Constants.WhiteDrakeHeadbuttDamString = String.valueOf(properties.getProperty("White_Drake_Head_butt_Dam_String", String.valueOf(Constants.WhiteDrakeHeadbuttDamString)));
        Constants.WhiteDrakeKickDamString = String.valueOf(properties.getProperty("White_Drake_Kick_Dam_String", String.valueOf(Constants.WhiteDrakeKickDamString)));
        Constants.WhiteDrakeHandDamage = Float.valueOf(properties.getProperty("White_Drake_Hand_Damage", String.valueOf(Constants.WhiteDrakeHandDamage)));
        Constants.WhiteDrakeKickDamage = Float.valueOf(properties.getProperty("White_Drake_Kick_Damage", String.valueOf(Constants.WhiteDrakeKickDamage)));
        Constants.WhiteDrakeBiteDamage = Float.valueOf(properties.getProperty("White_Drake_Bite_Damage", String.valueOf(Constants.WhiteDrakeBiteDamage)));
        Constants.WhiteDrakeHeadDamage = Float.valueOf(properties.getProperty("White_Drake_Head_Damage", String.valueOf(Constants.WhiteDrakeHeadDamage)));
        Constants.WhiteDrakeBreathDamage = Float.valueOf(properties.getProperty("White_Drake_Breath_Damage", String.valueOf(Constants.WhiteDrakeBreathDamage)));
        //============================ DEFENSE ===========================
        Constants.WhiteDrakeNaturalArmour = Float.valueOf(properties.getProperty("White_Drake_Natural_Armour", String.valueOf(Constants.WhiteDrakeNaturalArmour)));
        ////Constants.WhiteDrakeArmourType =  Integer.valueOf(properties.getProperty("White_Drake_Armour_Type", String.valueOf(Constants.WhiteDrakeArmourType)));
        //============================ SKILLS ===========================
        Constants.WhiteDrakeBodyStrength = Float.valueOf(properties.getProperty("White_Drake_Body_Strength", String.valueOf(Constants.WhiteDrakeBodyStrength)));
        Constants.WhiteDrakeBodyControl = Float.valueOf(properties.getProperty("White_Drake_Body_Control", String.valueOf(Constants.WhiteDrakeBodyControl)));
        Constants.WhiteDrakeBodyStamina = Float.valueOf(properties.getProperty("White_Drake_Body_Stamina", String.valueOf(Constants.WhiteDrakeBodyStamina)));
        Constants.WhiteDrakeMindLogic = Float.valueOf(properties.getProperty("White_Drake_Mind_Logic", String.valueOf(Constants.WhiteDrakeMindLogic)));
        Constants.WhiteDrakeMindSpeed = Float.valueOf(properties.getProperty("White_Drake_Mind_Speed", String.valueOf(Constants.WhiteDrakeMindSpeed)));
        Constants.WhiteDrakeSoulStrength = Float.valueOf(properties.getProperty("White_Drake_Soul_Strength", String.valueOf(Constants.WhiteDrakeSoulStrength)));
        Constants.WhiteDrakeSoulDepth = Float.valueOf(properties.getProperty("White_Drake_Soul_Depth", String.valueOf(Constants.WhiteDrakeSoulDepth)));
        Constants.WhiteDrakeWeaponlessFighting = Float.valueOf(properties.getProperty("White_Drake_Weaponless_Fighting", String.valueOf(Constants.WhiteDrakeWeaponlessFighting)));
        Constants.WhiteDrakeGroupFighting = Float.valueOf(properties.getProperty("White_Drake_Group_Fighting", String.valueOf(Constants.WhiteDrakeGroupFighting)));
        //============================ SPAWN ===========================
        Constants.WhiteDrakeSpawnTree = Boolean.valueOf(properties.getProperty("White_Drake_Spawn_Tree", String.valueOf(Constants.WhiteDrakeSpawnTree)));
        Constants.WhiteDrakeSpawnSteppe = Boolean.valueOf(properties.getProperty("White_Drake_Spawn_Steppe", String.valueOf(Constants.WhiteDrakeSpawnSteppe)));
        Constants.WhiteDrakeSpawnGrass = Boolean.valueOf(properties.getProperty("White_Drake_Spawn_Grass", String.valueOf(Constants.WhiteDrakeSpawnGrass)));
        Constants.WhiteDrakeSpawnTundra = Boolean.valueOf(properties.getProperty("White_Drake_Spawn_Tundra", String.valueOf(Constants.WhiteDrakeSpawnTundra)));
        Constants.WhiteDrakeSpawnDirt = Boolean.valueOf(properties.getProperty("White_Drake_Spawn_Dirt", String.valueOf(Constants.WhiteDrakeSpawnDirt)));
        Constants.WhiteDrakeSpawnSand = Boolean.valueOf(properties.getProperty("White_Drake_Spawn_Sand", String.valueOf(Constants.WhiteDrakeSpawnSand)));
        Constants.WhiteDrakeSpawnSnow = Boolean.valueOf(properties.getProperty("White_Drake_Spawn_Snow", String.valueOf(Constants.WhiteDrakeSpawnSnow)));
        Constants.WhiteDrakeSpawnMarsh = Boolean.valueOf(properties.getProperty("White_Drake_Spawn_Marsh", String.valueOf(Constants.WhiteDrakeSpawnMarsh)));
        Constants.WhiteDrakeSpawnCave = Boolean.valueOf(properties.getProperty("White_Drake_Spawn_Cave", String.valueOf(Constants.WhiteDrakeSpawnCave)));
        Constants.WhiteDrakeSpawnPeat = Boolean.valueOf(properties.getProperty("White_Drake_Spawn_Peat", String.valueOf(Constants.WhiteDrakeSpawnPeat)));

        //=====================================================================================================================================
        //======================================================== Basilisks ==================================================================
        //=====================================================================================================================================
        /*
          Black Basilisk
         */
        //============================ MAIN ===========================
        Constants.BlackBasiliskEnabled = Boolean.valueOf(properties.getProperty("Black_Basilisk_Enabled", String.valueOf(Constants.BlackBasiliskEnabled)));
        Constants.BlackBasiliskDesc = String.valueOf(properties.getProperty("Black_Basilisk_Desc", String.valueOf(Constants.BlackBasiliskDesc)));
        Constants.BlackBasiliskCreatureTypes = Initiator.getPropertyArray(String.valueOf(properties.getProperty("Black_Basilisk_Creature_Types")));
        //============================ SIZE ===========================
        Constants.BlackBasiliskSizeX =  Integer.valueOf(properties.getProperty("Black_Basilisk_SizeX", String.valueOf(Constants.BlackBasiliskSizeX)));
        Constants.BlackBasiliskSizeY =  Integer.valueOf(properties.getProperty("Black_Basilisk_SizeY", String.valueOf(Constants.BlackBasiliskSizeY)));
        Constants.BlackBasiliskSizeZ =  Integer.valueOf(properties.getProperty("Black_Basilisk_SizeZ", String.valueOf(Constants.BlackBasiliskSizeZ)));
        //============================ MISC ===========================
        Constants.BlackBasiliskMaxPop =  Integer.valueOf(properties.getProperty("Black_Basilisk_Max_Population", String.valueOf(Constants.BlackBasiliskMaxPop)));
        Constants.BlackBasiliskMaxAge =  Integer.valueOf(properties.getProperty("Black_Basilisk_Max_Age", String.valueOf(Constants.BlackBasiliskMaxAge)));
        Constants.BlackBasiliskItemsButchered = Initiator.getPropertyArray(String.valueOf(properties.getProperty("Black_Basilisk_Items_Butchered")));
        Constants.BlackBasiliskMoveRate =  Integer.valueOf(properties.getProperty("Black_Basilisk_MoveRate", String.valueOf(Constants.BlackBasiliskMoveRate)));
        //============================ ATTITUDE ===========================
        Constants.BlackBasiliskAggression =  Integer.valueOf(properties.getProperty("Black_Basilisk_Aggression", String.valueOf(Constants.BlackBasiliskAggression)));
        Constants.BlackBasiliskAlignment = Float.valueOf(properties.getProperty("Black_Basilisk_Alignment", String.valueOf(Constants.BlackBasiliskAlignment)));
        Constants.BlackBasiliskVision =  Integer.valueOf(properties.getProperty("Black_Basilisk_Vision", String.valueOf(Constants.BlackBasiliskVision)));
        Constants.BlackBasiliskMaxHuntRange =  Integer.valueOf(properties.getProperty("Black_Basilisk_Max_Hunt_Range", String.valueOf(Constants.BlackBasiliskMaxHuntRange)));
        //============================ VEHICLE ===========================
        Constants.BlackBasiliskSetMaxHeightDiff = Float.valueOf(properties.getProperty("Black_Basilisk_Vehicle_Max_Height_Diff", String.valueOf(Constants.BlackBasiliskSetMaxHeightDiff)));
        Constants.BlackBasiliskVehicleSpeed = Float.valueOf(properties.getProperty("Black_Basilisk_Vehicle_Max_Speed", String.valueOf(Constants.BlackBasiliskVehicleSpeed)));
        Constants.BlackBasiliskVehicleSkill = Float.valueOf(properties.getProperty("Black_Basilisk_Vehicle_Skill_Required", String.valueOf(Constants.BlackBasiliskVehicleSkill)));
        Constants.BlackBasiliskVehicleDepth = Float.valueOf(properties.getProperty("Black_Basilisk_Vehicle_Max_Depth", String.valueOf(Constants.BlackBasiliskVehicleDepth)));
        Constants.BlackBasiliskZAxisOffset = Float.valueOf(properties.getProperty("Black_Basilisk_Vehicle_ZAxis_Offset", String.valueOf(Constants.BlackBasiliskZAxisOffset)));
        Constants.BlackBasiliskMoveSpeed = Float.valueOf(properties.getProperty("Black_Basilisk_Move_Speed", String.valueOf(Constants.BlackBasiliskMoveSpeed)));
        //============================ OFFENSE ===========================
        Constants.BlackBasiliskBaseCombatRating = Float.valueOf(properties.getProperty("Black_Basilisk_Base_Combat_Rating", String.valueOf(Constants.BlackBasiliskBaseCombatRating)));
        Constants.BlackBasiliskCombatDamageType =  Integer.valueOf(properties.getProperty("Black_Basilisk_Combat_Damage_Type", String.valueOf(Constants.BlackBasiliskCombatDamageType)));
        Constants.BlackBasiliskCombatMoves = Initiator.getPropertyArray(String.valueOf(properties.getProperty("Black_Basilisk_Combat_Moves")));
        Constants.BlackBasiliskHeadbuttDamString = String.valueOf(properties.getProperty("Black_Basilisk_Head_butt_Dam_String", String.valueOf(Constants.BlackBasiliskHeadbuttDamString)));
        Constants.BlackBasiliskKickDamString = String.valueOf(properties.getProperty("Black_Basilisk_Kick_Dam_String", String.valueOf(Constants.BlackBasiliskKickDamString)));
        Constants.BlackBasiliskHandDamage = Float.valueOf(properties.getProperty("Black_Basilisk_Hand_Damage", String.valueOf(Constants.BlackBasiliskHandDamage)));
        Constants.BlackBasiliskKickDamage = Float.valueOf(properties.getProperty("Black_Basilisk_Kick_Damage", String.valueOf(Constants.BlackBasiliskKickDamage)));
        Constants.BlackBasiliskBiteDamage = Float.valueOf(properties.getProperty("Black_Basilisk_Bite_Damage", String.valueOf(Constants.BlackBasiliskBiteDamage)));
        Constants.BlackBasiliskHeadDamage = Float.valueOf(properties.getProperty("Black_Basilisk_Head_Damage", String.valueOf(Constants.BlackBasiliskHeadDamage)));
        Constants.BlackBasiliskBreathDamage = Float.valueOf(properties.getProperty("Black_Basilisk_Breath_Damage", String.valueOf(Constants.BlackBasiliskBreathDamage)));
        //============================ DEFENSE ===========================
        Constants.BlackBasiliskNaturalArmour = Float.valueOf(properties.getProperty("Black_Basilisk_Natural_Armour", String.valueOf(Constants.BlackBasiliskNaturalArmour)));
        //Constants.BlackBasiliskArmourType =  Integer.valueOf(properties.getProperty("Black_Basilisk_Armour_Type", String.valueOf(Constants.BlackBasiliskArmourType)));
        //============================ SKILLS ===========================
        Constants.BlackBasiliskBodyStrength = Float.valueOf(properties.getProperty("Black_Basilisk_Body_Strength", String.valueOf(Constants.BlackBasiliskBodyStrength)));
        Constants.BlackBasiliskBodyControl = Float.valueOf(properties.getProperty("Black_Basilisk_Body_Control", String.valueOf(Constants.BlackBasiliskBodyControl)));
        Constants.BlackBasiliskBodyStamina = Float.valueOf(properties.getProperty("Black_Basilisk_Body_Stamina", String.valueOf(Constants.BlackBasiliskBodyStamina)));
        Constants.BlackBasiliskMindLogic = Float.valueOf(properties.getProperty("Black_Basilisk_Mind_Logic", String.valueOf(Constants.BlackBasiliskMindLogic)));
        Constants.BlackBasiliskMindSpeed = Float.valueOf(properties.getProperty("Black_Basilisk_Mind_Speed", String.valueOf(Constants.BlackBasiliskMindSpeed)));
        Constants.BlackBasiliskSoulStrength = Float.valueOf(properties.getProperty("Black_Basilisk_Soul_Strength", String.valueOf(Constants.BlackBasiliskSoulStrength)));
        Constants.BlackBasiliskSoulDepth = Float.valueOf(properties.getProperty("Black_Basilisk_Soul_Depth", String.valueOf(Constants.BlackBasiliskSoulDepth)));
        Constants.BlackBasiliskWeaponlessFighting = Float.valueOf(properties.getProperty("Black_Basilisk_Weaponless_Fighting", String.valueOf(Constants.BlackBasiliskWeaponlessFighting)));
        Constants.BlackBasiliskGroupFighting = Float.valueOf(properties.getProperty("Black_Basilisk_Group_Fighting", String.valueOf(Constants.BlackBasiliskGroupFighting)));
        //============================ SPAWN ===========================
        Constants.BlackBasiliskSpawnTree = Boolean.valueOf(properties.getProperty("Black_Basilisk_Spawn_Tree", String.valueOf(Constants.BlackBasiliskSpawnTree)));
        Constants.BlackBasiliskSpawnSteppe = Boolean.valueOf(properties.getProperty("Black_Basilisk_Spawn_Steppe", String.valueOf(Constants.BlackBasiliskSpawnSteppe)));
        Constants.BlackBasiliskSpawnGrass = Boolean.valueOf(properties.getProperty("Black_Basilisk_Spawn_Grass", String.valueOf(Constants.BlackBasiliskSpawnGrass)));
        Constants.BlackBasiliskSpawnTundra = Boolean.valueOf(properties.getProperty("Black_Basilisk_Spawn_Tundra", String.valueOf(Constants.BlackBasiliskSpawnTundra)));
        Constants.BlackBasiliskSpawnDirt = Boolean.valueOf(properties.getProperty("Black_Basilisk_Spawn_Dirt", String.valueOf(Constants.BlackBasiliskSpawnDirt)));
        Constants.BlackBasiliskSpawnSand = Boolean.valueOf(properties.getProperty("Black_Basilisk_Spawn_Sand", String.valueOf(Constants.BlackBasiliskSpawnSand)));
        Constants.BlackBasiliskSpawnSnow = Boolean.valueOf(properties.getProperty("Black_Basilisk_Spawn_Snow", String.valueOf(Constants.BlackBasiliskSpawnSnow)));
        Constants.BlackBasiliskSpawnMarsh = Boolean.valueOf(properties.getProperty("Black_Basilisk_Spawn_Marsh", String.valueOf(Constants.BlackBasiliskSpawnMarsh)));
        Constants.BlackBasiliskSpawnCave = Boolean.valueOf(properties.getProperty("Black_Basilisk_Spawn_Cave", String.valueOf(Constants.BlackBasiliskSpawnCave)));
        Constants.BlackBasiliskSpawnPeat = Boolean.valueOf(properties.getProperty("Black_Basilisk_Spawn_Peat", String.valueOf(Constants.BlackBasiliskSpawnPeat)));
        /*
          Blue Basilisk
         */
        //============================ MAIN ===========================
        Constants.BlueBasiliskEnabled = Boolean.valueOf(properties.getProperty("Blue_Basilisk_Enabled", String.valueOf(Constants.BlueBasiliskEnabled)));
        Constants.BlueBasiliskDesc = String.valueOf(properties.getProperty("Blue_Basilisk_Desc", String.valueOf(Constants.BlueBasiliskDesc)));
        Constants.BlueBasiliskCreatureTypes = Initiator.getPropertyArray(String.valueOf(properties.getProperty("Blue_Basilisk_Creature_Types")));
        //============================ SIZE ===========================
        Constants.BlueBasiliskSizeX =  Integer.valueOf(properties.getProperty("Blue_Basilisk_SizeX", String.valueOf(Constants.BlueBasiliskSizeX)));
        Constants.BlueBasiliskSizeY =  Integer.valueOf(properties.getProperty("Blue_Basilisk_SizeY", String.valueOf(Constants.BlueBasiliskSizeY)));
        Constants.BlueBasiliskSizeZ =  Integer.valueOf(properties.getProperty("Blue_Basilisk_SizeZ", String.valueOf(Constants.BlueBasiliskSizeZ)));
        //============================ MISC ===========================
        Constants.BlueBasiliskMaxPop =  Integer.valueOf(properties.getProperty("Blue_Basilisk_Max_Population", String.valueOf(Constants.BlueBasiliskMaxPop)));
        Constants.BlueBasiliskMaxAge =  Integer.valueOf(properties.getProperty("Blue_Basilisk_Max_Age", String.valueOf(Constants.BlueBasiliskMaxAge)));
        Constants.BlueBasiliskItemsButchered = Initiator.getPropertyArray(String.valueOf(properties.getProperty("Blue_Basilisk_Items_Butchered")));
        Constants.BlueBasiliskMoveRate =  Integer.valueOf(properties.getProperty("Blue_Basilisk_MoveRate", String.valueOf(Constants.BlueBasiliskMoveRate)));
        //============================ ATTITUDE ===========================
        Constants.BlueBasiliskAggression =  Integer.valueOf(properties.getProperty("Blue_Basilisk_Aggression", String.valueOf(Constants.BlueBasiliskAggression)));
        Constants.BlueBasiliskAlignment = Float.valueOf(properties.getProperty("Blue_Basilisk_Alignment", String.valueOf(Constants.BlueBasiliskAlignment)));
        Constants.BlueBasiliskVision =  Integer.valueOf(properties.getProperty("Blue_Basilisk_Vision", String.valueOf(Constants.BlueBasiliskVision)));
        Constants.BlueBasiliskMaxHuntRange =  Integer.valueOf(properties.getProperty("Blue_Basilisk_Max_Hunt_Range", String.valueOf(Constants.BlueBasiliskMaxHuntRange)));
        //============================ VEHICLE ===========================
        Constants.BlueBasiliskSetMaxHeightDiff = Float.valueOf(properties.getProperty("Blue_Basilisk_Vehicle_Max_Height_Diff", String.valueOf(Constants.BlueBasiliskSetMaxHeightDiff)));
        Constants.BlueBasiliskVehicleSpeed = Float.valueOf(properties.getProperty("Blue_Basilisk_Vehicle_Max_Speed", String.valueOf(Constants.BlueBasiliskVehicleSpeed)));
        Constants.BlueBasiliskVehicleSkill = Float.valueOf(properties.getProperty("Blue_Basilisk_Vehicle_Skill_Required", String.valueOf(Constants.BlueBasiliskVehicleSkill)));
        Constants.BlueBasiliskVehicleDepth = Float.valueOf(properties.getProperty("Blue_Basilisk_Vehicle_Max_Depth", String.valueOf(Constants.BlueBasiliskVehicleDepth)));
        Constants.BlueBasiliskZAxisOffset = Float.valueOf(properties.getProperty("Blue_Basilisk_Vehicle_ZAxis_Offset", String.valueOf(Constants.BlueBasiliskZAxisOffset)));
        Constants.BlueBasiliskMoveSpeed = Float.valueOf(properties.getProperty("Blue_Basilisk_Move_Speed", String.valueOf(Constants.BlueBasiliskMoveSpeed)));
        //============================ OFFENSE ===========================
        Constants.BlueBasiliskBaseCombatRating = Float.valueOf(properties.getProperty("Blue_Basilisk_Base_Combat_Rating", String.valueOf(Constants.BlueBasiliskBaseCombatRating)));
        Constants.BlueBasiliskCombatDamageType =  Integer.valueOf(properties.getProperty("Blue_Basilisk_Combat_Damage_Type", String.valueOf(Constants.BlueBasiliskCombatDamageType)));
        Constants.BlueBasiliskCombatMoves = Initiator.getPropertyArray(String.valueOf(properties.getProperty("Blue_Basilisk_Combat_Moves")));
        Constants.BlueBasiliskHeadbuttDamString = String.valueOf(properties.getProperty("Blue_Basilisk_Head_butt_Dam_String", String.valueOf(Constants.BlueBasiliskHeadbuttDamString)));
        Constants.BlueBasiliskKickDamString = String.valueOf(properties.getProperty("Blue_Basilisk_Kick_Dam_String", String.valueOf(Constants.BlueBasiliskKickDamString)));
        Constants.BlueBasiliskHandDamage = Float.valueOf(properties.getProperty("Blue_Basilisk_Hand_Damage", String.valueOf(Constants.BlueBasiliskHandDamage)));
        Constants.BlueBasiliskKickDamage = Float.valueOf(properties.getProperty("Blue_Basilisk_Kick_Damage", String.valueOf(Constants.BlueBasiliskKickDamage)));
        Constants.BlueBasiliskBiteDamage = Float.valueOf(properties.getProperty("Blue_Basilisk_Bite_Damage", String.valueOf(Constants.BlueBasiliskBiteDamage)));
        Constants.BlueBasiliskHeadDamage = Float.valueOf(properties.getProperty("Blue_Basilisk_Head_Damage", String.valueOf(Constants.BlueBasiliskHeadDamage)));
        Constants.BlueBasiliskBreathDamage = Float.valueOf(properties.getProperty("Blue_Basilisk_Breath_Damage", String.valueOf(Constants.BlueBasiliskBreathDamage)));
        //============================ DEFENSE ===========================
        Constants.BlueBasiliskNaturalArmour = Float.valueOf(properties.getProperty("Blue_Basilisk_Natural_Armour", String.valueOf(Constants.BlueBasiliskNaturalArmour)));
        //Constants.BlueBasiliskArmourType =  ArmourTemplate.ArmourType.(properties.getProperty("Blue_Basilisk_Armour_Type"));
        //============================ SKILLS ===========================
        Constants.BlueBasiliskBodyStrength = Float.valueOf(properties.getProperty("Blue_Basilisk_Body_Strength", String.valueOf(Constants.BlueBasiliskBodyStrength)));
        Constants.BlueBasiliskBodyControl = Float.valueOf(properties.getProperty("Blue_Basilisk_Body_Control", String.valueOf(Constants.BlueBasiliskBodyControl)));
        Constants.BlueBasiliskBodyStamina = Float.valueOf(properties.getProperty("Blue_Basilisk_Body_Stamina", String.valueOf(Constants.BlueBasiliskBodyStamina)));
        Constants.BlueBasiliskMindLogic = Float.valueOf(properties.getProperty("Blue_Basilisk_Mind_Logic", String.valueOf(Constants.BlueBasiliskMindLogic)));
        Constants.BlueBasiliskMindSpeed = Float.valueOf(properties.getProperty("Blue_Basilisk_Mind_Speed", String.valueOf(Constants.BlueBasiliskMindSpeed)));
        Constants.BlueBasiliskSoulStrength = Float.valueOf(properties.getProperty("Blue_Basilisk_Soul_Strength", String.valueOf(Constants.BlueBasiliskSoulStrength)));
        Constants.BlueBasiliskSoulDepth = Float.valueOf(properties.getProperty("Blue_Basilisk_Soul_Depth", String.valueOf(Constants.BlueBasiliskSoulDepth)));
        Constants.BlueBasiliskWeaponlessFighting = Float.valueOf(properties.getProperty("Blue_Basilisk_Weaponless_Fighting", String.valueOf(Constants.BlueBasiliskWeaponlessFighting)));
        Constants.BlueBasiliskGroupFighting = Float.valueOf(properties.getProperty("Blue_Basilisk_Group_Fighting", String.valueOf(Constants.BlueBasiliskGroupFighting)));
        //============================ SPAWN ===========================
        Constants.BlueBasiliskSpawnTree = Boolean.valueOf(properties.getProperty("Blue_Basilisk_Spawn_Tree", String.valueOf(Constants.BlueBasiliskSpawnTree)));
        Constants.BlueBasiliskSpawnSteppe = Boolean.valueOf(properties.getProperty("Blue_Basilisk_Spawn_Steppe", String.valueOf(Constants.BlueBasiliskSpawnSteppe)));
        Constants.BlueBasiliskSpawnGrass = Boolean.valueOf(properties.getProperty("Blue_Basilisk_Spawn_Grass", String.valueOf(Constants.BlueBasiliskSpawnGrass)));
        Constants.BlueBasiliskSpawnTundra = Boolean.valueOf(properties.getProperty("Blue_Basilisk_Spawn_Tundra", String.valueOf(Constants.BlueBasiliskSpawnTundra)));
        Constants.BlueBasiliskSpawnDirt = Boolean.valueOf(properties.getProperty("Blue_Basilisk_Spawn_Dirt", String.valueOf(Constants.BlueBasiliskSpawnDirt)));
        Constants.BlueBasiliskSpawnSand = Boolean.valueOf(properties.getProperty("Blue_Basilisk_Spawn_Sand", String.valueOf(Constants.BlueBasiliskSpawnSand)));
        Constants.BlueBasiliskSpawnSnow = Boolean.valueOf(properties.getProperty("Blue_Basilisk_Spawn_Snow", String.valueOf(Constants.BlueBasiliskSpawnSnow)));
        Constants.BlueBasiliskSpawnMarsh = Boolean.valueOf(properties.getProperty("Blue_Basilisk_Spawn_Marsh", String.valueOf(Constants.BlueBasiliskSpawnMarsh)));
        Constants.BlueBasiliskSpawnCave = Boolean.valueOf(properties.getProperty("Blue_Basilisk_Spawn_Cave", String.valueOf(Constants.BlueBasiliskSpawnCave)));
        Constants.BlueBasiliskSpawnPeat = Boolean.valueOf(properties.getProperty("Blue_Basilisk_Spawn_Peat", String.valueOf(Constants.BlueBasiliskSpawnPeat)));
        /*
          Ghost Basilisk
         */
        //============================ MAIN ===========================
        Constants.GhostBasiliskEnabled = Boolean.valueOf(properties.getProperty("Spectral_Basilisk_Enabled", String.valueOf(Constants.GhostBasiliskEnabled)));
        Constants.GhostBasiliskDesc = String.valueOf(properties.getProperty("Spectral_Basilisk_Desc", String.valueOf(Constants.GhostBasiliskDesc)));
        Constants.GhostBasiliskCreatureTypes = Initiator.getPropertyArray(String.valueOf(properties.getProperty("Spectral_Basilisk_Creature_Types")));
        Constants.GhostBasiliskModelColor = String.valueOf(properties.getProperty("Ghost_Basilisk_Model_Color", String.valueOf(Constants.GhostBasiliskModelColor)));
        //============================ SIZE ===========================
        Constants.GhostBasiliskSizeX =  Integer.valueOf(properties.getProperty("Spectral_Basilisk_SizeX", String.valueOf(Constants.GhostBasiliskSizeX)));
        Constants.GhostBasiliskSizeY =  Integer.valueOf(properties.getProperty("Spectral_Basilisk_SizeY", String.valueOf(Constants.GhostBasiliskSizeY)));
        Constants.GhostBasiliskSizeZ =  Integer.valueOf(properties.getProperty("Spectral_Basilisk_SizeZ", String.valueOf(Constants.GhostBasiliskSizeZ)));
        //============================ MISC ===========================
        Constants.GhostBasiliskMaxPop =  Integer.valueOf(properties.getProperty("Spectral_Basilisk_Max_Population", String.valueOf(Constants.GhostBasiliskMaxPop)));
        Constants.GhostBasiliskMaxAge =  Integer.valueOf(properties.getProperty("Spectral_Basilisk_Max_Age", String.valueOf(Constants.GhostBasiliskMaxAge)));
        Constants.GhostBasiliskItemsButchered = Initiator.getPropertyArray(String.valueOf(properties.getProperty("Spectral_Basilisk_Items_Butchered")));
        Constants.GhostBasiliskMoveRate =  Integer.valueOf(properties.getProperty("Spectral_Basilisk_MoveRate", String.valueOf(Constants.GhostBasiliskMoveRate)));
        //============================ ATTITUDE ===========================
        Constants.GhostBasiliskAggression =  Integer.valueOf(properties.getProperty("Spectral_Basilisk_Aggression", String.valueOf(Constants.GhostBasiliskAggression)));
        Constants.GhostBasiliskAlignment = Float.valueOf(properties.getProperty("Spectral_Basilisk_Alignment", String.valueOf(Constants.GhostBasiliskAlignment)));
        Constants.GhostBasiliskVision =  Integer.valueOf(properties.getProperty("Spectral_Basilisk_Vision", String.valueOf(Constants.GhostBasiliskVision)));
        Constants.GhostBasiliskMaxHuntRange =  Integer.valueOf(properties.getProperty("Spectral_Basilisk_Max_Hunt_Range", String.valueOf(Constants.GhostBasiliskMaxHuntRange)));
        //============================ VEHICLE ===========================
        Constants.GhostBasiliskSetMaxHeightDiff = Float.valueOf(properties.getProperty("Spectral_Basilisk_Vehicle_Max_Height_Diff", String.valueOf(Constants.GhostBasiliskSetMaxHeightDiff)));
        Constants.GhostBasiliskVehicleSpeed = Float.valueOf(properties.getProperty("Spectral_Basilisk_Vehicle_Max_Speed", String.valueOf(Constants.GhostBasiliskVehicleSpeed)));
        Constants.GhostBasiliskVehicleSkill = Float.valueOf(properties.getProperty("Spectral_Basilisk_Vehicle_Skill_Required", String.valueOf(Constants.GhostBasiliskVehicleSkill)));
        Constants.GhostBasiliskVehicleDepth = Float.valueOf(properties.getProperty("Spectral_Basilisk_Vehicle_Max_Depth", String.valueOf(Constants.GhostBasiliskVehicleDepth)));
        Constants.GhostBasiliskZAxisOffset = Float.valueOf(properties.getProperty("Spectral_Basilisk_Vehicle_ZAxis_Offset", String.valueOf(Constants.GhostBasiliskZAxisOffset)));
        Constants.GhostBasiliskMoveSpeed = Float.valueOf(properties.getProperty("Spectral_Basilisk_Move_Speed", String.valueOf(Constants.GhostBasiliskMoveSpeed)));
        //============================ OFFENSE ===========================
        Constants.GhostBasiliskBaseCombatRating = Float.valueOf(properties.getProperty("Spectral_Basilisk_Base_Combat_Rating", String.valueOf(Constants.GhostBasiliskBaseCombatRating)));
        Constants.GhostBasiliskCombatDamageType =  Integer.valueOf(properties.getProperty("Spectral_Basilisk_Combat_Damage_Type", String.valueOf(Constants.GhostBasiliskCombatDamageType)));
        Constants.GhostBasiliskCombatMoves = Initiator.getPropertyArray(String.valueOf(properties.getProperty("Spectral_Basilisk_Combat_Moves")));
        Constants.GhostBasiliskHeadbuttDamString = String.valueOf(properties.getProperty("Spectral_Basilisk_Head_butt_Dam_String", String.valueOf(Constants.GhostBasiliskHeadbuttDamString)));
        Constants.GhostBasiliskKickDamString = String.valueOf(properties.getProperty("Spectral_Basilisk_Kick_Dam_String", String.valueOf(Constants.GhostBasiliskKickDamString)));
        Constants.GhostBasiliskHandDamage = Float.valueOf(properties.getProperty("Spectral_Basilisk_Hand_Damage", String.valueOf(Constants.GhostBasiliskHandDamage)));
        Constants.GhostBasiliskKickDamage = Float.valueOf(properties.getProperty("Spectral_Basilisk_Kick_Damage", String.valueOf(Constants.GhostBasiliskKickDamage)));
        Constants.GhostBasiliskBiteDamage = Float.valueOf(properties.getProperty("Spectral_Basilisk_Bite_Damage", String.valueOf(Constants.GhostBasiliskBiteDamage)));
        Constants.GhostBasiliskHeadDamage = Float.valueOf(properties.getProperty("Spectral_Basilisk_Head_Damage", String.valueOf(Constants.GhostBasiliskHeadDamage)));
        Constants.GhostBasiliskBreathDamage = Float.valueOf(properties.getProperty("Spectral_Basilisk_Breath_Damage", String.valueOf(Constants.GhostBasiliskBreathDamage)));
        //============================ DEFENSE ===========================
        Constants.GhostBasiliskNaturalArmour = Float.valueOf(properties.getProperty("Spectral_Basilisk_Natural_Armour", String.valueOf(Constants.GhostBasiliskNaturalArmour)));
        ////Constants.GhostBasiliskArmourType =  Integer.valueOf(properties.getProperty("Spectral_Basilisk_Armour_Type", String.valueOf(Constants.BasiliskEggLayer)));
        //============================ SKILLS ===========================
        Constants.GhostBasiliskBodyStrength = Float.valueOf(properties.getProperty("Spectral_Basilisk_Body_Strength", String.valueOf(Constants.GhostBasiliskBodyStrength)));
        Constants.GhostBasiliskBodyControl = Float.valueOf(properties.getProperty("Spectral_Basilisk_Body_Control", String.valueOf(Constants.GhostBasiliskBodyControl)));
        Constants.GhostBasiliskBodyStamina = Float.valueOf(properties.getProperty("Spectral_Basilisk_Body_Stamina", String.valueOf(Constants.GhostBasiliskBodyStamina)));
        Constants.GhostBasiliskMindLogic = Float.valueOf(properties.getProperty("Spectral_Basilisk_Mind_Logic", String.valueOf(Constants.GhostBasiliskMindLogic)));
        Constants.GhostBasiliskMindSpeed = Float.valueOf(properties.getProperty("Spectral_Basilisk_Mind_Speed", String.valueOf(Constants.GhostBasiliskMindSpeed)));
        Constants.GhostBasiliskSoulStrength = Float.valueOf(properties.getProperty("Spectral_Basilisk_Soul_Strength", String.valueOf(Constants.GhostBasiliskSoulStrength)));
        Constants.GhostBasiliskSoulDepth = Float.valueOf(properties.getProperty("Spectral_Basilisk_Soul_Depth", String.valueOf(Constants.GhostBasiliskSoulDepth)));
        Constants.GhostBasiliskWeaponlessFighting = Float.valueOf(properties.getProperty("Spectral_Basilisk_Weaponless_Fighting", String.valueOf(Constants.GhostBasiliskWeaponlessFighting)));
        Constants.GhostBasiliskGroupFighting = Float.valueOf(properties.getProperty("Spectral_Basilisk_Group_Fighting", String.valueOf(Constants.GhostBasiliskGroupFighting)));
        //============================ SPAWN ===========================
        Constants.GhostBasiliskSpawnTree = Boolean.valueOf(properties.getProperty("Spectral_Basilisk_Spawn_Tree", String.valueOf(Constants.GhostBasiliskSpawnTree)));
        Constants.GhostBasiliskSpawnSteppe = Boolean.valueOf(properties.getProperty("Spectral_Basilisk_Spawn_Steppe", String.valueOf(Constants.GhostBasiliskSpawnSteppe)));
        Constants.GhostBasiliskSpawnGrass = Boolean.valueOf(properties.getProperty("Spectral_Basilisk_Spawn_Grass", String.valueOf(Constants.GhostBasiliskSpawnGrass)));
        Constants.GhostBasiliskSpawnTundra = Boolean.valueOf(properties.getProperty("Spectral_Basilisk_Spawn_Tundra", String.valueOf(Constants.GhostBasiliskSpawnTundra)));
        Constants.GhostBasiliskSpawnDirt = Boolean.valueOf(properties.getProperty("Spectral_Basilisk_Spawn_Dirt", String.valueOf(Constants.GhostBasiliskSpawnDirt)));
        Constants.GhostBasiliskSpawnSand = Boolean.valueOf(properties.getProperty("Spectral_Basilisk_Spawn_Sand", String.valueOf(Constants.GhostBasiliskSpawnSand)));
        Constants.GhostBasiliskSpawnSnow = Boolean.valueOf(properties.getProperty("Spectral_Basilisk_Spawn_Snow", String.valueOf(Constants.GhostBasiliskSpawnSnow)));
        Constants.GhostBasiliskSpawnMarsh = Boolean.valueOf(properties.getProperty("Spectral_Basilisk_Spawn_Marsh", String.valueOf(Constants.GhostBasiliskSpawnMarsh)));
        Constants.GhostBasiliskSpawnCave = Boolean.valueOf(properties.getProperty("Spectral_Basilisk_Spawn_Cave", String.valueOf(Constants.GhostBasiliskSpawnCave)));
        Constants.GhostBasiliskSpawnPeat = Boolean.valueOf(properties.getProperty("Spectral_Basilisk_Spawn_Peat", String.valueOf(Constants.GhostBasiliskSpawnPeat)));
        /*
          Green Basilisk
         */
        //============================ MAIN ===========================
        Constants.GreenBasiliskEnabled = Boolean.valueOf(properties.getProperty("Green_Basilisk_Enabled", String.valueOf(Constants.GreenBasiliskEnabled)));
        Constants.GreenBasiliskDesc = String.valueOf(properties.getProperty("Green_Basilisk_Desc", String.valueOf(Constants.GreenBasiliskDesc)));
        Constants.GreenBasiliskCreatureTypes = Initiator.getPropertyArray(String.valueOf(properties.getProperty("Green_Basilisk_Creature_Types")));
        //============================ SIZE ===========================
        Constants.GreenBasiliskSizeX =  Integer.valueOf(properties.getProperty("Green_Basilisk_SizeX", String.valueOf(Constants.GreenBasiliskSizeX)));
        Constants.GreenBasiliskSizeY =  Integer.valueOf(properties.getProperty("Green_Basilisk_SizeY", String.valueOf(Constants.GreenBasiliskSizeY)));
        Constants.GreenBasiliskSizeZ =  Integer.valueOf(properties.getProperty("Green_Basilisk_SizeZ", String.valueOf(Constants.GreenBasiliskSizeZ)));
        //============================ MISC ===========================
        Constants.GreenBasiliskMaxPop =  Integer.valueOf(properties.getProperty("Green_Basilisk_Max_Population", String.valueOf(Constants.GreenBasiliskMaxPop)));
        Constants.GreenBasiliskMaxAge =  Integer.valueOf(properties.getProperty("Green_Basilisk_Max_Age", String.valueOf(Constants.GreenBasiliskMaxAge)));
        Constants.GreenBasiliskItemsButchered = Initiator.getPropertyArray(String.valueOf(properties.getProperty("Green_Basilisk_Items_Butchered")));
        Constants.GreenBasiliskMoveRate =  Integer.valueOf(properties.getProperty("Green_Basilisk_MoveRate", String.valueOf(Constants.GreenBasiliskMoveRate)));
        //============================ ATTITUDE ===========================
        Constants.GreenBasiliskAggression =  Integer.valueOf(properties.getProperty("Green_Basilisk_Aggression", String.valueOf(Constants.GreenBasiliskAggression)));
        Constants.GreenBasiliskAlignment = Float.valueOf(properties.getProperty("Green_Basilisk_Alignment", String.valueOf(Constants.GreenBasiliskAlignment)));
        Constants.GreenBasiliskVision =  Integer.valueOf(properties.getProperty("Green_Basilisk_Vision", String.valueOf(Constants.GreenBasiliskVision)));
        Constants.GreenBasiliskMaxHuntRange =  Integer.valueOf(properties.getProperty("Green_Basilisk_Max_Hunt_Range", String.valueOf(Constants.GreenBasiliskMaxHuntRange)));
        //============================ VEHICLE ===========================
        Constants.GreenBasiliskSetMaxHeightDiff = Float.valueOf(properties.getProperty("Green_Basilisk_Vehicle_Max_Height_Diff", String.valueOf(Constants.GreenBasiliskSetMaxHeightDiff)));
        Constants.GreenBasiliskVehicleSpeed = Float.valueOf(properties.getProperty("Green_Basilisk_Vehicle_Max_Speed", String.valueOf(Constants.GreenBasiliskVehicleSpeed)));
        Constants.GreenBasiliskVehicleSkill = Float.valueOf(properties.getProperty("Green_Basilisk_Vehicle_Skill_Required", String.valueOf(Constants.GreenBasiliskVehicleSkill)));
        Constants.GreenBasiliskVehicleDepth = Float.valueOf(properties.getProperty("Green_Basilisk_Vehicle_Max_Depth", String.valueOf(Constants.GreenBasiliskVehicleDepth)));
        Constants.GreenBasiliskZAxisOffset = Float.valueOf(properties.getProperty("Green_Basilisk_Vehicle_ZAxis_Offset", String.valueOf(Constants.GreenBasiliskZAxisOffset)));
        Constants.GreenBasiliskMoveSpeed = Float.valueOf(properties.getProperty("Green_Basilisk_Move_Speed", String.valueOf(Constants.GreenBasiliskMoveSpeed)));
        //============================ OFFENSE ===========================
        Constants.GreenBasiliskBaseCombatRating = Float.valueOf(properties.getProperty("Green_Basilisk_Base_Combat_Rating", String.valueOf(Constants.GreenBasiliskBaseCombatRating)));
        Constants.GreenBasiliskCombatDamageType =  Integer.valueOf(properties.getProperty("Green_Basilisk_Combat_Damage_Type", String.valueOf(Constants.GreenBasiliskCombatDamageType)));
        Constants.GreenBasiliskCombatMoves = Initiator.getPropertyArray(String.valueOf(properties.getProperty("Green_Basilisk_Combat_Moves")));
        Constants.GreenBasiliskHeadbuttDamString = String.valueOf(properties.getProperty("Green_Basilisk_Head_butt_Dam_String", String.valueOf(Constants.GreenBasiliskHeadbuttDamString)));
        Constants.GreenBasiliskKickDamString = String.valueOf(properties.getProperty("Green_Basilisk_Kick_Dam_String", String.valueOf(Constants.GreenBasiliskKickDamString)));
        Constants.GreenBasiliskHandDamage = Float.valueOf(properties.getProperty("Green_Basilisk_Hand_Damage", String.valueOf(Constants.GreenBasiliskHandDamage)));
        Constants.GreenBasiliskKickDamage = Float.valueOf(properties.getProperty("Green_Basilisk_Kick_Damage", String.valueOf(Constants.GreenBasiliskKickDamage)));
        Constants.GreenBasiliskBiteDamage = Float.valueOf(properties.getProperty("Green_Basilisk_Bite_Damage", String.valueOf(Constants.GreenBasiliskBiteDamage)));
        Constants.GreenBasiliskHeadDamage = Float.valueOf(properties.getProperty("Green_Basilisk_Head_Damage", String.valueOf(Constants.GreenBasiliskHeadDamage)));
        Constants.GreenBasiliskBreathDamage = Float.valueOf(properties.getProperty("Green_Basilisk_Breath_Damage", String.valueOf(Constants.GreenBasiliskBreathDamage)));
        //============================ DEFENSE ===========================
        Constants.GreenBasiliskNaturalArmour = Float.valueOf(properties.getProperty("Green_Basilisk_Natural_Armour", String.valueOf(Constants.GreenBasiliskNaturalArmour)));
        ////Constants.GreenBasiliskArmourType =  Integer.valueOf(properties.getProperty("Green_Basilisk_Armour_Type", String.valueOf(Constants.BasiliskEggLayer)));
        //============================ SKILLS ===========================
        Constants.GreenBasiliskBodyStrength = Float.valueOf(properties.getProperty("Green_Basilisk_Body_Strength", String.valueOf(Constants.GreenBasiliskBodyStrength)));
        Constants.GreenBasiliskBodyControl = Float.valueOf(properties.getProperty("Green_Basilisk_Body_Control", String.valueOf(Constants.GreenBasiliskBodyControl)));
        Constants.GreenBasiliskBodyStamina = Float.valueOf(properties.getProperty("Green_Basilisk_Body_Stamina", String.valueOf(Constants.GreenBasiliskBodyStamina)));
        Constants.GreenBasiliskMindLogic = Float.valueOf(properties.getProperty("Green_Basilisk_Mind_Logic", String.valueOf(Constants.GreenBasiliskMindLogic)));
        Constants.GreenBasiliskMindSpeed = Float.valueOf(properties.getProperty("Green_Basilisk_Mind_Speed", String.valueOf(Constants.GreenBasiliskMindSpeed)));
        Constants.GreenBasiliskSoulStrength = Float.valueOf(properties.getProperty("Green_Basilisk_Soul_Strength", String.valueOf(Constants.GreenBasiliskSoulStrength)));
        Constants.GreenBasiliskSoulDepth = Float.valueOf(properties.getProperty("Green_Basilisk_Soul_Depth", String.valueOf(Constants.GreenBasiliskSoulDepth)));
        Constants.GreenBasiliskWeaponlessFighting = Float.valueOf(properties.getProperty("Green_Basilisk_Weaponless_Fighting", String.valueOf(Constants.GreenBasiliskWeaponlessFighting)));
        Constants.GreenBasiliskGroupFighting = Float.valueOf(properties.getProperty("Green_Basilisk_Group_Fighting", String.valueOf(Constants.GreenBasiliskGroupFighting)));
        //============================ SPAWN ===========================
        Constants.GreenBasiliskSpawnTree = Boolean.valueOf(properties.getProperty("Green_Basilisk_Spawn_Tree", String.valueOf(Constants.GreenBasiliskSpawnTree)));
        Constants.GreenBasiliskSpawnSteppe = Boolean.valueOf(properties.getProperty("Green_Basilisk_Spawn_Steppe", String.valueOf(Constants.GreenBasiliskSpawnSteppe)));
        Constants.GreenBasiliskSpawnGrass = Boolean.valueOf(properties.getProperty("Green_Basilisk_Spawn_Grass", String.valueOf(Constants.GreenBasiliskSpawnGrass)));
        Constants.GreenBasiliskSpawnTundra = Boolean.valueOf(properties.getProperty("Green_Basilisk_Spawn_Tundra", String.valueOf(Constants.GreenBasiliskSpawnTundra)));
        Constants.GreenBasiliskSpawnDirt = Boolean.valueOf(properties.getProperty("Green_Basilisk_Spawn_Dirt", String.valueOf(Constants.GreenBasiliskSpawnDirt)));
        Constants.GreenBasiliskSpawnSand = Boolean.valueOf(properties.getProperty("Green_Basilisk_Spawn_Sand", String.valueOf(Constants.GreenBasiliskSpawnSand)));
        Constants.GreenBasiliskSpawnSnow = Boolean.valueOf(properties.getProperty("Green_Basilisk_Spawn_Snow", String.valueOf(Constants.GreenBasiliskSpawnSnow)));
        Constants.GreenBasiliskSpawnMarsh = Boolean.valueOf(properties.getProperty("Green_Basilisk_Spawn_Marsh", String.valueOf(Constants.GreenBasiliskSpawnMarsh)));
        Constants.GreenBasiliskSpawnCave = Boolean.valueOf(properties.getProperty("Green_Basilisk_Spawn_Cave", String.valueOf(Constants.GreenBasiliskSpawnCave)));
        Constants.GreenBasiliskSpawnPeat = Boolean.valueOf(properties.getProperty("Green_Basilisk_Spawn_Peat", String.valueOf(Constants.GreenBasiliskSpawnPeat)));
        /*
          Red Basilisk
         */
        //============================ MAIN ===========================
        Constants.RedBasiliskEnabled = Boolean.valueOf(properties.getProperty("Red_Basilisk_Enabled", String.valueOf(Constants.RedBasiliskEnabled)));
        Constants.RedBasiliskDesc = String.valueOf(properties.getProperty("Red_Basilisk_Desc", String.valueOf(Constants.RedBasiliskDesc)));
        Constants.RedBasiliskCreatureTypes = Initiator.getPropertyArray(String.valueOf(properties.getProperty("Red_Basilisk_Creature_Types")));
        //============================ SIZE ===========================
        Constants.RedBasiliskSizeX =  Integer.valueOf(properties.getProperty("Red_Basilisk_SizeX", String.valueOf(Constants.RedBasiliskSizeX)));
        Constants.RedBasiliskSizeY =  Integer.valueOf(properties.getProperty("Red_Basilisk_SizeY", String.valueOf(Constants.RedBasiliskSizeY)));
        Constants.RedBasiliskSizeZ =  Integer.valueOf(properties.getProperty("Red_Basilisk_SizeZ", String.valueOf(Constants.RedBasiliskSizeZ)));
        //============================ MISC ===========================
        Constants.RedBasiliskMaxPop =  Integer.valueOf(properties.getProperty("Red_Basilisk_Max_Population", String.valueOf(Constants.RedBasiliskMaxPop)));
        Constants.RedBasiliskMaxAge =  Integer.valueOf(properties.getProperty("Red_Basilisk_Max_Age", String.valueOf(Constants.RedBasiliskMaxAge)));
        Constants.RedBasiliskItemsButchered = Initiator.getPropertyArray(String.valueOf(properties.getProperty("Red_Basilisk_Items_Butchered")));
        Constants.RedBasiliskMoveRate =  Integer.valueOf(properties.getProperty("Red_Basilisk_MoveRate", String.valueOf(Constants.RedBasiliskMoveRate)));
        //============================ ATTITUDE ===========================
        Constants.RedBasiliskAggression =  Integer.valueOf(properties.getProperty("Red_Basilisk_Aggression", String.valueOf(Constants.RedBasiliskAggression)));
        Constants.RedBasiliskAlignment = Float.valueOf(properties.getProperty("Red_Basilisk_Alignment", String.valueOf(Constants.RedBasiliskAlignment)));
        Constants.RedBasiliskVision =  Integer.valueOf(properties.getProperty("Red_Basilisk_Vision", String.valueOf(Constants.RedBasiliskVision)));
        Constants.RedBasiliskMaxHuntRange =  Integer.valueOf(properties.getProperty("Red_Basilisk_Max_Hunt_Range", String.valueOf(Constants.RedBasiliskMaxHuntRange)));
        //============================ VEHICLE ===========================
        Constants.RedBasiliskSetMaxHeightDiff = Float.valueOf(properties.getProperty("Red_Basilisk_Vehicle_Max_Height_Diff", String.valueOf(Constants.RedBasiliskSetMaxHeightDiff)));
        Constants.RedBasiliskVehicleSpeed = Float.valueOf(properties.getProperty("Red_Basilisk_Vehicle_Max_Speed", String.valueOf(Constants.RedBasiliskVehicleSpeed)));
        Constants.RedBasiliskVehicleSkill = Float.valueOf(properties.getProperty("Red_Basilisk_Vehicle_Skill_Required", String.valueOf(Constants.RedBasiliskVehicleSkill)));
        Constants.RedBasiliskVehicleDepth = Float.valueOf(properties.getProperty("Red_Basilisk_Vehicle_Max_Depth", String.valueOf(Constants.RedBasiliskVehicleDepth)));
        Constants.RedBasiliskZAxisOffset = Float.valueOf(properties.getProperty("Red_Basilisk_Vehicle_ZAxis_Offset", String.valueOf(Constants.RedBasiliskZAxisOffset)));
        Constants.RedBasiliskMoveSpeed = Float.valueOf(properties.getProperty("Red_Basilisk_Move_Speed", String.valueOf(Constants.RedBasiliskMoveSpeed)));
        //============================ OFFENSE ===========================
        Constants.RedBasiliskBaseCombatRating = Float.valueOf(properties.getProperty("Red_Basilisk_Base_Combat_Rating", String.valueOf(Constants.RedBasiliskBaseCombatRating)));
        Constants.RedBasiliskCombatDamageType =  Integer.valueOf(properties.getProperty("Red_Basilisk_Combat_Damage_Type", String.valueOf(Constants.RedBasiliskCombatDamageType)));
        Constants.RedBasiliskCombatMoves = Initiator.getPropertyArray(String.valueOf(properties.getProperty("Red_Basilisk_Combat_Moves")));
        Constants.RedBasiliskHeadbuttDamString = String.valueOf(properties.getProperty("Red_Basilisk_Head_butt_Dam_String", String.valueOf(Constants.RedBasiliskHeadbuttDamString)));
        Constants.RedBasiliskKickDamString = String.valueOf(properties.getProperty("Red_Basilisk_Kick_Dam_String", String.valueOf(Constants.RedBasiliskKickDamString)));
        Constants.RedBasiliskHandDamage = Float.valueOf(properties.getProperty("Red_Basilisk_Hand_Damage", String.valueOf(Constants.RedBasiliskHandDamage)));
        Constants.RedBasiliskKickDamage = Float.valueOf(properties.getProperty("Red_Basilisk_Kick_Damage", String.valueOf(Constants.RedBasiliskKickDamage)));
        Constants.RedBasiliskBiteDamage = Float.valueOf(properties.getProperty("Red_Basilisk_Bite_Damage", String.valueOf(Constants.RedBasiliskBiteDamage)));
        Constants.RedBasiliskHeadDamage = Float.valueOf(properties.getProperty("Red_Basilisk_Head_Damage", String.valueOf(Constants.RedBasiliskHeadDamage)));
        Constants.RedBasiliskBreathDamage = Float.valueOf(properties.getProperty("Red_Basilisk_Breath_Damage", String.valueOf(Constants.RedBasiliskBreathDamage)));
        //============================ DEFENSE ===========================
        Constants.RedBasiliskNaturalArmour = Float.valueOf(properties.getProperty("Red_Basilisk_Natural_Armour", String.valueOf(Constants.RedBasiliskNaturalArmour)));
        ////Constants.RedBasiliskArmourType =  Integer.valueOf(properties.getProperty("Red_Basilisk_Armour_Type", String.valueOf(Constants.RedBasiliskArmourType)));
        //============================ SKILLS ===========================
        Constants.RedBasiliskBodyStrength = Float.valueOf(properties.getProperty("Red_Basilisk_Body_Strength", String.valueOf(Constants.RedBasiliskBodyStrength)));
        Constants.RedBasiliskBodyControl = Float.valueOf(properties.getProperty("Red_Basilisk_Body_Control", String.valueOf(Constants.RedBasiliskBodyControl)));
        Constants.RedBasiliskBodyStamina = Float.valueOf(properties.getProperty("Red_Basilisk_Body_Stamina", String.valueOf(Constants.RedBasiliskBodyStamina)));
        Constants.RedBasiliskMindLogic = Float.valueOf(properties.getProperty("Red_Basilisk_Mind_Logic", String.valueOf(Constants.RedBasiliskMindLogic)));
        Constants.RedBasiliskMindSpeed = Float.valueOf(properties.getProperty("Red_Basilisk_Mind_Speed", String.valueOf(Constants.RedBasiliskMindSpeed)));
        Constants.RedBasiliskSoulStrength = Float.valueOf(properties.getProperty("Red_Basilisk_Soul_Strength", String.valueOf(Constants.RedBasiliskSoulStrength)));
        Constants.RedBasiliskSoulDepth = Float.valueOf(properties.getProperty("Red_Basilisk_Soul_Depth", String.valueOf(Constants.RedBasiliskSoulDepth)));
        Constants.RedBasiliskWeaponlessFighting = Float.valueOf(properties.getProperty("Red_Basilisk_Weaponless_Fighting", String.valueOf(Constants.RedBasiliskWeaponlessFighting)));
        Constants.RedBasiliskGroupFighting = Float.valueOf(properties.getProperty("Red_Basilisk_Group_Fighting", String.valueOf(Constants.RedBasiliskGroupFighting)));
        //============================ SPAWN ===========================
        Constants.RedBasiliskSpawnTree = Boolean.valueOf(properties.getProperty("Red_Basilisk_Spawn_Tree", String.valueOf(Constants.RedBasiliskSpawnTree)));
        Constants.RedBasiliskSpawnSteppe = Boolean.valueOf(properties.getProperty("Red_Basilisk_Spawn_Steppe", String.valueOf(Constants.RedBasiliskSpawnSteppe)));
        Constants.RedBasiliskSpawnGrass = Boolean.valueOf(properties.getProperty("Red_Basilisk_Spawn_Grass", String.valueOf(Constants.RedBasiliskSpawnGrass)));
        Constants.RedBasiliskSpawnTundra = Boolean.valueOf(properties.getProperty("Red_Basilisk_Spawn_Tundra", String.valueOf(Constants.RedBasiliskSpawnTundra)));
        Constants.RedBasiliskSpawnDirt = Boolean.valueOf(properties.getProperty("Red_Basilisk_Spawn_Dirt", String.valueOf(Constants.RedBasiliskSpawnDirt)));
        Constants.RedBasiliskSpawnSand = Boolean.valueOf(properties.getProperty("Red_Basilisk_Spawn_Sand", String.valueOf(Constants.RedBasiliskSpawnSand)));
        Constants.RedBasiliskSpawnSnow = Boolean.valueOf(properties.getProperty("Red_Basilisk_Spawn_Snow", String.valueOf(Constants.RedBasiliskSpawnSnow)));
        Constants.RedBasiliskSpawnMarsh = Boolean.valueOf(properties.getProperty("Red_Basilisk_Spawn_Marsh", String.valueOf(Constants.RedBasiliskSpawnMarsh)));
        Constants.RedBasiliskSpawnCave = Boolean.valueOf(properties.getProperty("Red_Basilisk_Spawn_Cave", String.valueOf(Constants.RedBasiliskSpawnCave)));
        Constants.RedBasiliskSpawnPeat = Boolean.valueOf(properties.getProperty("Red_Basilisk_Spawn_Peat", String.valueOf(Constants.RedBasiliskSpawnPeat)));
        /*
          White Basilisk
         */
        //============================ MAIN ===========================
        Constants.WhiteBasiliskEnabled = Boolean.valueOf(properties.getProperty("White_Basilisk_Enabled", String.valueOf(Constants.WhiteBasiliskEnabled)));
        Constants.WhiteBasiliskDesc = String.valueOf(properties.getProperty("White_Basilisk_Desc", String.valueOf(Constants.WhiteBasiliskDesc)));
        Constants.WhiteBasiliskCreatureTypes = Initiator.getPropertyArray(String.valueOf(properties.getProperty("White_Basilisk_Creature_Types")));
        //============================ SIZE ===========================
        Constants.WhiteBasiliskSizeX =  Integer.valueOf(properties.getProperty("White_Basilisk_SizeX", String.valueOf(Constants.WhiteBasiliskSizeX)));
        Constants.WhiteBasiliskSizeY =  Integer.valueOf(properties.getProperty("White_Basilisk_SizeY", String.valueOf(Constants.WhiteBasiliskSizeY)));
        Constants.WhiteBasiliskSizeZ =  Integer.valueOf(properties.getProperty("White_Basilisk_SizeZ", String.valueOf(Constants.WhiteBasiliskSizeZ)));
        //============================ MISC ===========================
        Constants.WhiteBasiliskMaxPop =  Integer.valueOf(properties.getProperty("White_Basilisk_Max_Population", String.valueOf(Constants.WhiteBasiliskMaxPop)));
        Constants.WhiteBasiliskMaxAge =  Integer.valueOf(properties.getProperty("White_Basilisk_Max_Age", String.valueOf(Constants.WhiteBasiliskMaxAge)));
        Constants.WhiteBasiliskItemsButchered = Initiator.getPropertyArray(String.valueOf(properties.getProperty("White_Basilisk_Items_Butchered")));
        Constants.WhiteBasiliskMoveRate =  Integer.valueOf(properties.getProperty("White_Basilisk_MoveRate", String.valueOf(Constants.WhiteBasiliskMoveRate)));
        //============================ ATTITUDE ===========================
        Constants.WhiteBasiliskAggression =  Integer.valueOf(properties.getProperty("White_Basilisk_Aggression", String.valueOf(Constants.WhiteBasiliskAggression)));
        Constants.WhiteBasiliskAlignment = Float.valueOf(properties.getProperty("White_Basilisk_Alignment", String.valueOf(Constants.WhiteBasiliskAlignment)));
        Constants.WhiteBasiliskVision =  Integer.valueOf(properties.getProperty("White_Basilisk_Vision", String.valueOf(Constants.WhiteBasiliskVision)));
        Constants.WhiteBasiliskMaxHuntRange =  Integer.valueOf(properties.getProperty("White_Basilisk_Max_Hunt_Range", String.valueOf(Constants.WhiteBasiliskMaxHuntRange)));
        //============================ VEHICLE ===========================
        Constants.WhiteBasiliskSetMaxHeightDiff = Float.valueOf(properties.getProperty("White_Basilisk_Vehicle_Max_Height_Diff", String.valueOf(Constants.WhiteBasiliskSetMaxHeightDiff)));
        Constants.WhiteBasiliskVehicleSpeed = Float.valueOf(properties.getProperty("White_Basilisk_Vehicle_Max_Speed", String.valueOf(Constants.WhiteBasiliskVehicleSpeed)));
        Constants.WhiteBasiliskVehicleSkill = Float.valueOf(properties.getProperty("White_Basilisk_Vehicle_Skill_Required", String.valueOf(Constants.WhiteBasiliskVehicleSkill)));
        Constants.WhiteBasiliskVehicleDepth = Float.valueOf(properties.getProperty("White_Basilisk_Vehicle_Max_Depth", String.valueOf(Constants.WhiteBasiliskVehicleDepth)));
        Constants.WhiteBasiliskZAxisOffset = Float.valueOf(properties.getProperty("White_Basilisk_Vehicle_ZAxis_Offset", String.valueOf(Constants.WhiteBasiliskZAxisOffset)));
        Constants.WhiteBasiliskMoveSpeed = Float.valueOf(properties.getProperty("White_Basilisk_Move_Speed", String.valueOf(Constants.WhiteBasiliskMoveSpeed)));
        //============================ OFFENSE ===========================
        Constants.WhiteBasiliskBaseCombatRating = Float.valueOf(properties.getProperty("White_Basilisk_Base_Combat_Rating", String.valueOf(Constants.WhiteBasiliskBaseCombatRating)));
        Constants.WhiteBasiliskCombatDamageType =  Integer.valueOf(properties.getProperty("White_Basilisk_Combat_Damage_Type", String.valueOf(Constants.WhiteBasiliskCombatDamageType)));
        Constants.WhiteBasiliskCombatMoves = Initiator.getPropertyArray(String.valueOf(properties.getProperty("White_Basilisk_Combat_Moves")));
        Constants.WhiteBasiliskHeadbuttDamString = String.valueOf(properties.getProperty("White_Basilisk_Head_butt_Dam_String", String.valueOf(Constants.WhiteBasiliskHeadbuttDamString)));
        Constants.WhiteBasiliskKickDamString = String.valueOf(properties.getProperty("White_Basilisk_Kick_Dam_String", String.valueOf(Constants.WhiteBasiliskKickDamString)));
        Constants.WhiteBasiliskHandDamage = Float.valueOf(properties.getProperty("White_Basilisk_Hand_Damage", String.valueOf(Constants.WhiteBasiliskHandDamage)));
        Constants.WhiteBasiliskKickDamage = Float.valueOf(properties.getProperty("White_Basilisk_Kick_Damage", String.valueOf(Constants.WhiteBasiliskKickDamage)));
        Constants.WhiteBasiliskBiteDamage = Float.valueOf(properties.getProperty("White_Basilisk_Bite_Damage", String.valueOf(Constants.WhiteBasiliskBiteDamage)));
        Constants.WhiteBasiliskHeadDamage = Float.valueOf(properties.getProperty("White_Basilisk_Head_Damage", String.valueOf(Constants.WhiteBasiliskHeadDamage)));
        Constants.WhiteBasiliskBreathDamage = Float.valueOf(properties.getProperty("White_Basilisk_Breath_Damage", String.valueOf(Constants.WhiteBasiliskBreathDamage)));
        //============================ DEFENSE ===========================
        Constants.WhiteBasiliskNaturalArmour = Float.valueOf(properties.getProperty("White_Basilisk_Natural_Armour", String.valueOf(Constants.WhiteBasiliskNaturalArmour)));
        ////Constants.WhiteBasiliskArmourType =  Integer.valueOf(properties.getProperty("White_Basilisk_Armour_Type", String.valueOf(Constants.WhiteBasiliskArmourType)));
        //============================ SKILLS ===========================
        Constants.WhiteBasiliskBodyStrength = Float.valueOf(properties.getProperty("White_Basilisk_Body_Strength", String.valueOf(Constants.WhiteBasiliskBodyStrength)));
        Constants.WhiteBasiliskBodyControl = Float.valueOf(properties.getProperty("White_Basilisk_Body_Control", String.valueOf(Constants.WhiteBasiliskBodyControl)));
        Constants.WhiteBasiliskBodyStamina = Float.valueOf(properties.getProperty("White_Basilisk_Body_Stamina", String.valueOf(Constants.WhiteBasiliskBodyStamina)));
        Constants.WhiteBasiliskMindLogic = Float.valueOf(properties.getProperty("White_Basilisk_Mind_Logic", String.valueOf(Constants.WhiteBasiliskMindLogic)));
        Constants.WhiteBasiliskMindSpeed = Float.valueOf(properties.getProperty("White_Basilisk_Mind_Speed", String.valueOf(Constants.WhiteBasiliskMindSpeed)));
        Constants.WhiteBasiliskSoulStrength = Float.valueOf(properties.getProperty("White_Basilisk_Soul_Strength", String.valueOf(Constants.WhiteBasiliskSoulStrength)));
        Constants.WhiteBasiliskSoulDepth = Float.valueOf(properties.getProperty("White_Basilisk_Soul_Depth", String.valueOf(Constants.WhiteBasiliskSoulDepth)));
        Constants.WhiteBasiliskWeaponlessFighting = Float.valueOf(properties.getProperty("White_Basilisk_Weaponless_Fighting", String.valueOf(Constants.WhiteBasiliskWeaponlessFighting)));
        Constants.WhiteBasiliskGroupFighting = Float.valueOf(properties.getProperty("White_Basilisk_Group_Fighting", String.valueOf(Constants.WhiteBasiliskGroupFighting)));
        //============================ SPAWN ===========================
        Constants.WhiteBasiliskSpawnTree = Boolean.valueOf(properties.getProperty("White_Basilisk_Spawn_Tree", String.valueOf(Constants.WhiteBasiliskSpawnTree)));
        Constants.WhiteBasiliskSpawnSteppe = Boolean.valueOf(properties.getProperty("White_Basilisk_Spawn_Steppe", String.valueOf(Constants.WhiteBasiliskSpawnSteppe)));
        Constants.WhiteBasiliskSpawnGrass = Boolean.valueOf(properties.getProperty("White_Basilisk_Spawn_Grass", String.valueOf(Constants.WhiteBasiliskSpawnGrass)));
        Constants.WhiteBasiliskSpawnTundra = Boolean.valueOf(properties.getProperty("White_Basilisk_Spawn_Tundra", String.valueOf(Constants.WhiteBasiliskSpawnTundra)));
        Constants.WhiteBasiliskSpawnDirt = Boolean.valueOf(properties.getProperty("White_Basilisk_Spawn_Dirt", String.valueOf(Constants.WhiteBasiliskSpawnDirt)));
        Constants.WhiteBasiliskSpawnSand = Boolean.valueOf(properties.getProperty("White_Basilisk_Spawn_Sand", String.valueOf(Constants.WhiteBasiliskSpawnSand)));
        Constants.WhiteBasiliskSpawnSnow = Boolean.valueOf(properties.getProperty("White_Basilisk_Spawn_Snow", String.valueOf(Constants.WhiteBasiliskSpawnSnow)));
        Constants.WhiteBasiliskSpawnMarsh = Boolean.valueOf(properties.getProperty("White_Basilisk_Spawn_Marsh", String.valueOf(Constants.WhiteBasiliskSpawnMarsh)));
        Constants.WhiteBasiliskSpawnCave = Boolean.valueOf(properties.getProperty("White_Basilisk_Spawn_Cave", String.valueOf(Constants.WhiteBasiliskSpawnCave)));
        Constants.WhiteBasiliskSpawnPeat = Boolean.valueOf(properties.getProperty("White_Basilisk_Spawn_Peat", String.valueOf(Constants.WhiteBasiliskSpawnPeat)));
        /*
          Settings
         */
        Constants.DEBUG = Boolean.valueOf(properties.getProperty("Debug", String.valueOf(Constants.DEBUG)));
        if (Constants.DEBUG) {
            Logging.creatureLogging();
        }
    }
}