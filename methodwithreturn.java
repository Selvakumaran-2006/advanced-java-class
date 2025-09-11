import java.util.Scanner;

public class methodwithreturn {
    static int add(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n1= scan.nextInt();
        int n2=scan.nextInt();
        System.out.println(add(n1, n2));
        scan.close();

    }
    
}

// it is another method 
// public static void main(String[] args) {
  //      Scanner scan=new Scanner(System.in);
    //    int n1= scan.nextInt();
      //  int n2=scan.nextInt();
      //a=add(n1,n2)
        //System.out.println(a);
        //scan.close();

