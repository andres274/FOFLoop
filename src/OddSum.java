import java.util.Scanner;

public class OddSum {
    public static void main(String [] args) {
        int n, i, sum=0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter an odd number");
        int number = keyboard.nextInt();

        for (i=0; i<=number; i++) {
            if ((i%2) == 1) {
                sum +=i;
            }
        }
        System.out.print("The sum of the odd numbers up to " + number + " is " + sum);
    }
}