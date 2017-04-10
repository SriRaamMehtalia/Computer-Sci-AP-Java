import java.util.*;

public class Blackjack {
	private Dealer theDealer;
	private Player thePlayer;
	private	static Scanner input = new Scanner(System.in);
	private static final int PLAYER_WINS = 1;
	private static final int PUSH = 0;
	private static final int DEALER_WINS = -1;

	public static void main(String... args) throws InterruptedException {
		Blackjack blackjackGame = new Blackjack(100);	
		boolean repeat = true;
		boolean first = true;
		
		do {
			int whoWins = 2;
			if (first) {
				System.out.println("Welcome to BlackJack! You will begin with $100.");
				first = false;
			}

			System.out.println("Please make a bet to begin.");
			
			boolean inputVerified = false;
			boolean notFirst = false;
			 
			do {
				if (notFirst) System.out.println("Invalid input. Try again.");
				while (!input.hasNextInt()) {
					input.next();
				}
				int newBet = input.nextInt();
				inputVerified = (newBet <= blackjackGame.getPlayer().getMoney())
					      && (newBet >= 0);
				if (inputVerified) blackjackGame.getPlayer().makeBet(newBet);
				notFirst = true;
			} while (!inputVerified);	

			blackjackGame.getDealer().initialDeal(blackjackGame.getPlayer());
			boolean continueGame = blackjackGame.beginPlayerLoop(); 

			if (continueGame) {
				blackjackGame.getDealer().getHand().getCard(0).setVisible(true);
				System.out.println(blackjackGame);
				int dealerScore = blackjackGame.getDealer().beginPlaying();
				int playerScore = blackjackGame.getPlayer().getHand().getHandValue();
				whoWins = (dealerScore > 21)? PLAYER_WINS : 
					  (playerScore > dealerScore)? PLAYER_WINS : 
				          (playerScore == dealerScore)? PUSH : 
					  DEALER_WINS;
			} else {
				whoWins = DEALER_WINS;
			}
			
			blackjackGame.getPlayer().addMoney(whoWins * blackjackGame.getPlayer().getBet());

			String response = "";
			switch (whoWins) {
				case PLAYER_WINS:
					System.out.println("Congratz! Would you like to play again? (y/n)");
					response = input.nextLine();
					break;
				case PUSH: 
					System.out.println("Push! Would you like to play again? (y/n)");
					response = input.nextLine();
					break;
				case DEALER_WINS:
					System.out.println("Drat, the dealer wins! Would you like to play again? (y/n)");
					response = input.nextLine();
					break;
			}

			if (response.toLowerCase().equals("n")) {
				repeat = false;
				System.out.println("Thanks for playing!");
			} else {
				blackjackGame.reset();
			}
		} while (repeat);
	}

	public void reset() {
		thePlayer.reset();
		theDealer.reset();
	}

	public Blackjack(int cash) {
		thePlayer = new Player(cash);
		theDealer = new Dealer(); 
	}
	
	/**
	 *      this method does everything from prompting the player to move, going until
	 *      the dealer will has to move. It also handles the bust operation.
	 *	@return boolean     whether or not to continue in the main blackjack method. 
	 */

	public boolean beginPlayerLoop() {
		boolean firstTime = true;
		boolean doubleDown = false;
		breakloop:
		do {	
			String options = "\nHit (h)" + "\nStand (s)";
			if (firstTime) { 
				options += "\nDouble Down (d)\n"; //implement splitting later
				doubleDown = true;
			}

			System.out.println("\nDealer's Hand: " + this.getDealer().getHand());
			System.out.println("Your Hand: " + this.getPlayer().getHand());
			// splitting will go here.
			System.out.println("You have " + thePlayer.getMoney() + " dollars and are betting " + thePlayer.getBet() + " dollars");
			System.out.println("What would you like to do?" + options);
			
			if (firstTime) {
				input.nextLine(); // clearing the scanner.
				firstTime = false;
			}
			String response = input.nextLine();
			switch (response.toLowerCase()){
				case "s": 
					this.getPlayer().getHand().setStanding(true);	
					break breakloop;
				case "h":
					this.getPlayer().getHand().addCard(this.theDealer.dealCard());
					break;
				case "d":
					if (doubleDown) {
						this.getPlayer().getHand().addCard(this.theDealer.dealCard());
						int newBet = this.getPlayer().getBet()*2;
						this.getPlayer().setBet(newBet);
						System.out.println("New bet is " + newBet+".");
					}
					break;
				default:
					System.out.println("Invalid input! Please try again.");
					break;
			}				
		} while (!this.getPlayer().getHand().isStanding() 
			&& !this.getPlayer().getHand().isBusted()); 
		if (thePlayer.getHand().isBusted()) {
			System.out.println(this);
			System.out.println("Sorry, you busted! Better luck next time.");	
			return false;
		} 
		System.out.println("Here!");
		return true;
	}

	public void playerAction(String s) {
		
	}
	
	public Player getPlayer() {
		return this.thePlayer;
	}

	public Dealer getDealer() {
		return this.theDealer;	
	}

	public String toString() {
		return 	"Dealer's Hand: " + this.getDealer().getHand() + "\n" +
			"Your Hand: " + this.getPlayer().getHand() + "\n";
	}
}
