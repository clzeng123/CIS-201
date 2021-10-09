



 /*
 Name: Changli Zeng
 Course: CIS 201 -Computer Science I
 Section: 004
 Assignment :8
 */
 // the purpose of the progam is to ask user for month, date and year, tell you
 // what day of week the date falls on.
 import java.util.*;
 public class DayOfWeek{
     public static void main(String[] args){
        introduction();
        Scanner console = new Scanner(System.in);
        System.out.print("What is the month (1 to 12)? ");
        int month = console.nextInt();
        System.out.print("What is the day (1 to 31)? " );
        int day = console.nextInt();
        System.out.print("What is the year (e.g., 2007)? "); 
        int year = console.nextInt();  
        System.out.println("Your date falls on a " + dayFor(total(month,day,year)));
     }
     
    // tell the user what this program is about.
     public static void introduction(){
        System.out.println("This program will tell you what day of the week");
        System.out.println("a certain date falls on.");
        System.out.println();
     }
    
     // return sum of month
     public static int sumOfMonth(int number){
         int sum = 0;
         for(int i = 1 ; i < number; i++) {
             if(number == 1) {
                return sum;
             }else if(i <= 7 && i % 2 == 1){
                     sum += 31;
             }else if(i >= 8 && i % 2 == 0) {
                      sum += 31;
            }else if(i == 2){
                     sum += 28;
            }else{
                 sum += 30;
            }
         }
        return sum;
    }
    
    
    
    
    
    
    
    
    
    
    // return total of leapday
      public static int leapDay(int month, int year) {
        
        int divisibleby4  = year / 4;
        int divisibleby100 = year / 100;
        int divisibleby400 = year / 400;
        int total =divisibleby4 - divisibleby100 + divisibleby400;
        if(IsleapYear(year) && month <= 2){
            total = total - 1;
        }
        return total;
    } 
    
    // return is year a leapyear
    public static boolean IsleapYear(int year) {
        if(year % 4 == 0 ) {
            return true;
        }else if(year >= 100 && year % 4 == 0 && year % 100 == 0 ) {
            return true;
        }else if(year % 4 == 0 && year % 400 == 0 ) {
            return true;
        }else {
            return false;
        }
    }
    
    // return the total of the day
    public static int total(int month,int day, int year) {
        return ((year - 1) * 365) + leapDay(month,year) + day + sumOfMonth(month);
    }
    
    // Return a string that indicate which day “Sunday”,  “Monday”, “Tuesday”,  
    // “Wednesday”, “Thursday”,  “Friday”, or  “Saturday” 
    // depending on the total number of days that have pass in the the parameter.  
    public static String dayFor(int totalday) {
        String word = "";
        if(totalday % 7 == 1 ) {
            word = "Monday";
            return word;
        }else if(totalday % 7 == 2) {
            word = "Tuesday";
            return word;
        }else if(totalday % 7 == 3) {
            word = "Wendnesday";
            return word;
        }else if(totalday % 7 == 4) {
            word = "Thursday";
            return word;
        }else if(totalday % 7 == 5) {
            word = "Friday";
            return word;
        }else if(totalday % 7 == 6) {
            word = "Saturday";
            return word;
        }else {
            word = "Sunday";
            return word;
        }
    }
}


