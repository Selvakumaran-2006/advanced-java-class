import java.util.Scanner;

public class minimummaximum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int m= scan.nextInt();
        if (n<m){
            System.out.println("the maximum numberis"+m);  
            System.out.println("the minimum number is "+n);
        }else{
            System.out.println("the minimum number is "+n);
            System.out.println("the maximum number is "+m);
        }
        scan.close();

        }
    }

