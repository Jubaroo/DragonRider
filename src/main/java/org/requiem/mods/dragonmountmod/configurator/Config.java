
package org.requiem.mods.dragonmountmod.configurator;

import org.requiem.mods.dragonmountmod.Initiator;

import java.util.Properties;


public class Config {

    public static void doConfig(Properties properties) {
        /*
          Toggle Egg Layer
         */
        Constants.DrakeEggLayer = Boolean.valueOf(properties.getProperty("Toggle_Egg_Layers", String.valueOf(Constants.DrakeEggLayer)));
        Initiator.logInfo("Toggle_Egg_Layers = " + Constants.DrakeEggLayer);
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
        Constants.BlackDrakeZaxisOffset = Float.valueOf(properties.getProperty("Black_Drake_Vehicle_Zaxis_Offset", String.valueOf(Constants.BlackDrakeZaxisOffset)));
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
        Constants.BlueDrakeZaxisOffset = Float.valueOf(properties.getProperty("Blue_Drake_Vehicle_Zaxis_Offset", String.valueOf(Constants.BlueDrakeZaxisOffset)));
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
        Constants.BlueDrakeSpawnTree = Boolean.valueOf(properties.getProperty("Blue_Drake_Spawn_Tree", String.valueOf(Constants.DrakeEggLayer)));
        Constants.BlueDrakeSpawnSteppe = Boolean.valueOf(properties.getProperty("Blue_Drake_Spawn_Steppe", String.valueOf(Constants.DrakeEggLayer)));
        Constants.BlueDrakeSpawnGrass = Boolean.valueOf(properties.getProperty("Blue_Drake_Spawn_Grass", String.valueOf(Constants.DrakeEggLayer)));
        Constants.BlueDrakeSpawnTundra = Boolean.valueOf(properties.getProperty("Blue_Drake_Spawn_Tundra", String.valueOf(Constants.DrakeEggLayer)));
        Constants.BlueDrakeSpawnDirt = Boolean.valueOf(properties.getProperty("Blue_Drake_Spawn_Dirt", String.valueOf(Constants.DrakeEggLayer)));
        Constants.BlueDrakeSpawnSand = Boolean.valueOf(properties.getProperty("Blue_Drake_Spawn_Sand", String.valueOf(Constants.DrakeEggLayer)));
        Constants.BlueDrakeSpawnSnow = Boolean.valueOf(properties.getProperty("Blue_Drake_Spawn_Snow", String.valueOf(Constants.DrakeEggLayer)));
        Constants.BlueDrakeSpawnMarsh = Boolean.valueOf(properties.getProperty("Blue_Drake_Spawn_Marsh", String.valueOf(Constants.DrakeEggLayer)));
        Constants.BlueDrakeSpawnCave = Boolean.valueOf(properties.getProperty("Blue_Drake_Spawn_Cave", String.valueOf(Constants.DrakeEggLayer)));
        Constants.BlueDrakeSpawnPeat = Boolean.valueOf(properties.getProperty("Blue_Drake_Spawn_Peat", String.valueOf(Constants.DrakeEggLayer)));
        /*
          Ghost Drake
         */
        //============================ MAIN ===========================
        Constants.GhostDrakeEnabled = Boolean.valueOf(properties.getProperty("Spectral_Drake_Enabled", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GhostDrakeDesc = String.valueOf(properties.getProperty("Spectral_Drake_Desc", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GhostDrakeCreatureTypes = Initiator.getPropertyArray(String.valueOf(properties.getProperty("Spectral_Drake_Creature_Types")));
        Constants.GhostDrakeModelColor = String.valueOf(properties.getProperty("Ghost_Drake_Model_Color", String.valueOf(Constants.DrakeEggLayer)));
        //============================ SIZE ===========================
        Constants.GhostDrakeSizeX =  Integer.valueOf(properties.getProperty("Spectral_Drake_SizeX", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GhostDrakeSizeY =  Integer.valueOf(properties.getProperty("Spectral_Drake_SizeY", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GhostDrakeSizeZ =  Integer.valueOf(properties.getProperty("Spectral_Drake_SizeZ", String.valueOf(Constants.DrakeEggLayer)));
        //============================ MISC ===========================
        Constants.GhostDrakeMaxPop =  Integer.valueOf(properties.getProperty("Spectral_Drake_Max_Population", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GhostDrakeMaxAge =  Integer.valueOf(properties.getProperty("Spectral_Drake_Max_Age", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GhostDrakeItemsButchered = Initiator.getPropertyArray(String.valueOf(properties.getProperty("Spectral_Drake_Items_Butchered")));
        Constants.GhostDrakeMoveRate =  Integer.valueOf(properties.getProperty("Spectral_Drake_MoveRate", String.valueOf(Constants.DrakeEggLayer)));
        //============================ ATTITUDE ===========================
        Constants.GhostDrakeAggression =  Integer.valueOf(properties.getProperty("Spectral_Drake_Aggression", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GhostDrakeAlignment = Float.valueOf(properties.getProperty("Spectral_Drake_Alignment", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GhostDrakeVision =  Integer.valueOf(properties.getProperty("Spectral_Drake_Vision", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GhostDrakeMaxHuntRange =  Integer.valueOf(properties.getProperty("Spectral_Drake_Max_Hunt_Range", String.valueOf(Constants.DrakeEggLayer)));
        //============================ VEHICLE ===========================
        Constants.GhostDrakeSetMaxHeightDiff = Float.valueOf(properties.getProperty("Spectral_Drake_Vehicle_Max_Height_Diff", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GhostDrakeVehicleSpeed = Float.valueOf(properties.getProperty("Spectral_Drake_Vehicle_Max_Speed", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GhostDrakeVehicleSkill = Float.valueOf(properties.getProperty("Spectral_Drake_Vehicle_Skill_Required", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GhostDrakeVehicleDepth = Float.valueOf(properties.getProperty("Spectral_Drake_Vehicle_Max_Depth", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GhostDrakeZaxisOffset = Float.valueOf(properties.getProperty("Spectral_Drake_Vehicle_Zaxis_Offset", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GhostDrakeMoveSpeed = Float.valueOf(properties.getProperty("Spectral_Drake_Move_Speed", String.valueOf(Constants.DrakeEggLayer)));
        //============================ OFFENSE ===========================
        Constants.GhostDrakeBaseCombatRating = Float.valueOf(properties.getProperty("Spectral_Drake_Base_Combat_Rating", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GhostDrakeCombatDamageType =  Integer.valueOf(properties.getProperty("Spectral_Drake_Combat_Damage_Type", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GhostDrakeCombatMoves = Initiator.getPropertyArray(String.valueOf(properties.getProperty("Spectral_Drake_Combat_Moves")));
        Constants.GhostDrakeHeadbuttDamString = String.valueOf(properties.getProperty("Spectral_Drake_Head_butt_Dam_String", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GhostDrakeKickDamString = String.valueOf(properties.getProperty("Spectral_Drake_Kick_Dam_String", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GhostDrakeHandDamage = Float.valueOf(properties.getProperty("Spectral_Drake_Hand_Damage", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GhostDrakeKickDamage = Float.valueOf(properties.getProperty("Spectral_Drake_Kick_Damage", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GhostDrakeBiteDamage = Float.valueOf(properties.getProperty("Spectral_Drake_Bite_Damage", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GhostDrakeHeadDamage = Float.valueOf(properties.getProperty("Spectral_Drake_Head_Damage", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GhostDrakeBreathDamage = Float.valueOf(properties.getProperty("Spectral_Drake_Breath_Damage", String.valueOf(Constants.DrakeEggLayer)));
        //============================ DEFENSE ===========================
        Constants.GhostDrakeNaturalArmour = Float.valueOf(properties.getProperty("Spectral_Drake_Natural_Armour", String.valueOf(Constants.DrakeEggLayer)));
        ////Constants.GhostDrakeArmourType =  Integer.valueOf(properties.getProperty("Spectral_Drake_Armour_Type", String.valueOf(Constants.DrakeEggLayer)));
        //============================ SKILLS ===========================
        Constants.GhostDrakeBodyStrength = Float.valueOf(properties.getProperty("Spectral_Drake_Body_Strength", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GhostDrakeBodyControl = Float.valueOf(properties.getProperty("Spectral_Drake_Body_Control", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GhostDrakeBodyStamina = Float.valueOf(properties.getProperty("Spectral_Drake_Body_Stamina", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GhostDrakeMindLogic = Float.valueOf(properties.getProperty("Spectral_Drake_Mind_Logic", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GhostDrakeMindSpeed = Float.valueOf(properties.getProperty("Spectral_Drake_Mind_Speed", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GhostDrakeSoulStrength = Float.valueOf(properties.getProperty("Spectral_Drake_Soul_Strength", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GhostDrakeSoulDepth = Float.valueOf(properties.getProperty("Spectral_Drake_Soul_Depth", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GhostDrakeWeaponlessFighting = Float.valueOf(properties.getProperty("Spectral_Drake_Weaponless_Fighting", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GhostDrakeGroupFighting = Float.valueOf(properties.getProperty("Spectral_Drake_Group_Fighting", String.valueOf(Constants.DrakeEggLayer)));
        //============================ SPAWN ===========================
        Constants.GhostDrakeSpawnTree = Boolean.valueOf(properties.getProperty("Spectral_Drake_Spawn_Tree", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GhostDrakeSpawnSteppe = Boolean.valueOf(properties.getProperty("Spectral_Drake_Spawn_Steppe", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GhostDrakeSpawnGrass = Boolean.valueOf(properties.getProperty("Spectral_Drake_Spawn_Grass", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GhostDrakeSpawnTundra = Boolean.valueOf(properties.getProperty("Spectral_Drake_Spawn_Tundra", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GhostDrakeSpawnDirt = Boolean.valueOf(properties.getProperty("Spectral_Drake_Spawn_Dirt", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GhostDrakeSpawnSand = Boolean.valueOf(properties.getProperty("Spectral_Drake_Spawn_Sand", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GhostDrakeSpawnSnow = Boolean.valueOf(properties.getProperty("Spectral_Drake_Spawn_Snow", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GhostDrakeSpawnMarsh = Boolean.valueOf(properties.getProperty("Spectral_Drake_Spawn_Marsh", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GhostDrakeSpawnCave = Boolean.valueOf(properties.getProperty("Spectral_Drake_Spawn_Cave", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GhostDrakeSpawnPeat = Boolean.valueOf(properties.getProperty("Spectral_Drake_Spawn_Peat", String.valueOf(Constants.DrakeEggLayer)));
        /*
          Green Drake
         */
        //============================ MAIN ===========================
        Constants.GreenDrakeEnabled = Boolean.valueOf(properties.getProperty("Green_Drake_Enabled", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GreenDrakeDesc = String.valueOf(properties.getProperty("Green_Drake_Desc", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GreenDrakeCreatureTypes = Initiator.getPropertyArray(String.valueOf(properties.getProperty("Green_Drake_Creature_Types")));
        //============================ SIZE ===========================
        Constants.GreenDrakeSizeX =  Integer.valueOf(properties.getProperty("Green_Drake_SizeX", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GreenDrakeSizeY =  Integer.valueOf(properties.getProperty("Green_Drake_SizeY", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GreenDrakeSizeZ =  Integer.valueOf(properties.getProperty("Green_Drake_SizeZ", String.valueOf(Constants.DrakeEggLayer)));
        //============================ MISC ===========================
        Constants.GreenDrakeMaxPop =  Integer.valueOf(properties.getProperty("Green_Drake_Max_Population", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GreenDrakeMaxAge =  Integer.valueOf(properties.getProperty("Green_Drake_Max_Age", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GreenDrakeItemsButchered = Initiator.getPropertyArray(String.valueOf(properties.getProperty("Green_Drake_Items_Butchered")));
        Constants.GreenDrakeMoveRate =  Integer.valueOf(properties.getProperty("Green_Drake_MoveRate", String.valueOf(Constants.DrakeEggLayer)));
        //============================ ATTITUDE ===========================
        Constants.GreenDrakeAggression =  Integer.valueOf(properties.getProperty("Green_Drake_Aggression", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GreenDrakeAlignment = Float.valueOf(properties.getProperty("Green_Drake_Alignment", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GreenDrakeVision =  Integer.valueOf(properties.getProperty("Green_Drake_Vision", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GreenDrakeMaxHuntRange =  Integer.valueOf(properties.getProperty("Green_Drake_Max_Hunt_Range", String.valueOf(Constants.DrakeEggLayer)));
        //============================ VEHICLE ===========================
        Constants.GreenDrakeSetMaxHeightDiff = Float.valueOf(properties.getProperty("Green_Drake_Vehicle_Max_Height_Diff", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GreenDrakeVehicleSpeed = Float.valueOf(properties.getProperty("Green_Drake_Vehicle_Max_Speed", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GreenDrakeVehicleSkill = Float.valueOf(properties.getProperty("Green_Drake_Vehicle_Skill_Required", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GreenDrakeVehicleDepth = Float.valueOf(properties.getProperty("Green_Drake_Vehicle_Max_Depth", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GreenDrakeZaxisOffset = Float.valueOf(properties.getProperty("Green_Drake_Vehicle_Zaxis_Offset", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GreenDrakeMoveSpeed = Float.valueOf(properties.getProperty("Green_Drake_Move_Speed", String.valueOf(Constants.DrakeEggLayer)));
        //============================ OFFENSE ===========================
        Constants.GreenDrakeBaseCombatRating = Float.valueOf(properties.getProperty("Green_Drake_Base_Combat_Rating", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GreenDrakeCombatDamageType =  Integer.valueOf(properties.getProperty("Green_Drake_Combat_Damage_Type", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GreenDrakeCombatMoves = Initiator.getPropertyArray(String.valueOf(properties.getProperty("Green_Drake_Combat_Moves")));
        Constants.GreenDrakeHeadbuttDamString = String.valueOf(properties.getProperty("Green_Drake_Head_butt_Dam_String", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GreenDrakeKickDamString = String.valueOf(properties.getProperty("Green_Drake_Kick_Dam_String", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GreenDrakeHandDamage = Float.valueOf(properties.getProperty("Green_Drake_Hand_Damage", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GreenDrakeKickDamage = Float.valueOf(properties.getProperty("Green_Drake_Kick_Damage", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GreenDrakeBiteDamage = Float.valueOf(properties.getProperty("Green_Drake_Bite_Damage", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GreenDrakeHeadDamage = Float.valueOf(properties.getProperty("Green_Drake_Head_Damage", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GreenDrakeBreathDamage = Float.valueOf(properties.getProperty("Green_Drake_Breath_Damage", String.valueOf(Constants.DrakeEggLayer)));
        //============================ DEFENSE ===========================
        Constants.GreenDrakeNaturalArmour = Float.valueOf(properties.getProperty("Green_Drake_Natural_Armour", String.valueOf(Constants.DrakeEggLayer)));
        ////Constants.GreenDrakeArmourType =  Integer.valueOf(properties.getProperty("Green_Drake_Armour_Type", String.valueOf(Constants.DrakeEggLayer)));
        //============================ SKILLS ===========================
        Constants.GreenDrakeBodyStrength = Float.valueOf(properties.getProperty("Green_Drake_Body_Strength", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GreenDrakeBodyControl = Float.valueOf(properties.getProperty("Green_Drake_Body_Control", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GreenDrakeBodyStamina = Float.valueOf(properties.getProperty("Green_Drake_Body_Stamina", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GreenDrakeMindLogic = Float.valueOf(properties.getProperty("Green_Drake_Mind_Logic", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GreenDrakeMindSpeed = Float.valueOf(properties.getProperty("Green_Drake_Mind_Speed", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GreenDrakeSoulStrength = Float.valueOf(properties.getProperty("Green_Drake_Soul_Strength", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GreenDrakeSoulDepth = Float.valueOf(properties.getProperty("Green_Drake_Soul_Depth", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GreenDrakeWeaponlessFighting = Float.valueOf(properties.getProperty("Green_Drake_Weaponless_Fighting", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GreenDrakeGroupFighting = Float.valueOf(properties.getProperty("Green_Drake_Group_Fighting", String.valueOf(Constants.DrakeEggLayer)));
        //============================ SPAWN ===========================
        Constants.GreenDrakeSpawnTree = Boolean.valueOf(properties.getProperty("Green_Drake_Spawn_Tree", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GreenDrakeSpawnSteppe = Boolean.valueOf(properties.getProperty("Green_Drake_Spawn_Steppe", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GreenDrakeSpawnGrass = Boolean.valueOf(properties.getProperty("Green_Drake_Spawn_Grass", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GreenDrakeSpawnTundra = Boolean.valueOf(properties.getProperty("Green_Drake_Spawn_Tundra", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GreenDrakeSpawnDirt = Boolean.valueOf(properties.getProperty("Green_Drake_Spawn_Dirt", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GreenDrakeSpawnSand = Boolean.valueOf(properties.getProperty("Green_Drake_Spawn_Sand", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GreenDrakeSpawnSnow = Boolean.valueOf(properties.getProperty("Green_Drake_Spawn_Snow", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GreenDrakeSpawnMarsh = Boolean.valueOf(properties.getProperty("Green_Drake_Spawn_Marsh", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GreenDrakeSpawnCave = Boolean.valueOf(properties.getProperty("Green_Drake_Spawn_Cave", String.valueOf(Constants.DrakeEggLayer)));
        Constants.GreenDrakeSpawnPeat = Boolean.valueOf(properties.getProperty("Green_Drake_Spawn_Peat", String.valueOf(Constants.DrakeEggLayer)));
        /*
          Red Drake
         */
        //============================ MAIN ===========================
        Constants.RedDrakeEnabled = Boolean.valueOf(properties.getProperty("Red_Drake_Enabled", String.valueOf(Constants.DrakeEggLayer)));
        Constants.RedDrakeDesc = String.valueOf(properties.getProperty("Red_Drake_Desc", String.valueOf(Constants.DrakeEggLayer)));
        Constants.RedDrakeCreatureTypes = Initiator.getPropertyArray(String.valueOf(properties.getProperty("Red_Drake_Creature_Types")));
        //============================ SIZE ===========================
        Constants.RedDrakeSizeX =  Integer.valueOf(properties.getProperty("Red_Drake_SizeX", String.valueOf(Constants.DrakeEggLayer)));
        Constants.RedDrakeSizeY =  Integer.valueOf(properties.getProperty("Red_Drake_SizeY", String.valueOf(Constants.DrakeEggLayer)));
        Constants.RedDrakeSizeZ =  Integer.valueOf(properties.getProperty("Red_Drake_SizeZ", String.valueOf(Constants.DrakeEggLayer)));
        //============================ MISC ===========================
        Constants.RedDrakeMaxPop =  Integer.valueOf(properties.getProperty("Red_Drake_Max_Population", String.valueOf(Constants.DrakeEggLayer)));
        Constants.RedDrakeMaxAge =  Integer.valueOf(properties.getProperty("Red_Drake_Max_Age", String.valueOf(Constants.DrakeEggLayer)));
        Constants.RedDrakeItemsButchered = Initiator.getPropertyArray(String.valueOf(properties.getProperty("Red_Drake_Items_Butchered")));
        Constants.RedDrakeMoveRate =  Integer.valueOf(properties.getProperty("Red_Drake_MoveRate", String.valueOf(Constants.DrakeEggLayer)));
        //============================ ATTITUDE ===========================
        Constants.RedDrakeAggression =  Integer.valueOf(properties.getProperty("Red_Drake_Aggression", String.valueOf(Constants.DrakeEggLayer)));
        Constants.RedDrakeAlignment = Float.valueOf(properties.getProperty("Red_Drake_Alignment", String.valueOf(Constants.DrakeEggLayer)));
        Constants.RedDrakeVision =  Integer.valueOf(properties.getProperty("Red_Drake_Vision", String.valueOf(Constants.DrakeEggLayer)));
        Constants.RedDrakeMaxHuntRange =  Integer.valueOf(properties.getProperty("Red_Drake_Max_Hunt_Range", String.valueOf(Constants.DrakeEggLayer)));
        //============================ VEHICLE ===========================
        Constants.RedDrakeSetMaxHeightDiff = Float.valueOf(properties.getProperty("Red_Drake_Vehicle_Max_Height_Diff", String.valueOf(Constants.DrakeEggLayer)));
        Constants.RedDrakeVehicleSpeed = Float.valueOf(properties.getProperty("Red_Drake_Vehicle_Max_Speed", String.valueOf(Constants.DrakeEggLayer)));
        Constants.RedDrakeVehicleSkill = Float.valueOf(properties.getProperty("Red_Drake_Vehicle_Skill_Required", String.valueOf(Constants.DrakeEggLayer)));
        Constants.RedDrakeVehicleDepth = Float.valueOf(properties.getProperty("Red_Drake_Vehicle_Max_Depth", String.valueOf(Constants.DrakeEggLayer)));
        Constants.RedDrakeZaxisOffset = Float.valueOf(properties.getProperty("Red_Drake_Vehicle_Zaxis_Offset", String.valueOf(Constants.DrakeEggLayer)));
        Constants.RedDrakeMoveSpeed = Float.valueOf(properties.getProperty("Red_Drake_Move_Speed", String.valueOf(Constants.DrakeEggLayer)));
        //============================ OFFENSE ===========================
        Constants.RedDrakeBaseCombatRating = Float.valueOf(properties.getProperty("Red_Drake_Base_Combat_Rating", String.valueOf(Constants.DrakeEggLayer)));
        Constants.RedDrakeCombatDamageType =  Integer.valueOf(properties.getProperty("Red_Drake_Combat_Damage_Type", String.valueOf(Constants.DrakeEggLayer)));
        Constants.RedDrakeCombatMoves = Initiator.getPropertyArray(String.valueOf(properties.getProperty("Red_Drake_Combat_Moves")));
        Constants.RedDrakeHeadbuttDamString = String.valueOf(properties.getProperty("Red_Drake_Head_butt_Dam_String", String.valueOf(Constants.DrakeEggLayer)));
        Constants.RedDrakeKickDamString = String.valueOf(properties.getProperty("Red_Drake_Kick_Dam_String", String.valueOf(Constants.DrakeEggLayer)));
        Constants.RedDrakeHandDamage = Float.valueOf(properties.getProperty("Red_Drake_Hand_Damage", String.valueOf(Constants.DrakeEggLayer)));
        Constants.RedDrakeKickDamage = Float.valueOf(properties.getProperty("Red_Drake_Kick_Damage", String.valueOf(Constants.DrakeEggLayer)));
        Constants.RedDrakeBiteDamage = Float.valueOf(properties.getProperty("Red_Drake_Bite_Damage", String.valueOf(Constants.DrakeEggLayer)));
        Constants.RedDrakeHeadDamage = Float.valueOf(properties.getProperty("Red_Drake_Head_Damage", String.valueOf(Constants.DrakeEggLayer)));
        Constants.RedDrakeBreathDamage = Float.valueOf(properties.getProperty("Red_Drake_Breath_Damage", String.valueOf(Constants.DrakeEggLayer)));
        //============================ DEFENSE ===========================
        Constants.RedDrakeNaturalArmour = Float.valueOf(properties.getProperty("Red_Drake_Natural_Armour", String.valueOf(Constants.DrakeEggLayer)));
        ////Constants.RedDrakeArmourType =  Integer.valueOf(properties.getProperty("Red_Drake_Armour_Type", String.valueOf(Constants.DrakeEggLayer)));
        //============================ SKILLS ===========================
        Constants.RedDrakeBodyStrength = Float.valueOf(properties.getProperty("Red_Drake_Body_Strength", String.valueOf(Constants.DrakeEggLayer)));
        Constants.RedDrakeBodyControl = Float.valueOf(properties.getProperty("Red_Drake_Body_Control", String.valueOf(Constants.DrakeEggLayer)));
        Constants.RedDrakeBodyStamina = Float.valueOf(properties.getProperty("Red_Drake_Body_Stamina", String.valueOf(Constants.DrakeEggLayer)));
        Constants.RedDrakeMindLogic = Float.valueOf(properties.getProperty("Red_Drake_Mind_Logic", String.valueOf(Constants.DrakeEggLayer)));
        Constants.RedDrakeMindSpeed = Float.valueOf(properties.getProperty("Red_Drake_Mind_Speed", String.valueOf(Constants.DrakeEggLayer)));
        Constants.RedDrakeSoulStrength = Float.valueOf(properties.getProperty("Red_Drake_Soul_Strength", String.valueOf(Constants.DrakeEggLayer)));
        Constants.RedDrakeSoulDepth = Float.valueOf(properties.getProperty("Red_Drake_Soul_Depth", String.valueOf(Constants.DrakeEggLayer)));
        Constants.RedDrakeWeaponlessFighting = Float.valueOf(properties.getProperty("Red_Drake_Weaponless_Fighting", String.valueOf(Constants.DrakeEggLayer)));
        Constants.RedDrakeGroupFighting = Float.valueOf(properties.getProperty("Red_Drake_Group_Fighting", String.valueOf(Constants.DrakeEggLayer)));
        //============================ SPAWN ===========================
        Constants.RedDrakeSpawnTree = Boolean.valueOf(properties.getProperty("Red_Drake_Spawn_Tree", String.valueOf(Constants.DrakeEggLayer)));
        Constants.RedDrakeSpawnSteppe = Boolean.valueOf(properties.getProperty("Red_Drake_Spawn_Steppe", String.valueOf(Constants.DrakeEggLayer)));
        Constants.RedDrakeSpawnGrass = Boolean.valueOf(properties.getProperty("Red_Drake_Spawn_Grass", String.valueOf(Constants.DrakeEggLayer)));
        Constants.RedDrakeSpawnTundra = Boolean.valueOf(properties.getProperty("Red_Drake_Spawn_Tundra", String.valueOf(Constants.DrakeEggLayer)));
        Constants.RedDrakeSpawnDirt = Boolean.valueOf(properties.getProperty("Red_Drake_Spawn_Dirt", String.valueOf(Constants.DrakeEggLayer)));
        Constants.RedDrakeSpawnSand = Boolean.valueOf(properties.getProperty("Red_Drake_Spawn_Sand", String.valueOf(Constants.DrakeEggLayer)));
        Constants.RedDrakeSpawnSnow = Boolean.valueOf(properties.getProperty("Red_Drake_Spawn_Snow", String.valueOf(Constants.DrakeEggLayer)));
        Constants.RedDrakeSpawnMarsh = Boolean.valueOf(properties.getProperty("Red_Drake_Spawn_Marsh", String.valueOf(Constants.DrakeEggLayer)));
        Constants.RedDrakeSpawnCave = Boolean.valueOf(properties.getProperty("Red_Drake_Spawn_Cave", String.valueOf(Constants.DrakeEggLayer)));
        Constants.RedDrakeSpawnPeat = Boolean.valueOf(properties.getProperty("Red_Drake_Spawn_Peat", String.valueOf(Constants.DrakeEggLayer)));
        /*
          White Drake
         */
        //============================ MAIN ===========================
        Constants.WhiteDrakeEnabled = Boolean.valueOf(properties.getProperty("White_Drake_Enabled", String.valueOf(Constants.DrakeEggLayer)));
        Constants.WhiteDrakeDesc = String.valueOf(properties.getProperty("White_Drake_Desc", String.valueOf(Constants.DrakeEggLayer)));
        Constants.WhiteDrakeCreatureTypes = Initiator.getPropertyArray(String.valueOf(properties.getProperty("White_Drake_Creature_Types")));
        //============================ SIZE ===========================
        Constants.WhiteDrakeSizeX =  Integer.valueOf(properties.getProperty("White_Drake_SizeX", String.valueOf(Constants.DrakeEggLayer)));
        Constants.WhiteDrakeSizeY =  Integer.valueOf(properties.getProperty("White_Drake_SizeY", String.valueOf(Constants.DrakeEggLayer)));
        Constants.WhiteDrakeSizeZ =  Integer.valueOf(properties.getProperty("White_Drake_SizeZ", String.valueOf(Constants.DrakeEggLayer)));
        //============================ MISC ===========================
        Constants.WhiteDrakeMaxPop =  Integer.valueOf(properties.getProperty("White_Drake_Max_Population", String.valueOf(Constants.DrakeEggLayer)));
        Constants.WhiteDrakeMaxAge =  Integer.valueOf(properties.getProperty("White_Drake_Max_Age", String.valueOf(Constants.DrakeEggLayer)));
        Constants.WhiteDrakeItemsButchered = Initiator.getPropertyArray(String.valueOf(properties.getProperty("White_Drake_Items_Butchered")));
        Constants.WhiteDrakeMoveRate =  Integer.valueOf(properties.getProperty("White_Drake_MoveRate", String.valueOf(Constants.DrakeEggLayer)));
        //============================ ATTITUDE ===========================
        Constants.WhiteDrakeAggression =  Integer.valueOf(properties.getProperty("White_Drake_Aggression", String.valueOf(Constants.DrakeEggLayer)));
        Constants.WhiteDrakeAlignment = Float.valueOf(properties.getProperty("White_Drake_Alignment", String.valueOf(Constants.DrakeEggLayer)));
        Constants.WhiteDrakeVision =  Integer.valueOf(properties.getProperty("White_Drake_Vision", String.valueOf(Constants.DrakeEggLayer)));
        Constants.WhiteDrakeMaxHuntRange =  Integer.valueOf(properties.getProperty("White_Drake_Max_Hunt_Range", String.valueOf(Constants.DrakeEggLayer)));
        //============================ VEHICLE ===========================
        Constants.WhiteDrakeSetMaxHeightDiff = Float.valueOf(properties.getProperty("White_Drake_Vehicle_Max_Height_Diff", String.valueOf(Constants.DrakeEggLayer)));
        Constants.WhiteDrakeVehicleSpeed = Float.valueOf(properties.getProperty("White_Drake_Vehicle_Max_Speed", String.valueOf(Constants.DrakeEggLayer)));
        Constants.WhiteDrakeVehicleSkill = Float.valueOf(properties.getProperty("White_Drake_Vehicle_Skill_Required", String.valueOf(Constants.DrakeEggLayer)));
        Constants.WhiteDrakeVehicleDepth = Float.valueOf(properties.getProperty("White_Drake_Vehicle_Max_Depth", String.valueOf(Constants.DrakeEggLayer)));
        Constants.WhiteDrakeZaxisOffset = Float.valueOf(properties.getProperty("White_Drake_Vehicle_Zaxis_Offset", String.valueOf(Constants.DrakeEggLayer)));
        Constants.WhiteDrakeMoveSpeed = Float.valueOf(properties.getProperty("White_Drake_Move_Speed", String.valueOf(Constants.DrakeEggLayer)));
        //============================ OFFENSE ===========================
        Constants.WhiteDrakeBaseCombatRating = Float.valueOf(properties.getProperty("White_Drake_Base_Combat_Rating", String.valueOf(Constants.DrakeEggLayer)));
        Constants.WhiteDrakeCombatDamageType =  Integer.valueOf(properties.getProperty("White_Drake_Combat_Damage_Type", String.valueOf(Constants.DrakeEggLayer)));
        Constants.WhiteDrakeCombatMoves = Initiator.getPropertyArray(String.valueOf(properties.getProperty("White_Drake_Combat_Moves")));
        Constants.WhiteDrakeHeadbuttDamString = String.valueOf(properties.getProperty("White_Drake_Head_butt_Dam_String", String.valueOf(Constants.DrakeEggLayer)));
        Constants.WhiteDrakeKickDamString = String.valueOf(properties.getProperty("White_Drake_Kick_Dam_String", String.valueOf(Constants.DrakeEggLayer)));
        Constants.WhiteDrakeHandDamage = Float.valueOf(properties.getProperty("White_Drake_Hand_Damage", String.valueOf(Constants.DrakeEggLayer)));
        Constants.WhiteDrakeKickDamage = Float.valueOf(properties.getProperty("White_Drake_Kick_Damage", String.valueOf(Constants.DrakeEggLayer)));
        Constants.WhiteDrakeBiteDamage = Float.valueOf(properties.getProperty("White_Drake_Bite_Damage", String.valueOf(Constants.DrakeEggLayer)));
        Constants.WhiteDrakeHeadDamage = Float.valueOf(properties.getProperty("White_Drake_Head_Damage", String.valueOf(Constants.DrakeEggLayer)));
        Constants.WhiteDrakeBreathDamage = Float.valueOf(properties.getProperty("White_Drake_Breath_Damage", String.valueOf(Constants.DrakeEggLayer)));
        //============================ DEFENSE ===========================
        Constants.WhiteDrakeNaturalArmour = Float.valueOf(properties.getProperty("White_Drake_Natural_Armour", String.valueOf(Constants.DrakeEggLayer)));
        ////Constants.WhiteDrakeArmourType =  Integer.valueOf(properties.getProperty("White_Drake_Armour_Type", String.valueOf(Constants.DrakeEggLayer)));
        //============================ SKILLS ===========================
        Constants.WhiteDrakeBodyStrength = Float.valueOf(properties.getProperty("White_Drake_Body_Strength", String.valueOf(Constants.DrakeEggLayer)));
        Constants.WhiteDrakeBodyControl = Float.valueOf(properties.getProperty("White_Drake_Body_Control", String.valueOf(Constants.DrakeEggLayer)));
        Constants.WhiteDrakeBodyStamina = Float.valueOf(properties.getProperty("White_Drake_Body_Stamina", String.valueOf(Constants.DrakeEggLayer)));
        Constants.WhiteDrakeMindLogic = Float.valueOf(properties.getProperty("White_Drake_Mind_Logic", String.valueOf(Constants.DrakeEggLayer)));
        Constants.WhiteDrakeMindSpeed = Float.valueOf(properties.getProperty("White_Drake_Mind_Speed", String.valueOf(Constants.DrakeEggLayer)));
        Constants.WhiteDrakeSoulStrength = Float.valueOf(properties.getProperty("White_Drake_Soul_Strength", String.valueOf(Constants.DrakeEggLayer)));
        Constants.WhiteDrakeSoulDepth = Float.valueOf(properties.getProperty("White_Drake_Soul_Depth", String.valueOf(Constants.DrakeEggLayer)));
        Constants.WhiteDrakeWeaponlessFighting = Float.valueOf(properties.getProperty("White_Drake_Weaponless_Fighting", String.valueOf(Constants.DrakeEggLayer)));
        Constants.WhiteDrakeGroupFighting = Float.valueOf(properties.getProperty("White_Drake_Group_Fighting", String.valueOf(Constants.DrakeEggLayer)));
        //============================ SPAWN ===========================
        Constants.WhiteDrakeSpawnTree = Boolean.valueOf(properties.getProperty("White_Drake_Spawn_Tree", String.valueOf(Constants.DrakeEggLayer)));
        Constants.WhiteDrakeSpawnSteppe = Boolean.valueOf(properties.getProperty("White_Drake_Spawn_Steppe", String.valueOf(Constants.DrakeEggLayer)));
        Constants.WhiteDrakeSpawnGrass = Boolean.valueOf(properties.getProperty("White_Drake_Spawn_Grass", String.valueOf(Constants.DrakeEggLayer)));
        Constants.WhiteDrakeSpawnTundra = Boolean.valueOf(properties.getProperty("White_Drake_Spawn_Tundra", String.valueOf(Constants.DrakeEggLayer)));
        Constants.WhiteDrakeSpawnDirt = Boolean.valueOf(properties.getProperty("White_Drake_Spawn_Dirt", String.valueOf(Constants.DrakeEggLayer)));
        Constants.WhiteDrakeSpawnSand = Boolean.valueOf(properties.getProperty("White_Drake_Spawn_Sand", String.valueOf(Constants.DrakeEggLayer)));
        Constants.WhiteDrakeSpawnSnow = Boolean.valueOf(properties.getProperty("White_Drake_Spawn_Snow", String.valueOf(Constants.DrakeEggLayer)));
        Constants.WhiteDrakeSpawnMarsh = Boolean.valueOf(properties.getProperty("White_Drake_Spawn_Marsh", String.valueOf(Constants.DrakeEggLayer)));
        Constants.WhiteDrakeSpawnCave = Boolean.valueOf(properties.getProperty("White_Drake_Spawn_Cave", String.valueOf(Constants.DrakeEggLayer)));
        Constants.WhiteDrakeSpawnPeat = Boolean.valueOf(properties.getProperty("White_Drake_Spawn_Peat", String.valueOf(Constants.DrakeEggLayer)));
        /*
          Settings
         */
        Constants.DEBUG = Boolean.valueOf(properties.getProperty("Debug", String.valueOf(Constants.DEBUG)));
        if (Constants.DEBUG) {
            Initiator.creatureLogging();
        }
    }

}
