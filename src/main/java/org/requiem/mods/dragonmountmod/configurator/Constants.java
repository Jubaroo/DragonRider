package org.requiem.mods.dragonmountmod.configurator;

import com.wurmonline.server.combat.ArmourTemplate.ArmourType;

import static com.wurmonline.server.combat.ArmourTemplate.ARMOUR_TYPE_LEATHER_DRAGON;

public class Constants {

    public static boolean DEBUG;

//=======================================================================================    
//======================================== DRAKES =======================================
//=======================================================================================

    public static boolean DrakeEggLayer;

    /**
     * Black Drake
     */
    public static String BlackDrakeDesc = "This docile black drake looks happy as it sits ready to ride.";
    public static String BlackDrakeKickDamString = "wingbuff";
    public static String BlackDrakeHeadbuttDamString = "tailwhip";

    public static int[] BlackDrakeItemsButchered = new int[]{303,308,309,310,371,636};
    public static int[] BlackDrakeCombatMoves = new int[]{1,2,6};
    public static int[] BlackDrakeCreatureTypes = new int[]{0,3,4,9,12,14,27,30,32,41,43,62};

    public static int BlackDrakeMoveRate = 10;
    public static int BlackDrakeMaxHuntRange = 10;
    public static int BlackDrakeAggression = 0;
    public static int BlackDrakeVision = 10;
    public static ArmourType BlackDrakeArmourType = ARMOUR_TYPE_LEATHER_DRAGON;
    public static int BlackDrakeCombatDamageType = 2;
    public static int BlackDrakeSizeX = 60;
    public static int BlackDrakeSizeY = 60;
    public static int BlackDrakeSizeZ = 60;
    public static int BlackDrakeMaxPop = 30;
    public static int BlackDrakeMaxAge = 500;

    public static float BlackDrakeSetMaxHeightDiff;
    public static float BlackDrakeNaturalArmour;
    public static float BlackDrakeHandDamage;
    public static float BlackDrakeKickDamage;
    public static float BlackDrakeBiteDamage;
    public static float BlackDrakeHeadDamage;
    public static float BlackDrakeBreathDamage;
    public static float BlackDrakeZaxisOffset;
    public static float BlackDrakeMoveSpeed;
    public static float BlackDrakeBodyStrength;
    public static float BlackDrakeBodyControl;
    public static float BlackDrakeBodyStamina;
    public static float BlackDrakeMindLogic;
    public static float BlackDrakeMindSpeed;
    public static float BlackDrakeSoulStrength;
    public static float BlackDrakeSoulDepth;
    public static float BlackDrakeWeaponlessFighting;
    public static float BlackDrakeGroupFighting;
    public static float BlackDrakeBaseCombatRating;
    public static float BlackDrakeAlignment;
    public static float BlackDrakeVehicleSpeed;
    public static float BlackDrakeVehicleSkill;
    public static float BlackDrakeVehicleDepth;

    public static boolean BlackDrakeEnabled = true;
    public static boolean BlackDrakeSpawnTree = false;
    public static boolean BlackDrakeSpawnSteppe = false;
    public static boolean BlackDrakeSpawnGrass = false;
    public static boolean BlackDrakeSpawnTundra = false;
    public static boolean BlackDrakeSpawnDirt = false;
    public static boolean BlackDrakeSpawnSand = false;
    public static boolean BlackDrakeSpawnSnow = false;
    public static boolean BlackDrakeSpawnMarsh = false;
    public static boolean BlackDrakeSpawnCave = false;
    public static boolean BlackDrakeSpawnPeat = false;
    /**
     * Blue Drake
     */
    public static String BlueDrakeDesc;
    public static String BlueDrakeKickDamString= "wingbuff";;
    public static String BlueDrakeHeadbuttDamString = "tailwhip";;

    public static int[] BlueDrakeItemsButchered = new int[]{303,308,309,310,371,636};
    public static int[] BlueDrakeCombatMoves = new int[]{1,2,6};
    public static int[] BlueDrakeCreatureTypes = new int[]{0,3,4,9,12,14,27,30,32,41,43,62};

