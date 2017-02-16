package easy;

import java.util.Scanner;

public class LastLengthOfWordInString {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String[] words = str.split(" ");
		int len = words.length;
		if (len != 0) {
			System.out.println(words[len-1].length());
		}
		input.close();

	}
}


/* use this code when you submit

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String[] words = str.split(" ");
		int len = words.length;
		if (len != 0) {
			System.out.println(words[len-1].length());
		}
		input.close();

	}
}
 */
