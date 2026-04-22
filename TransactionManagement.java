package practice;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
public class TransactionManagement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<String> transbetween = new HashSet<>();
		int total = sc.nextInt();
		int prevtime=-1;
		for(int i=0; i<total; i++) {
			String sender = sc.next();
			String receiver = sc.next();
			int timeStamp = sc.nextInt();
			int amt = sc.nextInt();
			String key = sender+"-"+receiver;
			if(transbetween.contains(key)) {
				System.out.println("duplicate");
				return;
			}
			if(prevtime!=-1 && timeStamp-prevtime>60) {
				System.out.println("Fraud");
				return;
			}
			prevtime=timeStamp;
			transbetween.add(key);
		}
		System.out.println("Valid");

	}

}
