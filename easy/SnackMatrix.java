package easy;

import java.util.Scanner;

public class SnackMatrix {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int N = input.nextInt();
			if (N <= 0) {
				input.close();
				return;
			}
			
			int[] rowBegin = new int[N+1];
			rowBegin[0] = 1;
			for (int i=1; i<N; i++) {
				rowBegin[i] = rowBegin[i-1] + i;
			}
			
			for (int i=0; i<N; i++) {
				int currentNum = rowBegin[i];
				System.out.print(currentNum);
				for (int count=1, step=i+2; count<(N-i); count++, step++) {
					System.out.print(" ");
					currentNum += step;
					System.out.print(currentNum);
				}
				System.out.println();
			}
		}
		input.close();
	}
}

/* use this code when you submit

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int N = input.nextInt();
			if (N <= 0) {
				input.close();
				return;
			}
			
			int[] rowBegin = new int[N+1];
			rowBegin[0] = 1;
			for (int i=1; i<N; i++) {
				rowBegin[i] = rowBegin[i-1] + i;
			}
			
			for (int i=0; i<N; i++) {
				int currentNum = rowBegin[i];
				System.out.print(currentNum);
				for (int count=1, step=i+2; count<(N-i); count++, step++) {
					System.out.print(" ");
					currentNum += step;
					System.out.print(currentNum);
				}
				System.out.println();
			}
		}
		input.close();
	}
}
*/