    public static int BlueDrakeMoveRate = 10;
    public static int BlueDrakeMaxHuntRange = 10;
    public static int BlueDrakeAggression = 0;
    public static int BlueDrakeVision = 10;
    public static ArmourType BlueDrakeArmourType = ARMOUR_TYPE_LEATHER_DRAGON;
    public static int BlueDrakeCombatDamageType = 2;
    public static int BlueDrakeSizeX = 60;
    public static int BlueDrakeSizeY = 60;
    public static int BlueDrakeSizeZ = 60;
    public static int BlueDrakeMaxPop = 30;
    public static int BlueDrakeMaxAge = 500;

    public static float BlueDrakeSetMaxHeightDiff;
    public static float BlueDrakeNaturalArmour;
    public static float BlueDrakeHandDamage;
    public static float BlueDrakeKickDamage;
    public static float BlueDrakeBiteDamage;
    public static float BlueDrakeHeadDamage;
    public static float BlueDrakeBreathDamage;
    public static float BlueDrakeZaxisOffset;
    public static float BlueDrakeMoveSpeed;
    public static float BlueDrakeBodyStrength;
    public static float BlueDrakeBodyControl;
    public static float BlueDrakeBodyStamina;
    public static float BlueDrakeMindLogic;
    public static float BlueDrakeMindSpeed;
    public static float BlueDrakeSoulStrength;
    public static float BlueDrakeSoulDepth;
    public static float BlueDrakeWeaponlessFighting;
    public static float BlueDrakeGroupFighting;
    public static float BlueDrakeBaseCombatRating;
    public static float BlueDrakeAlignment;
    public static float BlueDrakeVehicleSpeed;
    public static float BlueDrakeVehicleSkill;
    public static float BlueDrakeVehicleDepth;

    public static boolean BlueDrakeEnabled = true;
    public static boolean BlueDrakeSpawnTree = false;
    public static boolean BlueDrakeSpawnSteppe = false;
    public static boolean BlueDrakeSpawnGrass = false;
    public static boolean BlueDrakeSpawnTundra = false;
    public static boolean BlueDrakeSpawnDirt = false;
    public static boolean BlueDrakeSpawnSand = false;
    public static boolean BlueDrakeSpawnSnow = false;
    public static boolean BlueDrakeSpawnMarsh = false;
    public static boolean BlueDrakeSpawnCave = false;
    public static boolean BlueDrakeSpawnPeat = false;
    /**
     * Ghost Drake
     */
    public static String GhostDrakeDesc;
    public static String GhostDrakeKickDamString= "wingbuff";;
    public static String GhostDrakeHeadbuttDamString = "tailwhip";;
    public static String GhostDrakeModelColor;

    public static int[] GhostDrakeItemsButchered = new int[]{303,308,309,310,371,636};
    public static int[] GhostDrakeCombatMoves = new int[]{1,2,6};
    public static int[] GhostDrakeCreatureTypes = new int[]{0,3,4,9,12,14,27,30,32,41,43,62};

    public static int GhostDrakeMoveRate = 10;
    public static int GhostDrakeMaxHuntRange = 10;
    public static int GhostDrakeAggression = 0;
    public static int GhostDrakeVision = 10;
    public static ArmourType GhostDrakeArmourType = ARMOUR_TYPE_LEATHER_DRAGON;
    public static int GhostDrakeCombatDamageType = 2;
    public static int GhostDrakeSizeX = 60;
    public static int GhostDrakeSizeY = 60;
    public static int GhostDrakeSizeZ = 60;
    public static int GhostDrakeMaxPop = 30;
    public static int GhostDrakeMaxAge = 500;

    public static float GhostDrakeSetMaxHeightDiff;
    public static float GhostDrakeNaturalArmour;
    public static float GhostDrakeHandDamage;
    public static float GhostDrakeKickDamage;
    public static float GhostDrakeBiteDamage;
    public static float GhostDrakeHeadDamage;
    public static float GhostDrakeBreathDamage;
    public static float GhostDrakeZaxisOffset;
    public static float GhostDrakeMoveSpeed;
    public static float GhostDrakeBodyStrength;
    public static float GhostDrakeBodyControl;
    public static float GhostDrakeBodyStamina;
    public static float GhostDrakeMindLogic;
    public static float GhostDrakeMindSpeed;
    public static float GhostDrakeSoulStrength;
    public static float GhostDrakeSoulDepth;
    public static float GhostDrakeWeaponlessFighting;
    public static float GhostDrakeGroupFighting;
    public static float GhostDrakeBaseCombatRating;
    public static float GhostDrakeAlignment;
    public static float GhostDrakeVehicleSpeed;
    public static float GhostDrakeVehicleSkill;
    public static float GhostDrakeVehicleDepth;

