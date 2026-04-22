package practice;

import java.util.Scanner;

public class MaxNetEnergy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int max=Integer.MIN_VALUE;
		int currentSum=0;
		for(int i=0;i<n;i++) {
			if(currentSum+arr[i]<arr[i]) {
				currentSum=0;
			}
			currentSum+=arr[i];
			if(currentSum>max) {
				max=currentSum;
			}
		}
		System.out.print(max);
	}
}
