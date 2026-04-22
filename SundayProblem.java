package practice;
import java.util.Scanner;

public class SundayProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();
        int days = sc.nextInt();
        int noOfSundays =0;
        if(day.equals("sun")){
            noOfSundays = days/7 +1;
        } else {
            noOfSundays = days/7 ;
        }
        System.out.println(noOfSundays);
    }
}
