
import java.util.Scanner;
import static java.lang.Math.random;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hi! Welcome to the Guessing Game.");

        Scanner input = new Scanner(System.in);
        int n;
        n = (int) (random()*10);

        System.out.println("Enter an Integer from 0 to 10.");
        int a = input.nextInt();
        int b=0;
        while(a!=n) {
            System.out.println("Incorrect number entered. Try again.");

            b++;
            if(n>a) {
                System.out.println("Hint: A little higher.");
            }
            else{
                    System.out.println("Hint: A bit lower");

            }
            a = input.nextInt();
        }

        if(b==0){
            System.out.println("Wow! You guessed correctly on the first try. The number was " + n);
        }
        else{
            System.out.println("Great!\nYou required " + b + " times to guess correctly.");
            
        }
    }
}