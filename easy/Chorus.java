package easy;

import java.util.Scanner;

public class Chorus {
	
	public static void getLongestIncreSubSequence(int[] height, int[] flag, int N) {
		for (int i=0; i<N; i++) {
			flag[i] = 1;
			for (int j=0; j<i; j++) {
				 if (height[i]>height[j] && flag[j]+1>flag[i]) {
					 flag[i] = flag[j] + 1;
				 }
			}
		}
	}
	
	public static void getLongestDecreSubSequence(int[] height, int[] flag, int N) {
		for (int i=N-1; i>=0; i--) {
			flag[i] = 1;
			for (int j=N-1; j>i; j--) {
				if (height[i]>height[j] && flag[j]+1>flag[i]) {
					 flag[i] = flag[j] + 1;
				 }
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		if (input.hasNext()) {
			
			int N = input.nextInt();
			if (N <= 0) {
				input.close();
				return;
			}
			
			int[] height = new int[N];
			for (int i=0; i<N; i++) {
				height[i] = input.nextInt();
			}
			
			int[] increFlag = new int[N];
			int[] decreFlag = new int[N];
			getLongestIncreSubSequence(height, increFlag, N);
			getLongestDecreSubSequence(height, decreFlag, N);
			
			int maxChorusNum = 1;
			for (int i=0; i<N; i++) {
				if (maxChorusNum < increFlag[i]+decreFlag[i]) {
					maxChorusNum = increFlag[i] + decreFlag[i];
				}
			}
			maxChorusNum--;
			System.out.println(N-maxChorusNum);
		}
		input.close();
	}
}

/* use this code when you submit
 * 
import java.util.Scanner;

public class Main {
	
	public static void getLongestIncreSubSequence(int[] height, int[] flag, int N) {
		for (int i=0; i<N; i++) {
			flag[i] = 1;
			for (int j=0; j<i; j++) {
				 if (height[i]>height[j] && flag[j]+1>flag[i]) {
					 flag[i] = flag[j] + 1;
				 }
			}
		}
	}
	
	public static void getLongestDecreSubSequence(int[] height, int[] flag, int N) {
		for (int i=N-1; i>=0; i--) {
			flag[i] = 1;
			for (int j=N-1; j>i; j--) {
				if (height[i]>height[j] && flag[j]+1>flag[i]) {
					 flag[i] = flag[j] + 1;
				 }
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		if (input.hasNext()) {
			
			int N = input.nextInt();
			if (N <= 0) {
				input.close();
				return;
			}
			
			int[] height = new int[N];
			for (int i=0; i<N; i++) {
				height[i] = input.nextInt();
			}
			
			int[] increFlag = new int[N];
			int[] decreFlag = new int[N];
			getLongestIncreSubSequence(height, increFlag, N);
			getLongestDecreSubSequence(height, decreFlag, N);
			
			int maxChorusNum = 1;
			for (int i=0; i<N; i++) {
				if (maxChorusNum < increFlag[i]+decreFlag[i]) {
					maxChorusNum = increFlag[i] + decreFlag[i];
				}
			}
			maxChorusNum--;
			System.out.println(N-maxChorusNum);
		}
		input.close();
	}
}
*/
