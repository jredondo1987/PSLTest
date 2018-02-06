package Test;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import LCD.ImpresorLCD;

public class ImpresorLCDTest {
	
	private String resultTest="";
	
 
	
	public ImpresorLCDTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
	@Test
    public void testIsNumeric() {
        System.out.println("isNumeric");
        String string = "123";
        boolean expResult = true;
        boolean result = ImpresorLCD.isNumeric(string);
        assertEquals(expResult, result);
    }
	
	    
	@Test
	public void test(){
		String strTest = 			 "     -   -       -  "
				   				   + "  |   |   | | | |   "
				   				   + "     -   -   -   -  "
				   				   + "  | |     |   |   | "
				   				   + "     -   -       -  ";
		assertNotEquals("Output error", strTest, resultTest);
	}
	


}
