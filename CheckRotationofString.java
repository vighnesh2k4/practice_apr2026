package practice;

import java.util.Scanner;

public class CheckRotationofString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		System.out.println((s1+s1).contains(s2));
	}
}
