package practice;

import java.util.Scanner;

public class RotateMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] tarr = new int[row][col];
		for(int i = 0; i<row; i++) {
			for(int j=0; j<col;j++) {
				tarr[i][j] = sc.nextInt();
			}
		}
		int[][] newarr = new int[row][col];
		int k=2;
		for(int i = 0; i<row; i++) {
			for(int j=0; j<col;j++) {
				newarr[j][k] = tarr[i][j];
			}
			k--;
		}
		for(int i = 0; i<row; i++) {
			for(int j=0; j<col;j++) {
				System.out.print(newarr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
