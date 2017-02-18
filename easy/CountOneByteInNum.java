package easy;

import java.util.Scanner;

public class CountOneByteInNum {
	
	public static int count(int num) {
		if (num == 0) {
			return 0;
		}
		
		int result = 0;
		while (num != 0) {
			result++;
			num = num & (num-1);
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int num = input.nextInt();
			System.out.println(count(num));
		}
		
		input.close();
	}
}

/* 
 * 

import java.util.Scanner;

public class Main {
	
	public static int count(int num) {
		if (num == 0) {
			return 0;
		}
		
		int result = 0;
		while (num != 0) {
			result++;
			num = num & (num-1);
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int num = input.nextInt();
			System.out.println(count(num));
		}
		
		input.close();
	}
}


*/
