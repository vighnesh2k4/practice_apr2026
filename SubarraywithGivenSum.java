package practice;

import java.util.Scanner;

public class SubarraywithGivenSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int sum =sc.nextInt();
		int curSum=0;
		int stIndex=0;
		int end=size;
		for(int i=stIndex;i<size;i++) {
			curSum+=arr[i];
			while(curSum>sum) {
				curSum-=arr[stIndex];
				stIndex++;
			}
			if(curSum==sum) {
				end=i+1;
				break;
			}
		}
		for(int i=stIndex;i<end;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
