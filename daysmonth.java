import java.util.Scanner;

public class daysmonth {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int days=scan.nextInt();
        int years = days / 365;
        days = days % 365;
        int months = days / 30;
        days = days % 30;
        System.out.println("Years: " + years);
        System.out.println("Months: " + months);
        System.out.println("Days: " + days);
        
        scan.close();
        
    }
}
