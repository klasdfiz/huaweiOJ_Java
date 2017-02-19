package easy;

import java.util.Scanner;

public class StringWildcard {
	
	public static boolean check(String pattern, String str) {
		char[] pat = pattern.toCharArray();
		char[] sr = str.toCharArray();
		int patLength = pattern.length();
		int srLength = str.length();
		int patIndex = 0;
		int srIndex = 0;
		
		while (patIndex<patLength && srIndex<srLength) {
			if (pat[patIndex] == sr[srIndex] || pat[patIndex] == '?') {
				patIndex++;
				srIndex++;
			} 
			
			else {
				if (pat[patIndex] != '*') {
					return false;
				}
				if (patIndex+1 < patLength) {
					boolean flag = false;
					int i = srIndex;
					for (; i<srLength; i++) {
						if (sr[i] == pat[patIndex+1]) {
							flag = true;  //find
							break;
						}
					}
					if (flag) { //find
						for (; i<srLength-1; i++) {  //e.g. : *smt sssssmt
							if (sr[i] != sr[i+1]) {
								break;
							}
						}
						srIndex = (sr[i]==sr[i+1]) ? i+1 : i;
					} 
					else { //not find
						return false;
					}
				}
				else {
					return true;
				}
				patIndex++;
				
			}
		}
		
		if (patIndex==patLength && srIndex==srLength) {
			return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			String pattern = input.next();
			String str = input.next();
			
			System.out.println(check(pattern, str));
		}
		input.close();
	}
}

/*
import java.util.Scanner;

public class Main {
	
	public static boolean check(String pattern, String str) {
		char[] pat = pattern.toCharArray();
		char[] sr = str.toCharArray();
		int patLength = pattern.length();
		int srLength = str.length();
		int patIndex = 0;
		int srIndex = 0;
		
		while (patIndex<patLength && srIndex<srLength) {
			if (pat[patIndex] == sr[srIndex] || pat[patIndex] == '?') {
				patIndex++;
				srIndex++;
			} 
			
			else {
				if (pat[patIndex] != '*') {
					return false;
				}
				if (patIndex+1 < patLength) {
					boolean flag = false;
					int i = srIndex;
					for (; i<srLength; i++) {
						if (sr[i] == pat[patIndex+1]) {
							flag = true;  //find
							break;
						}
					}
					if (flag) { //find
						for (; i<srLength-1; i++) {
							if (sr[i] != sr[i+1]) {
								break;
							}
						}
						srIndex = (sr[i]==sr[i+1]) ? i+1 : i;
					} 
					else { //not find
						return false;
					}
				}
				else {
					return true;
				}
				patIndex++;
				
			}
		}
		
		if (patIndex==patLength && srIndex==srLength) {
			return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			String pattern = input.next();
			String str = input.next();
			
			System.out.println(check(pattern, str));
		}
		input.close();
	}
}

*/
