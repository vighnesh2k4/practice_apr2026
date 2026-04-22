package practice;

import java.util.Scanner;

public class MaxSubarraySum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int maxSum=0;
		int curSum=0;
		for(int i=0;i<size;i++) {
			if(curSum+arr[i]>arr[i]) {
				curSum+=arr[i];
			} else {
				curSum=arr[i];
			}
			if(curSum>maxSum) {
				maxSum=curSum;
			}
		}
		System.out.println(maxSum);
	}
}
