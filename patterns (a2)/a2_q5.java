import java.util.Scanner;

public class a2_q5 {
    public static void main(String[] args){

        System.out.print("Enter a number:");
        Scanner tip = new Scanner(System.in);
        int n = tip.nextInt();

        // traversing rows of the upper triangle
        for (int i = 0; i < n/2+1 ; i++){

            // creating (n-1) blank triangle
            for (int j = n/2; j > i ; j--){
                System.out.print(" ");
            }

            // creating the n star triangle
            for (int k = 0 ; k < (2*i+1); k++){
                System.out.print("*");
            }
        System.out.println();
        }


        // traversing rows of the lower triangle
        for (int i = n/2-1 ; i >= 0 ; i--){

            // creating n blank triangle
            for (int j = n/2-1; j >= i ; j--){
                System.out.print(" ");
            }

            // creating the n star downward triangle
            for (int k = 0; k < (2*i+1); k++){
                System.out.print("*");

            }
        System.out.println();
        }
        tip.close();
    }
    
}
