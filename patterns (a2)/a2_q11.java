import java.util.Scanner;

public class a2_q11 {
    public static void main(String[] args){

        System.out.print("Enter a number:");
        Scanner tip = new Scanner(System.in);
        int n = tip.nextInt();

        int number  = 1;

        for (int i = 0; i < n; i++){

            for (int j = 0; j <= i; j++ ){

                System.err.print(number+" ");
                number++;

            }

        System.out.println();

        }
        tip.close();
    }
    
}
