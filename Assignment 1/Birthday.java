/*
    Name: Changli Zeng
    Course: CIS 201 -Computer Science I
    Section: 004
    Assignment :1 
*/

import java.util.*;
public class Birthday {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char answerChar;

        do {
             // get the probability that two people share the same Birthday
             // form the user of this program
            double inputProbability = getInputProbability();
            
            //  get the number of the people needed so that the probability
            //  of at least two of them having the same Birthday
            //  is greater than or equal to the inputProbability
            double [] results = calculatePerson(inputProbability);

            // report results
               report(inputProbability, results);

            // see we user wants to run this again for another probability
            System.out.print("\nRun again (yes/no): ");
            String answer = sc.next().toLowerCase();
            answerChar = answer.charAt(0);
        } while (answerChar == 'y');
}

    //Gets the input Probability and checks that it is valid
    public static double getInputProbability() {
        Scanner input = new Scanner(System.in);
        double inputProb;
        do {
            System.out.print("\nEnter a probability - at least two people" +   
                              "share the same birthday: ");
            inputProb = input.nextDouble();
        } while (inputProb <= 0 || inputProb >= 1.0);
        return inputProb;
    }
    
    // calculates the nunber of people needed so that the probability
    // of at least two of them having the same birthday
    // is greater than or equal to the inputProbability
    // also returns that exact probability of two same birthday for
    // the number of people returned
     public static double [] calculatePerson (double inputProb) {
         int numPeople = 0;
         int days = 366;
         double probNoTwoSame = 1;
         while (days > 0) {
             numPeople++;
             days--;
             probNoTwoSame *=  days/365.0;

             // stop if probability that two people have the same
             // birthday exceeds the input probability
                if (1 - probNoTwoSame > inputProb)
                    break;
        }
    double [] result = new double[2];
    result[0] = numPeople;
    result[1] = 1 - probNoTwoSame;
    return result;
   }
    
    // report on the number of people needed and the exact probability
    public static void report(double inputProbability, double [] results){
            int numPersons = (int) results[0];
            double actualProb = results[1];
            System.out.print("\n" + numPersons +
                               " people are needed for the ");
            System.out.println("probability that at least two of them");
            System.out.println("having the same birthday exceeds " +
                               inputProbability + ".");
            System.out.println("\nFor " + numPersons + ", the exact " + 
                                " probability that two or more have the same ");
            System.out.println("birthday is " + actualProb);
    }
}
