package easy;

import java.util.Scanner;

public class MultiThread {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int N = input.nextInt();
			for (int i=0; i<N; i++) {
				System.out.print("ABCD");
			}
			System.out.println();
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
			for (int i=0; i<N; i++) {
				System.out.print("ABCD");
			}
			System.out.println();
		}
		input.close();
	}
}
 */
