import java.util.Scanner;

public class alpha {
    public static void main(String[] args) {
        Scanner letter=new Scanner(System.in);
        char n= letter.next().charAt(0);
        for(char i=n;i<='Z'; i++)
        System.out.print(i+" ");
        letter.close();
    }
    
}
