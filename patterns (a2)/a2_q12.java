import java.util.Scanner;

public class a2_q12 {
    public static void main(String[] args){

        System.out.print("Enter a number:");
        Scanner tip = new Scanner(System.in);
        int n = tip.nextInt();

        int number = 0; // number to be displayed
        int next = 1;  // value after number

        for (int i = 0; i < n; i++){

            for (int j = 0; j <= i; j++){
        
                System.out.print(number+" ");
  
                int previous_value = number;
                number += next;
                next = previous_value;


            }
        System.err.println();
        }
        
        tip.close();
    }
    
}
