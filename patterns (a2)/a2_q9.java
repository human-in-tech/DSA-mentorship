import java.util.Scanner;

public class a2_q9 {
    public static void main(String[] args){

        System.out.print("Enter a number:");
        Scanner tip = new Scanner(System.in);
        int n = tip.nextInt();

        // first half 

        for (int i = 0; i < n; i++){
            
            // space left
            for (int j = 0; j < i; j++ ){
                System.out.print(" ");
            }

            System.out.print("*");

            // mid space
            for (int k = 0; k < 2*(n-i); k++){
                System.out.print(" ");
            }

            System.out.println("*");
        }
        
        // second half 

        for (int i = n; i >= 0; i--){

            // space left
            for (int j = 0; j < i; j++){
                System.out.print(" ");
            }

            if (i!=n) System.out.print("*");  // so as not to get double stars on n th row

            // star + margin  (except star on n cuz it would be printed by sout(*))
            for (int k = 0; k < (2*(n-i)); k++){
                System.out.print(" ");
                
            }

            System.out.println("*");
        }
    tip.close();}
     
    } 

