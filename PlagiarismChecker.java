package practice;

import java.util.Scanner;

public class PlagiarismChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		int longest =0;
		int temp=Integer.MIN_VALUE;
		int count=0;
		for(int j=0;j<s2.length();j++) {
			if(s1.indexOf(s2.charAt(j))>temp) {
				count++;
				temp=s1.indexOf(s2.charAt(j));
			} else {
				if(count>longest) longest = count;
				count=0;
			}
		}
		System.out.print(count);	
	}

}
