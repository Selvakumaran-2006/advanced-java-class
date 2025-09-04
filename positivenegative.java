import java.util.Scanner;

public class positivenegative {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        if(n>0) {
            System.out.println("it is positive ");
        } else if(n==0) {
            System.out.println("it is zero ");
            
        } else {
            System.out.println("it is negative");  
        } 
        scan.close();
    }
}