    public static boolean GhostDrakeEnabled = true;
    public static boolean GhostDrakeSpawnTree = false;
    public static boolean GhostDrakeSpawnSteppe = false;
    public static boolean GhostDrakeSpawnGrass = false;
    public static boolean GhostDrakeSpawnTundra = false;
    public static boolean GhostDrakeSpawnDirt = false;
    public static boolean GhostDrakeSpawnSand = false;
    public static boolean GhostDrakeSpawnSnow = false;
    public static boolean GhostDrakeSpawnMarsh = false;
    public static boolean GhostDrakeSpawnCave = false;
    public static boolean GhostDrakeSpawnPeat = false;
    /**
     * Green Drake
     */
    public static String GreenDrakeDesc;
    public static String GreenDrakeKickDamString= "wingbuff";;
    public static String GreenDrakeHeadbuttDamString = "tailwhip";;

    public static int[] GreenDrakeItemsButchered = new int[]{303,308,309,310,371,636};
    public static int[] GreenDrakeCombatMoves = new int[]{1,2,6};
    public static int[] GreenDrakeCreatureTypes = new int[]{0,3,4,9,12,14,27,30,32,41,43,62};

    public static int GreenDrakeMoveRate = 10;
    public static int GreenDrakeMaxHuntRange = 10;
    public static int GreenDrakeAggression = 0;
    public static int GreenDrakeVision = 10;
    public static ArmourType GreenDrakeArmourType = ARMOUR_TYPE_LEATHER_DRAGON;
    public static int GreenDrakeCombatDamageType = 2;
    public static int GreenDrakeSizeX = 60;
    public static int GreenDrakeSizeY = 60;
    public static int GreenDrakeSizeZ = 60;
    public static int GreenDrakeMaxPop = 30;
    public static int GreenDrakeMaxAge = 500;

    public static float GreenDrakeSetMaxHeightDiff;
    public static float GreenDrakeNaturalArmour;
    public static float GreenDrakeHandDamage;
    public static float GreenDrakeKickDamage;
    public static float GreenDrakeBiteDamage;
    public static float GreenDrakeHeadDamage;
    public static float GreenDrakeBreathDamage;
    public static float GreenDrakeZaxisOffset;
    public static float GreenDrakeMoveSpeed;
    public static float GreenDrakeBodyStrength;
    public static float GreenDrakeBodyControl;
    public static float GreenDrakeBodyStamina;
    public static float GreenDrakeMindLogic;
    public static float GreenDrakeMindSpeed;
    public static float GreenDrakeSoulStrength;
    public static float GreenDrakeSoulDepth;
    public static float GreenDrakeWeaponlessFighting;
    public static float GreenDrakeGroupFighting;
    public static float GreenDrakeBaseCombatRating;
    public static float GreenDrakeAlignment;
    public static float GreenDrakeVehicleSpeed;
    public static float GreenDrakeVehicleSkill;
    public static float GreenDrakeVehicleDepth;

    public static boolean GreenDrakeEnabled = true;
    public static boolean GreenDrakeSpawnTree = false;
    public static boolean GreenDrakeSpawnSteppe = false;
    public static boolean GreenDrakeSpawnGrass = false;
    public static boolean GreenDrakeSpawnTundra = false;
    public static boolean GreenDrakeSpawnDirt = false;
    public static boolean GreenDrakeSpawnSand = false;
    public static boolean GreenDrakeSpawnSnow = false;
    public static boolean GreenDrakeSpawnMarsh = false;
    public static boolean GreenDrakeSpawnCave = false;
    public static boolean GreenDrakeSpawnPeat = false;
    /**
     * Red Drake
     */
    public static String RedDrakeDesc;
    public static String RedDrakeKickDamString= "wingbuff";;
    public static String RedDrakeHeadbuttDamString = "tailwhip";;

    public static int[] RedDrakeItemsButchered = new int[]{303,308,309,310,371,636};
    public static int[] RedDrakeCombatMoves = new int[]{1,2,6};
    public static int[] RedDrakeCreatureTypes = new int[]{0,3,4,9,12,14,27,30,32,41,43,62};

