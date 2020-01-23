/* Lab 2 Exersice 1
** David Girard
** CS 161 winter 2020
** 1/22/20
** Floating-number program that determines if a number is postive negative, or zero, and 
    whether the number is small (<1) or large > 1,000,000.*/

public class Exercise1 {

    public static void main(String[] args) {
        double x = .1;
        if (x > 0 ) {
            System.out.println("positive");
        }
          else if ( x < 0) {
            System.out.println("negative"); 
        }
        else if (x == 0) { 
            System.out.println("zero");
        }    
        if (x > 0 && x < 1) {
            System.out.println("Small");
        }    
        else if ( x > 10000000) {
            System.out.println("Large");
        }
        
       }
}   

    /*positive
    **Small*/

        
    
