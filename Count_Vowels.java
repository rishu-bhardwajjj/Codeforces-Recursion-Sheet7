import java.util.Scanner;

public class Count_Vowels {
     String v="AEIOUaeiou";
     int cnt=0;
    public  int func(String s,int i){
        if(i>s.length()-1)
        return cnt;
        if(v.indexOf(s.charAt(i))!=-1)
        cnt++;
        return func(s, i+1);
        
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Count_Vowels ob=new Count_Vowels();
        String s=sc.nextLine();
        System.out.println(ob.func(s, 0));

        sc.close();
    }
    
}