    public static int RedDrakeMoveRate = 10;
    public static int RedDrakeMaxHuntRange = 10;
    public static int RedDrakeAggression = 0;
    public static int RedDrakeVision = 10;
    public static ArmourType RedDrakeArmourType = ARMOUR_TYPE_LEATHER_DRAGON;
    public static int RedDrakeCombatDamageType = 2;
    public static int RedDrakeSizeX = 60;
    public static int RedDrakeSizeY = 60;
    public static int RedDrakeSizeZ = 60;
    public static int RedDrakeMaxPop = 30;
    public static int RedDrakeMaxAge = 500;

    public static float RedDrakeSetMaxHeightDiff;
    public static float RedDrakeNaturalArmour;
    public static float RedDrakeHandDamage;
    public static float RedDrakeKickDamage;
    public static float RedDrakeBiteDamage;
    public static float RedDrakeHeadDamage;
    public static float RedDrakeBreathDamage;
    public static float RedDrakeZaxisOffset;
    public static float RedDrakeMoveSpeed;
    public static float RedDrakeBodyStrength;
    public static float RedDrakeBodyControl;
    public static float RedDrakeBodyStamina;
    public static float RedDrakeMindLogic;
    public static float RedDrakeMindSpeed;
    public static float RedDrakeSoulStrength;
    public static float RedDrakeSoulDepth;
    public static float RedDrakeWeaponlessFighting;
    public static float RedDrakeGroupFighting;
    public static float RedDrakeBaseCombatRating;
    public static float RedDrakeAlignment;
    public static float RedDrakeVehicleSpeed;
    public static float RedDrakeVehicleSkill;
    public static float RedDrakeVehicleDepth;

    public static boolean RedDrakeEnabled = true;
    public static boolean RedDrakeSpawnTree = false;
    public static boolean RedDrakeSpawnSteppe = false;
    public static boolean RedDrakeSpawnGrass = false;
    public static boolean RedDrakeSpawnTundra = false;
    public static boolean RedDrakeSpawnDirt = false;
    public static boolean RedDrakeSpawnSand = false;
    public static boolean RedDrakeSpawnSnow = false;
    public static boolean RedDrakeSpawnMarsh = false;
    public static boolean RedDrakeSpawnCave = false;
    public static boolean RedDrakeSpawnPeat = false;
    /**
     * White Drake
     */
    public static String WhiteDrakeDesc;
    public static String WhiteDrakeKickDamString= "wingbuff";;
    public static String WhiteDrakeHeadbuttDamString = "tailwhip";;

    public static int[] WhiteDrakeItemsButchered = new int[]{303,308,309,310,371,636};
    public static int[] WhiteDrakeCombatMoves = new int[]{1,2,6};
    public static int[] WhiteDrakeCreatureTypes = new int[]{0,3,4,9,12,14,27,30,32,41,43,62};

    public static int WhiteDrakeMoveRate = 10;
    public static int WhiteDrakeMaxHuntRange = 10;
    public static int WhiteDrakeAggression = 0;
    public static int WhiteDrakeVision = 10;
    public static ArmourType WhiteDrakeArmourType = ARMOUR_TYPE_LEATHER_DRAGON;
    public static int WhiteDrakeCombatDamageType = 2;
    public static int WhiteDrakeSizeX = 60;
    public static int WhiteDrakeSizeY = 60;
    public static int WhiteDrakeSizeZ = 60;
    public static int WhiteDrakeMaxPop = 30;
    public static int WhiteDrakeMaxAge = 500;

    public static float WhiteDrakeSetMaxHeightDiff;
    public static float WhiteDrakeNaturalArmour;
    public static float WhiteDrakeHandDamage;
    public static float WhiteDrakeKickDamage;
    public static float WhiteDrakeBiteDamage;
    public static float WhiteDrakeHeadDamage;
    public static float WhiteDrakeBreathDamage;
    public static float WhiteDrakeZaxisOffset;
    public static float WhiteDrakeMoveSpeed;
    public static float WhiteDrakeBodyStrength;
    public static float WhiteDrakeBodyControl;
    public static float WhiteDrakeBodyStamina;
    public static float WhiteDrakeMindLogic;
    public static float WhiteDrakeMindSpeed;
    public static float WhiteDrakeSoulStrength;
    public static float WhiteDrakeSoulDepth;
    public static float WhiteDrakeWeaponlessFighting;
    public static float WhiteDrakeGroupFighting;
    public static float WhiteDrakeBaseCombatRating;
    public static float WhiteDrakeAlignment;
    public static float WhiteDrakeVehicleSpeed;
    public static float WhiteDrakeVehicleSkill;
    public static float WhiteDrakeVehicleDepth;

