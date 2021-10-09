



/*
    Name: Changli Zeng
    Course: CIS 201 -Computer Science I
    Secontion:004
    Assignment :6
*/
// the purpose of program is print out towers of different heights. 
public class ToweringStrings{
    public static final String bigString = "Hello,_guv'ner,_wot's_about?";
    public static final int HEIGHT = 6;
    public static int next = 0;
    public static void main(String[] args){
    /*printTower(); */
    /*System.out.print(getFirstExtractionIndex()); */
    /*getCharacter(bigString); */
    next = getFirstExtractionIndex();
    printTower();
    }
    
    // get First Extraction Index
    public static int getFirstExtractionIndex(){
       int L = bigString.length();
       int start = (int)Math.sqrt(L);
       return start;
    } 
    
    // print tower
    public static void printTower(){
        // for each constant number lines
        for(int line = 0; line < HEIGHT; line++){
            System.out.print(" ");
            // print some number
            for(int i = 0; i < line+1; i++){
                System.out.print(getCharacter());
                next++;
            }// end inner loop
            System.out.println();
        }//end of outer loop
        for(int j = 0; j <= HEIGHT+1; j++){ 
            System.out.print("@");
        }//end of the loop 
    }
    // get a single character from global string
    public static String getCharacter(){
        return (bigString.substring(next, next+1));
    } 

    /*
    // print 1 add sign
    public static void printAddsign(){
        System.out.print("+");
    }
    
    //print tower with number
    public static void printTower(){
        // for each constant number lines
        for(int line = 1; line < HEIGHT; line++){
            System.out.print(" ");
            // print some number
            for(int i = 1; i < line+1; i++){
                System.out.print(next);
                next++;
            }// end inner loop
            System.out.println();
        }//end of outer loop
        for(int j = 1; j <= HEIGHT+1; j++){ 
            System.out.print("@");
        }//end of the loop 
    }// end of the method
     */
    
    
    
    
    
    
    
    
    
    // draw drawing towers of various heights by changing the class constant
    // use 3  5 7 10 to test the highet
    /*public static void printTower(){
        // for each constant number lines
        for(int line = 1; line < HEIGHT; line++){
            System.out.print(" ");
            // print some + sign
            for(int i = 1; i < line+1; i++){
                System.out.print("+");
            }// end inner loop
            System.out.println();
        }//end of outer loop
        for(int j = 0; j <= HEIGHT+1; j++){ 
            System.out.print("@");
        }//end of the loop 
    }//end of the method */
    
    
    //Draw a tower of + and @ characters
    /*public static void printTower(){
        // for each 5 lines
        for(int line = 1; line < 5; line++){
            // print some + sign
            System.out.print(" ");
            for(int i = 1; i < line+1; i++){
                System.out.print("+");
            }// end of innor loop
            System.out.println();
        }//end of the outer loop
        for(int j = 0; j <= 5+1; j++){ 
            System.out.print("@");
        }//end of loop        
    }// end of the mehtod */
}// end of the class
