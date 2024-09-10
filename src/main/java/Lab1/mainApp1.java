package Lab1;
/* Comp3111Lex\Lab1\mainApp1.java
Main application for Lab1 exercise */
public class mainApp1 {
    public static void main(String[] args) {
        int b = 2;
        int n = 11;
        int c = 15;
        System.out.println("Program... Starting");
        System.out.println("Good Morning!");
        System.out.println("1 + 1 =" + 2 );
        System.out.println(b+" to power "+n+" = "+ myLibrary.Power(b,n));
        System.out.println(n+"! = " + myLibrary.factorial(n));
        System.out.println(c+"! = " + myLibrary.factorial(c));
        System.out.println("Program ..Ended ...");
    }
}
