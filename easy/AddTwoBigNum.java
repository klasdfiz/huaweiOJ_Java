package easy;

import java.util.Scanner;

public class AddTwoBigNum {
	
	public static String addTwoBigNum(String num1, String num2) {
		int len1 = num1.length();
		int len2 = num2.length();
		if (len1 < len2) {
			return addTwoBigNum(num2, num1);
		}
		char[] n1 = num1.toCharArray();
		char[] n2 = num2.toCharArray();
		int bit = 0;
		String result = "";
		
		for (int i=len2-1; i>=0; i--) {
			int bit1 = n1[i] - '0';
			int bit2 = n2[i] - '0';
			int bitSum = (bit1+bit2+bit) % 10;
			bit = (bit1+bit2+bit) / 10;
			result = bitSum + result;
		}
		
		for (int i=len1-len2-1; i>=0; i--) {
			int bit1 = n1[i] - '0';
			int bitSum = (bit1+bit) % 10;
			bit = (bit1+bit) / 10;
			result = bitSum + result;
		}
		
		if (bit != 0) {
			result = bit + result;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			String num1 = input.next();
			String num2 = input.next();
			System.out.println(addTwoBigNum(num1, num2));
		}
		input.close();

	}
}

/*
package easy;

import java.util.Scanner;

public class Main {
	
	public static String addTwoBigNum(String num1, String num2) {
		int len1 = num1.length();
		int len2 = num2.length();
		if (len1 < len2) {
			return addTwoBigNum(num2, num1);
		}
		char[] n1 = num1.toCharArray();
		char[] n2 = num2.toCharArray();
		int bit = 0;
		String result = "";
		
		for (int i=len2-1; i>=0; i--) {
			int bit1 = n1[i] - '0';
			int bit2 = n2[i] - '0';
			int bitSum = (bit1+bit2+bit) % 10;
			bit = (bit1+bit2+bit) / 10;
			result = bitSum + result;
		}
		
		for (int i=len1-len2-1; i>=0; i--) {
			int bit1 = n1[i] - '0';
			int bitSum = (bit1+bit) % 10;
			bit = (bit1+bit) / 10;
			result = bitSum + result;
		}
		
		if (bit != 0) {
			result = bit + result;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			String num1 = input.next();
			String num2 = input.next();
			System.out.println(addTwoBigNum(num1, num2));
		}
		input.close();

	}
}


*/