    public static boolean WhiteDrakeEnabled = true;
    public static boolean WhiteDrakeSpawnTree = false;
    public static boolean WhiteDrakeSpawnSteppe = false;
    public static boolean WhiteDrakeSpawnGrass = false;
    public static boolean WhiteDrakeSpawnTundra = false;
    public static boolean WhiteDrakeSpawnDirt = false;
    public static boolean WhiteDrakeSpawnSand = false;
    public static boolean WhiteDrakeSpawnSnow = false;
    public static boolean WhiteDrakeSpawnMarsh = false;
    public static boolean WhiteDrakeSpawnCave = false;
    public static boolean WhiteDrakeSpawnPeat = false;

//=======================================================================================    
//======================================== BASILISKS ====================================
//=======================================================================================

    public static boolean BasiliskEggLayer;

    /**
     * Black Basilisk
     */
    public static String BlackBasiliskDesc;
    public static String BlackBasiliskKickDamString;
    public static String BlackBasiliskHeadbuttDamString;

    public static int[] BlackBasiliskItemsButchered;
    public static int[] BlackBasiliskCombatMoves;
    public static int[] BlackBasiliskCreatureTypes;

    public static int BlackBasiliskMoveRate;
    public static int BlackBasiliskMaxHuntRange;
    public static int BlackBasiliskAggression;
    public static int BlackBasiliskVision;
    public static ArmourType BlackBasiliskArmourType;
    public static int BlackBasiliskCombatDamageType;
    public static int BlackBasiliskSizeX;
    public static int BlackBasiliskSizeY;
    public static int BlackBasiliskSizeZ;
    public static int BlackBasiliskMaxPop;
    public static int BlackBasiliskMaxAge = 750;

    public static float BlackBasiliskSetMaxHeightDiff;
    public static float BlackBasiliskNaturalArmour;
    public static float BlackBasiliskHandDamage;
    public static float BlackBasiliskKickDamage;
    public static float BlackBasiliskBiteDamage;
    public static float BlackBasiliskHeadDamage;
    public static float BlackBasiliskBreathDamage;
    public static float BlackBasiliskZaxisOffset;
    public static float BlackBasiliskMoveSpeed;
    public static float BlackBasiliskBodyStrength;
    public static float BlackBasiliskBodyControl;
    public static float BlackBasiliskBodyStamina;
    public static float BlackBasiliskMindLogic;
    public static float BlackBasiliskMindSpeed;
    public static float BlackBasiliskSoulStrength;
    public static float BlackBasiliskSoulDepth;
    public static float BlackBasiliskWeaponlessFighting;
    public static float BlackBasiliskGroupFighting;
    public static float BlackBasiliskBaseCombatRating;
    public static float BlackBasiliskAlignment;
    public static float BlackBasiliskVehicleSpeed;
    public static float BlackBasiliskVehicleSkill;
    public static float BlackBasiliskVehicleDepth;

    public static boolean BlackBasiliskEnabled = true;
    public static boolean BlackBasiliskSpawnTree = false;
    public static boolean BlackBasiliskSpawnSteppe = false;
    public static boolean BlackBasiliskSpawnGrass = false;
    public static boolean BlackBasiliskSpawnTundra = false;
    public static boolean BlackBasiliskSpawnDirt = false;
    public static boolean BlackBasiliskSpawnSand = false;
    public static boolean BlackBasiliskSpawnSnow = false;
    public static boolean BlackBasiliskSpawnMarsh = false;
    public static boolean BlackBasiliskSpawnCave = false;
    public static boolean BlackBasiliskSpawnPeat = false;
    /**
     * Blue Basilisk
     */
    public static String BlueBasiliskDesc;
    public static String BlueBasiliskKickDamString;
    public static String BlueBasiliskHeadbuttDamString;

    public static int[] BlueBasiliskItemsButchered;
    public static int[] BlueBasiliskCombatMoves;
    public static int[] BlueBasiliskCreatureTypes;

    public static int BlueBasiliskMoveRate;
    public static int BlueBasiliskMaxHuntRange;
    public static int BlueBasiliskAggression;
    public static int BlueBasiliskVision;
    public static ArmourType BlueBasiliskArmourType;
    public static int BlueBasiliskCombatDamageType;
    public static int BlueBasiliskSizeX;
    public static int BlueBasiliskSizeY;
    public static int BlueBasiliskSizeZ;
    public static int BlueBasiliskMaxPop;
    public static int BlueBasiliskMaxAge = 750;

