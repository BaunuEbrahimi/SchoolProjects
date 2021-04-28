import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.Random;

public class CrapsGame {
    static double accountBalance, initialBalance;
    static double bet;
    static final double MIN_BET = 1.00;
    static final double MIN_BALANCE = 50.00;
    static int win = 0, lose = 0, gamesPlayed = 0;

    // ask user if they would like to play
    static void initiate() {
        System.out.print("Do you wish to play a new game (y for yes)? ");
        // count the number of games played
        gamesPlayed++;
        Scanner scan = new Scanner(System.in); 
        String repeat = scan.next();
    // if no, program exits
        if (!(repeat.toLowerCase().charAt(0) == 'y')) {
            System.exit(0);
        }
    }
    // ask for the users initial account balance with JOptionPane and catch exceptions
    static void requestBalance() {
        boolean cont = true;
        while (cont) {
            String response = JOptionPane.showInputDialog("Enter your starting account balance (in dollars):");
            try {
                accountBalance = Double.parseDouble(response);
                // save initial account balance
                initialBalance = accountBalance;
            } catch (NullPointerException e) {
                // catch if the user presses cancel and ask for initial balance again
                System.out.println("Error: The box cannot be empty!\n");
                continue;
            } catch (NumberFormatException e) {
                // catch if the user enters a non numeric value and ask for initial balance again
                System.out.println("Error: You must enter a numeric value in the box!\n");
                continue;
            } 
            // catch if user enters negative balance and ask for inital balance again
            if (accountBalance < 0) {
                System.out.println("Error: You can not have a negative balance!\n");
                continue;
            // if the balance given is less than 50 dollars, ask for inital balance again
            } else if (accountBalance < MIN_BALANCE) {
                System.out.printf("Please enter at least $%.2f for a starting balance\n", MIN_BALANCE);
                continue;
            // accept balance if all conditions are met
            } else {
                System.out.printf("Your account balance is confirmed at:   $%.2f\n", accountBalance);
            }
            cont = false;
        }
    }
    // ask for the users bet and catch exceptions
    static void requestBet() {
        boolean cont = true;
        while (cont) {  
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter your bet: ");
            // if the user enters a non numeric bet ask for bet again
            if(scan.hasNextDouble()) {

                bet = scan.nextDouble();
                // if the user enters a bet higher than initial balance ask for bet again
                if (bet > accountBalance) {
                    System.out.printf("Error: Your bet cannot exceed your balance of $%.2f\n", accountBalance);
                    continue;
                // if the user enters a negative bet ask for bet again
                } else if (bet < 0) {
                    System.out.println("Error: You can not make a negative bet\n");
                    continue;
                // if the user enters a bet less than 1 dollar ask for bet again
                } else if (bet < MIN_BET) {
                    System.out.printf("Error: The minimum bet is $%.2f\n", MIN_BET);
                    continue;
                // accept bet if all conditions are met
                } else {
                    System.out.printf("Your bet is confirmed at:   $%.2f\n", bet);
                }
                cont = false;
            } else {
                System.out.println("Error: You must enter a numeric bet\n");
                continue; 
            }
        } 
    }
    // roll the die
    static int rollDie() {
        return 1 + (int)(6.0 * Math.random());
    }
    // print the die outcome for the 2 dice and their sum (count the roll number)
    static void printRoll(int firstDie, int secondDie, int sumOfDie, int rollCount) {
        System.out.printf("Roll #%d\n", rollCount);
        System.out.println("Their values are:");
        System.out.printf("Dice 1: %d\n", firstDie);
        System.out.printf("Dice 2: %d\n", secondDie);
        System.out.println("Sum: " + sumOfDie);
    }
    // play the game while following official winning/losing rules of craps
    static void play() {
        boolean cont = true;
        int firstDie = rollDie();
        int secondDie = rollDie();
        int sumOfDie = firstDie + secondDie;
        int rollCount = 1;
        int sumOfFirstRoll;

        // first roll (winning/losing rules)
        printRoll(firstDie, secondDie, sumOfDie, rollCount);
        if (sumOfDie == 7 || sumOfDie == 11) {
            cont = false;
            System.out.println("You have won!");
            // count the win each game (if applicable)
            win++;
            accountBalance += bet;
            System.out.printf("Your account balance is now: $%.2f\n", accountBalance);
            // see if user wants to play again
            playAgain();
        } else if (sumOfDie == 2 || sumOfDie == 3 || sumOfDie == 12) {
            cont = false;
            System.out.println("You have lost.");
            // count the loss each game (if applicable)
            lose++;
            accountBalance -= bet;
            System.out.printf("Your account balance is now: $%.2f\n", accountBalance);
            // see if user wants to play again
            playAgain();
        }
        // set the sum of the first roll to the sum of the die for later use
        sumOfFirstRoll = sumOfDie;

        // second roll (winning/losing rules)
        while(cont) {
            firstDie = rollDie();
            secondDie = rollDie();
            sumOfDie = firstDie + secondDie;
            // count the roll number
            rollCount++;

            printRoll(firstDie, secondDie, sumOfDie, rollCount);
            if (sumOfDie == sumOfFirstRoll) {
                cont = false;
                System.out.println("You have won!");
                // count the win each game (if applicable)
                win++;
                accountBalance += bet;
                System.out.printf("Your account balance is now: $%.2f\n", accountBalance);
                // see if user wants to play again
                playAgain();
            } else if (sumOfDie == 7) {
                cont = false;
                System.out.println("You have lost.");
                // count the loss each game (if applicable)
                lose++;
                accountBalance -= bet;
                System.out.printf("Your account balance is now: $%.2f\n", accountBalance);
                // see if user wants to play again
                playAgain();
            }
        }   
    }    
    // see if user wants to play again
    static void playAgain() {
        double decreasedBy = ((initialBalance - accountBalance));
        double increasedBy = ((accountBalance - initialBalance));
        double decreasedPercent = ((decreasedBy/initialBalance) * 100);
        double increasedPercent = ((increasedBy/initialBalance) * 100);

        double percentWon = (((double)win/gamesPlayed) * 100);
        double percentLose = (((double)lose/gamesPlayed) * 100);
        // if account balance reaches 0 give game data and terminate program
        if (accountBalance == 0) {
            System.out.println("\nYou are no longer eligible to play: ");
            System.out.printf("Your ending account balance is: $%.2f\n", accountBalance);
            System.out.printf("Your initial balance has decreased by: $%.2f (%.2f%%)\n", decreasedBy, decreasedPercent);
            System.out.printf("Of the %d games you played, you have won %d (%.2f%%) and lost %d (%.2f%%)\n", gamesPlayed, win, percentWon, lose, percentLose);
            System.out.println("Thank you for playing the Craps Game, play again soon!");
            System.exit(0);
        }
        // if the account balance is greater than 0 ask user if they want to play again
        while (accountBalance > 0) {
            System.out.print("Do you wish to play a new game (y for yes)? ");
            Scanner scan = new Scanner(System.in);
            String repeat = scan.next();
            // if no, give game data and terminate program
            if (!(repeat.toLowerCase().charAt(0) == 'y')){
                System.out.printf("Your ending account balance is: $%.2f\n", accountBalance);
                if (accountBalance > initialBalance) {
                    System.out.printf("Your initial balance has increased by: $%.2f (%.2f%%)\n", increasedBy, increasedPercent);
                } else if (accountBalance < initialBalance) {
                    System.out.printf("Your initial balance has decreased by: $%.2f (%.2f%%)\n", decreasedBy, decreasedPercent);
                }
                System.out.printf("Of the %d games you played, you have won %d (%.2f%%) and lost %d (%.2f%%)\n", gamesPlayed, win, percentWon, lose, percentLose);
                System.out.println("Thank you for playing the Craps Game, play again soon!");
                System.exit(0);
            // if yes, request a new bet and play again
            } else if((repeat.toLowerCase().charAt(0) == 'y')) {
                // count the number of games played
                gamesPlayed++;
                requestBet();
                play();
            } 
        }
    } 

    public static void main(String[] args) {
        System.out.println("\nWelcome to the Craps Game\n");
        
            requestBalance();
            initiate();
            requestBet();
            play();
    
    }
}