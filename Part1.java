package java1;

import java.util.Scanner;

/**
 * @author Yifei Cao @instructor John Gordon
 *
 */
public class Part1 {

	public static void main(String[] args) {
		int array[] = new int[] { 39, 46, 10, 37, 33, 4, 30, 26, 14, 19, 29, 6, 43, 8, 35, 50, 13, 25, 17, 48, 28, 3,
				41, 34, 36, 38, 49, 16, 45, 2, 40, 15, 24, 7, 5, 9, 20, 1, 42, 44, 21, 47, 12, 22, 18, 31, 11, 32, 27,
				23 };
		int inputValue;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer between 1 and 50:");

		inputValue = input.nextInt();
		while (inputValue > 50 | inputValue < 1) {
			System.out.println("Please enter a valid integer:");
			inputValue = input.nextInt();
		}
		for (int i = 0; i < 50; i++) {
			if (array[i] == inputValue) {
				System.out.println("Integer Found: " + inputValue + " at position " + i);
			}
		}
		input.close();
	}
}
