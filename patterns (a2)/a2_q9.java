import java.util.Scanner;

public class a2_q9 {
    public static void main(String[] args){

        System.out.print("Enter a number:");
        Scanner tip = new Scanner(System.in);
        int n = tip.nextInt();

        for (int i = 0; i < n ; i++){
            // creating left to right line
            for (int j = 0; j < i; j++){
                System.out.print(" ");
            }
            System.err.print("*");

        // creating right to left line
            for (int j = n-1; j > i; j--){
                System.out.print(" ");
        }

            System.out.println("*");
    }
    tip.close();   
    } 
}
