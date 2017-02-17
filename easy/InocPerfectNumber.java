package easy;

import java.util.Scanner;

public class InocPerfectNumber {
	
	public static boolean isPerfectNum(int num) {
		//num>0
		int sum = 0;
		for (int i=1; i<num; i++) {
			if (num%i == 0) {
				sum += i;
			}
		}
		if (sum == num) {
			return true;
		} else {
			return false;
		}
	}
	
	public static int count(int n) {
		int result = 0;
		if (n<=0 || n>500000) {
			return -1;
		}
		
		for (int i=1; i<=n; i++) {
			if (isPerfectNum(i)) {
				result++;
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int N = input.nextInt();
			System.out.println(count(N));
		}
		input.close();
	}
}

/*
import java.util.Scanner;

public class Main {
	
	public static boolean isPerfectNum(int num) {
		//num>0
		int sum = 0;
		for (int i=1; i<num; i++) {
			if (num%i == 0) {
				sum += i;
			}
		}
		if (sum == num) {
			return true;
		} else {
			return false;
		}
	}
	
	public static int count(int n) {
		int result = 0;
		if (n<=0 || n>500000) {
			return -1;
		}
		
		for (int i=1; i<=n; i++) {
			if (isPerfectNum(i)) {
				result++;
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int N = input.nextInt();
			System.out.println(count(N));
		}
		input.close();
	}
}
 */
