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

    DirectoryCreator directoryCreator = new DirectoryCreator();
    private static final String PATH_TO_BUILDING1_DIRECTORY = "/Users/danielobrien/Desktop/BowsyTest/F34-Tool Acceptance Sign Off";
    private static final String PATH_TO_BUILDING2_DIRECTORY = "/Users/danielobrien/Desktop/BowsyTest/F24-Tool Acceptance Sign Off";
    private static final String PATH_TO_BUILDING3_DIRECTORY = "/Users/danielobrien/Desktop/BowsyTest/F14-Tool Acceptance Sign Off";
    private static final String PATH_TO_BUILDING4_DIRECTORY = "/Users/danielobrien/Desktop/BowsyTest/F10-Tool Acceptance Sign Off";

    static File file1 = new File(PATH_TO_BUILDING1_DIRECTORY);
    static File file2 = new File(PATH_TO_BUILDING2_DIRECTORY);
    static File file3 = new File(PATH_TO_BUILDING3_DIRECTORY);
    static File file4 = new File(PATH_TO_BUILDING4_DIRECTORY);
    ;

    @BeforeClass
    public static void removeAnyDirectoriesCurrentlyPresent() {
        deleteDirectory(file1);
        deleteDirectory(file2);
        deleteDirectory(file3);
        deleteDirectory(file4);
    }

    @AfterClass
    public static void cleanup() {
        deleteDirectory(file1);
        deleteDirectory(file2);
        deleteDirectory(file3);
        deleteDirectory(file4);
    }

    @Test
    public void shouldCreateEntityCodeDirectoriesOfF34BuildingWithAHMSDepartment_WhenCreateDirectoriesIsCalled() {
        // given
        String pathToEntityCodes = "/Users/danielobrien/Desktop/BowsyTest/F34-Tool Acceptance Sign Off/Fab/Demo - move Out/AMHS/AUTOLAB-1";
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
        String pathToEntityCodes = "/Users/danielobrien/Desktop/BowsyTest/F10-Tool Acceptance Sign Off/Fab/Demo - move Out/Wet Etch/f10WetEtchEntityCode1";
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
        String pathToNonExistentEntityCodes = "/Users/danielobrien/Desktop/BowsyTest/F10-Tool Acceptance Sign Off/Fab/Demo - move Out/Wet Etch/f10WetEtchEntityCode4";
        File file = new File(pathToNonExistentEntityCodes);

        // when
        directoryCreator.createDirectories();

        // then
        Assert.assertFalse(file.exists());
    }

    @Test
    public void shouldCreateEntityCodeDirectoriesOfF14BuildingWithWetEtchDepartment_WhenCreateDirectoriesIsCalled() {
        // given
        String pathToEntityCodes = "/Users/danielobrien/Desktop/BowsyTest/F14-Tool Acceptance Sign Off/Fab/Demo - move Out/Wet Etch/f14WetEtchEntityCode1";
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
        String pathToNonExistentEntityCodes = "/Users/danielobrien/Desktop/BowsyTest/F14-Tool Acceptance Sign Off/Fab/Demo - move Out/Wet Etch/f14WetEtchEntityCode4";
        File file = new File(pathToNonExistentEntityCodes);

        // when
        directoryCreator.createDirectories();

        // then
        Assert.assertFalse(file.exists());
    }

    @Test
    public void shouldCreateEntityCodeDirectoriesOfF24BuildingWithWetEtchDepartment_WhenCreateDirectoriesIsCalled() {
        // given
        String pathToEntityCodes = "/Users/danielobrien/Desktop/BowsyTest/F24-Tool Acceptance Sign Off/Fab/Demo - move Out/Wet Etch/f24WetEtchEntityCode1";
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
        String pathToNonExistentEntityCodes = "/Users/danielobrien/Desktop/BowsyTest/F24-Tool Acceptance Sign Off/Fab/Demo - move Out/Wet Etch/f24WetEtchEntityCode4";
        File file = new File(pathToNonExistentEntityCodes);

        // when
        directoryCreator.createDirectories();

        // then
        Assert.assertFalse(file.exists());
    }

    @Test
    public void shouldCreateEntityCodeDirectoriesOfF34BuildingWithWetEtchDepartment_WhenCreateDirectoriesIsCalled() {
        // given
        String pathToEntityCodes = "/Users/danielobrien/Desktop/BowsyTest/F34-Tool Acceptance Sign Off/Fab/Demo - move Out/Wet Etch/f34WetEtchEntityCode1";
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
        String pathToNonExistentEntityCodes = "/Users/danielobrien/Desktop/BowsyTest/F34-Tool Acceptance Sign Off/Fab/Demo - move Out/Wet Etch/f34WetEtchEntityCode4";
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
