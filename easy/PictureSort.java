package easy;

import java.util.Scanner;

public class PictureSort {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			String str = input.nextLine();
			char[] picture = str.toCharArray();
			int picLength = picture.length;
			for (int i=0; i<picLength; i++) {
				for (int j=i+1; j<picLength; j++) {
					if (picture[i] > picture[j]) {
						char temp = picture[i];
						picture[i] = picture[j];
						picture[j] = temp;
					}
				}
			}
			for (char c : picture) {
				System.out.print(c);
			}
			System.out.println();
		}
		input.close();
	}
}

/* use this code when you submit
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			String str = input.nextLine();
			char[] picture = str.toCharArray();
			int picLength = picture.length;
			for (int i=0; i<picLength; i++) {
				for (int j=i+1; j<picLength; j++) {
					if (picture[i] > picture[j]) {
						char temp = picture[i];
						picture[i] = picture[j];
						picture[j] = temp;
					}
				}
			}
			for (char c : picture) {
				System.out.print(c);
			}
			System.out.println();
		}
		input.close();
	}
}
 */
