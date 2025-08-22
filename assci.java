import java.util.Scanner;

public class assci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char character= sc.next().charAt(0);
        int ASCIIvalue= character;
        System.out.println(character+":"+ASCIIvalue);
        sc.close();

    }
    
}
