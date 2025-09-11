import java.util.Scanner;

public class methodwithoutparameter {
    static void add(){
        Scanner scan= new Scanner(System.in);
        int n1= scan.nextInt();
        int n2= scan.nextInt();
        System.out.println(n1+n2);
        scan.close();
    }
    public static void main(String[] args) {
        add();
        
        
    }

}
