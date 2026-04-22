package practice;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CapitalPlacingInWord {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String word = sc.nextLine();
		boolean correct=false;
		if(Pattern.matches("[A-Z]+",word) || Pattern.matches("[a-z]+",word) ||
				Pattern.matches("[A-Z]{1}[a-z]+",word)) {
			correct =true;
		}
		if(correct) {
			System.out.print("Correct");
		}else {
			System.out.print("Wrong");
		}
	}
}
