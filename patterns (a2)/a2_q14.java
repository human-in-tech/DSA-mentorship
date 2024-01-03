import java.util.Scanner;

public class a2_q14 {
    public static void main(String[] args){

        System.out.print("Enter a number:");
        Scanner tip = new Scanner(System.in);
        int n = tip.nextInt();


        for (int z = 1; z <= n; z++){
            System.out.println("x * 1 = " + z + "x");
        }

        
        tip.close();
    }
    
}
