package easy;

import java.util.Scanner;

public class EncryptString {
	
	public static void encrypt(char[] key, char[] data, char[] cipher) {
		String encTable = "";
		encTable += key[0];
		
		//init encTable
		for (int i=1; i<key.length; i++) {
			if (encTable.indexOf(key[i]) < 0) {
				encTable += key[i];
			}
		}
		for (int i=0; i<26; i++) {
			char temp = (char)('a' + i);
			if (encTable.indexOf(temp) < 0) {
				encTable += temp;
			}
		}
		
		//init cipher
		for (int i=0; i<data.length; i++) {
			if (Character.isAlphabetic(data[i])) {
				if (Character.isLowerCase(data[i])) {
					cipher[i] = encTable.charAt(data[i]-'a');
				} else {
					char temp = Character.toLowerCase(data[i]);
					cipher[i] = Character.toUpperCase(encTable.charAt(temp-'a'));
				}
			} else {
				cipher[i] = data[i];
			}
		}
		
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			String strKey = input.next();
			String strData = input.next();
			char[] cipher = new char[strData.length()];
			strKey = strKey.toLowerCase();
			
			encrypt(strKey.toCharArray(), strData.toCharArray(), cipher);
			
			for (char c : cipher) {
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
	
	public static void encrypt(char[] key, char[] data, char[] cipher) {
		String encTable = "";
		encTable += key[0];
		
		//init encTable
		for (int i=1; i<key.length; i++) {
			if (encTable.indexOf(key[i]) < 0) {
				encTable += key[i];
			}
		}
		for (int i=0; i<26; i++) {
			char temp = (char)('a' + i);
			if (encTable.indexOf(temp) < 0) {
				encTable += temp;
			}
		}
		
		//init cipher
		for (int i=0; i<data.length; i++) {
			if (Character.isAlphabetic(data[i])) {
				if (Character.isLowerCase(data[i])) {
					cipher[i] = encTable.charAt(data[i]-'a');
				} else {
					char temp = Character.toLowerCase(data[i]);
					cipher[i] = Character.toUpperCase(encTable.charAt(temp-'a'));
				}
			} else {
				cipher[i] = data[i];
			}
		}
		
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			String strKey = input.next();
			String strData = input.next();
			char[] cipher = new char[strData.length()];
			strKey = strKey.toLowerCase();
			
			encrypt(strKey.toCharArray(), strData.toCharArray(), cipher);
			
			for (char c : cipher) {
				System.out.print(c);
			}
			System.out.println();
			
		}
		input.close();
	}
}
 */
