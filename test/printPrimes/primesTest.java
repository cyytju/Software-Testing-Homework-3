package printPrimes;

import org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class primesTest {
    private primes pri;
	
	@Before
	public void setup(){
		pri = new primes();
	}
	
	@Test
	public void tests(){
		pri.printPrimes(15);
	}

}
