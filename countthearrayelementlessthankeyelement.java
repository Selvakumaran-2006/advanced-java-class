import java.util.Scanner;

public class countthearrayelementlessthankeyelement {
    static void count(int m,int []a){
        int count=0,s=a.length;
        for(int i=0;i<s;i++)
        
            if (a[i]<m) {
                count++;
            }
            System.out.println(count);
        

    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int size=scan.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        arr[i]=scan.nextInt();
        int mark=scan.nextInt();
        count(mark,arr);
        scan.close();
    }
}
   