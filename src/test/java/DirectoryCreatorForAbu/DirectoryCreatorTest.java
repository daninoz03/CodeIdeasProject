package DirectoryCreatorForAbu;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.File;

@RunWith(MockitoJUnitRunner.class)
public class DirectoryCreatorTest {

    //TODO: Need to change the paths of this whole test suite
    DirectoryCreator directoryCreator = new DirectoryCreator();
    private static final String PATH_TO_F34_BUILDING_DIRECTORY = "./src/main/resources/DirectoryCreatorForAbu/createdDirectories/F34-Tool Acceptance Sign Off";
    private static final String PATH_TO_F24_BUILDING_DIRECTORY = "./src/main/resources/DirectoryCreatorForAbu/createdDirectories/F24-Tool Acceptance Sign Off";
    private static final String PATH_TO_F14_BUILDING_DIRECTORY = "./src/main/resources/DirectoryCreatorForAbu/createdDirectories/F14-Tool Acceptance Sign Off";
    private static final String PATH_TO_F10_BUILDING_DIRECTORY = "./src/main/resources/DirectoryCreatorForAbu/createdDirectories/F10-Tool Acceptance Sign Off";
    private static final String PATH_TO_IR1_BUILDING_DIRECTORY = "./src/main/resources/DirectoryCreatorForAbu/createdDirectories/IR1";
    private static final String PATH_TO_IR4_BUILDING_DIRECTORY = "./src/main/resources/DirectoryCreatorForAbu/createdDirectories/IR4";
    private static final String PATH_TO_IR5_BUILDING_DIRECTORY = "./src/main/resources/DirectoryCreatorForAbu/createdDirectories/IR5";
    private static final String PATH_TO_SORT_BUILDING_DIRECTORY = "./src/main/resources/DirectoryCreatorForAbu/createdDirectories/Sort";

    static File file1 = new File(PATH_TO_F34_BUILDING_DIRECTORY);
    static File file2 = new File(PATH_TO_F24_BUILDING_DIRECTORY);
    static File file3 = new File(PATH_TO_F14_BUILDING_DIRECTORY);
    static File file4 = new File(PATH_TO_F10_BUILDING_DIRECTORY);
    static File file5 = new File(PATH_TO_IR1_BUILDING_DIRECTORY);
    static File file6 = new File(PATH_TO_IR4_BUILDING_DIRECTORY);
    static File file7 = new File(PATH_TO_IR5_BUILDING_DIRECTORY);
    static File file8 = new File(PATH_TO_SORT_BUILDING_DIRECTORY);



    private static final String GLOBAL_PATH = "./src/main/resources/DirectoryCreatorForAbu/createdDirectories/";

    @BeforeClass
    public static void removeAnyDirectoriesCurrentlyPresent() {
        deleteDirectory(file1);
        deleteDirectory(file2);
        deleteDirectory(file3);
        deleteDirectory(file4);
        deleteDirectory(file5);
        deleteDirectory(file6);
        deleteDirectory(file7);
        deleteDirectory(file8);
    }

    @AfterClass
    public static void cleanup() {
        deleteDirectory(file1);
        deleteDirectory(file2);
        deleteDirectory(file3);
        deleteDirectory(file4);
        deleteDirectory(file5);
        deleteDirectory(file6);
        deleteDirectory(file7);
        deleteDirectory(file8);
    }

    @Test
    public void shouldCreateEntityCodeDirectoriesOfF34BuildingWithAHMSDepartment_WhenCreateDirectoriesIsCalled() {
        // given
        String pathToEntityCodes = GLOBAL_PATH + "F34-Tool Acceptance Sign Off/Fab/Demo - move Out/AMHS/AUTOLAB-1";
        File file = new File(pathToEntityCodes);

        // when
        directoryCreator.createDirectories();

        // then
        Assert.assertTrue(file.exists());
        Assert.assertTrue(file.isDirectory());
    }

    @Test
    public void shouldCreateEntityCodeDirectoriesOfF10BuildingWithWetEtchDepartment_WhenCreateDirectoriesIsCalled() {
        // given
        String pathToEntityCodes = GLOBAL_PATH + "F10-Tool Acceptance Sign Off/Fab/Demo - move Out/Wet Etch/GST117-3";
        File file = new File(pathToEntityCodes);

        // when
        directoryCreator.createDirectories();

        // then
        Assert.assertTrue(file.exists());
        Assert.assertTrue(file.isDirectory());
    }

