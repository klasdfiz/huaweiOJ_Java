package easy;

import java.util.Scanner;

public class CommonSubString {
	
	//dp(m, n) = dp(m-1, n-1)+1 or 0
	//dp(m, n) means the length of substring end with str1[m],str2[n]
	public static int getCommonStrLength(String str1, String str2) {
		
		int len1 = str1.length();
		int len2 = str2.length();
		
		if (len1<=0 || len2<=0) {
			return 0;
		}
		
		char[] s1 = str1.toLowerCase().toCharArray();
		char[] s2 = str2.toLowerCase().toCharArray();
		int[][] dp = new int[len1][len2];
		int result = 0;
		
		for (int i=0; i<len1; i++) {
			for (int j=0; j<len2; j++) {
				if (s1[i] == s2[j]) {
					if (i==0 || j==0) {
						dp[i][j] = 1;
					} else {
						dp[i][j] = dp[i-1][j-1] + 1;
					}
				} else {
					dp[i][j] = 0;
				}
				
				if (dp[i][j] > result) {
					result = dp[i][j];
				}
			}
		}
		
		return result;
			
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			String str1 = input.next();
			String str2 = input.next();
			System.out.println(getCommonStrLength(str1, str2));
		}
		input.close();
	}
}

/*
import java.util.Scanner;

public class Main {
	
	//dp(m, n) = dp(m-1, n-1)+1 or 0
	//dp(m, n) means the length of substring end with str1[m],str2[n]
	public static int getCommonStrLength(String str1, String str2) {
		
		int len1 = str1.length();
		int len2 = str2.length();
		
		if (len1<=0 || len2<=0) {
			return 0;
		}
		
		char[] s1 = str1.toLowerCase().toCharArray();
		char[] s2 = str2.toLowerCase().toCharArray();
		int[][] dp = new int[len1][len2];
		int result = 0;
		
		for (int i=0; i<len1; i++) {
			for (int j=0; j<len2; j++) {
				if (s1[i] == s2[j]) {
					if (i==0 || j==0) {
						dp[i][j] = 1;
					} else {
						dp[i][j] = dp[i-1][j-1] + 1;
					}
				} else {
					dp[i][j] = 0;
				}
				
				if (dp[i][j] > result) {
					result = dp[i][j];
				}
			}
		}
		
		return result;
			
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			String str1 = input.next();
			String str2 = input.next();
			System.out.println(getCommonStrLength(str1, str2));
		}
		input.close();
	}
}

*/