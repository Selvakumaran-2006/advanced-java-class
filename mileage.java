import java.util.Scanner;

public class mileage {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double n= scan.nextDouble();
        double m=scan.nextDouble();
        double o=m-n;
        System.out.print(" the milege is "+o+" " +o*25);
        
    scan.close();
    }
}
