package easy;

import java.util.Scanner;

public class PutApple {
	
	public static int put(int m, int n) {
		if (m==0 || n==1) {
			return 1;
		}
		if (m < n) {
			return put(m, m);
		}
		
		return put(m, n-1) + put(m-n, n);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int m = input.nextInt();
			int n = input.nextInt();
			if (m<0 || m>10 || n<1 || n>10) {
				input.close();
				return;
			}
			System.out.println(put(m, n));
		}
		input.close();
	}
}

/*
package easy;

import java.util.Scanner;

public class Main {
	
	public static int put(int m, int n) {
		if (m==0 || n==1) {
			return 1;
		}
		if (m < n) {
			return put(m, m);
		}
		
		return put(m, n-1) + put(m-n, n);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int m = input.nextInt();
			int n = input.nextInt();
			if (m<0 || m>10 || n<1 || n>10) {
				input.close();
				return;
			}
			System.out.println(put(m, n));
		}
		input.close();
	}
}
*/