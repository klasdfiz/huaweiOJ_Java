package easy;

import java.util.Scanner;

public class ClosestPrimePair {
	
	public static boolean isPrime(int num) {
		if (num == 2) {
			return true;
		}
		
		for (int i=2; i<=Math.sqrt(num); i++) {
			if (num%i == 0) {
				return false;
			}
		}
		
		return true;		
	}
	
	public static void find(int num) {
		int primeMin = 0;
		int primeMax = 0;
		int distance = Integer.MAX_VALUE;
		
		for (int i=2; i<=num/2; i++) {
			if (isPrime(i)) {
				int temp = num - i;
				if (isPrime(temp) && distance>(temp-i)) {
					primeMin = i;
					primeMax = temp;
					distance = temp - i;
				}
			}
		}
		
		System.out.println(primeMin);
		System.out.println(primeMax);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int num = input.nextInt();
			if (num<=5 || num>10000) {
				input.close();
				return;
			}
			
			find(num);
		}
		input.close();
	}
}

/*
import java.util.Scanner;

public class Main {
	
	public static boolean isPrime(int num) {
		if (num == 2) {
			return true;
		}
		
		for (int i=2; i<=Math.sqrt(num); i++) {
			if (num%i == 0) {
				return false;
			}
		}
		
		return true;		
	}
	
	public static void find(int num) {
		int primeMin = 0;
		int primeMax = 0;
		int distance = Integer.MAX_VALUE;
		
		for (int i=2; i<=num/2; i++) {
			if (isPrime(i)) {
				int temp = num - i;
				if (isPrime(temp) && distance>(temp-i)) {
					primeMin = i;
					primeMax = temp;
					distance = temp - i;
				}
			}
		}
		
		System.out.println(primeMin);
		System.out.println(primeMax);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int num = input.nextInt();
			if (num<=5 || num>10000) {
				input.close();
				return;
			}
			
			find(num);
		}
		input.close();
	}
}
*/