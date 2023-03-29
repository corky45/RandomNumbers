package PracticalExam;

import java.util.Arrays;
import java.util.Random;
import java.util.*;

public class RandomNumber {
	public static void main(String[] args) {
		int[] numbers = new Random().ints(1, 1000).limit(500).toArray();
		System.out.println("Numbers generates are: " + Arrays.toString(numbers));
		
		System.out.println("Which nth would you like to see?");
		try (Scanner scan = new Scanner(System.in)) {
			int nposition = scan.nextInt();
			System.out.println("The number " + numbers[nposition-1] + " is in the " + nposition + " position.");
		}
		
	}
}
