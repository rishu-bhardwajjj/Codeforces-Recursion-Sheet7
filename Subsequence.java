import java.util.*;
public class Subsequence {

    //------------------------------RETURN AS VOID (JUST PRINTING)-----------------------------------------

    // public static void subseq(String p, String up) {
    //     if (up.isEmpty()) {
    //         System.out.println(p);
    //         return; // Ensure that recursion stops when `up` is empty.
    //     }
    //     char ch = up.charAt(0);
    //     subseq(p + ch, up.substring(1));
    //     subseq(p, up.substring(1));
    // }

    //------------------------------RETURN AS ARRAYLIST<ARRAYLIST<STRING>>-----------------------------------------

    // public static ArrayList<ArrayList<String>> subseq(String p,String up){
    //     ArrayList<ArrayList<String>> ans=new ArrayList<>();
    //     if(up.length()==0){
    //     ArrayList <String> a=new ArrayList<>();
    //     a.add(p);
    //     ans.add(a);
    //     return ans;
    //     }
    //     char ch=up.charAt(0);
    //     ArrayList<ArrayList<String>> l1=subseq(p+ch, up.substring(1));
    //     ArrayList<ArrayList<String>> l2 =subseq(p, up.substring(1));
    //          ans.addAll(l1);
    //          ans.addAll(l2);
    //          return ans;
    // }
    // public static void main(String[] args) {
    //    System.out.println( subseq("", "abc"));
        
    // }





    //------------------------------RETURN AS ARRAYLIST<STRING>-----------------------------------------
    public static ArrayList<String> subseq(String p,String up){
        if(up.length()==0){
        ArrayList <String> a=new ArrayList<>();
        a.add(p);
        return a;
        }
        char ch=up.charAt(0);
        ArrayList<String> l1=subseq(p+ch, up.substring(1));
        ArrayList<String> l2 =subseq(p, up.substring(1));
             l1.addAll(l2);
             return l1;
    }
    public static void main(String[] args) {
       System.out.println( subseq("", "abc"));
        
    }
}