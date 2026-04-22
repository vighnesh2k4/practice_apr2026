package practice;

import java.util.Arrays;
import java.util.Scanner;

public class FIndMissRepeatArr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int missing=0;
		int repeated=0;
		for(int i=1;i<=n;i++) {
			if(missing==0 && arr[i-1]!=i) {
				missing=i;
			}
			if(i!=n && arr[i-1]==arr[i]) {
				repeated=arr[i];
			}
		}
		System.out.printf("Missing: %d, Repeated: %d", missing, repeated);
	}
}


