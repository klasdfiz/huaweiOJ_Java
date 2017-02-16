package easy;

import java.util.Scanner;

public class SameIPSubNet {
	
	public static int checkNetSegment(String mask, String ip1, String ip2) {
		
		int result = 0;
		String[] maskStrArray = mask.split("\\.");
		String[] ip1StrArray = ip1.split("\\.");
		String[] ip2StrArray = ip2.split("\\.");
		
		if (maskStrArray.length!=4 || ip1StrArray.length!=4 || ip2StrArray.length!=4) {
			return 1;
		}
		
		for (int i=0; i<4; i++) {
			int maskInt = Integer.parseInt(maskStrArray[i]);
			int ip1Int = Integer.parseInt(ip1StrArray[i]);
			int ip2Int = Integer.parseInt(ip2StrArray[i]);
			
			if (maskInt<0 || maskInt>255 || ip1Int<0 || ip1Int>255 || ip2Int<0 || ip2Int>255) {
				result = 1;
				break;
			}
			
			if ((maskInt&ip1Int) != (maskInt&ip2Int)) {
				result = 2;
				break;
			}
		}
		
		return result;
		
	}
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			String mask = input.next();
			String ip1 = input.next();
			String ip2 = input.next();
			
			System.out.println(checkNetSegment(mask, ip1, ip2));
		}
		
		input.close();
	}
}

/*use this code when you submit
import java.util.Scanner;

public class Main {
	
	public static int checkNetSegment(String mask, String ip1, String ip2) {
		
		int result = 0;
		String[] maskStrArray = mask.split("\\.");
		String[] ip1StrArray = ip1.split("\\.");
		String[] ip2StrArray = ip2.split("\\.");
		
		if (maskStrArray.length!=4 || ip1StrArray.length!=4 || ip2StrArray.length!=4) {
			return 1;
		}
		
		for (int i=0; i<4; i++) {
			int maskInt = Integer.parseInt(maskStrArray[i]);
			int ip1Int = Integer.parseInt(ip1StrArray[i]);
			int ip2Int = Integer.parseInt(ip2StrArray[i]);
			
			if (maskInt<0 || maskInt>255 || ip1Int<0 || ip1Int>255 || ip2Int<0 || ip2Int>255) {
				result = 1;
				break;
			}
			
			if ((maskInt&ip1Int) != (maskInt&ip2Int)) {
				result = 2;
				break;
			}
		}
		
		return result;
		
	}
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			String mask = input.next();
			String ip1 = input.next();
			String ip2 = input.next();
			
			System.out.println(checkNetSegment(mask, ip1, ip2));
		}
		
		input.close();
	}
}
 */
