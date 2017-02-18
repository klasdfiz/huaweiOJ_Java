package easy;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class FindFirstChar {
	
	public static char find(char[] ch) {
		LinkedHashMap<Character, Integer> charMap = new LinkedHashMap<> ();
		for (char c : ch) {
			if (charMap.get(c) == null) {
				charMap.put(c, 1);
			} else {
				int temp = charMap.get(c);
				temp++;
				charMap.put(c, temp);
			}
		}
		
		Iterator it = charMap.entrySet().iterator();
		char result = '.';
		while (it.hasNext()) {
			Entry entry = (Entry) it.next();
			if ((int) entry.getValue() == 1) {
				result = (char) entry.getKey();
				break;
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			String str = input.next();
			System.out.println(find(str.toCharArray()));
		}
		input.close();
	}
}


/*
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class Main {
	
	public static char find(char[] ch) {
		LinkedHashMap<Character, Integer> charMap = new LinkedHashMap<> ();
		for (char c : ch) {
			if (charMap.get(c) == null) {
				charMap.put(c, 1);
			} else {
				int temp = charMap.get(c);
				temp++;
				charMap.put(c, temp);
			}
		}
		
		Iterator it = charMap.entrySet().iterator();
		char result = '.';
		while (it.hasNext()) {
			Entry entry = (Entry) it.next();
			if ((int) entry.getValue() == 1) {
				result = (char) entry.getKey();
				break;
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			String str = input.next();
			System.out.println(find(str.toCharArray()));
		}
		input.close();
	}
}
*/