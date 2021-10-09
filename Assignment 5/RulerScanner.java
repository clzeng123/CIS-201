/*
    Name: Changli Zeng
    Course: CIS 201 -Computer Science I
    Secontion:004
    Assignment :5
*/
// the purpose of program is draw ruler
import java.util.*;
public class RulerScanner{
    public static void main(String[] args){
        Scanner Console = new Scanner(System.in);
        System.out.print("How many inches long will the ruler be?");
        int inches = Console.nextInt();
        drawRuler(inches);
    }
    
    // draw a Ruler
    public static void drawRuler(int inches){
        PrintTop(inches);
        PrintMark(inches);
        PrintBottom(inches);
    }
    // print top edge of ruler
    public static void PrintTop(int inches){
        System.out.print(" ");
        // print underscore
        for(int i = 0; i <= (inches*inches/2-105); i++){
            System.out.print("_");
        }
        System.out.print("_");
        }
    
    
    // print the marks
    public static void PrintMark(int inches){
        System.out.println();
       // for each ¼ inch is marked
        for(int j = 0; j <= inches*2-1; j++){
            System.out.print("|");
            System.out.print("'");
        }
        
        // for each 1/4 inch is marked
        for(int k = 0; k < 1; k++){
            System.out.print("|");
            System.out.print("'");
        }
        System.out.print("|");
    }
    
    // print bottom edge of ruler
    public static void PrintBottom(int inches){
        System.out.println();
        System.out.print("|");
        // print each 1/2 the underscore and number form 0 
         for(int i = 1; i <= 9; i++){
            System.out.print("___");
            System.out.print(i);
            }
        
        // for each 1/2 inch print underscore with number
        for(int k = 10; k <=inches; k++){
            System.out.print("__");
            System.out.print(k);
        }
        System.out.print("_");
        System.out.print("|");
    }
}
