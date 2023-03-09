package numpackage;
import java.util.Scanner;

public class SumNatural {
    public static void main(String args[]) {
        int i, sum = 0;
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        for(i = 1; i <= num; i++) {
            sum += i;
        }

        System.out.println("Sum of first "+num+" natural numbers is: "+sum);
    }
}