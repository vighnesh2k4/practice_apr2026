package practice;

import java.util.Arrays;
import java.util.Scanner;

public class BaloonProblem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] w = new int[n];
		for(int i =0;i<n;i++) {
			w[i]= sc.nextInt();
		}
		int y = sc.nextInt();
		Arrays.sort(w);
		int sum=0;
		int count=0;
		for(int i=0;i<n;i++) {
			if(sum+w[i]<y) {
				sum+=w[i];
				count++;
			} else {
				break;
			}
		}
		System.out.print(count);
	}
}
