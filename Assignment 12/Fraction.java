 




/*
    Name: Changli Zeng
    Course: CIS 201 -Computer Science I
    Section: 004
    Assignment: 12
 */
 // this progam is use to find the greate comment denominator then
 // reduce the fraction
 public class Fraction {
    // fields
    private int numerator;
    private int denominator;
    
    // other constructor
    // pass in the value as numerator and denominator
    public Fraction(int newnumerator, int newdeminator) {    
        numerator = newnumerator;
        denominator = newdeminator;
    }
    
    // default constructor
    // construct method for Fraction
    public Fraction() {
        this(0,0);
    }
    
    // mutator method
    // pass in the value set as numerator
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    // mutator method
    // pass in the value set as denominator
    public void setDemonator(int denominator) {
        this.denominator = denominator;
    }
    
    // accessor methods
    // return the numerator of the object that calls this method
    public int getnumerator() {
        return this.numerator;
    }
    
    // accessor methods
    // return the denominator of the object that calls this method
    public int getdenominator() {
        return this.denominator;
    }
    
    // reduce the value of numerator and demonator
    public int reduce() {
        int value = gcd(numerator,denominator);
        numerator = numerator / value;
        denominator = denominator / value;
        return numerator + denominator;
    }
    
    
    
    
    
    
    // find the greate comment denominator
    public int gcd(int a, int b) {
        if(b == 0) {
            return a;
        }else {
            while(b != 0) {
                if(a > b) {
                    a = a-b;
                }else {
                    b = b-a;
                }
            }
        }
        return a;
    }
    
    
    // this method overrrides the object classes to toString method
    // it will return the value of all fields 
    public String toString() {
        return  numerator + "/" + denominator;
    }
 }
