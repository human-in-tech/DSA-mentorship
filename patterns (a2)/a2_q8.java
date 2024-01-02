import java.util.Scanner;

public class a2_q8 {
    public static void main(String[] args){

        System.out.print("Enter a number:");
        Scanner tip = new Scanner(System.in);
        int n = tip.nextInt();

        // traversing each row
        for (int i = 0; i < n; i++){
            
            // creating a downward blank pyramid
            for (int j = n-1; j > i; j--){
                System.out.print(" ");
            }

            System.out.println("*");
            System.out.println();
        }

        tip.close();
    }
    
}
