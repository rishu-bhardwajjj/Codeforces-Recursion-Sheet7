import java.util.Scanner;

public class Print_even_indices {
    public static void func(int a[],int b){
        if(b>a.length-1)
        return ;
        func(a, b+2);
        System.out.print(a[b]+" ");
        



    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        func(a, 0);
        sc.close();
        
    }
}