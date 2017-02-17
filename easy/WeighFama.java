package easy;

import java.util.Scanner;

public class WeighFama {
	
	public static int fama(int n, int[] weight, int[] num) {
		int result = 0;
		int totalWeight = 0;
		for (int i=0; i<n; i++) {
			totalWeight += weight[i] * num[i];
		}
		
		int[] dp = new int[totalWeight+1];
		dp[0] = 1;
		for (int i=0; i<n; i++) {
			for (int j=1; j<=num[i]; j++) {
				for (int k=totalWeight; k>=weight[i]; k--) {
					if (dp[k]!=1 && dp[k-weight[i]]==1) {
						dp[k] = 1;
					}
				}
			}
		}
		
		for (int i=0; i<=totalWeight; i++) {
			if (dp[i] == 1) {
				result++;
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while (input.hasNext()) {
			int N = input.nextInt();
			if (N<1 || N>10) {
				input.close();
				return;
			}
			
			int[] weight = new int[N];
			int[] num = new int[N];
			for (int i=0; i<N; i++) {
				weight[i] = input.nextInt();
				if (weight[i]<1 || weight[i]>10) {
					input.close();
					return;
				}
			}
			for (int i=0; i<N; i++) {
				num[i] = input.nextInt();
				if (num[i]<1 || num[i]>10) {
					input.close();
					return;
				}
			}
			
			System.out.println(fama(N, weight, num));
		}
		
		input.close();
	}
}

/*
import java.util.Scanner;

public class Main {
	
	public static int fama(int n, int[] weight, int[] num) {
		int result = 0;
		int totalWeight = 0;
		for (int i=0; i<n; i++) {
			totalWeight += weight[i] * num[i];
		}
		
		int[] dp = new int[totalWeight+1];
		dp[0] = 1;
		for (int i=0; i<n; i++) {
			for (int j=1; j<=num[i]; j++) {
				for (int k=totalWeight; k>=weight[i]; k--) {
					if (dp[k]!=1 && dp[k-weight[i]]==1) {
						dp[k] = 1;
					}
				}
			}
		}
		
		for (int i=0; i<=totalWeight; i++) {
			if (dp[i] == 1) {
				result++;
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while (input.hasNext()) {
			int N = input.nextInt();
			if (N<1 || N>10) {
				input.close();
				return;
			}
			
			int[] weight = new int[N];
			int[] num = new int[N];
			for (int i=0; i<N; i++) {
				weight[i] = input.nextInt();
				if (weight[i]<1 || weight[i]>10) {
					input.close();
					return;
				}
			}
			for (int i=0; i<N; i++) {
				num[i] = input.nextInt();
				if (num[i]<1 || num[i]>10) {
					input.close();
					return;
				}
			}
			
			System.out.println(fama(N, weight, num));
		}
		
		input.close();
	}
}
*/