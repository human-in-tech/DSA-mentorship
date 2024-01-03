import java.util.Scanner;

public class a2_q6 {
    public static void main(String[] args){

        System.out.print("Enter new number:");
        Scanner tip = new Scanner(System.in);
        int n = tip.nextInt();

        // n = number of lines

        // upper triangle
        for (int i = 0; i < (n/2+1); i++){

            // n/2 star triangle

            for (int j = i; j < n/2+1; j++){
                System.out.print("*");
            }

            // blank triangle 

            for (int k = 0; k < (2*i+1); k++){
                System.out.print(" ");
            }

            // copy of n/2 star triangle
            for (int j = i; j < n/2+1; j++){
                System.out.print("*");
            }
        
        System.out.println();
        }

        // lower triangle

        for (int i = (n/2)-1 ; i >= 0 ; i--){

            // deformed star triangle
            for (int j = i; j<=(n/2); j++){
                System.out.print("*");
            }

            // blank triangle
            for (int k = 0; k < (2*i+1); k++){
                System.out.print(" ");
            }

            // copy of deformed star triangle
            for (int j = i; j<=(n/2); j++){
                System.out.print("*");
            }

        System.out.println();
        }

        tip.close();
    }
}