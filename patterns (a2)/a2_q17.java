import java.util.Scanner;

public class a2_q17 {
    public static void main(String[] args){

        System.out.print("Enter a number:");
        Scanner tip = new Scanner(System.in);
        int n = tip.nextInt();

        // upper half
        for (int i = 0; i < n-1; i++){

            for (int j = 0; j < (n-1); j++){
                System.out.print(" ");
            }

            for (int j = 0; j <=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }

        // mid line
        for (int i = 0; i <= 2*n-1; i++){
            System.out.print("*");
        }

        System.out.println();

        // lower half
        for (int i = n-2; i >= 0; i--){

            for (int j = 0; j < (n-1); j++){
                System.out.print(" ");
            }

            for (int j = 0; j <=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
 
        tip.close();
    }
    
}
