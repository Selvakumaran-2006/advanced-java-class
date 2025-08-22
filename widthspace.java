import java.util.Scanner;

public class widthspace {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        System.out.printf("%05d \n%05d", num1,num2);
        scanner.close();
    }
    
}
