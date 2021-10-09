


/*
Name: Changli Zeng
Course: CIS 201 -Computer Science I
Secontion:004
Assignment :4
*/
// the program is use to draw mirror
public class Pattern {
    public static final int HEIGHT = 5;
    
    public static void main(String[] args) {
        printLine();
        printTop();
        printBottom();
        printLine();
        printBottom();
        printTop();
        printLine();
    }
    // print some line
    public static void printLine() {
        // print add sign
        System.out.print("+");
        // print some dash
        for (int k = 1; k <= HEIGHT * 2 - 1; k++) {
            System.out.print("-");
        }
        // print add sign
        System.out.println("+");
    }
    
    // print top of diamond
    public static void printTop() {
        for (int i = 1; i <= HEIGHT; i++) {
            System.out.print("|");
            // print some space
            for (int space = HEIGHT; space > i; space--) {
                System.out.print(" ");
            } // end of second loop

            // print some forward slash
            for (int fslash = 1; fslash < i; fslash++) {
                System.out.print("/");
            } // end of third loop
            // print start
            System.out.print("*");
            // print backslash
            for (int bslash = 1; bslash < i; bslash++) {
                System.out.print("\\");
            }// end of fourth loop
            // print some space
            for (int space = HEIGHT; space > i; space--) {
                System.out.print(" ");
            }// end of fifth loop
            // print bar
            System.out.println("|");
        }// end of outer loop
        
    }// end of the method

    // print bottom of diamond
    public static void printBottom() {
        for (int i = 1; i <= HEIGHT; i++) {
            System.out.print("|");
            // print some space
            for (int space = 1; space < i; space++) {
                System.out.print(" ");
            }// end of second loop
            // print backslash
            for (int bslash = HEIGHT; bslash > i; bslash--) {
                System.out.print("\\");
            }// end of third loop
            // print star
            System.out.print("*");

            // print some backslash
            for (int fslash = HEIGHT; fslash > i; fslash--) {
                System.out.print("/");
            }// end of fourth loop
            // print some space
            for (int space = 1; space < i; space++) {
                System.out.print(" ");
            }// end of fifth loop
            // print bar
            System.out.println("|");
        }// end of outer loop
    }// end method
}// end of the class