    @Test
    public void directoriesOfF10BuildingWithWetEtchDepartmentShouldNotBeCreated_WhenNotIncludedInCSVFile() {
        // given
        String pathToNonExistentEntityCodes = GLOBAL_PATH + "F10-Tool Acceptance Sign Off/Fab/Demo - move Out/Wet Etch/f10WetEtchEntityCode4";
        File file = new File(pathToNonExistentEntityCodes);

        // when
        directoryCreator.createDirectories();

        // then
        Assert.assertFalse(file.exists());
    }

    @Test
    public void shouldCreateEntityCodeDirectoriesOfF14BuildingWithWetEtchDepartment_WhenCreateDirectoriesIsCalled() {
        // given
        String pathToEntityCodes = GLOBAL_PATH + "F14-Tool Acceptance Sign Off/Fab/Demo - move Out/Wet Etch/WRO101-1";
        File file = new File(pathToEntityCodes);

        // when
        directoryCreator.createDirectories();

        // then
        Assert.assertTrue(file.exists());
        Assert.assertTrue(file.isDirectory());
    }

    @Test
    public void directoriesOfF14BuildingWithWetEtchDepartmentShouldNotBeCreated_WhenNotIncludedInCSVFile() {
        // given
        String pathToNonExistentEntityCodes = GLOBAL_PATH + "F14-Tool Acceptance Sign Off/Fab/Demo - move Out/Wet Etch/f14WetEtchEntityCode4";
        File file = new File(pathToNonExistentEntityCodes);

        // when
        directoryCreator.createDirectories();

        // then
        Assert.assertFalse(file.exists());
    }

    @Test
    public void shouldCreateEntityCodeDirectoriesOfF24BuildingWithWetEtchDepartment_WhenCreateDirectoriesIsCalled() {
        // given
        String pathToEntityCodes = GLOBAL_PATH + "F24-Tool Acceptance Sign Off/Fab/Demo - move Out/Wet Etch/GST108-1";
        File file = new File(pathToEntityCodes);

        // when
        directoryCreator.createDirectories();

        // then
        Assert.assertTrue(file.exists());
        Assert.assertTrue(file.isDirectory());
    }

    @Test
    public void directoriesOfF24BuildingWithWetEtchDepartmentShouldNotBeCreated_WhenNotIncludedInCSVFile() {
        // given
        String pathToNonExistentEntityCodes = GLOBAL_PATH + "F24-Tool Acceptance Sign Off/Fab/Demo - move Out/Wet Etch/f24WetEtchEntityCode4";
        File file = new File(pathToNonExistentEntityCodes);

        // when
        directoryCreator.createDirectories();

        // then
        Assert.assertFalse(file.exists());
    }

    @Test
    public void shouldCreateEntityCodeDirectoriesOfF34BuildingWithWetEtchDepartment_WhenCreateDirectoriesIsCalled() {
        // given
        String pathToEntityCodes = GLOBAL_PATH + "F34-Tool Acceptance Sign Off/Fab/Demo - move Out/Wet Etch/KST701-1";
        File file = new File(pathToEntityCodes);

        // when
        directoryCreator.createDirectories();

        // then
        Assert.assertTrue(file.exists());
        Assert.assertTrue(file.isDirectory());
    }

    @Test
    public void directoriesOfF34BuildingWithWetEtchDepartmentShouldNotBeCreated_WhenNotIncludedInCSVFile() {
        // given
        String pathToNonExistentEntityCodes = GLOBAL_PATH + "F34-Tool Acceptance Sign Off/Fab/Demo - move Out/Wet Etch/f34WetEtchEntityCode4";
        File file = new File(pathToNonExistentEntityCodes);

        // when
        directoryCreator.createDirectories();

        // then
        Assert.assertFalse(file.exists());
    }

    private static boolean deleteDirectory(File directoryToBeDeleted) {
        File[] allContents = directoryToBeDeleted.listFiles();
        if (allContents != null) {
            for (File file : allContents) {
                deleteDirectory(file);
            }
        }
        return directoryToBeDeleted.delete();
    }
}