import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class unitTest {

	@Test
	void test() {
		assertEquals(fibo(1),1);
		assertEquals(fibo(2),1);
		assertEquals(fibo(3),2);
		assertEquals(fibo(4),3);
		assertEquals(fibo(5),5);
		assertEquals(fibo(6),8);
		assertEquals(fibo(30),832040);
		assertEquals(fibo(31),1346269);
	}

	private int fibo(int i) {
		if(i==1)
			return 1;
		if(i==2)
			return 1;
		
			return fibo(i-2)+fibo(i-1);
	
	}

}
