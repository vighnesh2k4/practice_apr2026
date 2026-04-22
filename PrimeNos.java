package practice;

import java.util.Scanner;

public class PrimeNos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		boolean[] isNotPrime = new boolean[n+1];
		for(int i=2;i<=n;i++) {
			 if(isNotPrime[i]) {
				 continue;
			 }else {
				 if(isPrime(i)) {
					 for(int j=i*2;j<=n;j+=i) {
						 isNotPrime[j]=true;
					 }
				 }
			 }
		}
		for(int i=2;i<=n;i++) {
			if(!isNotPrime[i]) {
				System.out.print(i+" ");
			}
		}
		
	}
	public static boolean isPrime(int a) {
		int count=0;
		for(int i=1;i<=a/2;i++) {
			if(a%i==0) count++;
		}
		return count==1;
	}
}
