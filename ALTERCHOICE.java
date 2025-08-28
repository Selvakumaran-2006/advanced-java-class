import java.util.Scanner;

public class ALTERCHOICE {
    public static void main(String[] args) {
        Scanner alter= new Scanner(System.in);
        char choice= alter.next().charAt(0);
        switch (choice) {
            case 'A':System.out.println("WITHDRAW"); break;
            case 'B':System.out.println("Deposit"); break;
            case 'C':System.out.println("CHECK BALANCE"); break;
            default:System.out.println("Enter the letterbetween A-C");
                
        }
        alter.close();
    }
    
}
