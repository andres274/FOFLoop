import java.util.Scanner;

public class FactorialLoop {
    public static void main(String args []) {
        int N, factorial=1;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number to find its factorial");
        int number = keyboard.nextInt();
        for (N=1; N<=number; N++) {
            factorial = factorial*N;
        }
        System.out.println(number + "! (factorial) is " + factorial);
    }
}
