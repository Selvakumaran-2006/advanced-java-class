import java.util.Scanner;

public class maxmumarray {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int size= scan.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
            arr[i]=scan.nextInt();
            int max=arr[0];
            for(int i=1;i<size;i++){
                if (max <arr[i])
                max=arr[i]; 
                }
                System.out.println("MAX"+max);
                scan.close();
            }
    
}
