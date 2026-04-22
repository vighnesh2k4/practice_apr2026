package practice;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DiscountCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int amt = sc.nextInt();
		double finalamt = 0;
		if(amt>0 && amt<1000) {
			finalamt = amt*0.95;
		} else if(amt <5000) {
			finalamt = amt*0.90;
		} else if(amt>=5000) {
			finalamt =amt*0.85;
		}
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println(df.format(finalamt));
	}

}
