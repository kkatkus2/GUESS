import java.util.Random;

public class Game {

    private int randomNumber;
    private int tries = 0;
    private int range;
    private String Pname;

    public Game(int range) {
        this.range = range;
        generateRandomNumber();
    }

    private void generateRandomNumber() {
        Random rand = new Random();
        this.randomNumber = rand.nextInt(range) + 1;
    }

    public boolean guess(int guess) {
        tries++;
        if (guess == randomNumber) {
            if (tries > 1) {
                System.out.println("You got the number in " + tries + " tries.");
                return true;
            } else {
                System.out.println("You got the number in " + tries + " try.");
                return true;
            }
        } else if (guess > randomNumber) {
            System.out.println("Too high try again");
            return false;
        } else if (guess < randomNumber) {
            System.out.println("Too low try again ");
            return false;
        }
        return false;

    }

    public void reset() {
        this.tries = 0;
        generateRandomNumber();

    }

}
//1.     	Setup
//2.     	Display opening message
//3.     	Play Game
 //
  //      	3.1   	Display Menu
    //    	3.2   	If option is equal to play then
      //  	3.3               	Enter player name
        //	3.4               	Generate random number
          //                      	3.4.1	Computer generates a number between 1 and 50       	
        	//3.5               	While found equals false do
        	//3.6   	        	        	enter lucky guess from player
        	//3.7               	        	if guess equals random number then
        	//3.8                           	        	set found to true
        	//3.9               	        	else if guess is less than random number then
        	//3.10             	        	        	display a less than message
        	//3.11 	        	        	else
        	//3.12             	        	        	display a more than message
        	//3.13             	        	end if
        	//3.14 	        	end while
        	//3.15             	Display results
        	//3.16 	else
        	//3.17             	quit game
        	//3.18 	end if
//4. 	Display closing message
