import java.util.Scanner;


public class a2_q3 {
    public static void main(String[] args){

        System.out.print("Enter a number:");
        Scanner tip = new Scanner(System.in);
        int n = tip.nextInt();

        // traversing through each row
        for (int i = 0; i < n; i++){
            // a triangle made of (n-1) spaces
            for (int j = (n-1) ; j > i ; j--){
                System.out.print(" ");
            }
            // the n star triangle
            for (int k = 0 ; k < (i+1) ; k++){
                System.out.print("*");

            }

        System.out.println();
        }

        tip.close();
    }
}
