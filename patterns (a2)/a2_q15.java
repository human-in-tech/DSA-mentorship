import java.util.Scanner;

public class a2_q15 {
    public static void main(String[] args){

        System.out.print("Enter a number:");
        Scanner tip = new Scanner(System.in);
        int n = tip.nextInt();

        // upper half
        for (int i = 1; i <= n; i++){

            for (int j = n; j > i; j--){
                System.out.print(" ");
            }

            for (int j = i; j <= 2*i-1; j++){
                System.out.print(j);
            }

            for (int j = 2*i-2; j >= i; j--){
                System.out.print(j);
            }

            System.out.println();
        }


        // lower half

        for (int i = n-1; i > 0; i--){
            
            for (int j = n; j > i; j--){
                System.out.print(" ");
            }

            for (int j = i; j <= 2*i-1; j++){
                System.out.print(j);
            }

            for (int j = 2*i-2; j >= i; j--){
                System.out.print(j);
            }

            System.out.println();
            
        }
        
        tip.close();
    }
    
}