    public static float BlueBasiliskSetMaxHeightDiff;
    public static float BlueBasiliskNaturalArmour;
    public static float BlueBasiliskHandDamage;
    public static float BlueBasiliskKickDamage;
    public static float BlueBasiliskBiteDamage;
    public static float BlueBasiliskHeadDamage;
    public static float BlueBasiliskBreathDamage;
    public static float BlueBasiliskZaxisOffset;
    public static float BlueBasiliskMoveSpeed;
    public static float BlueBasiliskBodyStrength;
    public static float BlueBasiliskBodyControl;
    public static float BlueBasiliskBodyStamina;
    public static float BlueBasiliskMindLogic;
    public static float BlueBasiliskMindSpeed;
    public static float BlueBasiliskSoulStrength;
    public static float BlueBasiliskSoulDepth;
    public static float BlueBasiliskWeaponlessFighting;
    public static float BlueBasiliskGroupFighting;
    public static float BlueBasiliskBaseCombatRating;
    public static float BlueBasiliskAlignment;
    public static float BlueBasiliskVehicleSpeed;
    public static float BlueBasiliskVehicleSkill;
    public static float BlueBasiliskVehicleDepth;

    public static boolean BlueBasiliskEnabled = true;
    public static boolean BlueBasiliskSpawnTree = false;
    public static boolean BlueBasiliskSpawnSteppe = false;
    public static boolean BlueBasiliskSpawnGrass = false;
    public static boolean BlueBasiliskSpawnTundra = false;
    public static boolean BlueBasiliskSpawnDirt = false;
    public static boolean BlueBasiliskSpawnSand = false;
    public static boolean BlueBasiliskSpawnSnow = false;
    public static boolean BlueBasiliskSpawnMarsh = false;
    public static boolean BlueBasiliskSpawnCave = false;
    public static boolean BlueBasiliskSpawnPeat = false;
    /**
     * Ghost Basilisk
     */
    public static String GhostBasiliskDesc;
    public static String GhostBasiliskKickDamString;
    public static String GhostBasiliskHeadbuttDamString;
    public static String GhostBasiliskModelColor;

    public static int[] GhostBasiliskItemsButchered;
    public static int[] GhostBasiliskCombatMoves;
    public static int[] GhostBasiliskCreatureTypes;

    public static int GhostBasiliskMoveRate;
    public static int GhostBasiliskMaxHuntRange;
    public static int GhostBasiliskAggression;
    public static int GhostBasiliskVision;
    public static ArmourType GhostBasiliskArmourType;
    public static int GhostBasiliskCombatDamageType;
    public static int GhostBasiliskSizeX;
    public static int GhostBasiliskSizeY;
    public static int GhostBasiliskSizeZ;
    public static int GhostBasiliskMaxPop;
    public static int GhostBasiliskMaxAge = 750;

    public static float GhostBasiliskSetMaxHeightDiff;
    public static float GhostBasiliskNaturalArmour;
    public static float GhostBasiliskHandDamage;
    public static float GhostBasiliskKickDamage;
    public static float GhostBasiliskBiteDamage;
    public static float GhostBasiliskHeadDamage;
    public static float GhostBasiliskBreathDamage;
    public static float GhostBasiliskZaxisOffset;
    public static float GhostBasiliskMoveSpeed;
    public static float GhostBasiliskBodyStrength;
    public static float GhostBasiliskBodyControl;
    public static float GhostBasiliskBodyStamina;
    public static float GhostBasiliskMindLogic;
    public static float GhostBasiliskMindSpeed;
    public static float GhostBasiliskSoulStrength;
    public static float GhostBasiliskSoulDepth;
    public static float GhostBasiliskWeaponlessFighting;
    public static float GhostBasiliskGroupFighting;
    public static float GhostBasiliskBaseCombatRating;
    public static float GhostBasiliskAlignment;
    public static float GhostBasiliskVehicleSpeed;
    public static float GhostBasiliskVehicleSkill;
    public static float GhostBasiliskVehicleDepth;

