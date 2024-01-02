import java.util.Scanner;

public class a2_q4 {
    public static void main(String[] args){

        System.out.print("Enter a number:");
        
        Scanner tip = new Scanner(System.in);
        int n = tip.nextInt();

        // traversing through each row
        for (int i = 0; i < n ; i++){

            // creating the (n-1) blank triangle
            for (int j = 0; j < i ; j++){
                System.out.print(" ");}

            // creating the n start triangle
            for (int k = n ; k > i ; k--){
                System.out.print("*");
            }
            
        System.out.println();
        }
    tip.close();
    }
    
}
