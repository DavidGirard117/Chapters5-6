/**
 * Lab 2 Exercise 2
 * David Girard
 * CS 161 winter 2020
 * 1/22/20
 * Program that demonstrates NAND and NOR gates.
 */
public class Exercise2 {
    public static void main(String[] args) {
        int a;
        boolean b;
        double d;

        a = 10;
        b = true;
        d = 3.6;
        if ((b==true) && (d==3.6)) System.out.println("Yep");
        if ((d==4.2) || (a==10)) System.out.println("Yay");
        if ((a==7) ^ (b=true)) System.out.println("success");
        

    }
    
}
/*Yep
Yay
success*/