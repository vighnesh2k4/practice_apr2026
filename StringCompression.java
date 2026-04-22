package practice;

import java.util.Scanner;

public class StringCompression {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String str = sc.nextLine();
		char c = str.charAt(0);
		int count = 1;
		for(int i=1;i<str.length();i++) {
			if(c==str.charAt(i)) {
				count++;
			} else {
				sb.append(c);
				sb.append(count);
				count=1;
				c=str.charAt(i);
			}
		}
		sb.append(c);
		sb.append(count);
		System.out.println(sb);
	}
}
