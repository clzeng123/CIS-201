



/*
    Name: Changli Zeng
    Course: CIS 201 -Computer Science I
    Section: 004
    Assignment :9
*/
// the purpose of this program is let user play RockPaperScissors vs computer.

 import java.util.*;
 public class RockPaperScissors{
    public static void main(String[] args){
        introduction();
        Scanner console = new Scanner(System.in);
        int duels = getDuels(console);
        playManyGames(console,duels);
    }
    
    
    // ask user for weapon and then return it
    public static String getUserWeapon(Scanner console){
        System.out.print("Choose your weapon? ");
        String weapon = console.next();
        weapon = weapon.toUpperCase();
        while(!weapon.equals("R") && !weapon.equals("S") && !weapon.equals("P")) {
            System.out.print("Choose your weapon? ");
            weapon = console.next();
            weapon = weapon.toUpperCase();
        }
        return weapon;
    }
    
    // radome generate the weapon for computer and return it 
    public static String getRandomWeapon() {
        Random rand= new Random();
        int value = rand.nextInt(3) + 1; 
        String choice = "";
        if(value == 1) {
            choice = "R" ;
        }else if(value == 2){
            choice = "P";
        }else if(value == 3){
            choice = "S";
        }
        return  choice;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    // call the getUserWeapon and getRandomWeapon and compare 
    // it if user win,report You win! to the screen,wins 
    // return 1,variable incrementif computer win return 2,
    //  loss increment if comupter and user 
    //  have same weapon,return 3 then tie increment.
    public static int playDuel(Scanner console) {
        String useweapon = getUserWeapon(console);
        String randomweapon = getRandomWeapon();
        System.out.println("I chose the weapon: " + randomweapon);
        if(useweapon.equals("R") && randomweapon.equals("S")) {
            System.out.println("You win!");
            return 1;
        }else if(useweapon.equals("S") && randomweapon.equals("R")) {
            System.out.println("You loss!");
            return 2;
        }else if(useweapon.equals("P") && randomweapon.equals("S")) {
            System.out.println("You loss!");
            return 1;
        }else if(useweapon.equals("S") && randomweapon.equals("P")) {
            System.out.println("You win!");
            return 1;
        }else if(useweapon.equals("P") && randomweapon.equals("R")){
            System.out.println("You win!");
            return 1;
        }else if(useweapon.equals("R") && randomweapon.equals("P")){
            System.out.println("You loss!");
            return 2;
        }else {
            System.out.println("Tie");
            return 3;
        }  
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    


    
    
    
    
    
    
    
    
    
    
    
    // after user enter the duel, pass in the number of duel to this method
    // then tell user which duel is on then call playdul to have user to enter
    // the weapon and computer pick a random weapon, then compare them, report 
    // back  the 1, 2 or 3 to have wins, losses, or ties increment. after the 
    // duels done jump to play again, if user answer y, game restart, or if user
    // answer no, then jump to reportStats method pass wins, losses, or ties increment
    // as parameter to calculate number of Duels, wins,  losses, ties and win rate
    // then report back to the user.
    public static void playManyGames(Scanner console, int value) {
        int totalDuels = 0; 
        int wins = 0; 
        int losses = 0; 
        int ties = 0;
        do {
            for(int i = 1; i <= value; i++) {
                System.out.println("Duel " + i + " :");
                int winner = playDuel(console); 
                if (winner == 1) {
                    wins++;
                } else if (winner == 2) {
                   losses++;
                } else if (winner == 3) {
                    ties++;
                }
                totalDuels ++;
            }
        } while (playAgain(console));
        reportStats(totalDuels, wins, losses,ties);
    } 
    
    // report the overall result of number of Duels, wins,  losses, ties and win rate
    public static void reportStats(int totalDuels, int wins, int losses, int ties) {
        System.out.println("Overall results:");
        System.out.println("totalDuels = " + totalDuels);
        System.out.println("wins = " + wins);
        System.out.println("losses = " + losses);
        System.out.println("ties = " + ties);
        System.out.print("win % = ");
        System.out.printf("%.2f\n",((double)wins/totalDuels)*100);
    } 
    
    // ask user if he/she want to play again enter "y" same as  "y" or "n"same as "N"
    public static boolean playAgain(Scanner console) {
        System.out.print("Do you want to play again? ");
        String answer = console.next();
        if(answer.equals("Y") || answer.equals("y")) {
            return true;
        }else {
            return false;
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    // ask user for how many dual, if enter even number it will ask until enter odd number
    public static int getDuels(Scanner console){
        System.out.print("Best out of how many duels (must be odd)? ");
        int number = console.nextInt();
        while(number % 2 != 1 ) {
            System.out.println("Invalid number of duels.  Type a positive odd number!");
            System.out.print("Best out of how many duels (must be odd)? ");
            number = console.nextInt();
        }
        return number;
    }
    
    // telling user what program is about.
    public static void introduction(){
        System.out.println("This program plays duels of Rock­Paper­Scissors");
        System.out.println("against the computer. You'll type in your guess");
        System.out.println("of (R)ock, (P)aper, or (S)cissors and try to");
        System.out.println("beat the computer as many times as you can.");
        System.out.println();
    }
 }
