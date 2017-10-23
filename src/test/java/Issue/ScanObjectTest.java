package Issue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ScanObjectTest {
    
    /**
     * Test of setFileContent method, of class ScanObject.
     */
    @Test
    public void testSetFileContent() {
        System.out.println("setFileContent");
        String[][] fileContent = new String[0][0];
        ScanObject instance = new ScanObject();
        ScanObject expResult = instance;
        expResult.setFileContent(fileContent);
        ScanObject result = instance.setFileContent(fileContent);
        assertEquals(expResult, result);
    }

    /**
     * Test of setClassName method, of class ScanObject.
     */
    @Test
    public void testSetClassName() {
        System.out.println("setClassName");
        String[][] className = new String[0][0];
        ScanObject instance = new ScanObject();
        ScanObject expResult = instance;
        ScanObject result = instance.setClassName(className);
        assertEquals(expResult, result);
    }

    /**
     * Test of setClassFileNumber method, of class ScanObject.
     */
    @Test
    public void testSetClassFileNumber() {
        System.out.println("setClassFileNumber");
        int[] classFileNumber = new int[0];
        ScanObject instance = new ScanObject();
        ScanObject expResult = instance;
        ScanObject result = instance.setClassFileNumber(classFileNumber);
        assertEquals(expResult, result);
    }

    /**
     * Test of setInterfaceFileNumber method, of class ScanObject.
     */
    @Test
    public void testSetInterfaceFileNumber() {
        System.out.println("setInterfaceFileNumber");
        int[] interfaceFileNumber = new int[0];
        ScanObject instance = new ScanObject();
        ScanObject expResult = instance;
        ScanObject result = instance.setInterfaceFileNumber(interfaceFileNumber);
        assertEquals(expResult, result);
    }

    /**
     * Test of getIssueSolved method, of class ScanObject.
     */
    @Test
    public void testGetIssueSolved() {
        System.out.println("getIssueSolved");
        int numberOfFile = 0;
        ScanObject instance = new ScanObject();
        instance.setClassName(new String[0][0]);
        int expResult = 0;
        int result = instance.getIssueSolved(numberOfFile);
        assertEquals(expResult, result);
    }

    /**
     * Test of grepObject method, of class ScanObject.
     */
    @Test
    public void testGrepObject() {
        System.out.println("grepObject");
        String singleLine = "";
        String className = "";
        ScanObject instance = new ScanObject();
        boolean expResult = false;
        boolean result = instance.grepObject(singleLine, className);
        assertEquals(expResult, result);
    }
    
}
