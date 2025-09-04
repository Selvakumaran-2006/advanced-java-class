import java.util.Scanner;

public class value {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int n=scan.nextInt();
        if (n%3==0||n%5==0) {
            System.out.println("yes");
            
        } else {
            System.out.println("no");
            
        }
        scan.close();
    }
}
