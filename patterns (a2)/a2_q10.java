import java.util.Scanner;

public class a2_q10 {

    public static void main(String[] args){

        System.out.print("Enter number: ");
        
        Scanner tip = new Scanner(System.in);
        int n = tip.nextInt();


        // upper half of symmetry
        for (int i = 0; i < n; i++){

            // blank space left
            for (int j = n-1; j > i; j--){
                System.out.print(" ");}

            System.out.print("*");
            
            // blank space mid
            for (int k = 0; k < 2*i-1; k++){
                System.out.print(" ");}

            if (i==0) System.out.println("");
            else System.out.println("*");
            }
        
        // lower half of symmetry (the ranges should be same but reversed)

        for (int i = n-2; i >= 0; i--){

            // blank space left
            for (int j = n-1; j > i; j--){
                System.out.print(" ");}

            System.out.print("*");
            
            // blank space mid
            for (int k = 0; k < 2*i-1; k++){
                System.out.print(" ");}

            if (i==0) System.out.println("");
            else System.out.println("*");
            }
        
        tip.close();
        }
    }
    

