


/*
    Name: Changli Zeng
    Course: CIS 201 -Computer Science I
    Secontion:004
    Assignment :2
*/

//  Print the three Rocket figure
public class Rocket{
   
    public static void main(String[] args){
        RocketOne();
        RocketTwo();
        RocketThree();
}
    //Drawing the RocketOne figure with words Rocket ONE on top of figure
    public static void RocketOne(){
        printRocketOne();
        RocketTop();
        RocketBody();
}
    //Drawing the RocketOne figure with words Rocket TWO on top of figure
    public static void RocketTwo(){
        RocketTop();
        printRocketTwo();
        RocketTop();
        RocketBody();
}        
     //Drawing the RocketOne figure with words Rocket THREE on top of figure
    public static void RocketThree(){
        RocketTop();
        printRocketThree();
        RocketTop();
        RocketBody();
        RocketTop();
        
}
    //Drawing the driangle as top of Rocket figure
    public static void RocketTop(){
        Triangle();
}
    //Drawing the body of middle of Rocket
    public static void RocketBody(){
        Line();
        Square();
        Line();
        USinsideSquare();
        Fourline();
        Square();
        Line();
}
    //Print out the name of Rocket One 
    public static void printRocketOne(){
        System.out.println("Rocket ONE");
}
    //Print out the name of Rocket Two
    public static void printRocketTwo(){
        System.out.println("Rocket TWO");
}




    //Print out the name of Rocket Three 
    public static void printRocketThree(){
        System.out.println("Rocket THREE");  
        
}
    // Draw the top of the Triangle of an rocket figure
    public static void Triangle(){
        System.out.println("   /\\");
        System.out.println("  /  \\");
        System.out.println(" /    \\");
    }
    
    // Draw the line for middle of the rocket figure
    public static void Line(){
	    System.out.println("+------+");
}

    // Draw the square of middle of the rocket figure
    public static void Square(){
        System.out.println("|      |");
        System.out.println("|      |");
}
    // Draw the us inside of the square of middle of the rocket figure
    public static void USinsideSquare() {
        System.out.println("|United|");
        System.out.println("|States|");
}
    // Draw the four line of middle of the rocket figure
    public static void Fourline(){
        System.out.println("+------+");
        System.out.println("+------+");
        System.out.println("+------+");
        System.out.println("+------+");
    }
}
