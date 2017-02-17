package easy;

import java.util.Scanner;

public class PrintLastKNode {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int N = input.nextInt();
			if (N <= 0) {
				input.close();
				return;
			}
			
			int[] num = new int[N];
			for (int i=0; i<N; i++) {
				num[i] = input.nextInt();
			}
			
			int K = input.nextInt();
			
			System.out.println(num[N-K-1]);
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
			int N = input.nextInt();
			if (N <= 0) {
				input.close();
				return;
			}
			
			int[] num = new int[N];
			for (int i=0; i<N; i++) {
				num[i] = input.nextInt();
			}
			
			int K = input.nextInt();
			
			System.out.println(num[N-K-1]);
		}
		input.close();
	}
}
 */
