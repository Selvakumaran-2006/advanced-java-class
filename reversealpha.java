import java.util.Scanner;

public class reversealpha {
    public static void main(String[] args) {
        Scanner letter=new Scanner(System.in);
        char n= letter.next().charAt(0);
        for(char i='Z';i>=n; i++)
        System.out.print(i+"");
        letter.close();
    }
    
}
