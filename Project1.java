import java.util.*;


public class Project1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        P1Random rng = new P1Random(); 
        boolean game = true;
        boolean menu = true;
        boolean gameOver = false;
        int gameNumber = 1;
        int playerHand = 0;
        int wins = 0;
        int loses = 0;
        int ties = 0;
        System.out.println("START GAME #" + gameNumber);

        while (game) {
            
            int myNumber = rng.nextInt(13) + 1;

            if (myNumber > 1 && myNumber < 10) {
                    System.out.println("Your card is a " + myNumber);
                    playerHand += myNumber;
                } else if (myNumber == 1) {
                    System.out.println("Your card is an ACE!");
                    playerHand += myNumber;
                } else {
                    if (myNumber == 11) {
                        System.out.println("Your card is a JACK!");
                    } else if (myNumber == 12) {
                        System.out.println("Your card is a QUEEN!");
                    } else {
                        System.out.println("Your card is a KING!");
                    }
                    playerHand += 10;
                }

                if (playerHand > 21) {
                    System.out.println("You exceeded 21! You lose.");
                    System.out.println("You're hand is: " + playerHand);
                    System.out.println("");
                    gameOver = true;
                    playerHand = 0;
                    loses++;
                    gameNumber++;
                    gameOver = true;
                    if (gameOver) {
                    System.out.println("START GAME #" + gameNumber);
                    }
                    
                    continue;
                } else if (playerHand == 21) {
                    System.out.println("BLACKJACK! You win!");
                    System.out.println("");
                    gameOver = true;
                    playerHand = 0;
                    wins++;
                    gameNumber++;
                    gameOver = true;
                    if (gameOver) {
                    System.out.println("START GAME #" + gameNumber);
                    }
                    continue;
                }

            
                System.out.println("Your hand is: " + playerHand);      
                System.out.println(""); 
                


                System.out.println("1. Get another card");
                System.out.println("2. Hold hand");
                System.out.println("3. Print statistics");
                System.out.println("4. Exit");
                System.out.println("");

                int choice = input.nextInt();

                if (choice == 1 ) {
                    continue;
                } else if (choice == 2) {
                    int dealerValue = rng.nextInt(11) + 16;
                    System.out.println("Dealer's hand: " + dealerValue);
                    System.out.println("Your hand is: "+ playerHand);
                
                    if (playerHand == dealerValue) {
                        System.out.println("It's a tie! No one wins!");
                        ties++;
                    } else if (playerHand < dealerValue && dealerValue <= 21) {
                        System.out.println("Dealer wins!");
                        loses++;
                    } else if (dealerValue > 21) {
                        System.out.println("You win!");
                        wins++;
                    } else if (playerHand < 21 && playerHand >= dealerValue) {
                        System.out.println("You win!!");
                        wins++;
                    }
                    System.out.println("");
                    gameOver = !gameOver;
                    playerHand = 0;
                } else if (choice == 3) {
                    int winPercentage = (wins/gameNumber)*100;
                    System.out.println("Number of Player wins: " + wins);
                    System.out.println("Number of Dealer wins: " + loses);
                    System.out.println("Number of tie games: " + ties);
                    System.out.println("Total # of games played is: " + gameNumber);
                    System.out.println("Percentage of Player wins: "+ winPercentage);
                    gameNumber--;
                } else if (choice == 4) {
                    game = !game;
                     break;
                } else {
                    System.out.println("Invalid input!");
                    System.out.println("Please enter an integer value between 1 and 4.");
                    gameNumber--;
                }
                gameNumber++;
                if (gameOver) {
                     System.out.println("START GAME #" + gameNumber);
                }
                continue;
        } 
    }
}




