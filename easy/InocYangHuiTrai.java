package easy;

import java.util.Scanner;

public class InocYangHuiTrai {
	
	public static int run(int N) {
		int result = -1;
		if (N <= 2) {
			return result;
		}
		int[] num = new int[2*N-1];
		int[] temp = new int[2*N-1];
		num[0] = num[1] = num[2] = num[2*N-2] = 1;

		for (int i=3; i<=N; i++) {
			for (int j=0; j<(2*N-2); j++) {
				temp[j] = num[j];
			}
			
			for (int j=1; j<(2*N-2); j++) {
				int topleft = (j==1) ? 0 : temp[j-2];
				int top = temp[j-1];
				int topright = temp[j];
				num[j] = topleft + top + topright;
			}
			
		}
		
		for (int i=0; i<(2*N-1); i++) {
			if (num[i]%2 == 0 && num[i] != 0) {
				result = i+1;
				break;
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int N = input.nextInt();
			
			System.out.println(run(N));
		}
		input.close();
	}
}

/*
import java.util.Scanner;

public class Main {
	
	public static int run(int N) {
		int result = -1;
		if (N <= 2) {
			return result;
		}
		int[] num = new int[2*N-1];
		int[] temp = new int[2*N-1];
		num[0] = num[1] = num[2] = num[2*N-2] = 1;

		for (int i=3; i<=N; i++) {
			for (int j=0; j<(2*N-2); j++) {
				temp[j] = num[j];
			}
			
			for (int j=1; j<(2*N-2); j++) {
				int topleft = (j==1) ? 0 : temp[j-2];
				int top = temp[j-1];
				int topright = temp[j];
				num[j] = topleft + top + topright;
			}
			
		}
		
		for (int i=0; i<(2*N-1); i++) {
			if (num[i]%2 == 0 && num[i] != 0) {
				result = i+1;
				break;
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int N = input.nextInt();
			
			System.out.println(run(N));
		}
		input.close();
	}
}
 */
