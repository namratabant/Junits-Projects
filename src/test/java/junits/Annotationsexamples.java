package junits;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Annotationsexamples {
	
	@BeforeAll
	public static void method3() {
		System.out.println("inside Before All");
		
	}
	
	@BeforeEach
	public void method1() {
		System.out.println("inside Before Each");
		
	}
	
	@Test
	public void addTest1() {
		
		assertEquals(9,Calculator.add(4, 5));
		assertTrue(true);
		
		String[] array1 = {"one,two,three"};
		String[] array2 = {"one,two,three"};
		assertArrayEquals(array1,array2);
		System.out.println("inside Test1");
		
		
}

	@Test
	public void addTest2() {
		
		assertEquals(9,Calculator.add(5, 4));
		System.out.println("inside Test2");
	}
		@AfterEach
		public void method2() {
			System.out.println("inside After Each");
			
		}
		
		@AfterAll
		public static void method4() {
			System.out.println("inside After All");
			
			
		}

}
