import java.util.Scanner;

public class digits {

    public static void func(int n){
        if(n<10){
            System.out.print(n+" ");
            return;
        }
        func(n/10);
        System.out.print(n%10+" ");
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        int t=sc.nextInt();
        
        while(t-->0){
            
            int n=sc.nextInt();
        func(n/10);
        System.out.print(n%10);
        if(t!=0)
        System.out.println();

    }
    sc.close();
}
}