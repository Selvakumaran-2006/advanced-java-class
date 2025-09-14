import java.util.Scanner;

public class Armstrongnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int Orginalvalue=n;
        int digits=String.valueOf(n).length();
        int sum=0;
        while (n>0) {
            int digit=n%10;
            sum+=Math.pow(digit, digits);
            n=n/10; 
        }if (sum==Orginalvalue) {
            System.out.println("It is Arstrong number");
            
        } else {
            System.out.println("It is not a Armstrong number");
            
        }
        sc.close();
    }
}
