import java.util.Scanner;

public class integer {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        float inputvalue= scanner.nextFloat();
        System.out.println(Math.round(inputvalue));
        scanner.close();
    }
    
}
