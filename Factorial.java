import java.util.Scanner;

public class Factorial {
   public static long  func(long n){
    if(n==1||n==00) return 1;
    return n*func(n-1);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        System.out.println(func(n));
        sc.close();
    }
    
}
