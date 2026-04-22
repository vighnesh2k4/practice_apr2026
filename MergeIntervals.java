package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MergeIntervals {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = 2;
		int[][] arr = new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j =0; j<col;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		Arrays.sort(arr, (a,b)->Integer.compare(a[0], b[0]));
		List<List<Integer>> lst = new ArrayList<>();
		int j= 0;
		while(j<row) {
			int start = arr[j][0];
			int end = arr[j][1];
			while(arr[j][0]<=end) {
				end = Math.max(end, arr[j][1]);
				if(j==row-1) {
					j++;
					break;
				}
				j++;
			}
			lst.add(Arrays.asList(start, end));
		}
		System.out.print(lst.toString());
	}
}
