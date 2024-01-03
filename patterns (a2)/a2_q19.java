import java.util.Scanner;

public class a2_q19 {
    public static void main(String[] args){

        System.out.print("Enter a number:");
        Scanner tip = new Scanner(System.in);
        int n = tip.nextInt();


        // 1st row
        for (int j = 0; j < n; j++){
            System.out.print("*");
        }

        for (int j = 1; j < n; j++){
            System.out.print(" ");
        }
        
        System.out.println("*");

        // upper figure
        for (int i = 2; i < n; i++){ //i am using rows as i=1,2,3,..,2,1
            for (int j = 1; j < n; j++){
            System.out.print(" ");
            }

            System.out.print("*");

            for (int j = 1; j < n; j++){
            System.out.print(" ");
            }

            System.out.println("*");
        }

        // mid line
        for (int j = 0; j < 2*n; j++){
            System.out.print("*");
        }
        System.out.println();

        // lower figure

        for (int i = 2; i < n; i++){ //i am using rows as i=1,2,3,..,2,1

            System.out.print("*");

            for (int j = 1; j < n-1; j++){
            System.out.print(" ");
            }

            System.out.print("*");

            System.out.println();         
        }

        // nth row

        System.out.print("*");

        for (int j = 1; j < n-1; j++){
            System.out.print(" ");
        }

        for (int j = 0; j <= n; j++){
            System.out.print("*");
        }

        
        
        



        tip.close();
    }
    
}
