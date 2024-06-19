package DirectoryCreatorForAbu;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DirectoryCreator {

    private static final String PATH_TO_BASE_DIR = "/Users/danielobrien/Desktop/BowsyTest/";
    private static final String PATH_TO_ROOT_DIR_CSV = "rootDirNames.csv";
    private static final String PATH_TO_DEPARTMENTS_CSV = "departments.csv";

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

        /**
         * Example path is rootDir/level2Element/level3Element/departments/entityCode/level4Element
         */
        List<String> level2List = new ArrayList<>();
        level2List.add("Fab");
        level2List.add("Fan Attic");
        level2List.add("Sub Fab");
        level2List.add("Utility");

        // These 2 dirs have exactly the same content. Possible can just copy and paste here instead of looping
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
                                    f34BuildingWetEtchDepartmentEntityCodeList, f34BuildingSortDepartmentEntityCodeList);
                        }
                        /**
                         * All F24 Department
                         */
                        if (rootElement.contains("F24")) {
                            createF24Directories(department, f24BuildingAMHSDepartmentEntityCodeList, rootElement, level2Element, level3Element, level4List,
                                    f24BuildingDireDepartmentEntityCodeList, f24BuildingDryEtchDepartmentEntityCodeList,
                                    f24BuildingGlobalsDepartmentEntityCodeList, f24BuildingLithoDepartmentEntityCodeList,
                                    f24BuildingPlanarDepartmentEntityCodeList, f24BuildingThinFilmsDepartmentEntityCodeList,
                                    f24BuildingWetEtchDepartmentEntityCodeList, f24BuildingSortDepartmentEntityCodeList);
                        }
                        /**
                         * All F14 Department
                         */
                        if (rootElement.contains("F14")) {
                            createF14Directories(department, f14BuildingAMHSDepartmentEntityCodeList, rootElement, level2Element, level3Element, level4List,
                                    f14BuildingDireDepartmentEntityCodeList, f14BuildingDryEtchDepartmentEntityCodeList,
                                    f14BuildingGlobalsDepartmentEntityCodeList, f14BuildingLithoDepartmentEntityCodeList,
                                    f14BuildingPlanarDepartmentEntityCodeList, f14BuildingThinFilmsDepartmentEntityCodeList,
                                    f14BuildingWetEtchDepartmentEntityCodeList, f14BuildingSortDepartmentEntityCodeList);
                        }
                        /**
                         * All F10 Department
                         */
                        if (rootElement.contains("F10")) {
                            createF10Directories(department, f10BuildingAMHSDepartmentEntityCodeList, rootElement, level2Element, level3Element, level4List,
                                    f10BuildingDireDepartmentEntityCodeList, f10BuildingDryEtchDepartmentEntityCodeList,
                                    f10BuildingGlobalsDepartmentEntityCodeList, f10BuildingLithoDepartmentEntityCodeList,
                                    f10BuildingPlanarDepartmentEntityCodeList, f10BuildingThinFilmsDepartmentEntityCodeList,
                                    f10BuildingWetEtchDepartmentEntityCodeList, f10BuildingSortDepartmentEntityCodeList);
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        DirectoryCreator directoryCreator = new DirectoryCreator();
        directoryCreator.createDirectories();
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
                                      List<String> f10BuildingWetEtchDepartmentEntityCodeList, List<String> f10BuildingSortDepartmentEntityCodeList) {
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
    }

    private void createF14Directories(String department, List<String> f14BuildingAMHSDepartmentEntityCodeList, String rootElement, String level2Element, String level3Element, List<String> level4List,
                                      List<String> f14BuildingDireDepartmentEntityCodeList, List<String> f14BuildingDryEtchDepartmentEntityCodeList,
                                      List<String> f14BuildingGlobalsDepartmentEntityCodeList, List<String> f14BuildingLithoDepartmentEntityCodeList,
                                      List<String> f14BuildingPlanarDepartmentEntityCodeList, List<String> f14BuildingThinFilmsDepartmentEntityCodeList,
                                      List<String> f14BuildingWetEtchDepartmentEntityCodeList, List<String> f14BuildingSortDepartmentEntityCodeList) {
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
    }

    private void createF24Directories(String department, List<String> f24BuildingAMHSDepartmentEntityCodeList, String rootElement, String level2Element, String level3Element, List<String> level4List,
                                      List<String> f24BuildingDireDepartmentEntityCodeList, List<String> f24BuildingDryEtchDepartmentEntityCodeList,
                                      List<String> f24BuildingGlobalsDepartmentEntityCodeList, List<String> f24BuildingLithoDepartmentEntityCodeList,
                                      List<String> f24BuildingPlanarDepartmentEntityCodeList, List<String> f24BuildingThinFilmsDepartmentEntityCodeList,
                                      List<String> f24BuildingWetEtchDepartmentEntityCodeList, List<String> f24BuildingSortDepartmentEntityCodeList) {

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
    }

    private void createF34Directories(String department, List<String> f34BuildingAMHSDepartmentEntityCodeList, String rootElement, String level2Element, String level3Element, List<String> level4List,
                                      List<String> f34BuildingDireDepartmentEntityCodeList, List<String> f34BuildingDryEtchDepartmentEntityCodeList,
                                      List<String> f34BuildingGlobalsDepartmentEntityCodeList, List<String> f34BuildingLithoDepartmentEntityCodeList,
                                      List<String> f34BuildingPlanarDepartmentEntityCodeList, List<String> f34BuildingThinFilmsDepartmentEntityCodeList,
                                      List<String> f34BuildingWetEtchDepartmentEntityCodeList, List<String> f34BuildingSortDepartmentEntityCodeList) {

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
    }

}
