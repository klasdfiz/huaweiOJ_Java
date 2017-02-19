package easy;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Game24 {
	
	public static int[] num = new int[4];
	
	public static int calExpression(int[] op) {
		int result = 0;
		Stack<Integer> numStack = new Stack<>();
		LinkedList<Integer> opList = new LinkedList<>();
		numStack.push(num[0]);
		
		for (int i=0; i<3; i++) {
			if (op[i] == 2) { // *
				int temp = numStack.peek();
				temp *= num[i+1];
				numStack.pop();
				numStack.push(temp);
			}
			
			else if (op[i] == 3) { // / throws 0 exception
				int temp = numStack.peek();
				temp /= num[i+1];
				numStack.pop();
				numStack.push(temp);
			}
			
			else {
				numStack.push(num[i+1]);
				opList.add(op[i]);
			}
		}
		
		Stack<Integer> numStackReverse = new Stack<>();
		while (!numStack.empty()) {
			numStackReverse.push(numStack.peek());
			numStack.pop();
		}
		while (!opList.isEmpty()) {
			//poll two elements and one operator
			int temp1 = numStackReverse.peek();
			int operator = opList.getFirst();
			numStackReverse.pop();
			opList.removeFirst();
			int temp2 = numStackReverse.peek();
			numStackReverse.pop();
			
			if (operator == 0) {  // +
				numStackReverse.push(temp1 + temp2);
			}
			else if (operator == 1) {  // -
				numStackReverse.push(temp1 - temp2);
			}
		}
		
		result = numStackReverse.peek();
		numStackReverse.pop();
		
		return result;
	}
	
	public static boolean check(){
		int[] op = new int[3];
		for (int i=0; i<4; i++) {
			op[0] = i;
			for (int j=0; j<4; j++) {
				op[1] = j;
				for (int k=0; k<4; k++) {
					op[2] = k;
					if (calExpression(op) == 24) {
						return true;
					}
				}
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			for (int i=0; i<4; i++) {
				num[i] = input.nextInt();
			}
			
			System.out.println(check());
		}
		input.close();
	}
}

/*

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	public static int[] num = new int[4];
	
	public static int calExpression(int[] op) {
		int result = 0;
		Stack<Integer> numStack = new Stack<>();
		LinkedList<Integer> opList = new LinkedList<>();
		numStack.push(num[0]);
		
		for (int i=0; i<3; i++) {
			if (op[i] == 2) { // *
				int temp = numStack.peek();
				temp *= num[i+1];
				numStack.pop();
				numStack.push(temp);
			}
			
			else if (op[i] == 3) { // / throws 0 exception
				int temp = numStack.peek();
				temp /= num[i+1];
				numStack.pop();
				numStack.push(temp);
			}
			
			else {
				numStack.push(num[i+1]);
				opList.add(op[i]);
			}
		}
		
		Stack<Integer> numStackReverse = new Stack<>();
		while (!numStack.empty()) {
			numStackReverse.push(numStack.peek());
			numStack.pop();
		}
		while (!opList.isEmpty()) {
			//poll two elements and one operator
			int temp1 = numStackReverse.peek();
			int operator = opList.getFirst();
			numStackReverse.pop();
			opList.removeFirst();
			int temp2 = numStackReverse.peek();
			numStackReverse.pop();
			
			if (operator == 0) {  // +
				numStackReverse.push(temp1 + temp2);
			}
			else if (operator == 1) {  // -
				numStackReverse.push(temp1 - temp2);
			}
		}
		
		result = numStackReverse.peek();
		numStackReverse.pop();
		
		return result;
	}
	
	public static boolean check(){
		int[] op = new int[3];
		for (int i=0; i<4; i++) {
			op[0] = i;
			for (int j=0; j<4; j++) {
				op[1] = j;
				for (int k=0; k<4; k++) {
					op[2] = k;
					if (calExpression(op) == 24) {
						return true;
					}
				}
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			for (int i=0; i<4; i++) {
				num[i] = input.nextInt();
			}
			
			System.out.println(check());
		}
		input.close();
	}
}


*/
