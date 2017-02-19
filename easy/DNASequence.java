package easy;

import java.util.Scanner;

public class DNASequence {
	
	public static void find(char[] dna, int n) {
		int len = dna.length;
		if (n <= 0) return;
		if (len <= n) {
			for (char c : dna) {
				System.out.print(c);
			}
			System.out.println();
			return;
		}
		
		int index = 0;
		int maxRatio = 0;
		
		for (int i=0; i<=len-n; i++) {
			int currentRatio = 0;
			for (int j=i; j<i+n; j++) {
				if (dna[j] == 'G' || dna[j] == 'C') {
					currentRatio++;
				}
			}
			if (maxRatio < currentRatio) {
				maxRatio = currentRatio;
				index = i;
			}
		}
		
		for (int i=index; i<index+n; i++) {
			System.out.print(dna[i]);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			String str = input.next();
			char[] dna = str.toCharArray();
			int n = input.nextInt();
			
			find(dna, n);
		}
		input.close();
	}
}

/*
package easy;

import java.util.Scanner;

public class Main {
	
	public static void find(char[] dna, int n) {
		int len = dna.length;
		if (n <= 0) return;
		if (len <= n) {
			for (char c : dna) {
				System.out.print(c);
			}
			System.out.println();
			return;
		}
		
		int index = 0;
		int maxRatio = 0;
		
		for (int i=0; i<=len-n; i++) {
			int currentRatio = 0;
			for (int j=i; j<i+n; j++) {
				if (dna[j] == 'G' || dna[j] == 'C') {
					currentRatio++;
				}
			}
			if (maxRatio < currentRatio) {
				maxRatio = currentRatio;
				index = i;
			}
		}
		
		for (int i=index; i<index+n; i++) {
			System.out.print(dna[i]);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			String str = input.next();
			char[] dna = str.toCharArray();
			int n = input.nextInt();
			
			find(dna, n);
		}
		input.close();
	}
}
*/