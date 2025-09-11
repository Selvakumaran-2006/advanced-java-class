import java.util.Scanner;

public class methodwithoutparameterwithreturn {
    static int add(){
        Scanner scan= new Scanner(System.in);
        int n1=scan.nextInt();
        int n2= scan.nextInt();
        return (n1+n2);
        
       
    

    }
    public static void main(String[] args) {
        System.out.println(add());
        
    }
}
