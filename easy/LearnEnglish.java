package easy;

import java.util.Scanner;

public class LearnEnglish {
	
	public static String[] digit = new String[20];
	public static String[] tensDigit = new String[8];
	
	public static void init() {
		digit[0] = "zero";
		digit[1] = "one";
		digit[2] = "two";
		digit[3] = "three";
		digit[4] = "four";
		digit[5] = "five";
		digit[6] = "six";
		digit[7] = "seven";
		digit[8] = "eight";
		digit[9] = "nine";
		digit[10] = "ten";
		digit[11] = "eleven";
		digit[12] = "twelve";
		digit[13] = "thirteen";
		digit[14] = "fourteen";
		digit[15] = "fifteen";
		digit[16] = "sixteen";
		digit[17] = "seventeen";
		digit[18] = "eighteen";
		digit[19] = "nineteen";
		
		//20-90
		tensDigit[0] = "twenty";
		tensDigit[1] = "thirty";
		tensDigit[2] = "forty";
		tensDigit[3] = "fifty";
		tensDigit[4] = "sixty";
		tensDigit[5] = "seventy";
		tensDigit[6] = "eighty";
		tensDigit[7] = "ninety";
	}
	
	//1 ~ 999
	public static String parse3Num(int num) {
		if (num == 0) {
			return "";
		}
		String result = "";
		
		int temp = num / 100;
		if (temp != 0) {
			result += digit[temp] + " hundred";
		}
		num %= 100;
		if (num == 0) {
			return result;
		}
		
		if (result.length() != 0) {
			result += " and ";
		}
		
		temp = num / 10;
		if (temp == 0 || temp == 1) {
			result += digit[num];
		} else {
			result += tensDigit[temp-2];
			num %= 10;
			if (num != 0) {
				result += " " + digit[num];
			}
		}
		
		return result;
	}
	
	public static String parse(long num) {
		if (num <= 0) {
			return "error";
		}
		
		String result = "";
		int temp = (int)(num % 1000);
		result = parse3Num(temp);
		num /= 1000;
		if (num == 0) {  // 1~999
			return result;
		}
		
		// 1,000~ 
		if (result.length() != 0) {
			result = " " + result;  //---
			if ((temp%100)==0 || temp<100) {
				result = " and" + result;
			}
		}
		temp = (int)(num % 1000);
		String t1 = parse3Num(temp);
		if (t1.length() != 0) { //!000,000
			result = t1 + " thousand" + result;
		}
		num /= 1000;
		if (num == 0) {  // 1,000 ~ 999,999
			return result;
		}
		
		//1,000,000 ~
		if (result.length()!=0 && result.charAt(0)!=' ') {
			result = " " + result; //--
		}
		temp = (int)(num % 1000);
		t1 = parse3Num(temp);
		if (t1.length() != 0) { //!000,000,000
			result = t1 + " million" + result;
		}
		num /= 1000;
		if (num == 0) {  // 1,000,000 ~ 999,999,999
			return result;
		}
		
		//1,000,000,000 ~ 9,999,999,999
		if (result.length()!=0 && result.charAt(0)!=' ') {
			result = " " + result;
		}
		temp = (int)num;
		result = parse3Num(temp) + " billion" + result;
		
		
		return result;
	}
	
	public static void main(String[] args) {
		init();
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			String str = input.next();
			if (str.length() > 10) {
				input.close();
				System.out.println("error");
				return;
			}
			long num = Long.parseLong(str);
					
			System.out.println(parse(num));
		}
		input.close();

	}
}

/* use this code when you submit
import java.util.Scanner;

public class Main {
	
	public static String[] digit = new String[20];
	public static String[] tensDigit = new String[8];
	
	public static void init() {
		digit[0] = "zero";
		digit[1] = "one";
		digit[2] = "two";
		digit[3] = "three";
		digit[4] = "four";
		digit[5] = "five";
		digit[6] = "six";
		digit[7] = "seven";
		digit[8] = "eight";
		digit[9] = "nine";
		digit[10] = "ten";
		digit[11] = "eleven";
		digit[12] = "twelve";
		digit[13] = "thirteen";
		digit[14] = "fourteen";
		digit[15] = "fifteen";
		digit[16] = "sixteen";
		digit[17] = "seventeen";
		digit[18] = "eighteen";
		digit[19] = "nineteen";
		
		//20-90
		tensDigit[0] = "twenty";
		tensDigit[1] = "thirty";
		tensDigit[2] = "forty";
		tensDigit[3] = "fifty";
		tensDigit[4] = "sixty";
		tensDigit[5] = "seventy";
		tensDigit[6] = "eighty";
		tensDigit[7] = "ninety";
	}
	
	//1 ~ 999
	public static String parse3Num(int num) {
		if (num == 0) {
			return "";
		}
		String result = "";
		
		int temp = num / 100;
		if (temp != 0) {
			result += digit[temp] + " hundred";
		}
		num %= 100;
		if (num == 0) {
			return result;
		}
		
		if (result.length() != 0) {
			result += " and ";
		}
		
		temp = num / 10;
		if (temp == 0 || temp == 1) {
			result += digit[num];
		} else {
			result += tensDigit[temp-2];
			num %= 10;
			if (num != 0) {
				result += " " + digit[num];
			}
		}
		
		return result;
	}
	
	public static String parse(long num) {
		if (num <= 0) {
			return "error";
		}
		
		String result = "";
		int temp = (int)(num % 1000);
		result = parse3Num(temp);
		num /= 1000;
		if (num == 0) {  // 1~999
			return result;
		}
		
		// 1,000~ 
		if (result.length() != 0) {
			result = " " + result;  //---
			if ((temp%100)==0 || temp<100) {
				result = " and" + result;
			}
		}
		temp = (int)(num % 1000);
		String t1 = parse3Num(temp);
		if (t1.length() != 0) { //!000,000
			result = t1 + " thousand" + result;
		}
		num /= 1000;
		if (num == 0) {  // 1,000 ~ 999,999
			return result;
		}
		
		//1,000,000 ~
		if (result.length()!=0 && result.charAt(0)!=' ') {
			result = " " + result; //--
		}
		temp = (int)(num % 1000);
		t1 = parse3Num(temp);
		if (t1.length() != 0) { //!000,000,000
			result = t1 + " million" + result;
		}
		num /= 1000;
		if (num == 0) {  // 1,000,000 ~ 999,999,999
			return result;
		}
		
		//1,000,000,000 ~ 9,999,999,999
		if (result.length()!=0 && result.charAt(0)!=' ') {
			result = " " + result;
		}
		temp = (int)num;
		result = parse3Num(temp) + " billion" + result;
		
		
		return result;
	}
	
	public static void main(String[] args) {
		init();
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			String str = input.next();
			if (str.length() > 10) {
				input.close();
				System.out.println("error");
				return;
			}
			long num = Long.parseLong(str);
					
			System.out.println(parse(num));
		}
		input.close();

	}
}
 */
