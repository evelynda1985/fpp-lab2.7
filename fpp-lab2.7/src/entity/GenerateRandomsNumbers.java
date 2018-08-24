package entity;

import java.util.Random;

public class GenerateRandomsNumbers {
	
	static int x = 4;
	static int y = 3;
	
	public GenerateRandomsNumbers() {}

	//Generate a random number between 1 - 99
	// nextInt as provided by Random is exclusive of the top value so you need to add 1 
	//Source: https://stackoverflow.com/questions/20389890/generating-a-random-number-between-1-and-10-java
	public static int getRandomNumber() {
		
		int min = 1;
		int max = 99;
		Random rand = new Random();
		
		int RandomNumber = rand.nextInt((max - min) + 1) + min;
		
		return RandomNumber;
		
	}
	
	//Is the number in the range?
	public static boolean isInTheRange(int randomNumber) {
		
		if ((randomNumber > 0) && (randomNumber < 100)) {
			
			return true;
		}
		
		return false;
	}
	
	//Is the number < 10 - one digit number
	public static boolean isOneDigitNumber(int number) {
		
		if (number < 10) {
			return true;
		}
		
		return false;
		
	}
	
	
	//print to numbers in the right format
	public static void printNumbersFormat() {
		
		int number1 = getRandomNumber();
		int number2 = getRandomNumber();
		int number3 = getRandomNumber();
		int number4 = getRandomNumber();
		int number5 = getRandomNumber();
		int number6 = getRandomNumber();
		int number7 = getRandomNumber();
		int number8 = getRandomNumber();
		
		String printNumber1;
		String printNumber2;
		String printNumber3;
		String printNumber4;
		String printNumber5;
		String printNumber6;
		String printNumber7;
		String printNumber8;
		
		
		if((isInTheRange(number1)) && (isInTheRange(number2)) 
				&& ((isInTheRange(number3)) && (isInTheRange(number4)))
				&& ((isInTheRange(number5)) && (isInTheRange(number6)))
				&& ((isInTheRange(number7)) && (isInTheRange(number8)))) {
			
			printNumber1 = String.format("%" + x + "d", number1);
			printNumber3 = String.format("%" + 10 + "d", number3);
			printNumber5 = String.format("%" + 10 + "d", number5);
			printNumber7 = String.format("%" + 10 + "d", number7);
			
			printNumber2 = String.format("%" + y + "d", number2);
			printNumber4 = String.format("%" + 3 + "d", number4);
			printNumber6 = String.format("%" + 3 + "d", number6);
			printNumber8 = String.format("%" + 3 + "d", number8);
			
			
			
			System.out.print(printNumber1);
			System.out.print(printNumber3);
			System.out.print(printNumber5);
			System.out.print(printNumber7);
			
			System.out.println("");
			
			System.out.print("+" + printNumber2);
			System.out.format("%7s", "+");
			System.out.print( printNumber4);
			System.out.format("%7s", "+");
			System.out.print( printNumber6);
			System.out.format("%7s", "+");
			System.out.print( printNumber8);
			
			
			System.out.println("");
			System.out.print("_____");
			System.out.format("%10s", "_____");
			System.out.format("%10s", "_____");
			System.out.format("%10s", "_____");
			System.out.println("");
			
			
		}
		
	}
	
	//Generate 8 exercises, with 16 numbers and with the right format
	public static void getExercises() {
		
		printNumbersFormat();
		System.out.println("");
		printNumbersFormat();
		
	}

}
