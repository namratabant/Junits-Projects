package junits;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;

public class StringFunctionTest {

	@Tag("Sanity")
	@Tag("Sanity")
	@DisplayName("Positive Test")
	@Test
	public  void test1() {
		
		assertTrue(StringFunctions.isPalindrom("madam"));
		assertTrue(StringFunctions.isPalindrom("racecar"));
	}
	
	//////@CustomAnnotation
	@Tag("Sanity")
	public  void test2() {
		
		assertFalse(StringFunctions.isPalindrom("namrata"));
}
}

