package practice;

import java.util.Scanner;

public class SmartATM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		int j=n-1;
		int count=0;
		while(j>=0) {
			if(m/arr[j]>=1) {
				count+=m/arr[j];
				m%=arr[j];
			}
			if(m==0) break;
			j--;
		}
		System.out.print(count);
	}
}
