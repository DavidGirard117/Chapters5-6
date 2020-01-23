import java.util.Scanner;

/**
 * Lab 2 Exercise 4
 * David Girard
 * CS 161 winter 2020
 * 1/22/20
 * user inputs a number 0 to 100 and system will determine if it's pass 50 or < or fail < 50.
 */
public class Exercise4 {

    public static void main(final String[] args) {
        final Scanner in = new Scanner(System.in);
        System.out.println("Enter number 0 through 100: ");
        final double number = in.nextDouble();
       
            if ((number < 50) && (number > 0)) {
                System.out.println("fail");
            } else if ((number >=50 ) && (number <= 100)) {
                  System.out.println("pass");
            } else {
                      System.out.println("error");
            }
        }
    }
/* 50.5
** pass */