package easy;

import java.util.Scanner;

public class TheroyNikechesi {
	
	public static void getResult(int m) {
		if (m<1 || m>100) return;
		
		int num = m * m * m;
		
		for (int i=1; i<=num; i+=2) {
			int temp = i;
			int res = i;
			for (int j=1; j<m; j++) {
				temp += 2;
				res += temp;
			}
			if (res == num) {
				System.out.print(i);
				temp = i;
				for (int j=1; j<m; j++) {
					temp += 2;
					System.out.print("+" + temp);
				}
				System.out.println();
				return;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int m = input.nextInt();
			getResult(m);
		}
		input.close();
	}
}

/*
package easy;

import java.util.Scanner;

public class Main {
	
	public static void getResult(int m) {
		if (m<1 || m>100) return;
		
		int num = m * m * m;
		
		for (int i=1; i<=num; i+=2) {
			int temp = i;
			int res = i;
			for (int j=1; j<m; j++) {
				temp += 2;
				res += temp;
			}
			if (res == num) {
				System.out.print(i);
				temp = i;
				for (int j=1; j<m; j++) {
					temp += 2;
					System.out.print("+" + temp);
				}
				System.out.println();
				return;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int m = input.nextInt();
			getResult(m);
		}
		input.close();
	}
}
*/