import static org.junit.Assert.*;

import org.junit.Test;


public class JUnitExample1 
{

	@Test
	public void test() 
	{
		int one = 1;
		assertTrue("there was an error", one==2);
	}

}
