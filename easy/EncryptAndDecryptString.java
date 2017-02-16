package easy;

import java.util.Scanner;

public class EncryptAndDecryptString {
	
	//their interface
	public static void Encrypt(char aucPassword[], char aucResult[]) {
		int len = aucPassword.length;
		for (int i=0; i<len; i++) {
			
			if (Character.isDigit(aucPassword[i])) {
				int temp = (aucPassword[i] - '0' + 1) % 10;
				aucResult[i] = (char)(temp + '0');
			} else if (aucPassword[i] == 'Z') {
				aucResult[i] = 'a';
			} else if (aucPassword[i] == 'z') {
				aucResult[i] = 'A';
			} else if (Character.isUpperCase(aucPassword[i])) {
				aucResult[i] = (char)(33 + aucPassword[i]);
			} else if (Character.isLowerCase(aucPassword[i])) {
				aucResult[i] = (char)(aucPassword[i] - 31);
			} else {
				aucResult[i] = aucPassword[i];
			}
		}
	}
	
	public static int unEncrypt(char result[], char password[]) {
		int len = password.length;
		for (int i=0; i<len; i++) {
			
			if (password[i] == '0') {
				result[i] = '9';
			} else if (Character.isDigit(password[i])) {
				result[i] = (char)(password[i] - 1);
			} else if (password[i] == 'a') {
				result[i] = 'Z';
			} else if (password[i] == 'A') {
				result[i] = 'z';
			} else if (Character.isUpperCase(password[i])) {
				result[i] = (char)(password[i] + 31);
			} else if (Character.isLowerCase(password[i])) {
				result[i] = (char)(password[i] - 33);
			} else {
				result[i] = password[i];
			}
		}
		
		return 0;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			String strPlaintext = input.nextLine();
			String strCiphertext = input.nextLine();
			char[] plaintext = strPlaintext.toCharArray();
			char[] ciphertext = strCiphertext.toCharArray();
			char[] encPlaintextResult = new char[plaintext.length];
			char[] decCiphertextResult = new char[ciphertext.length];
			
			Encrypt(plaintext, encPlaintextResult);
			unEncrypt(decCiphertextResult, ciphertext);
			
			for (char c : encPlaintextResult) {
				System.out.print(c);
			}
			System.out.println();
			
			for (char c : decCiphertextResult) {
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
	
	//their interface
	public static void Encrypt(char aucPassword[], char aucResult[]) {
		int len = aucPassword.length;
		for (int i=0; i<len; i++) {
			
			if (Character.isDigit(aucPassword[i])) {
				int temp = (aucPassword[i] - '0' + 1) % 10;
				aucResult[i] = (char)(temp + '0');
			} else if (aucPassword[i] == 'Z') {
				aucResult[i] = 'a';
			} else if (aucPassword[i] == 'z') {
				aucResult[i] = 'A';
			} else if (Character.isUpperCase(aucPassword[i])) {
				aucResult[i] = (char)(33 + aucPassword[i]);
			} else if (Character.isLowerCase(aucPassword[i])) {
				aucResult[i] = (char)(aucPassword[i] - 31);
			} else {
				aucResult[i] = aucPassword[i];
			}
		}
	}
	
	public static int unEncrypt(char result[], char password[]) {
		int len = password.length;
		for (int i=0; i<len; i++) {
			
			if (password[i] == '0') {
				result[i] = '9';
			} else if (Character.isDigit(password[i])) {
				result[i] = (char)(password[i] - 1);
			} else if (password[i] == 'a') {
				result[i] = 'Z';
			} else if (password[i] == 'A') {
				result[i] = 'z';
			} else if (Character.isUpperCase(password[i])) {
				result[i] = (char)(password[i] + 31);
			} else if (Character.isLowerCase(password[i])) {
				result[i] = (char)(password[i] - 33);
			} else {
				result[i] = password[i];
			}
		}
		
		return 0;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			String strPlaintext = input.nextLine();
			String strCiphertext = input.nextLine();
			char[] plaintext = strPlaintext.toCharArray();
			char[] ciphertext = strCiphertext.toCharArray();
			char[] encPlaintextResult = new char[plaintext.length];
			char[] decCiphertextResult = new char[ciphertext.length];
			
			Encrypt(plaintext, encPlaintextResult);
			unEncrypt(decCiphertextResult, ciphertext);
			
			for (char c : encPlaintextResult) {
				System.out.print(c);
			}
			System.out.println();
			
			for (char c : decCiphertextResult) {
				System.out.print(c);
			}
			System.out.println();
			
		}
		
		input.close();
		
	}
}
*/
