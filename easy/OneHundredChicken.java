package easy;

import java.util.Scanner;

public class OneHundredChicken {
	
	public static void getResult() {
		for (int i=0; i<25; i++) {
			for (int j=0; j<=33; j++) {
				for (int k=0; k<100; k++) {
					if (i+j+k==100 && 5*i+3*j+k/3==100 && k%3==0) {
						System.out.println(i + " " + j + " " + k);
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int i = input.nextInt();
			getResult();
		}
		
		input.close();
	}
}


/*
package easy;

import java.util.Scanner;

public class Main {
	
	public static void getResult() {
		for (int i=0; i<25; i++) {
			for (int j=0; j<=33; j++) {
				for (int k=0; k<100; k++) {
					if (i+j+k==100 && 5*i+3*j+k/3==100 && k%3==0) {
						System.out.println(i + " " + j + " " + k);
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int i = input.nextInt();
			getResult();
		}
		
		input.close();
	}
}
*/