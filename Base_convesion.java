import java.util.*;
public class Base_convesion {
    public static void func(int n){
        if(n==1){
        System.out.print(n);
        return;}
        func(n/2);
        System.out.print(n%2);

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){ 
            int n=sc.nextInt();
            func(n);
            if(t!=0)
            System.out.println();
        }

        sc.close();
    }
}

