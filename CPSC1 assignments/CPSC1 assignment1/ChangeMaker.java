import java.util.*; 

public class ChangeMaker {
    public static void main(String[] args) {
        // initialize scanner
        Scanner scan = new Scanner(System.in);
        int itemCost, remainingChange, amountOfCoin, currentCoin;

        // initializing array to hold coins for loop
        ArrayList<Integer> coinList = new ArrayList<Integer>();

        // intializing array to hold amount of quarters, dimes, and nickels
        ArrayList<Integer> amountOfCoinsList = new ArrayList<Integer>();

        // add coins
        coinList.add(25);
        coinList.add(10);
        coinList.add(5);

        // asking the user for item cost in cents
        System.out.println("How much is your item (in cents: 1 to 99)?");
        itemCost = scan.nextInt();

        // calculating initial value of change
        remainingChange = 100 - itemCost;

        // looping through coin list to calculate the amount of each coin and update remaining change
        for (int i = 0; i < coinList.size(); i++) {
            currentCoin = coinList.get(i);
            amountOfCoin = remainingChange / currentCoin;
            remainingChange = remainingChange % currentCoin;
            amountOfCoinsList.add(amountOfCoin);
        }

        System.out.printf("%d cents change in coins can be given as:\n\t%d quarters\n\t%d dimes\n\t%d nickels and\n\t%d pennies.", (100 - itemCost), amountOfCoinsList.get(0), amountOfCoinsList.get(1), amountOfCoinsList.get(2), remainingChange); 
    }
} 