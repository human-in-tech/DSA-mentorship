import java.util.Scanner;

public class a2_q1 {

    public static void main(String[] args) {
        // creating scanner object
        System.out.print("Enter number:");

        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();


        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }                
        System.out.println();   
        }

        obj.close();

    }
}