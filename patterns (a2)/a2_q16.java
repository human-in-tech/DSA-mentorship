import java.util.Scanner;

public class a2_q16 {
    public static void main(String[] args){

        System.out.print("Enter a number:");
        Scanner tip = new Scanner(System.in);
        int n = tip.nextInt();

        for (int i = 1; i <= n; i++){

            // numeric triangle
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }

            // blank space part I
            for (int j = 0; j < 2*(n-i)-1; j++){
                System.out.print(" ");
            }

            // nummeric triangle
            if (i!=n) {
                for (int j = i; j >= 1; j--){
                    System.out.print(j);
                }}
            else {
                for (int j = i-1; j >= 1; j-- ){
                    System.out.print(j);
                }
                }
            
            System.out.println();
            
        }


    

        
        tip.close();
    }
    
}
