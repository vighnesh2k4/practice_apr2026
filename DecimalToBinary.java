package practice;

import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		while(n>0) {
			sb.append(n%2);
			n=n/2;
		}
		while(sb.length()%4!=0) {
			sb.append(0);
		}
		sb.reverse();
		System.out.println(new String(sb));
		for(int i=0;i<sb.length();i++) {
			if('1'==sb.charAt(i)) {
				sb.setCharAt(i,'0');
			} else {
				sb.setCharAt(i,'1');
			}
		}
		System.out.println(new String(sb));
		int num=0;
		int j=0;
		for(int i=sb.length()-1;i>=0;i--) {
			int temp = Integer.parseInt(sb.substring(i,i+1));
			num+=temp*Math.pow(2, j++);
			if(j==4) j=0;
		}
		System.out.println(num);
	}
}
