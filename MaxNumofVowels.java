package practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MaxNumofVowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int k= sc.nextInt();
		Set<Character> set = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
		int max=0;
		int currentSum=0;
		for(int i=0;i<k;i++) {
			if(set.contains(str.charAt(i))) {
				currentSum++;
			}
			if(i==k-1) {
				max=currentSum;
				for(int j=k;j<str.length();j++) {
					if(set.contains(str.charAt(j-k))){
						currentSum--;
					}
					if(set.contains(str.charAt(j))){
						currentSum++;
					}
					if(currentSum>max) {
						max=currentSum;
					}
				}
			}
		}
		System.out.print(max);
	}
}
