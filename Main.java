import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Ex1:
        System.out.print("Enter number: ");

        int x = in.nextInt();
        int factorial = 1;
        for(int i=x;i>0;i--)
        {
            factorial *= i;
        }
        System.out.println("The factorial (" + x + ") is: " + factorial);

        System.out.println("---------------------------------------");

        // Ex2:
        for(int i = 1;i <= 100;i++)
        {
            if(i%3==0 && i%5==0)
                System.out.println("FizzBuzz");
             else if (i%3==0)
                System.out.println("Fizz");
             else if (i%5==0)
                System.out.println("Buzz");

            else System.out.println(i);
        }
        System.out.println("---------------------------------------");
        // Ex3:
        System.out.print("Enter the grade: ");
        int g = in.nextInt();
        System.out.println("Grade before the round = " + g);
        if(g%5 == 3) {
            g += 2;
        }
        if(g%5 == 4) {
            g += 1;
        }
        System.out.println("Grade after the round = " + g);
        in.close();
    }
}