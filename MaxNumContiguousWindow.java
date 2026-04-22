package practice;

import java.util.Arrays;
import java.util.Scanner;

public class MaxNumContiguousWindow {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		int i=0;
		int [] newarr = new int[n-k+1];
		while(i<n-k+1) {
			int max=0;
			for(int j=i;j<i+k;j++) {
				if(arr[j]>max) max=arr[j];
			}
			newarr[i]=max;
			i++;
		}
		System.out.println(Arrays.toString(newarr));
	}
}
