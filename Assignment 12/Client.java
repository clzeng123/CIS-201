



/*
    Name: Changli Zeng
    Course: CIS 201 -Computer Science I
    Section: 004
    Assignment: 11
 */
 // This program is the client code use to test the fraction class
 public class Client {
     public static void main(String[] args) {
        // test the constructor
        Fraction f2 = new Fraction(8,10);
        System.out.println("f2 = " + f2);
        
        // test the denominator mutaror method and accessor method
        f2.setDemonator(12);
        System.out.println(f2.getdenominator());
        
        //// test the numerator mutaror method and accessor method
        f2.setNumerator(11);
        System.out.println(f2.getnumerator());
        System.out.println("f2 = " + f2);
        
        // test the help method recduce
        Fraction f3 = new Fraction (18, 12);
        System.out.println("f3 = " + f3);
        f3.reduce();
        System.out.println("f3 = " + f3);
    }
 }


