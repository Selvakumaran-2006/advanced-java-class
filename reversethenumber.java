import java.util.Scanner;

public class reversethenumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int reverse=0;
        while (a>0) {
            int digit = a % 10;         
            reverse = reverse * 10 + digit; 
            a = a / 10;                
        }
System.out.println("the reveresed number"+reverse);
sc.close();
        }

    }

