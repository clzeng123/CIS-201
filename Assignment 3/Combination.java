


/*
    Name: Changli Zeng
    Course: CIS 201 -Computer Science I
    Secontion:004
    Assignment :3
*/
// the purpose of program is to find the combination of number
public class Combination{
    
    public static void main(String[] args){
    // initiallize all the varibale 
    int m = 4; 
    int n = 12;
    int fact = 1;
    int factN = 1;
    int factM = 1;
    int difference = 0;
    int factC = 1;
    
    // Calulate the factorial of N.
    for(int i = 1 ;i <=n; i++){
    factN = fact*=i;
    }
    fact = 1;
    
    // Calulate the factorial of M.
    for(int i = 1 ;i <=m; i++){
    factM = fact*=i;
    }
    fact = 1;
    
    // Calulate the factorial of difference of n and m.
    difference = n-m;
    for(int i = 1 ;i <=difference; i++){
    factC = fact*=i;
    }
    fact = 1;
    
    // initiallize the denominator the factorial of the product of factorial of M 
    // and N, the denominator to factorial of N;
    int denominator = factM*factC;
    int numerator = factN;

    //print out the result of c(n,m)of the combination of the number 
    System.out.println("The number of ways to pick " + m + " items from " + n 
    + " distinct items is " + (numerator/denominator) + ".");
    }
}

