



/*
 Name: Changli Zeng
 Course: CIS 201 -Computer Science I
 Section: 004
 Assignment :10
 */
 // the purpose of this program is first check if the user enter the
 // correct file name if user dont enter the exist file name, it will
 // keep asking until user enter the correct file name, then after user
 // enter the correct name, then read the file after that read the input 
 // file, line by line, strip out comments, and writethe uncommented code
 // to an output file.
 import java.io.*;
 import java.util.*;
 
 public class CommentRemove{
    public static void main(String[] args)
        throws FileNotFoundException {
        Scanner filescan= new Scanner(new File(fileFind()));
        PrintStream PS = new PrintStream(new File("Program.java.cln"));
        removeComment(PS, filescan);
    }
    
    // Thie method Reading input while in a line comment 
    // Reading input while in a multiline comment 
    // Reading input while not in a comment at all
    // first it read throught the whole file and then the line 
    // then the each token to strip out the comment then copy 
    // the uncommented part to new file
    public static void removeComment(PrintStream ps, Scanner filescan){
        boolean inLineComment = false;
        boolean inMultiLineComment = false;
        while(filescan.hasNext()){
            while(filescan.hasNextLine()){
                String line = filescan.nextLine();
                Scanner linescan = new Scanner(line);
                while(linescan.hasNext()){
                    String word = linescan.next();
                    if(word.startsWith("/*")){
                        while(!word.endsWith("*/")){
                            inMultiLineComment = true;
                            if(linescan.hasNext()){
                                word = linescan.next();
                            }else{
                                linescan = new Scanner(filescan.nextLine());
                            }
                        }
                    }else if(word.startsWith("//")){
                        inLineComment = true;
                        linescan = new Scanner(filescan.nextLine());
                    }else{
                        ps.print(word + " ");
                    }
                }
                ps.println();
            }
        }
    }
    
    
    // kepp promp the user for file name. until the file name match the file 
    // that was in the Computer
    public static String fileFind(){
        File file;
        String filename;
        do {
            System.out.print("Enter the input file name: ");
            Scanner console = new Scanner(System.in);
            filename = console.nextLine();
            file = new File(filename);
            if (!file.exists())
                System.out.println("does not exist. " + filename);
        } while(!file.exists());
        return filename;
    }
 }

 
 
