package easy;

import java.util.Scanner;

public class MatrixMultiplication {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int x = input.nextInt();
			int y = input.nextInt();
			int z = input.nextInt();
			if (x<=0 || y<=0 || z<=0) {
				input.close();
				return;
			}
			
			//init matrixs;
			int[][] matrix1 = new int[x][y];
			int[][] matrix2 = new int[y][z];
			int[][] result = new int[x][z];
			for (int i=0; i<x; i++) {
				for (int j=0; j<y; j++) {
					matrix1[i][j] = input.nextInt();
				}
			}
			for (int i=0; i<y; i++) {
				for (int j=0; j<z; j++) {
					matrix2[i][j] = input.nextInt();
				}
			}
			
			//multiplication
			for (int i=0; i<x; i++) {
				for (int j=0; j<z; j++) {
					int temp = 0;
					for (int k=0; k<y; k++) {
						temp += matrix1[i][k] * matrix2[k][j];
					}
					result[i][j] = temp;
				}
			}
			
			//print
			for (int i=0; i<x; i++) {
				System.out.print(result[i][0]);
				for (int j=1; j<z; j++) {
					System.out.print(" " + result[i][j]);
				}
				System.out.println();
			}
		}
		
		input.close();
	}
}

/*
package easy;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int x = input.nextInt();
			int y = input.nextInt();
			int z = input.nextInt();
			if (x<=0 || y<=0 || z<=0) {
				input.close();
				return;
			}
			
			//init matrixs;
			int[][] matrix1 = new int[x][y];
			int[][] matrix2 = new int[y][z];
			int[][] result = new int[x][z];
			for (int i=0; i<x; i++) {
				for (int j=0; j<y; j++) {
					matrix1[i][j] = input.nextInt();
				}
			}
			for (int i=0; i<y; i++) {
				for (int j=0; j<z; j++) {
					matrix2[i][j] = input.nextInt();
				}
			}
			
			//multiplication
			for (int i=0; i<x; i++) {
				for (int j=0; j<z; j++) {
					int temp = 0;
					for (int k=0; k<y; k++) {
						temp += matrix1[i][k] * matrix2[k][j];
					}
					result[i][j] = temp;
				}
			}
			
			//print
			for (int i=0; i<x; i++) {
				System.out.print(result[i][0]);
				for (int j=1; j<z; j++) {
					System.out.print(" " + result[i][j]);
				}
				System.out.println();
			}
		}
		
		input.close();
	}
}
*/
