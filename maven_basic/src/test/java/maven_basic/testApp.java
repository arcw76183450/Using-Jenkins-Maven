package maven_basic;
import static org.junit.Assert.*;

import org.junit.Test;

public class testApp {

	@Test
	public void test1() {
		App a = new App();
		assertEquals(a.even_odd(4),0);
	}
	@Test
	public void test2() {
		App a = new App();
		assertEquals(a.even_odd(5),1);
	}
}
