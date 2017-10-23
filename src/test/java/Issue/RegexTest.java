package Issue;

import java.util.LinkedList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author wanzu
 */
public class RegexTest {
    
    /**
     * Test of grepClassName method, of class Regex.
     */
    @Test
    public void testGrepClassName() {
        System.out.println("grepClassName");
        String input = "";
        String regexe = "";
        String[] expResult = new String[1];
        expResult[0] = "";
        String[] result = Regex.grepClassName(input, regexe);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of convertListClass method, of class Regex.
     */
    @Test
    public void testConvertListClass() {
        System.out.println("convertListClass");
        LinkedList listClassName = new LinkedList();
        String[] expResult = new String[0];
        String[] result = Regex.convertListClass(listClassName);
        assertArrayEquals(expResult, result);
    }
    
}
