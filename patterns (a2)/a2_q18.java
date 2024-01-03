import java.util.Scanner;

public class a2_q18 {
    public static void main(String[] args){

        System.out.print("Enter a number:");
        Scanner tip = new Scanner(System.in);
        int n = tip.nextInt();


        // upper triangle
        for (int i = 1; i < n; i++){
            
            // upper line
            if (i == 1){
                for (int j = 0; j < 2*n-1; j++){
                    System.out.print("*");
                }
                

            } else {
                // blank left + starry line
                for (int j = 1; j < i; j++){
                System.out.print(" ");
                } 
                System.out.print("*");

                // blank mid + starry line
                for (int j = 0; j < 2*(n-i)-1; j++){
                System.out.print(" ");
                }
                System.out.print("*");
            }

        System.out.println();
        }

        // mid dot
        for (int i = 1; i < n; i++){
            System.out.print(" ");
        }

        System.out.println("*");

        // lower half
        for (int i = n-1; i > 0; i--){
            
            // blank left
            for (int j = 1; j < i; j++){
                System.out.print(" ");
            }

            for (int j = 0; j < 2*(n-i)+1; j++){
                System.out.print("*");
            }
        
        System.out.println();
        }
        
        tip.close();
    }
    
}
