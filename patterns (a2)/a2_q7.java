import java.util.Scanner;

public class a2_q7 {
    public static void main(String[] args){

        System.out.print("Enter a number:");
        Scanner tip = new Scanner(System.in);
        int n = tip.nextInt();

        for (int i = 0; i < n ; i++){
            // creating n-1 blank pyramid
            for (int j = 0; j < i; j++){
                System.out.print(" ");
            }
            System.err.println("*");
        }
        tip.close();
    }
    
}
