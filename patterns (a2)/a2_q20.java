import java.util.Scanner;

public class a2_q20 {
    public static void main(String[] args){

        System.out.print("Enter a number:");
        Scanner tip = new Scanner(System.in);
        int n = tip.nextInt();

        // let n be 3, then rows shall be 0,1,2,1,0

        // upper half
        for (int i = 0; i < n-1; i++){
            System.out.print("*");
            }

        for (int j = 0; j < 2*n-3; j++){
            System.out.print(" ");
            }
        
        System.out.println("*");
        

        // mid line
        System.out.print("*");

        for (int j = 0; j < n-2; j++) System.out.print(" ");

        System.out.print("*");

        for (int j = 0; j < n-2; j++) System.out.print(" ");

        // lower hald
        // for (int i = n-2; i >=0; i--){}
        tip.close();
    }
    
}
