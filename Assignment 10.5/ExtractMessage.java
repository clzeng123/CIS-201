


    

/*
    Name: Changli Zeng
    Course: CIS 201 -Computer Science I
    Section: 004
    Assignment :10.5
*/
  // the purpose of this progam is to extract number from file
  // then convert to ascii number then finally convert to ascii 
  // code 
 import java.util.*;
 import java.io.*;
 public class ExtractMessage{
    public static void main(String[] args) throws FileNotFoundException {
    	Scanner filescan= new Scanner(new File(fileFind()));
        int[] input = extractnumber(filescan);
        System.out.println(letter(input));
    }
  
    // extract number from file then putting array
    // then convert number to ascii number 
    public static int[] extractnumber(Scanner filescan) throws FileNotFoundException{
        int size = 0;
        int[] value = new int[200];
        while(filescan.hasNext()) {
            if(filescan.hasNextInt()) {
                value[size] = filescan.nextInt();
                size++;
            }else{
            	filescan.next();
            }
        }
            
        int[] number = new int[size];
        for(int i = 0; i < number.length; i++){
            number[i] = value[i];
        }
            
        for(int i =0; i < number.length; i++){
            number[i] -= number.length;
        }
            
        return number;
    }
        
        
        
        
        
        
        
    // convert the ascii number to ascii code
    public static String letter(int[] values) {
        String letter ="";
        for(int i = 0; i < values.length; i++) {
             char v= (char)values[i];
             letter += v;
        }
        return letter;
    }
    
    // check if the file is exist, if not keep ask user for filename 
    // untile he/she enter the exisist filename
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
    