    public static boolean GhostBasiliskEnabled = true;
    public static boolean GhostBasiliskSpawnTree = false;
    public static boolean GhostBasiliskSpawnSteppe = false;
    public static boolean GhostBasiliskSpawnGrass = false;
    public static boolean GhostBasiliskSpawnTundra = false;
    public static boolean GhostBasiliskSpawnDirt = false;
    public static boolean GhostBasiliskSpawnSand = false;
    public static boolean GhostBasiliskSpawnSnow = false;
    public static boolean GhostBasiliskSpawnMarsh = false;
    public static boolean GhostBasiliskSpawnCave = false;
    public static boolean GhostBasiliskSpawnPeat = false;
    /**
     * Green Basilisk
     */
    public static String GreenBasiliskDesc;
    public static String GreenBasiliskKickDamString;
    public static String GreenBasiliskHeadbuttDamString;

    public static int[] GreenBasiliskItemsButchered;
    public static int[] GreenBasiliskCombatMoves;
    public static int[] GreenBasiliskCreatureTypes;

    public static int GreenBasiliskMoveRate;
    public static int GreenBasiliskMaxHuntRange;
    public static int GreenBasiliskAggression;
    public static int GreenBasiliskVision;
    public static ArmourType GreenBasiliskArmourType;
    public static int GreenBasiliskCombatDamageType;
    public static int GreenBasiliskSizeX;
    public static int GreenBasiliskSizeY;
    public static int GreenBasiliskSizeZ;
    public static int GreenBasiliskMaxPop;
    public static int GreenBasiliskMaxAge = 750;

    public static float GreenBasiliskSetMaxHeightDiff;
    public static float GreenBasiliskNaturalArmour;
    public static float GreenBasiliskHandDamage;
    public static float GreenBasiliskKickDamage;
    public static float GreenBasiliskBiteDamage;
    public static float GreenBasiliskHeadDamage;
    public static float GreenBasiliskBreathDamage;
    public static float GreenBasiliskZaxisOffset;
    public static float GreenBasiliskMoveSpeed;
    public static float GreenBasiliskBodyStrength;
    public static float GreenBasiliskBodyControl;
    public static float GreenBasiliskBodyStamina;
    public static float GreenBasiliskMindLogic;
    public static float GreenBasiliskMindSpeed;
    public static float GreenBasiliskSoulStrength;
    public static float GreenBasiliskSoulDepth;
    public static float GreenBasiliskWeaponlessFighting;
    public static float GreenBasiliskGroupFighting;
    public static float GreenBasiliskBaseCombatRating;
    public static float GreenBasiliskAlignment;
    public static float GreenBasiliskVehicleSpeed;
    public static float GreenBasiliskVehicleSkill;
    public static float GreenBasiliskVehicleDepth;

    public static boolean GreenBasiliskEnabled = true;
    public static boolean GreenBasiliskSpawnTree = false;
    public static boolean GreenBasiliskSpawnSteppe = false;
    public static boolean GreenBasiliskSpawnGrass = false;
    public static boolean GreenBasiliskSpawnTundra = false;
    public static boolean GreenBasiliskSpawnDirt = false;
    public static boolean GreenBasiliskSpawnSand = false;
    public static boolean GreenBasiliskSpawnSnow = false;
    public static boolean GreenBasiliskSpawnMarsh = false;
    public static boolean GreenBasiliskSpawnCave = false;
    public static boolean GreenBasiliskSpawnPeat = false;
    /**
     * Red Basilisk
     */
    public static String RedBasiliskDesc;
    public static String RedBasiliskKickDamString;
    public static String RedBasiliskHeadbuttDamString;

    public static int[] RedBasiliskItemsButchered;
    public static int[] RedBasiliskCombatMoves;
    public static int[] RedBasiliskCreatureTypes;

    public static int RedBasiliskMoveRate;
    public static int RedBasiliskMaxHuntRange;
    public static int RedBasiliskAggression;
    public static int RedBasiliskVision;
    public static ArmourType RedBasiliskArmourType;
    public static int RedBasiliskCombatDamageType;
    public static int RedBasiliskSizeX;
    public static int RedBasiliskSizeY;
    public static int RedBasiliskSizeZ;
    public static int RedBasiliskMaxPop;
    public static int RedBasiliskMaxAge = 750;

