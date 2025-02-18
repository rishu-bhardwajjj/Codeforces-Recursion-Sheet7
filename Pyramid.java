import java.util.Scanner;

public class Pyramid {
    public static void printPyramid(int rows,int currentRow){
       
        if(currentRow>rows)
        return;
        printSpaces(rows-currentRow);
        printStars(1,currentRow*2-1);
        
        System.out.println();
        printPyramid(rows,currentRow+1);
        

    }

    public static void printSpaces(int space){
        if(space==0) return;
        System.out.print(" ");
        printSpaces(space-1);
    }
    public static void printStars(int star,int rows){
        if(star>rows){
            // System.out.print("*");
            return;
        } 
        System.out.print("*");
        printStars(star+1,rows);
    }


    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        printPyramid(rows,1);
        sc.close();
    }
}
