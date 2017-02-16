package easy;

import java.util.Arrays;
import java.util.Scanner;

public class BeautyOfName {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int N = input.nextInt();
			if (N <= 0) {
				input.close();
				return;
			}
			
			int[] maxBeauty = new int[N];
			
			for (int i=0; i<N; i++) {
				String str = input.next();
				char[] name = str.toCharArray();
				int[] flag = new int[26];
				for (int j=0; j<name.length; j++) {
					flag[name[j]-'a']++;
				}
				Arrays.sort(flag);
				
				int times = 26;
				for (int j=25; j>=0; j--) {
					if (flag[j] <= 0) {
						break;
					}
					maxBeauty[i] += flag[j] * times;
					times--;
				}
			}
			
			for (int i : maxBeauty) {
				System.out.println(i);
			}
		}
		input.close();
	}
}

/* use this code when you submit
import java.util.Arrays;
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
			
			int[] maxBeauty = new int[N];
			
			for (int i=0; i<N; i++) {
				String str = input.next();
				char[] name = str.toCharArray();
				int[] flag = new int[26];
				for (int j=0; j<name.length; j++) {
					flag[name[j]-'a']++;
				}
				Arrays.sort(flag);
				
				int times = 26;
				for (int j=25; j>=0; j--) {
					if (flag[j] <= 0) {
						break;
					}
					maxBeauty[i] += flag[j] * times;
					times--;
				}
			}
			
			for (int i : maxBeauty) {
				System.out.println(i);
			}
		}
		input.close();
	}
}
 */
