package junit;
import junit.framework.TestCase;
import pass.Division;



public class DivisionTest extends TestCase {
	
	protected void setUp() throws Exception {
		super.setUp();
		
	}
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testDivide() {
		this.assertEquals(Division.divide(0,42), 0);
		this.assertEquals(Division.divide(42,1), 42);
		this.assertEquals(Division.divide(127,3), 42);
	}
}