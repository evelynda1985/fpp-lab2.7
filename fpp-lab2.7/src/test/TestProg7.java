package test;

import static org.junit.Assert.*;
import org.junit.Test;
import entity.GenerateRandomsNumbers;

public class TestProg7 {
	
	//TDD
	//Step#1
	//What we need...
	//We need instance an object without parameters, we can do it static ;)
	//We need a call a method to generate a random number from 1 - 99
	//the only way to verifying this is to validate that numbers are in the range.
	//We also need to generate 16 random numbers
	//We need to print them in a special format through console.
	
	//Step#2 create the methods to make this work
	
	@Test
	public void isInTheRangeTest() {
		
		int randomNumber = GenerateRandomsNumbers.getRandomNumber();
		
		assertEquals(true, GenerateRandomsNumbers.isInTheRange(randomNumber));
		
	}
	
	@Test
	public void IsOneDigitTest() {
		
		assertEquals(true, GenerateRandomsNumbers.isOneDigitNumber(5));
		assertEquals(false, GenerateRandomsNumbers.isOneDigitNumber(15));
		
	}
	
	//Step#3 Refactor the code

}
