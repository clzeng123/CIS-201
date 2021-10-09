



/*
    Name: Changli Zeng
    Course: CIS 201 -Computer Science I
    Section: 004
    Assignment :7
*/
// the purpose of this program is ask user for information about two applicants,then calcuate their overallscore
// to determint which one doing better or they doing equal.
// the out put for example 3 in Assignment#7  is incoreect, the correct output is the
// First applicant overall score  = 135.3571434020996
// Second applicant overall score  = 133.33333206176758
// The first applicant is better qualified.

 import java.util.*;
 public class Admit{

    public static void main(String[] args) {
        introduction();
        Scanner console = new Scanner(System.in);    
        int count = 0;
        double firstperson = number(console, count);
        count++;
        double secondperson = number(console, count);
        System.out.println("First applicant overall score  = " + firstperson);
        System.out.println("Second applicant overall score  = " + secondperson);
        System.out.println(compare(firstperson, secondperson));
    }
    
    // ask user which score they have, by enter 1 for sat scores, or 2 for actscores, 
    // and if input out range report back YOU'RE A CHEATER, and then exit.
    public static double number(Scanner console, int count) {
        if(count == 0){
              System.out.println("Information for the first applicant:");
         }else {
           System.out.println("Information for the second applicant:");
         }
         System.out.print("    do you have 1) SAT scores or 2) ACT scores?" + " ");
         int choice = console.nextInt();
         double score = 0;
         double total = 0;
         if(choice == 1) {
           score = SATscore(console);
           double gpa = GPA(console);
           double maxgpa = maxGPA(console);
           total = Total(score, gpa, maxgpa);
           System.out.println();
         } else if(choice ==2) {
           score = ACTscore(console);
           double gpa = GPA(console);
           double maxgpa = maxGPA(console);
           total = Total(score, gpa, maxgpa);
            System.out.println();
         } else{
           System.out.println("YOU'RE A CHEATER.");
           System.exit(0);
         }
         return total;
     }
 
 
    // ask user for score and if input out range report back YOU'RE A CHEATER, and then exit.
    public static double SATscore(Scanner console){
        double score = 0;
        System.out.print("    SAT math?"+ " ");
        int math = console.nextInt();
        if (math < 200 ) {
            System.out.print("YOU'RE A CHEATER");
            System.exit(0);
        } else if (math > 800) {
            System.out.print("YOU'RE A CHEATER");
            System.exit(0);
        }
        System.out.print("    SAT verbal?" + " ");
        int verbal = console.nextInt();
        if (verbal <200 ) {
           System.out.print("YOU'RE A CHEATER");
            System.exit(0);
        } else if (verbal > 800) {
            System.out.print("YOU'RE A CHEATER");
            System.exit(0);
        } else {
            score = SAT(math, verbal);
        }
        return score;
    }
    
    // ask user for act score, and read user input and calcuate the scores, 
    // if input out range report back YOU'RE A CHEATER, and then exit.
    public static double ACTscore(Scanner console) {
        double score = 0;
        System.out.print("    ACT English?" + " ");
        int English = console.nextInt();
            if (English < 1) {
               System.out.print("YOU'RE A CHEATER");
            System.exit(0);
            } else if (English > 36){
                System.out.print("YOU'RE A CHEATER");
             System.exit(0);
            }
        System.out.print("    ACT math?"+ " ");
        int math = console.nextInt();
        if (math < 1) {
             System.out.print("YOU'RE A CHEATER");
              System.exit(0);
        } else if (math > 36){
             System.out.print("YOU'RE A CHEATER");
              System.exit(0);
        }
        System.out.print("    ACT reading?" + " ");
        int reading = console.nextInt();
        if (reading < 1) {
             System.out.print("YOU'RE A CHEATER");
              System.exit(0);
        } else if (reading > 36){
             System.out.print("YOU'RE A CHEATER");
              System.exit(0);
        }
        
        
        
        System.out.print("    ACT science?" + " ");
        int science = console.nextInt();
        if (science < 1) {
             System.out.print("YOU'RE A CHEATER");
              System.exit(0);
        } else if (science > 36){
             System.out.print("YOU'RE A CHEATER");
              System.exit(0);
        }
        score = ((float)((science + math + reading + English-4 )*100)/ (4 * 35));
        return score;
    }
    
    // calcuate the sat scores
    // number multiply by 100 to change the number that goes from 
    // zero to one into one that goes from zero to 100.
    public static double SAT(int mathGrade, int varbalGrade){
        return((float)((varbalGrade + mathGrade - 400)*100) / (2 * 600));
    }
    
    // telling user what this program is about, then ask user for the type of score they have.
    public static void introduction(){
        System.out.println("This program compares two applicants to");
        System.out.println("determine which one is the stronger candidate");
        System.out.println("Foreach candidate please provide either SAT");
        System.out.println("or ACT scores, plus a weighted GPA.");
        System.out.println();
    }
    
    // read user input gpa and return it, if input out range report back YOU'RE A CHEATER, and then exit.
    public static double GPA(Scanner console) {
        System.out.print("    Overall GPA? ");
        double GPA = console.nextDouble();
        if (GPA > 4.0) {
           System.out.print("YOU'RE A CHEATER");
            System.exit(0);
        } 
        return GPA;
    }
    
     // read user input gpa and return message YOU'RE A CHEATER if input is out range
    public static double maxGPA(Scanner console) {
        System.out.print("    Maximum GPA? ");
        double maxGPA = console.nextDouble();
        if (maxGPA > 4.0) {
            System.out.print("YOU'RE A CHEATER");
             System.exit(0);
        }
        return maxGPA;
    }
    
     // calcuate the gap between 0-100
    public static double calculateGPA(double actual_GPA, double maximum_GPA) {
        return (((actual_GPA)/(maximum_GPA)*100));
    }
    
    
    
    // calcuate the total score by adding satscore and gap and maxgpa
    public static double Total(double sat, double gpa, double maxgpa){
        double total = 0;
        total = (float)sat + calculateGPA(gpa,maxgpa);
        return total;
    }
    
    // compare two applicant's overall score, and report back which one is better qualified
    // or both of them have same overall score report back the The applicants are equally qualified
    public static String compare(double first, double second) {
        if (first < second) {
              return "The second applicant is better qualified.";
         }else if (first == second) {
              return "The applicants are equally qualified.";
        } else {
           return "The first applicant is better qualified.";
            }
        }
 }





























