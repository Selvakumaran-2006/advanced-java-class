import java.util.Scanner;

public class group {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        System.out.print("enter gender: ");
        int gendercode=scan.nextInt();
        System.out.print("enter age");
        int age= scan.nextInt();
        
        if (gendercode==1 && age<=25) {
            System.out.print("group1");
            
        } else if (gendercode==2 && age<=25) {
            System.out.print("group2");
            
        } 
        scan.close();

    }
}