    public static float RedBasiliskSetMaxHeightDiff;
    public static float RedBasiliskNaturalArmour;
    public static float RedBasiliskHandDamage;
    public static float RedBasiliskKickDamage;
    public static float RedBasiliskBiteDamage;
    public static float RedBasiliskHeadDamage;
    public static float RedBasiliskBreathDamage;
    public static float RedBasiliskZaxisOffset;
    public static float RedBasiliskMoveSpeed;
    public static float RedBasiliskBodyStrength;
    public static float RedBasiliskBodyControl;
    public static float RedBasiliskBodyStamina;
    public static float RedBasiliskMindLogic;
    public static float RedBasiliskMindSpeed;
    public static float RedBasiliskSoulStrength;
    public static float RedBasiliskSoulDepth;
    public static float RedBasiliskWeaponlessFighting;
    public static float RedBasiliskGroupFighting;
    public static float RedBasiliskBaseCombatRating;
    public static float RedBasiliskAlignment;
    public static float RedBasiliskVehicleSpeed;
    public static float RedBasiliskVehicleSkill;
    public static float RedBasiliskVehicleDepth;

    public static boolean RedBasiliskEnabled = true;
    public static boolean RedBasiliskSpawnTree = false;
    public static boolean RedBasiliskSpawnSteppe = false;
    public static boolean RedBasiliskSpawnGrass = false;
    public static boolean RedBasiliskSpawnTundra = false;
    public static boolean RedBasiliskSpawnDirt = false;
    public static boolean RedBasiliskSpawnSand = false;
    public static boolean RedBasiliskSpawnSnow = false;
    public static boolean RedBasiliskSpawnMarsh = false;
    public static boolean RedBasiliskSpawnCave = false;
    public static boolean RedBasiliskSpawnPeat = false;
    /**
     * White Basilisk
     */
    public static String WhiteBasiliskDesc;
    public static String WhiteBasiliskKickDamString;
    public static String WhiteBasiliskHeadbuttDamString;

    public static int[] WhiteBasiliskItemsButchered;
    public static int[] WhiteBasiliskCombatMoves;
    public static int[] WhiteBasiliskCreatureTypes;

    public static int WhiteBasiliskMoveRate;
    public static int WhiteBasiliskMaxHuntRange;
    public static int WhiteBasiliskAggression;
    public static int WhiteBasiliskVision;
    public static ArmourType WhiteBasiliskArmourType;
    public static int WhiteBasiliskCombatDamageType;
    public static int WhiteBasiliskSizeX;
    public static int WhiteBasiliskSizeY;
    public static int WhiteBasiliskSizeZ;
    public static int WhiteBasiliskMaxPop;
    public static int WhiteBasiliskMaxAge = 750;

    public static float WhiteBasiliskSetMaxHeightDiff;
    public static float WhiteBasiliskNaturalArmour;
    public static float WhiteBasiliskHandDamage;
    public static float WhiteBasiliskKickDamage;
    public static float WhiteBasiliskBiteDamage;
    public static float WhiteBasiliskHeadDamage;
    public static float WhiteBasiliskBreathDamage;
    public static float WhiteBasiliskZaxisOffset;
    public static float WhiteBasiliskMoveSpeed;
    public static float WhiteBasiliskBodyStrength;
    public static float WhiteBasiliskBodyControl;
    public static float WhiteBasiliskBodyStamina;
    public static float WhiteBasiliskMindLogic;
    public static float WhiteBasiliskMindSpeed;
    public static float WhiteBasiliskSoulStrength;
    public static float WhiteBasiliskSoulDepth;
    public static float WhiteBasiliskWeaponlessFighting;
    public static float WhiteBasiliskGroupFighting;
    public static float WhiteBasiliskBaseCombatRating;
    public static float WhiteBasiliskAlignment;
    public static float WhiteBasiliskVehicleSpeed;
    public static float WhiteBasiliskVehicleSkill;
    public static float WhiteBasiliskVehicleDepth;

    public static boolean WhiteBasiliskEnabled = true;
    public static boolean WhiteBasiliskSpawnTree = false;
    public static boolean WhiteBasiliskSpawnSteppe = false;
    public static boolean WhiteBasiliskSpawnGrass = false;
    public static boolean WhiteBasiliskSpawnTundra = false;
    public static boolean WhiteBasiliskSpawnDirt = false;
    public static boolean WhiteBasiliskSpawnSand = false;
    public static boolean WhiteBasiliskSpawnSnow = false;
    public static boolean WhiteBasiliskSpawnMarsh = false;
    public static boolean WhiteBasiliskSpawnCave = false;
    public static boolean WhiteBasiliskSpawnPeat = false;

    public Constants() {
    }
}
