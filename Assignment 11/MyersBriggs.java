




/*
    Name: Changli Zeng
    Course: CIS 201 -Computer Science I
    Section: 004
    Assignment :11
*/
  // the purpose of this progam is to read file and calcute the answers 
  // and display the result
 import java.util.*;
 import java.io.*;
 public class MyersBriggs {
     public static void main(String[] args)  throws FileNotFoundException{ 
        //File file = new File(args[0]);
        PrintStream ps = new PrintStream(new File("answers.mb"));
        Scanner fileScanner = new Scanner(new File("answers.txt"));
        BMIT(fileScanner,ps);
     }
     
     // return the file with mb
     public static String filename(String[] args) {
         String file = args[0];
         int name = file.indexOf(".") + 1;
         String newfile = file.substring(0, name) + "mb";    
         return newfile;
     }

     
     // retrun the name counts of a and b and the percenage
     // and the type personality
     public static void BMIT(Scanner filescan,PrintStream ps) {
         while(filescan.hasNextLine()) {
                String line = filescan.nextLine();
                String [] bmit = new String [1];
                Scanner lineScanner = new Scanner(line);
                if(lineScanner.hasNext()){
                    String nextLine = " " +filescan.next();
                    for(int i = 0; i < bmit.length; i++) {
                        bmit [i] = name(line) + dim(nextLine) + 
                                   Percent(nextLine) + personality(nextLine);
                    ps.println(bmit[i]);
                    }
                }
        }
     }
     
     // return the percenages
     public static String Percent(String nextLine) {
        return "[" + dimOnePercent(nextLine) + "%, " 
            + dimTwoPercent(nextLine) + "%, " + dimThreePercent(nextLine) + "%, "
            + dimFourPercent(nextLine) + "%" + "] = ";
     }
     
     
     
     
     
     
     
     
     
     
     
     // return the name 
     public static String name(String line) {
        String name = "";
        if(line.contains(" ")) {
            name = line + ":\n";
        }
        return name;
     }
     
     // return the all four dimension a and b counts
     public static String dim(String nextLine) {
            String [] dim = {dimOneCount(nextLine), dimeTwoCount(nextLine),
                             dimThreeCount(nextLine), dimFourCount(nextLine)};
            String dimension = dim[0] + " " + dim[1] + " " + 
                               dim[2] + " " + dim[3] ;
            return dimension;
     }
     
     // return the percenage of dimension one
     public static int dimOnePercent(String nextLine) {
        char [] dimOne = {nextLine.charAt(1), nextLine.charAt(8), 
                          nextLine.charAt(15), nextLine.charAt(22),
                          nextLine.charAt(29), nextLine.charAt(36),
                          nextLine.charAt(43), nextLine.charAt(50),
                          nextLine.charAt(57), nextLine.charAt(64)};
        int a = 0;
        int b = 0;
        if(nextLine.contains(" ")){
            for(int i = 0; i < dimOne.length; i++) {
                if(dimOne[i] == 'A'){
                    a++;
                }else{
                    b++;
                }
            }
        double value = (1.0*a/(a+b)*100);
        int percent = (int)(value);
        return percent;
        }
        return 0;
     }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
      // return the counts of dimension one
     public static String dimOneCount(String nextLine) {
         char [] dimOne = {nextLine.charAt(1), nextLine.charAt(8), 
                           nextLine.charAt(15), nextLine.charAt(22),
                           nextLine.charAt(29), nextLine.charAt(36),
                           nextLine.charAt(43), nextLine.charAt(50),
                           nextLine.charAt(57), nextLine.charAt(64)};
         int a = 0;
         int b = 0;
         String count = "";
         if(nextLine.contains(" ")){
             for(int i = 0; i < dimOne.length; i++) {
                 if(dimOne[i] == 'A'){
                     a++;
                 }else{
                     b++;
                 }
             }
             count = a + "A-" + b + "B" ;
         }
         return count;
     }
         
     // return the percenage of dimension two
     public static int dimTwoPercent(String nextLine) {
        char [] dimTwo = {nextLine.charAt(2), nextLine.charAt(3), 
                          nextLine.charAt(9), nextLine.charAt(10),
                          nextLine.charAt(16), nextLine.charAt(17),
                          nextLine.charAt(23), nextLine.charAt(24),
                          nextLine.charAt(30), nextLine.charAt(31),
                          nextLine.charAt(37), nextLine.charAt(38),
                          nextLine.charAt(44), nextLine.charAt(45),
                          nextLine.charAt(51), nextLine.charAt(52),
                          nextLine.charAt(58), nextLine.charAt(59),
                          nextLine.charAt(65), nextLine.charAt(66)};
        int a = 0;
        int b = 0;
        if(nextLine.contains(" ")){
            for(int i = 0; i < dimTwo.length; i++) {
                if(dimTwo[i] == 'A'){
                    a++;
                }else{
                    b++;
                }
            }
            double value = (1.0*a/(a+b)*100);
            int percent = (int)(value);
            return percent;

        }
        return 0;
        
     }
     
     
     
     
     
     
     
     
     
     
     
      // return the count of dimension one
     public static String dimeTwoCount(String nextLine) {
            char [] dimTwo = {nextLine.charAt(2), nextLine.charAt(3), 
                              nextLine.charAt(9), nextLine.charAt(10),
                              nextLine.charAt(16), nextLine.charAt(17),
                              nextLine.charAt(23), nextLine.charAt(24),
                              nextLine.charAt(30), nextLine.charAt(31),
                              nextLine.charAt(37), nextLine.charAt(38),
                              nextLine.charAt(44), nextLine.charAt(45),
                              nextLine.charAt(51), nextLine.charAt(52),
                              nextLine.charAt(58), nextLine.charAt(59),
                              nextLine.charAt(65), nextLine.charAt(66)};
            int a = 0;
            int b = 0;
            String count = "";
            if(nextLine.contains(" ")){
                for(int i = 1; i < dimTwo.length; i++) {
                    if(dimTwo[i] == 'A'){
                        a++;
                    }else{
                        b++;
                    }
                }
                count = a + "A-" + b + "B";
            }
        return count;
     }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     // return the percenage of dimension three
     public static int dimThreePercent(String nextLine) {
            char [] dimThree = {nextLine.charAt(4), nextLine.charAt(5), 
                                  nextLine.charAt(11), nextLine.charAt(12),
                                  nextLine.charAt(18), nextLine.charAt(19),
                                  nextLine.charAt(25), nextLine.charAt(26),
                                  nextLine.charAt(32), nextLine.charAt(33),
                                  nextLine.charAt(39), nextLine.charAt(40),
                                  nextLine.charAt(46), nextLine.charAt(47),
                                  nextLine.charAt(53), nextLine.charAt(54),
                                  nextLine.charAt(60), nextLine.charAt(61),
                                  nextLine.charAt(67), nextLine.charAt(68)};
            int a = 0;
            int b = 0;
            if(nextLine.contains(" ")){
                for(int i = 0; i < dimThree.length; i++) {
                    if(dimThree[i] == 'A'){
                        a++;
                    }else{  
                        b++;
                    }
                }
                double value = (1.0*a/(a+b)*100);
                int percent = (int)(value);
                return percent;
            }
        return 0;
     }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
      // return the count of dimension one
     public static String dimThreeCount(String nextLine) {
            char [] dimThree = {nextLine.charAt(4), nextLine.charAt(5), 
                                  nextLine.charAt(11), nextLine.charAt(12),
                                  nextLine.charAt(18), nextLine.charAt(19),
                                  nextLine.charAt(25), nextLine.charAt(26),
                                  nextLine.charAt(32), nextLine.charAt(33),
                                  nextLine.charAt(39), nextLine.charAt(40),
                                  nextLine.charAt(46), nextLine.charAt(47),
                                  nextLine.charAt(53), nextLine.charAt(54),
                                  nextLine.charAt(60), nextLine.charAt(61),
                                  nextLine.charAt(67), nextLine.charAt(68)};
            int a = 0;
            int b = 0;
            String count = "";
            if(nextLine.contains(" ")){
                for(int i = 0; i < dimThree.length; i++) {
                    if(dimThree[i] == 'A'){
                        a++;
                    }else{
                        b++;
                    }
                }
                count = a + "A-" + b + "B";
            }
        return count;
     }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
      // return the percenage of dimension four
     public static int dimFourPercent(String nextLine) {
            char [] dimFour = {nextLine.charAt(6), nextLine.charAt(7), 
                               nextLine.charAt(13), nextLine.charAt(14),
                               nextLine.charAt(20), nextLine.charAt(21),
                               nextLine.charAt(27), nextLine.charAt(28),
                               nextLine.charAt(34), nextLine.charAt(35),
                               nextLine.charAt(41), nextLine.charAt(42),
                               nextLine.charAt(48), nextLine.charAt(49),
                               nextLine.charAt(55), nextLine.charAt(56),
                               nextLine.charAt(62), nextLine.charAt(63),
                               nextLine.charAt(69), nextLine.charAt(70)};
            int a = 0;
            int b = 0;
            if(nextLine.contains(" ")){
                for(int i = 0; i < dimFour.length; i++) {
                    if(dimFour[i] == 'A'){
                        a++;
                    }else{
                        b++;
                    }
                }
            double value = (1.0*a/(a+b)*100);
            int percent = (int)(value);
            return percent;
            }
            return 0;
     }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
      // return the count of dimension one
     public static String dimFourCount(String nextLine) {
         char [] dimFour = {nextLine.charAt(6), nextLine.charAt(7), 
                            nextLine.charAt(13), nextLine.charAt(14),
                            nextLine.charAt(20), nextLine.charAt(21),
                            nextLine.charAt(27), nextLine.charAt(28),
                            nextLine.charAt(34), nextLine.charAt(35),
                            nextLine.charAt(41), nextLine.charAt(42),
                            nextLine.charAt(48), nextLine.charAt(49),
                            nextLine.charAt(55), nextLine.charAt(56),
                            nextLine.charAt(62), nextLine.charAt(63),
                            nextLine.charAt(69), nextLine.charAt(70)};
            int a = 0;
            int b = 0;
            String count = "";
            if(nextLine.contains(" ")){
                for(int i = 0; i < dimFour.length; i++) {
                    if(dimFour[i] == 'A'){
                        a++;
                    }else{
                        b++;
                    }
                }
                count = a + "A-" + b +"B \r\n";
            }
        return count;
     }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     // return the type of personality that match the percenage of a and b
     public static String personality(String nextLine) {
            int [] percents = {dimOnePercent(nextLine), 
                               dimTwoPercent(nextLine),
                               dimThreePercent(nextLine),
                               dimFourPercent(nextLine)};
            String first;
            String second;
            String third;
            String fourth;
            if(percents[0] >= 50) {
                first = "I";
            }else{
                first = "E";
            }if(percents[1] >= 50) {
                second = "S";
            }else{
                second = "N";
            }if(percents[2] >= 50) {
                third = "T";
            }else{
                third = "F";
            }if(percents[3] >= 50) {
                fourth = "J";
            }else{
                fourth = "P";
            }
        return first + second + third + fourth;
    }
 }
