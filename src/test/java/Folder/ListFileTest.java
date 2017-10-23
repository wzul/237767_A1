package Folder;

import static com.wzul.a1.FindIssues.PATHFOLDER;
import java.io.File;
import java.util.LinkedList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ListFileTest {
    
    /**
     * Test of listFilesForFolder method, of class ListFile.
     */
    @Test
    public void testListFilesForFolder() {
        System.out.println("listFilesForFolder");
        File folder = new File(Path.getPath(PATHFOLDER));
        ListFile instance = new ListFile();
        String expResult[] = {"MySleep.java", "MyThread.java", "TestWaitNotify.java", "ThreadBlocked.java"};
        instance.listFilesForFolder(folder);
        String[] result = instance.getListFile();
        Assert.assertArrayEquals(expResult, result);
    }

    /**
     * Test of checkJavaExtension method, of class ListFile.
     */
    @Test
    public void testCheckJavaExtension() {
        System.out.println("checkJavaExtension");
        String extName = "aa.java";
        ListFile instance = new ListFile();
        boolean expResult = true;
        boolean result = instance.checkJavaExtension(extName);
        assertEquals(expResult, result);
    }

    /**
     * Test of getListFile method, of class ListFile.
     */
    @Test
    public void testGetListFile() {
        System.out.println("getListFile");
        ListFile instance = new ListFile();
        String[] expResult = new String[0];
        String[] result = instance.getListFile();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of toString method, of class ListFile.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ListFile instance = new ListFile();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
