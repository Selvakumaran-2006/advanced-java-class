import java.util.Scanner;

public class CHIOCE {
    
    public static void main(String[] args) {
        Scanner bank= new Scanner(System.in);
        int chioce= bank.nextInt();
        switch (chioce) {
            case 1:System.out.println("WITHDRAW");break;
            case 2:System.out.println("DEPOSIT");break;
            case 3:System.out.println("BALANCE CHECK"); break;
            default:System.out.println("Enter the number between 1-3");
                
        }
            bank.close();
    }
    
}
