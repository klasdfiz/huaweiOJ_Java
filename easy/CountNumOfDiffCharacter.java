package easy;

import java.util.Scanner;

public class CountNumOfDiffCharacter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			String str = input.nextLine();
			char[] strArray = str.toCharArray();
			int englishCharCount = 0;
			int blankCharCount = 0;
			int numberCharCount = 0;
			int otherCharCount = 0;
			
			for (int i=0; i<strArray.length; i++) {
				if (Character.isAlphabetic(strArray[i])) {
					englishCharCount++;
				} else if (Character.isDigit(strArray[i])) {
					numberCharCount++;
				} else if (strArray[i] == ' ') {
					blankCharCount++;
				} else {
					otherCharCount++;
				}
			}
			
			System.out.println(englishCharCount);
			System.out.println(blankCharCount);
			System.out.println(numberCharCount);
			System.out.println(otherCharCount);
		}
		input.close();

	}

}

/*
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			String str = input.nextLine();
			char[] strArray = str.toCharArray();
			int englishCharCount = 0;
			int blankCharCount = 0;
			int numberCharCount = 0;
			int otherCharCount = 0;
			
			for (int i=0; i<strArray.length; i++) {
				if (Character.isAlphabetic(strArray[i])) {
					englishCharCount++;
				} else if (Character.isDigit(strArray[i])) {
					numberCharCount++;
				} else if (strArray[i] == ' ') {
					blankCharCount++;
				} else {
					otherCharCount++;
				}
			}
			
			System.out.println(englishCharCount);
			System.out.println(blankCharCount);
			System.out.println(numberCharCount);
			System.out.println(otherCharCount);
		}
		input.close();

	}

}
 */
