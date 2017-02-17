package easy;

import java.util.Arrays;
import java.util.Scanner;

public class PrintLastKNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int N = input.nextInt();
			int K = input.nextInt();
			if (N<=0 || K<=0 || N<K) {
				input.close();
				return;
			}
			
			int[] num = new int[N];
			for (int i=0; i<N; i++) {
				num[i] = input.nextInt();
			}
			Arrays.sort(num);
			System.out.print(num[0]);
			for (int i=1; i<K; i++) {
				System.out.print(" " + num[i]);
			}
			System.out.println();
		}
		
		input.close();
	}
}

/*
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int N = input.nextInt();
			int K = input.nextInt();
			if (N<=0 || K<=0 || N<K) {
				input.close();
				return;
			}
			
			int[] num = new int[N];
			for (int i=0; i<N; i++) {
				num[i] = input.nextInt();
			}
			Arrays.sort(num);
			System.out.print(num[0]);
			for (int i=1; i<K; i++) {
				System.out.print(" " + num[i]);
			}
			System.out.println();
		}
		
		input.close();
	}
}
 */
