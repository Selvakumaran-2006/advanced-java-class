import java.util.Scanner;

public class hexa {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.next();
        long decimalValue = Long.parseLong(input.substring(2), 16);
        System.out.println(decimalValue);
        scanner.close();


    }
    
}
