package Issue;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author wanzu
 */
public class IdentifyTest {

    /**
     * Test of scanFileContent method, of class Identify.
     */
    @Test
    public void testScanFileContent() {
        System.out.println("scanFileContent");
        String[][] fileContent = new String[0][0];
        Identify instance = new Identify();
        instance.scanFileContent(fileContent);
        String result[][] = instance.getClassName();
        String expResult[][] = new String[2][0];
        Assert.assertArrayEquals(expResult, result);
    }

    /**
     * Test of searchClassName method, of class Identify.
     */
    @Test
    public void testSearchClassName() {
        System.out.println("searchClassName");
        String sentence = "";
        String search = "";
        Identify instance = new Identify();
        boolean expResult = true;
        boolean result = instance.searchClassName(sentence, search);
        assertEquals(expResult, result);
    }

    /**
     * Test of getClassName method, of class Identify.
     */
    @Test
    public void testGetClassName() {
        System.out.println("getClassName");
        Identify instance = new Identify();
        String[][] expResult = new String[2][0];
        String[][] result = instance.getClassName();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of getClassFileNumber method, of class Identify.
     */
    @Test
    public void testGetClassFileNumber() {
        System.out.println("getClassFileNumber");
        Identify instance = new Identify();
        int[] expResult = new int[0];
        int[] result = instance.getClassFileNumber();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of getInterfaceFileNumber method, of class Identify.
     */
    @Test
    public void testGetInterfaceFileNumber() {
        System.out.println("getInterfaceFileNumber");
        Identify instance = new Identify();
        int[] expResult = new int[0];
        int[] result = instance.getInterfaceFileNumber();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of getNumberOfClass method, of class Identify.
     */
    @Test
    public void testGetNumberOfClass() {
        System.out.println("getNumberOfClass");
        String[][] className = new String[0][0];
        int expResult = 0;
        int result = Identify.getNumberOfClass(className);
        assertEquals(expResult, result);
    }

}
