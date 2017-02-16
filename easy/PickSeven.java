package easy;

import java.util.Scanner;

public class PickSeven {
	
	public static boolean hasConToSeven(int num) {
		boolean status = false;
		
		if (num % 7 == 0) {
			status = true;
		} else {
			while (num != 0) {
				if (num % 10 == 7) {
					status = true;
					break;
				}
				num = num / 10;
			}
		}
		
		return status;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int N = input.nextInt();
			if (N<=0 || N>30000) {
				input.close();
				return;
			}
			
			int result = 0;
			for (int i=1; i<=N; i++) {
				if (hasConToSeven(i)) {
					result++;
				}
			}
			System.out.println(result);
		}
		input.close();
	}
}

/* use this code when you submit
import java.util.Scanner;

public class Main {
	
	public static boolean hasConToSeven(int num) {
		boolean status = false;
		
		if (num % 7 == 0) {
			status = true;
		} else {
			while (num != 0) {
				if (num % 10 == 7) {
					status = true;
					break;
				}
				num = num / 10;
			}
		}
		
		return status;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int N = input.nextInt();
			if (N<=0 || N>30000) {
				input.close();
				return;
			}
			
			int result = 0;
			for (int i=1; i<=N; i++) {
				if (hasConToSeven(i)) {
					result++;
				}
			}
			System.out.println(result);
		}
		input.close();
	}
}
*/
