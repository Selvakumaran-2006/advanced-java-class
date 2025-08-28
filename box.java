import java.util.Scanner;

public class box {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int n=scan.nextInt();
        for( int row=1;row<=n;row++){
            for(int col=1;col<=n;col++)
            {
                if (row==1||col==1||row==n||col==n) {
                    System.out.print("*");
    
                } else {
                    System.out.print(" ");
                    
                }
                System.out.println();
            }

        }
      scan.close();
    }
  
}
