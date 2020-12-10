package program1;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.*;   
import org.junit.Test; 


public class TestLogic 
{
	@Test  
	public void testTest()
	 {  
	
		assertEquals(4,Sample.findMax(new int[]{1,3,4,2}));  
		
		
	 }  
}
