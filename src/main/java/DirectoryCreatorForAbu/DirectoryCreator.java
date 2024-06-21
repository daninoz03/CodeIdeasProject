package DirectoryCreatorForAbu;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DirectoryCreator {

    private static final String PATH_TO_BASE_DIR = "./src/main/resources/DirectoryCreatorForAbu/createdDirectories/";//"/Users/danielobrien/Desktop/BowsyTest/";
    private static final String PATH_TO_ROOT_DIR_CSV = "../../resources/DirectoryCreatorForAbu/rootDirNames.csv";
    private static final String PATH_TO_DEPARTMENTS_CSV = "../../resources/DirectoryCreatorForAbu/departments.csv";

    public void createDirectories() {
        List<String> rootDirsList = readAndParseCSVFile(PATH_TO_ROOT_DIR_CSV);
        List<String> departmentList = readAndParseCSVFile(PATH_TO_DEPARTMENTS_CSV);

        // F34 Building Lists
        List<String> f34BuildingAMHSDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_F34BUILDING_AMHS_DEPARTMENT_ENTITYCODE);
        List<String> f34BuildingDireDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_F34BUILDING_DIRE_DEPARTMENT_ENTITYCODE);
        List<String> f34BuildingDryEtchDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_F34BUILDING_DRYETCH_DEPARTMENT_ENTITYCODE);
        List<String> f34BuildingGlobalsDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_F34BUILDING_GLOBALS_DEPARTMENT_ENTITYCODE);
        List<String> f34BuildingLithoDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_F34BUILDING_LITHO_DEPARTMENT_ENTITYCODE);
        List<String> f34BuildingPlanarDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_F34BUILDING_PLANAR_DEPARTMENT_ENTITYCODE);
        List<String> f34BuildingSortDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_F34BUILDING_SORT_DEPARTMENT_ENTITYCODE);
        List<String> f34BuildingThinFilmsDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_F34BUILDING_THINFILMS_DEPARTMENT_ENTITYCODE);
        List<String> f34BuildingWetEtchDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_F34BUILDING_WETETCH_DEPARTMENT_ENTITYCODE);
        List<String> f34BuildingC4DepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_F34BUILDING_C4_DEPARTMENT_ENTITYCODE);
        List<String> f34BuildingDefectMetroDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_F34BUILDING_DEFECTMETRO_DEPARTMENT_ENTITYCODE);
        List<String> f34BuildingPCDDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_F34BUILDING_PCD_DEPARTMENT_ENTITYCODE);

        // F10 Building Lists
        List<String> f10BuildingAMHSDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_F10BUILDING_AMHS_DEPARTMENT_ENTITYCODE);
        List<String> f10BuildingDireDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_F10BUILDING_DIRE_DEPARTMENT_ENTITYCODE);
        List<String> f10BuildingDryEtchDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_F10BUILDING_DRYETCH_DEPARTMENT_ENTITYCODE);
        List<String> f10BuildingGlobalsDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_F10BUILDING_GLOBALS_DEPARTMENT_ENTITYCODE);
        List<String> f10BuildingLithoDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_F10BUILDING_LITHO_DEPARTMENT_ENTITYCODE);
        List<String> f10BuildingPlanarDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_F10BUILDING_PLANAR_DEPARTMENT_ENTITYCODE);
        List<String> f10BuildingSortDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_F10BUILDING_SORT_DEPARTMENT_ENTITYCODE);
        List<String> f10BuildingThinFilmsDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_F10BUILDING_THINFILMS_DEPARTMENT_ENTITYCODE);
        List<String> f10BuildingWetEtchDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_F10BUILDING_WETETCH_DEPARTMENT_ENTITYCODE);
        List<String> f10BuildingC4DepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_F10BUILDING_C4_DEPARTMENT_ENTITYCODE);
        List<String> f10BuildingDefectMetroDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_F10BUILDING_DEFECTMETRO_DEPARTMENT_ENTITYCODE);
        List<String> f10BuildingPCDDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_F10BUILDING_PCD_DEPARTMENT_ENTITYCODE);

        // F24 Building Lists
        List<String> f24BuildingAMHSDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_F24BUILDING_AMHS_DEPARTMENT_ENTITYCODE);
        List<String> f24BuildingDireDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_F24BUILDING_DIRE_DEPARTMENT_ENTITYCODE);
        List<String> f24BuildingDryEtchDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_F24BUILDING_DRYETCH_DEPARTMENT_ENTITYCODE);
        List<String> f24BuildingGlobalsDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_F24BUILDING_GLOBALS_DEPARTMENT_ENTITYCODE);
        List<String> f24BuildingLithoDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_F24BUILDING_LITHO_DEPARTMENT_ENTITYCODE);
        List<String> f24BuildingPlanarDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_F24BUILDING_PLANAR_DEPARTMENT_ENTITYCODE);
        List<String> f24BuildingSortDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_F24BUILDING_SORT_DEPARTMENT_ENTITYCODE);
        List<String> f24BuildingThinFilmsDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_F24BUILDING_THINFILMS_DEPARTMENT_ENTITYCODE);
        List<String> f24BuildingWetEtchDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_F24BUILDING_WETETCH_DEPARTMENT_ENTITYCODE);
        List<String> f24BuildingC4DepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_F24BUILDING_C4_DEPARTMENT_ENTITYCODE);
        List<String> f24BuildingDefectMetroDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_F24BUILDING_DEFECTMETRO_DEPARTMENT_ENTITYCODE);
        List<String> f24BuildingPCDDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_F24BUILDING_PCD_DEPARTMENT_ENTITYCODE);

        // F14 Building Lists
        List<String> f14BuildingAMHSDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_F14BUILDING_AMHS_DEPARTMENT_ENTITYCODE);
        List<String> f14BuildingDireDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_F14BUILDING_DIRE_DEPARTMENT_ENTITYCODE);
        List<String> f14BuildingDryEtchDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_F14BUILDING_DRYETCH_DEPARTMENT_ENTITYCODE);
        List<String> f14BuildingGlobalsDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_F14BUILDING_GLOBALS_DEPARTMENT_ENTITYCODE);
        List<String> f14BuildingLithoDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_F14BUILDING_LITHO_DEPARTMENT_ENTITYCODE);
        List<String> f14BuildingPlanarDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_F14BUILDING_PLANAR_DEPARTMENT_ENTITYCODE);
        List<String> f14BuildingSortDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_F14BUILDING_SORT_DEPARTMENT_ENTITYCODE);
        List<String> f14BuildingThinFilmsDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_F14BUILDING_THINFILMS_DEPARTMENT_ENTITYCODE);
        List<String> f14BuildingWetEtchDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_F14BUILDING_WETETCH_DEPARTMENT_ENTITYCODE);
        List<String> f14BuildingC4DepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_F14BUILDING_C4_DEPARTMENT_ENTITYCODE);
        List<String> f14BuildingDefectMetroDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_F14BUILDING_DEFECTMETRO_DEPARTMENT_ENTITYCODE);
        List<String> f14BuildingPCDDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_F14BUILDING_PCD_DEPARTMENT_ENTITYCODE);

        // IR1 Building Lists
        List<String> ir1BuildingAMHSDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_IR1BUILDING_AMHS_DEPARTMENT_ENTITYCODE);
        List<String> ir1BuildingDireDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_IR1BUILDING_DIRE_DEPARTMENT_ENTITYCODE);
        List<String> ir1BuildingDryEtchDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_IR1BUILDING_DRYETCH_DEPARTMENT_ENTITYCODE);
        List<String> ir1BuildingGlobalsDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_IR1BUILDING_GLOBALS_DEPARTMENT_ENTITYCODE);
        List<String> ir1BuildingLithoDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_IR1BUILDING_LITHO_DEPARTMENT_ENTITYCODE);
        List<String> ir1BuildingPlanarDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_IR1BUILDING_PLANAR_DEPARTMENT_ENTITYCODE);
        List<String> ir1BuildingSortDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_IR1BUILDING_SORT_DEPARTMENT_ENTITYCODE);
        List<String> ir1BuildingThinFilmsDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_IR1BUILDING_THINFILMS_DEPARTMENT_ENTITYCODE);
        List<String> ir1BuildingWetEtchDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_IR1BUILDING_WETETCH_DEPARTMENT_ENTITYCODE);
        List<String> ir1BuildingC4DepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_IR1BUILDING_C4_DEPARTMENT_ENTITYCODE);
        List<String> ir1BuildingDefectMetroDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_IR1BUILDING_DEFECTMETRO_DEPARTMENT_ENTITYCODE);
        List<String> ir1BuildingPCDDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_IR1BUILDING_PCD_DEPARTMENT_ENTITYCODE);

        // IR4 Building Lists
        List<String> ir4BuildingAMHSDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_IR4BUILDING_AMHS_DEPARTMENT_ENTITYCODE);
        List<String> ir4BuildingDireDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_IR4BUILDING_DIRE_DEPARTMENT_ENTITYCODE);
        List<String> ir4BuildingDryEtchDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_IR4BUILDING_DRYETCH_DEPARTMENT_ENTITYCODE);
        List<String> ir4BuildingGlobalsDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_IR4BUILDING_GLOBALS_DEPARTMENT_ENTITYCODE);
        List<String> ir4BuildingLithoDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_IR4BUILDING_LITHO_DEPARTMENT_ENTITYCODE);
        List<String> ir4BuildingPlanarDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_IR4BUILDING_PLANAR_DEPARTMENT_ENTITYCODE);
        List<String> ir4BuildingSortDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_IR4BUILDING_SORT_DEPARTMENT_ENTITYCODE);
        List<String> ir4BuildingThinFilmsDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_IR4BUILDING_THINFILMS_DEPARTMENT_ENTITYCODE);
        List<String> ir4BuildingWetEtchDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_IR4BUILDING_WETETCH_DEPARTMENT_ENTITYCODE);
        List<String> ir4BuildingC4DepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_IR4BUILDING_C4_DEPARTMENT_ENTITYCODE);
        List<String> ir4BuildingDefectMetroDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_IR4BUILDING_DEFECTMETRO_DEPARTMENT_ENTITYCODE);
        List<String> ir4BuildingPCDDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_IR4BUILDING_PCD_DEPARTMENT_ENTITYCODE);

        // IR5 Building Lists
        List<String> ir5BuildingAMHSDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_IR5BUILDING_AMHS_DEPARTMENT_ENTITYCODE);
        List<String> ir5BuildingDireDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_IR5BUILDING_DIRE_DEPARTMENT_ENTITYCODE);
        List<String> ir5BuildingDryEtchDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_IR5BUILDING_DRYETCH_DEPARTMENT_ENTITYCODE);
        List<String> ir5BuildingGlobalsDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_IR5BUILDING_GLOBALS_DEPARTMENT_ENTITYCODE);
        List<String> ir5BuildingLithoDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_IR5BUILDING_LITHO_DEPARTMENT_ENTITYCODE);
        List<String> ir5BuildingPlanarDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_IR5BUILDING_PLANAR_DEPARTMENT_ENTITYCODE);
        List<String> ir5BuildingSortDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_IR5BUILDING_SORT_DEPARTMENT_ENTITYCODE);
        List<String> ir5BuildingThinFilmsDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_IR5BUILDING_THINFILMS_DEPARTMENT_ENTITYCODE);
        List<String> ir5BuildingWetEtchDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_IR5BUILDING_WETETCH_DEPARTMENT_ENTITYCODE);
        List<String> ir5BuildingC4DepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_IR5BUILDING_C4_DEPARTMENT_ENTITYCODE);
        List<String> ir5BuildingDefectMetroDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_IR5BUILDING_DEFECTMETRO_DEPARTMENT_ENTITYCODE);
        List<String> ir5BuildingPCDDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_IR5BUILDING_PCD_DEPARTMENT_ENTITYCODE);

        // Sort Building Lists
        List<String> sortBuildingAMHSDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_SORTBUILDING_AMHS_DEPARTMENT_ENTITYCODE);
        List<String> sortBuildingDireDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_SORTBUILDING_DIRE_DEPARTMENT_ENTITYCODE);
        List<String> sortBuildingDryEtchDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_SORTBUILDING_DRYETCH_DEPARTMENT_ENTITYCODE);
        List<String> sortBuildingGlobalsDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_SORTBUILDING_GLOBALS_DEPARTMENT_ENTITYCODE);
        List<String> sortBuildingLithoDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_SORTBUILDING_LITHO_DEPARTMENT_ENTITYCODE);
        List<String> sortBuildingPlanarDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_SORTBUILDING_PLANAR_DEPARTMENT_ENTITYCODE);
        List<String> sortBuildingSortDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_SORTBUILDING_SORT_DEPARTMENT_ENTITYCODE);
        List<String> sortBuildingThinFilmsDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_SORTBUILDING_THINFILMS_DEPARTMENT_ENTITYCODE);
        List<String> sortBuildingWetEtchDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_SORTBUILDING_WETETCH_DEPARTMENT_ENTITYCODE);
        List<String> sortBuildingC4DepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_SORTBUILDING_C4_DEPARTMENT_ENTITYCODE);
        List<String> sortBuildingDefectMetroDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_SORTBUILDING_DEFECTMETRO_DEPARTMENT_ENTITYCODE);
        List<String> sortBuildingPCDDepartmentEntityCodeList = readAndParseCSVFile(EntityCodeDirectoryPaths.PATH_TO_SORTBUILDING_PCD_DEPARTMENT_ENTITYCODE);

        /**
         * Example path is rootDir/level2Element/level3Element/departments/entityCode/level4Element
         */
        List<String> level2List = new ArrayList<>();
        level2List.add("Fab");
        level2List.add("Fan Attic");
        level2List.add("Sub Fab");
        level2List.add("Utility");

        // These 2 dirs have exactly the same content. Possibly can just copy and paste here instead of looping
        List<String> level3List = new ArrayList<>();
        level3List.add("Demo - move Out");
        level3List.add("Install - Move In");

        List<String> level4List = new ArrayList<>();
        level4List.add("Acceptance Sign Off Sheet");
        level4List.add("Delivery At Dock");
        level4List.add("Delivery At Set Point");
        level4List.add("Email to Tool Owner");

        for (String rootElement : rootDirsList) {
            for (String level2Element : level2List) {
                for (String level3Element : level3List) {
                    for (String department : departmentList) {
                        /**
                         * All F34 Department
                         */
                        if (rootElement.contains("F34")) {
                            createF34Directories(department, f34BuildingAMHSDepartmentEntityCodeList, rootElement, level2Element, level3Element, level4List,
                                    f34BuildingDireDepartmentEntityCodeList, f34BuildingDryEtchDepartmentEntityCodeList,
                                    f34BuildingGlobalsDepartmentEntityCodeList, f34BuildingLithoDepartmentEntityCodeList,
                                    f34BuildingPlanarDepartmentEntityCodeList, f34BuildingThinFilmsDepartmentEntityCodeList,
                                    f34BuildingWetEtchDepartmentEntityCodeList, f34BuildingSortDepartmentEntityCodeList,
                                    f34BuildingC4DepartmentEntityCodeList, f34BuildingDefectMetroDepartmentEntityCodeList,
                                    f34BuildingPCDDepartmentEntityCodeList);
                        }
                        /**
                         * All F24 Department
                         */
                        if (rootElement.contains("F24")) {
                            createF24Directories(department, f24BuildingAMHSDepartmentEntityCodeList, rootElement, level2Element, level3Element, level4List,
                                    f24BuildingDireDepartmentEntityCodeList, f24BuildingDryEtchDepartmentEntityCodeList,
                                    f24BuildingGlobalsDepartmentEntityCodeList, f24BuildingLithoDepartmentEntityCodeList,
                                    f24BuildingPlanarDepartmentEntityCodeList, f24BuildingThinFilmsDepartmentEntityCodeList,
                                    f24BuildingWetEtchDepartmentEntityCodeList, f24BuildingSortDepartmentEntityCodeList,
                                    f24BuildingC4DepartmentEntityCodeList, f24BuildingDefectMetroDepartmentEntityCodeList,
                                    f24BuildingPCDDepartmentEntityCodeList);
                        }
                        /**
                         * All F14 Department
                         */
                        if (rootElement.contains("F14")) {
                            createF14Directories(department, f14BuildingAMHSDepartmentEntityCodeList, rootElement, level2Element, level3Element, level4List,
                                    f14BuildingDireDepartmentEntityCodeList, f14BuildingDryEtchDepartmentEntityCodeList,
                                    f14BuildingGlobalsDepartmentEntityCodeList, f14BuildingLithoDepartmentEntityCodeList,
                                    f14BuildingPlanarDepartmentEntityCodeList, f14BuildingThinFilmsDepartmentEntityCodeList,
                                    f14BuildingWetEtchDepartmentEntityCodeList, f14BuildingSortDepartmentEntityCodeList,
                                    f14BuildingC4DepartmentEntityCodeList, f14BuildingDefectMetroDepartmentEntityCodeList,
                                    f14BuildingPCDDepartmentEntityCodeList);
                        }
                        /**
                         * All F10 Department
                         */
                        if (rootElement.contains("F10")) {
                            createF10Directories(department, f10BuildingAMHSDepartmentEntityCodeList, rootElement, level2Element, level3Element, level4List,
                                    f10BuildingDireDepartmentEntityCodeList, f10BuildingDryEtchDepartmentEntityCodeList,
                                    f10BuildingGlobalsDepartmentEntityCodeList, f10BuildingLithoDepartmentEntityCodeList,
                                    f10BuildingPlanarDepartmentEntityCodeList, f10BuildingThinFilmsDepartmentEntityCodeList,
                                    f10BuildingWetEtchDepartmentEntityCodeList, f10BuildingSortDepartmentEntityCodeList,
                                    f10BuildingC4DepartmentEntityCodeList, f10BuildingDefectMetroDepartmentEntityCodeList,
                                    f10BuildingPCDDepartmentEntityCodeList);
                        }
                        /**
                         * All IR1 Department
                         */
                        if (rootElement.contains("IR1")) {
                            createIR1Directories(department, ir1BuildingAMHSDepartmentEntityCodeList, rootElement, level2Element, level3Element, level4List,
                                    ir1BuildingDireDepartmentEntityCodeList, ir1BuildingDryEtchDepartmentEntityCodeList,
                                    ir1BuildingGlobalsDepartmentEntityCodeList, ir1BuildingLithoDepartmentEntityCodeList,
                                    ir1BuildingPlanarDepartmentEntityCodeList, ir1BuildingThinFilmsDepartmentEntityCodeList,
                                    ir1BuildingWetEtchDepartmentEntityCodeList, ir1BuildingSortDepartmentEntityCodeList,
                                    ir1BuildingC4DepartmentEntityCodeList, ir1BuildingDefectMetroDepartmentEntityCodeList,
                                    ir1BuildingPCDDepartmentEntityCodeList);
                        }
                        /**
                         * All IR4 Department
                         */
                        if (rootElement.contains("IR4")) {
                            createIR4Directories(department, ir4BuildingAMHSDepartmentEntityCodeList, rootElement, level2Element, level3Element, level4List,
                                    ir4BuildingDireDepartmentEntityCodeList, ir4BuildingDryEtchDepartmentEntityCodeList,
                                    ir4BuildingGlobalsDepartmentEntityCodeList, ir4BuildingLithoDepartmentEntityCodeList,
                                    ir4BuildingPlanarDepartmentEntityCodeList, ir4BuildingThinFilmsDepartmentEntityCodeList,
                                    ir4BuildingWetEtchDepartmentEntityCodeList, ir4BuildingSortDepartmentEntityCodeList,
                                    ir4BuildingC4DepartmentEntityCodeList, ir4BuildingDefectMetroDepartmentEntityCodeList,
                                    ir4BuildingPCDDepartmentEntityCodeList);
                        }
                        /**
                         * All IR5 Department
                         */
                        if (rootElement.contains("IR5")) {
                            createIR5Directories(department, ir5BuildingAMHSDepartmentEntityCodeList, rootElement, level2Element, level3Element, level4List,
                                    ir5BuildingDireDepartmentEntityCodeList, ir5BuildingDryEtchDepartmentEntityCodeList,
                                    ir5BuildingGlobalsDepartmentEntityCodeList, ir5BuildingLithoDepartmentEntityCodeList,
                                    ir5BuildingPlanarDepartmentEntityCodeList, ir5BuildingThinFilmsDepartmentEntityCodeList,
                                    ir5BuildingWetEtchDepartmentEntityCodeList, ir5BuildingSortDepartmentEntityCodeList,
                                    ir5BuildingC4DepartmentEntityCodeList, ir5BuildingDefectMetroDepartmentEntityCodeList,
                                    ir5BuildingPCDDepartmentEntityCodeList);
                        }
                        /**
                         * All IR1 Department
                         */
                        if (rootElement.contains("Sort")) {
                            createSortDirectories(department, sortBuildingAMHSDepartmentEntityCodeList, rootElement, level2Element, level3Element, level4List,
                                    sortBuildingDireDepartmentEntityCodeList, sortBuildingDryEtchDepartmentEntityCodeList,
                                    sortBuildingGlobalsDepartmentEntityCodeList, sortBuildingLithoDepartmentEntityCodeList,
                                    sortBuildingPlanarDepartmentEntityCodeList, sortBuildingThinFilmsDepartmentEntityCodeList,
                                    sortBuildingWetEtchDepartmentEntityCodeList, sortBuildingSortDepartmentEntityCodeList,
                                    sortBuildingC4DepartmentEntityCodeList, sortBuildingDefectMetroDepartmentEntityCodeList,
                                    sortBuildingPCDDepartmentEntityCodeList);
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

        Path currentRelativePath = Paths.get("");
        String s = currentRelativePath.toAbsolutePath().toString();
        System.out.println("Current absolute path is: " + s);
        long startTime = System.currentTimeMillis();
        DirectoryCreator directoryCreator = new DirectoryCreator();
        directoryCreator.createDirectories();
        long endTime = System.currentTimeMillis();
        long timeTaken = endTime - startTime;
        System.out.println("Time taken was " + timeTaken);
    }

    private void buildPathForDirectoryAndCreate(String rootElement, String level2Element, String level3Element, String department, String entityCode, List<String> level4List) {
        for (String level4Element : level4List) {
            new File(PATH_TO_BASE_DIR + "" + rootElement + "/" + level2Element + "/" + level3Element + "/" + department + "/" + entityCode + "/" + level4Element).mkdirs();
        }
    }

    private List<String> readAndParseCSVFile(String pathToCSV) {
        List<String> parsedList = new ArrayList<>();
        String value = "";
        Scanner sc = null;
        try {
            sc = new Scanner(new File("src/main/java/DirectoryCreatorForAbu/" + pathToCSV));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        sc.useDelimiter(",");   //sets the delimiter pattern
        while (sc.hasNext()) {
            value = sc.next();
            parsedList.add(value);
        }
        sc.close();
        return parsedList;
    }

    private void createF10Directories(String department, List<String> f10BuildingAMHSDepartmentEntityCodeList, String rootElement, String level2Element, String level3Element, List<String> level4List,
                                      List<String> f10BuildingDireDepartmentEntityCodeList, List<String> f10BuildingDryEtchDepartmentEntityCodeList,
                                      List<String> f10BuildingGlobalsDepartmentEntityCodeList, List<String> f10BuildingLithoDepartmentEntityCodeList,
                                      List<String> f10BuildingPlanarDepartmentEntityCodeList, List<String> f10BuildingThinFilmsDepartmentEntityCodeList,
                                      List<String> f10BuildingWetEtchDepartmentEntityCodeList, List<String> f10BuildingSortDepartmentEntityCodeList,
                                      List<String> f10BuildingC4DepartmentEntityCodeList, List<String> f10BuildingDefectMetroDepartmentEntityCodeList,
                                      List<String> f10BuildingPCDDepartmentEntityCodeList) {
        if (department.equals("AMHS")) {
            for (String f10_AMHSElement : f10BuildingAMHSDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, f10_AMHSElement, level4List);
            }
        }
        if (department.equals("Dire")) {
            for (String f10_DireElement : f10BuildingDireDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, f10_DireElement, level4List);
            }
        }
        if (department.equals("Dry Etch")) {
            for (String f10_DryEtchElement : f10BuildingDryEtchDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, f10_DryEtchElement, level4List);
            }
        }
        if (department.equals("Globals")) {
            for (String f10_GlobalsElement : f10BuildingGlobalsDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, f10_GlobalsElement, level4List);
            }
        }
        if (department.equals("Litho")) {
            for (String f10_LithoElement : f10BuildingLithoDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, f10_LithoElement, level4List);
            }
        }
        if (department.equals("Planar")) {
            for (String f10_PlanarElement : f10BuildingPlanarDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, f10_PlanarElement, level4List);
            }
        }
        if (department.equals("Thin Films")) {
            for (String f10_ThinFilmsElement : f10BuildingThinFilmsDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, f10_ThinFilmsElement, level4List);
            }
        }
        if (department.equals("Wet Etch")) {
            for (String f10_WetEtchElement : f10BuildingWetEtchDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, f10_WetEtchElement, level4List);
            }
        }
        if (department.equals("Sort")) {
            for (String f10_SortElement : f10BuildingSortDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, f10_SortElement, level4List);
            }
        }
        if (department.equals("C4")) {
            for (String f10_C4Element : f10BuildingC4DepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, f10_C4Element, level4List);
            }
        }
        if (department.equals("DefectMetro")) {
            for (String f10_DefectMetroElement : f10BuildingDefectMetroDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, f10_DefectMetroElement, level4List);
            }
        }
        if (department.equals("PCD")) {
            for (String f10_PCDElement : f10BuildingPCDDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, f10_PCDElement, level4List);
            }
        }
    }

    private void createF14Directories(String department, List<String> f14BuildingAMHSDepartmentEntityCodeList, String rootElement, String level2Element, String level3Element, List<String> level4List,
                                      List<String> f14BuildingDireDepartmentEntityCodeList, List<String> f14BuildingDryEtchDepartmentEntityCodeList,
                                      List<String> f14BuildingGlobalsDepartmentEntityCodeList, List<String> f14BuildingLithoDepartmentEntityCodeList,
                                      List<String> f14BuildingPlanarDepartmentEntityCodeList, List<String> f14BuildingThinFilmsDepartmentEntityCodeList,
                                      List<String> f14BuildingWetEtchDepartmentEntityCodeList, List<String> f14BuildingSortDepartmentEntityCodeList,
                                      List<String> f14BuildingC4DepartmentEntityCodeList, List<String> f14BuildingDefectMetroDepartmentEntityCodeList,
                                      List<String> f14BuildingPCDDepartmentEntityCodeList) {
        if (department.equals("AMHS")) {
            for (String f14_AMHSElement : f14BuildingAMHSDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, f14_AMHSElement, level4List);
            }
        }
        if (department.equals("Dire")) {
            for (String f14_DireElement : f14BuildingDireDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, f14_DireElement, level4List);
            }
        }
        if (department.equals("Dry Etch")) {
            for (String f14_DryEtchElement : f14BuildingDryEtchDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, f14_DryEtchElement, level4List);
            }
        }
        if (department.equals("Globals")) {
            for (String f14_GlobalsElement : f14BuildingGlobalsDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, f14_GlobalsElement, level4List);
            }
        }
        if (department.equals("Litho")) {
            for (String f14_LithoElement : f14BuildingLithoDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, f14_LithoElement, level4List);
            }
        }
        if (department.equals("Planar")) {
            for (String f14_PlanarElement : f14BuildingPlanarDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, f14_PlanarElement, level4List);
            }
        }
        if (department.equals("Thin Films")) {
            for (String f14_ThinFilmsElement : f14BuildingThinFilmsDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, f14_ThinFilmsElement, level4List);
            }
        }
        if (department.equals("Wet Etch")) {
            for (String f14_WetEtchElement : f14BuildingWetEtchDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, f14_WetEtchElement, level4List);
            }
        }
        if (department.equals("Sort")) {
            for (String f14_SortElement : f14BuildingSortDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, f14_SortElement, level4List);
            }
        }
        if (department.equals("C4")) {
            for (String f14_C4Element : f14BuildingC4DepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, f14_C4Element, level4List);
            }
        }
        if (department.equals("DefectMetro")) {
            for (String f14_DefectMetroElement : f14BuildingDefectMetroDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, f14_DefectMetroElement, level4List);
            }
        }
        if (department.equals("PCD")) {
            for (String f14_PCDElement : f14BuildingPCDDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, f14_PCDElement, level4List);
            }
        }
    }

    private void createF24Directories(String department, List<String> f24BuildingAMHSDepartmentEntityCodeList, String rootElement, String level2Element, String level3Element, List<String> level4List,
                                      List<String> f24BuildingDireDepartmentEntityCodeList, List<String> f24BuildingDryEtchDepartmentEntityCodeList,
                                      List<String> f24BuildingGlobalsDepartmentEntityCodeList, List<String> f24BuildingLithoDepartmentEntityCodeList,
                                      List<String> f24BuildingPlanarDepartmentEntityCodeList, List<String> f24BuildingThinFilmsDepartmentEntityCodeList,
                                      List<String> f24BuildingWetEtchDepartmentEntityCodeList, List<String> f24BuildingSortDepartmentEntityCodeList,
                                      List<String> f24BuildingC4DepartmentEntityCodeList, List<String> f24BuildingDefectMetroDepartmentEntityCodeList,
                                      List<String> f24BuildingPCDDepartmentEntityCodeList) {

        if (department.equals("AMHS")) {
            for (String f24_AMHSElement : f24BuildingAMHSDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, f24_AMHSElement, level4List);
            }
        }
        if (department.equals("Dire")) {
            for (String f24_DireElement : f24BuildingDireDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, f24_DireElement, level4List);
            }
        }
        if (department.equals("Dry Etch")) {
            for (String f24_DryEtchElement : f24BuildingDryEtchDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, f24_DryEtchElement, level4List);
            }
        }
        if (department.equals("Globals")) {
            for (String f24_GlobalsElement : f24BuildingGlobalsDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, f24_GlobalsElement, level4List);
            }
        }
        if (department.equals("Litho")) {
            for (String f24_LithoElement : f24BuildingLithoDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, f24_LithoElement, level4List);
            }
        }
        if (department.equals("Planar")) {
            for (String f24_PlanarElement : f24BuildingPlanarDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, f24_PlanarElement, level4List);
            }
        }
        if (department.equals("Thin Films")) {
            for (String f24_ThinFilmsElement : f24BuildingThinFilmsDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, f24_ThinFilmsElement, level4List);
            }
        }
        if (department.equals("Wet Etch")) {
            for (String f24_WetEtchElement : f24BuildingWetEtchDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, f24_WetEtchElement, level4List);
            }
        }
        if (department.equals("Sort")) {
            for (String f24_SortElement : f24BuildingSortDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, f24_SortElement, level4List);
            }
        }
        if (department.equals("C4")) {
            for (String f24_C4Element : f24BuildingC4DepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, f24_C4Element, level4List);
            }
        }
        if (department.equals("DefectMetro")) {
            for (String f24_DefectMetroElement : f24BuildingDefectMetroDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, f24_DefectMetroElement, level4List);
            }
        }
        if (department.equals("PCD")) {
            for (String f24_PCDElement : f24BuildingPCDDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, f24_PCDElement, level4List);
            }
        }
    }

    private void createF34Directories(String department, List<String> f34BuildingAMHSDepartmentEntityCodeList, String rootElement, String level2Element, String level3Element, List<String> level4List,
                                      List<String> f34BuildingDireDepartmentEntityCodeList, List<String> f34BuildingDryEtchDepartmentEntityCodeList,
                                      List<String> f34BuildingGlobalsDepartmentEntityCodeList, List<String> f34BuildingLithoDepartmentEntityCodeList,
                                      List<String> f34BuildingPlanarDepartmentEntityCodeList, List<String> f34BuildingThinFilmsDepartmentEntityCodeList,
                                      List<String> f34BuildingWetEtchDepartmentEntityCodeList, List<String> f34BuildingSortDepartmentEntityCodeList,
                                      List<String> f34BuildingC4DepartmentEntityCodeList, List<String> f34BuildingDefectMetroDepartmentEntityCodeList,
                                      List<String> f34BuildingPCDDepartmentEntityCodeList) {

        if (department.equals("AMHS")) {
            for (String f34_AMHSElement : f34BuildingAMHSDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, f34_AMHSElement, level4List);
            }
        }
        if (department.equals("Dire")) {
            for (String f34_DireElement : f34BuildingDireDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, f34_DireElement, level4List);
            }
        }
        if (department.equals("Dry Etch")) {
            for (String f34_DryEtchElement : f34BuildingDryEtchDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, f34_DryEtchElement, level4List);
            }
        }
        if (department.equals("Globals")) {
            for (String f34_GlobalsElement : f34BuildingGlobalsDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, f34_GlobalsElement, level4List);
            }
        }
        if (department.equals("Litho")) {
            for (String f34_LithoElement : f34BuildingLithoDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, f34_LithoElement, level4List);
            }
        }
        if (department.equals("Planar")) {
            for (String f34_PlanarElement : f34BuildingPlanarDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, f34_PlanarElement, level4List);
            }
        }
        if (department.equals("Thin Films")) {
            for (String f34_ThinFilmsElement : f34BuildingThinFilmsDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, f34_ThinFilmsElement, level4List);
            }
        }
        if (department.equals("Wet Etch")) {
            for (String f34_WetEtchElement : f34BuildingWetEtchDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, f34_WetEtchElement, level4List);
            }
        }
        if (department.equals("Sort")) {
            for (String f34_SortElement : f34BuildingSortDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, f34_SortElement, level4List);
            }
        }
        if (department.equals("C4")) {
            for (String f34_C4Element : f34BuildingC4DepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, f34_C4Element, level4List);
            }
        }
        if (department.equals("DefectMetro")) {
            for (String f34_DefectMetroElement : f34BuildingDefectMetroDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, f34_DefectMetroElement, level4List);
            }
        }
        if (department.equals("PCD")) {
            for (String f34_PCDElement : f34BuildingPCDDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, f34_PCDElement, level4List);
            }
        }
    }

    private void createIR1Directories(String department, List<String> ir1BuildingAMHSDepartmentEntityCodeList, String rootElement, String level2Element, String level3Element, List<String> level4List,
                                      List<String> ir1BuildingDireDepartmentEntityCodeList, List<String> ir1BuildingDryEtchDepartmentEntityCodeList,
                                      List<String> ir1BuildingGlobalsDepartmentEntityCodeList, List<String> ir1BuildingLithoDepartmentEntityCodeList,
                                      List<String> ir1BuildingPlanarDepartmentEntityCodeList, List<String> ir1BuildingThinFilmsDepartmentEntityCodeList,
                                      List<String> ir1BuildingWetEtchDepartmentEntityCodeList, List<String> ir1BuildingSortDepartmentEntityCodeList,
                                      List<String> ir1BuildingC4DepartmentEntityCodeList, List<String> ir1BuildingDefectMetroDepartmentEntityCodeList,
                                      List<String> ir1BuildingPCDDepartmentEntityCodeList) {

        if (department.equals("AMHS")) {
            for (String ir1_AMHSElement : ir1BuildingAMHSDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, ir1_AMHSElement, level4List);
            }
        }
        if (department.equals("Dire")) {
            for (String ir1_DireElement : ir1BuildingDireDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, ir1_DireElement, level4List);
            }
        }
        if (department.equals("Dry Etch")) {
            for (String ir1_DryEtchElement : ir1BuildingDryEtchDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, ir1_DryEtchElement, level4List);
            }
        }
        if (department.equals("Globals")) {
            for (String ir1_GlobalsElement : ir1BuildingGlobalsDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, ir1_GlobalsElement, level4List);
            }
        }
        if (department.equals("Litho")) {
            for (String ir1_LithoElement : ir1BuildingLithoDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, ir1_LithoElement, level4List);
            }
        }
        if (department.equals("Planar")) {
            for (String ir1_PlanarElement : ir1BuildingPlanarDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, ir1_PlanarElement, level4List);
            }
        }
        if (department.equals("Thin Films")) {
            for (String ir1_ThinFilmsElement : ir1BuildingThinFilmsDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, ir1_ThinFilmsElement, level4List);
            }
        }
        if (department.equals("Wet Etch")) {
            for (String ir1_WetEtchElement : ir1BuildingWetEtchDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, ir1_WetEtchElement, level4List);
            }
        }
        if (department.equals("Sort")) {
            for (String ir1_SortElement : ir1BuildingSortDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, ir1_SortElement, level4List);
            }
        }
        if (department.equals("C4")) {
            for (String ir1_C4Element : ir1BuildingC4DepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, ir1_C4Element, level4List);
            }
        }
        if (department.equals("DefectMetro")) {
            for (String ir1_DefectMetroElement : ir1BuildingDefectMetroDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, ir1_DefectMetroElement, level4List);
            }
        }
        if (department.equals("PCD")) {
            for (String ir1_PCDElement : ir1BuildingPCDDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, ir1_PCDElement, level4List);
            }
        }
    }

    private void createIR4Directories(String department, List<String> ir4BuildingAMHSDepartmentEntityCodeList, String rootElement, String level2Element, String level3Element, List<String> level4List,
                                      List<String> ir4BuildingDireDepartmentEntityCodeList, List<String> ir4BuildingDryEtchDepartmentEntityCodeList,
                                      List<String> ir4BuildingGlobalsDepartmentEntityCodeList, List<String> ir4BuildingLithoDepartmentEntityCodeList,
                                      List<String> ir4BuildingPlanarDepartmentEntityCodeList, List<String> ir4BuildingThinFilmsDepartmentEntityCodeList,
                                      List<String> ir4BuildingWetEtchDepartmentEntityCodeList, List<String> ir4BuildingSortDepartmentEntityCodeList,
                                      List<String> ir4BuildingC4DepartmentEntityCodeList, List<String> ir4BuildingDefectMetroDepartmentEntityCodeList,
                                      List<String> ir4BuildingPCDDepartmentEntityCodeList) {

        if (department.equals("AMHS")) {
            for (String ir4_AMHSElement : ir4BuildingAMHSDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, ir4_AMHSElement, level4List);
            }
        }
        if (department.equals("Dire")) {
            for (String ir4_DireElement : ir4BuildingDireDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, ir4_DireElement, level4List);
            }
        }
        if (department.equals("Dry Etch")) {
            for (String ir4_DryEtchElement : ir4BuildingDryEtchDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, ir4_DryEtchElement, level4List);
            }
        }
        if (department.equals("Globals")) {
            for (String ir4_GlobalsElement : ir4BuildingGlobalsDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, ir4_GlobalsElement, level4List);
            }
        }
        if (department.equals("Litho")) {
            for (String ir4_LithoElement : ir4BuildingLithoDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, ir4_LithoElement, level4List);
            }
        }
        if (department.equals("Planar")) {
            for (String ir4_PlanarElement : ir4BuildingPlanarDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, ir4_PlanarElement, level4List);
            }
        }
        if (department.equals("Thin Films")) {
            for (String ir4_ThinFilmsElement : ir4BuildingThinFilmsDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, ir4_ThinFilmsElement, level4List);
            }
        }
        if (department.equals("Wet Etch")) {
            for (String ir4_WetEtchElement : ir4BuildingWetEtchDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, ir4_WetEtchElement, level4List);
            }
        }
        if (department.equals("Sort")) {
            for (String ir4_SortElement : ir4BuildingSortDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, ir4_SortElement, level4List);
            }
        }
        if (department.equals("C4")) {
            for (String ir4_C4Element : ir4BuildingC4DepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, ir4_C4Element, level4List);
            }
        }
        if (department.equals("DefectMetro")) {
            for (String ir4_DefectMetroElement : ir4BuildingDefectMetroDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, ir4_DefectMetroElement, level4List);
            }
        }
        if (department.equals("PCD")) {
            for (String ir4_PCDElement : ir4BuildingPCDDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, ir4_PCDElement, level4List);
            }
        }
    }

    private void createIR5Directories(String department, List<String> ir5BuildingAMHSDepartmentEntityCodeList, String rootElement, String level2Element, String level3Element, List<String> level4List,
                                      List<String> ir5BuildingDireDepartmentEntityCodeList, List<String> ir5BuildingDryEtchDepartmentEntityCodeList,
                                      List<String> ir5BuildingGlobalsDepartmentEntityCodeList, List<String> ir5BuildingLithoDepartmentEntityCodeList,
                                      List<String> ir5BuildingPlanarDepartmentEntityCodeList, List<String> ir5BuildingThinFilmsDepartmentEntityCodeList,
                                      List<String> ir5BuildingWetEtchDepartmentEntityCodeList, List<String> ir5BuildingSortDepartmentEntityCodeList,
                                      List<String> ir5BuildingC4DepartmentEntityCodeList, List<String> ir5BuildingDefectMetroDepartmentEntityCodeList,
                                      List<String> ir5BuildingPCDDepartmentEntityCodeList) {

        if (department.equals("AMHS")) {
            for (String ir5_AMHSElement : ir5BuildingAMHSDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, ir5_AMHSElement, level4List);
            }
        }
        if (department.equals("Dire")) {
            for (String ir5_DireElement : ir5BuildingDireDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, ir5_DireElement, level4List);
            }
        }
        if (department.equals("Dry Etch")) {
            for (String ir5_DryEtchElement : ir5BuildingDryEtchDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, ir5_DryEtchElement, level4List);
            }
        }
        if (department.equals("Globals")) {
            for (String ir5_GlobalsElement : ir5BuildingGlobalsDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, ir5_GlobalsElement, level4List);
            }
        }
        if (department.equals("Litho")) {
            for (String ir5_LithoElement : ir5BuildingLithoDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, ir5_LithoElement, level4List);
            }
        }
        if (department.equals("Planar")) {
            for (String ir5_PlanarElement : ir5BuildingPlanarDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, ir5_PlanarElement, level4List);
            }
        }
        if (department.equals("Thin Films")) {
            for (String ir5_ThinFilmsElement : ir5BuildingThinFilmsDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, ir5_ThinFilmsElement, level4List);
            }
        }
        if (department.equals("Wet Etch")) {
            for (String ir5_WetEtchElement : ir5BuildingWetEtchDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, ir5_WetEtchElement, level4List);
            }
        }
        if (department.equals("Sort")) {
            for (String ir5_SortElement : ir5BuildingSortDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, ir5_SortElement, level4List);
            }
        }
        if (department.equals("C4")) {
            for (String ir5_C4Element : ir5BuildingC4DepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, ir5_C4Element, level4List);
            }
        }
        if (department.equals("DefectMetro")) {
            for (String ir5_DefectMetroElement : ir5BuildingDefectMetroDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, ir5_DefectMetroElement, level4List);
            }
        }
        if (department.equals("PCD")) {
            for (String ir5_PCDElement : ir5BuildingPCDDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, ir5_PCDElement, level4List);
            }
        }
    }

    private void createSortDirectories(String department, List<String> sortBuildingAMHSDepartmentEntityCodeList, String rootElement, String level2Element, String level3Element, List<String> level4List,
                                       List<String> sortBuildingDireDepartmentEntityCodeList, List<String> sortBuildingDryEtchDepartmentEntityCodeList,
                                       List<String> sortBuildingGlobalsDepartmentEntityCodeList, List<String> sortBuildingLithoDepartmentEntityCodeList,
                                       List<String> sortBuildingPlanarDepartmentEntityCodeList, List<String> sortBuildingThinFilmsDepartmentEntityCodeList,
                                       List<String> sortBuildingWetEtchDepartmentEntityCodeList, List<String> sortBuildingSortDepartmentEntityCodeList,
                                       List<String> sortBuildingC4DepartmentEntityCodeList, List<String> sortBuildingDefectMetroDepartmentEntityCodeList,
                                       List<String> sortBuildingPCDDepartmentEntityCodeList) {

        if (department.equals("AMHS")) {
            for (String sort_AMHSElement : sortBuildingAMHSDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, sort_AMHSElement, level4List);
            }
        }
        if (department.equals("Dire")) {
            for (String sort_DireElement : sortBuildingDireDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, sort_DireElement, level4List);
            }
        }
        if (department.equals("Dry Etch")) {
            for (String sort_DryEtchElement : sortBuildingDryEtchDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, sort_DryEtchElement, level4List);
            }
        }
        if (department.equals("Globals")) {
            for (String sort_GlobalsElement : sortBuildingGlobalsDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, sort_GlobalsElement, level4List);
            }
        }
        if (department.equals("Litho")) {
            for (String sort_LithoElement : sortBuildingLithoDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, sort_LithoElement, level4List);
            }
        }
        if (department.equals("Planar")) {
            for (String sort_PlanarElement : sortBuildingPlanarDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, sort_PlanarElement, level4List);
            }
        }
        if (department.equals("Thin Films")) {
            for (String sort_ThinFilmsElement : sortBuildingThinFilmsDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, sort_ThinFilmsElement, level4List);
            }
        }
        if (department.equals("Wet Etch")) {
            for (String sort_WetEtchElement : sortBuildingWetEtchDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, sort_WetEtchElement, level4List);
            }
        }
        if (department.equals("Sort")) {
            for (String sort_SortElement : sortBuildingSortDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, sort_SortElement, level4List);
            }
        }
        if (department.equals("C4")) {
            for (String sort_C4Element : sortBuildingC4DepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, sort_C4Element, level4List);
            }
        }
        if (department.equals("DefectMetro")) {
            for (String sort_DefectMetroElement : sortBuildingDefectMetroDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, sort_DefectMetroElement, level4List);
            }
        }
        if (department.equals("PCD")) {
            for (String sort_PCDElement : sortBuildingPCDDepartmentEntityCodeList) {
                buildPathForDirectoryAndCreate(rootElement, level2Element, level3Element, department, sort_PCDElement, level4List);
            }
        }
    }
}
