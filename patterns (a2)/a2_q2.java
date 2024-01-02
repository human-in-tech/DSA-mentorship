import java.util.Scanner;

public class a2_q2 {
    public static void main(String[] args){
        System.out.print("Enter number:");
        Scanner tip = new Scanner(System.in);
        int n = tip.nextInt();

        for  (int i=0 ; i < n ; i++){
            for (int j=n; j>i;j--){
                System.out.print("*");
            }
        System.out.println();
        }

    tip.close();
    }
}
