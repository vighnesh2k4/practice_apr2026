package practice;

import java.util.Scanner;

public class MoveAllZerostoEnd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		int i=0;
		int j = size-1;
		for(int k =0; k<size; k++) {
			int temp = sc.nextInt();
			if(temp==0) {
				arr[j]=temp;
				j--;
			} else {
				arr[i]=temp;
				i++;
			}
		}
		for(int k=0;k<size;k++) {
			System.out.print(arr[k]+" ");
		}
	}
}
