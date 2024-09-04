import java.util.*;

public class guessnum {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("welcome to the number guessing Game!");

        int minRange = 1;
        int maxrange = 100;
        int attempts = 5;
        int score = 0;

        boolean playagain = true;

        while(playagain)
        {
            int randomnum = random.nextInt(maxrange - minRange +1)+minRange;
            int remainingattempts = attempts;

            System.out.println("\nyou can selected a number between " + minRange + " and" +maxrange+".");
            System.out.println("you have " +remainingattempts+ " chance to guess it.");

            int guess;
            boolean guessedcorrectly = false;

            while(remainingattempts >0 && !guessedcorrectly){
                System.out.println("Enter your guess number: ");
                guess = Scanner.nextInt();

                if (guess == randomnum ) {
                    System.out.println("Congratulations! you guessed the number correctly");
                    guessedcorrectly = true;
                    score += remainingattempts;
                }else if(guess < randomnum){
                    System.out.println("too low! try again.");
                }else{
                    System.out.println("too high! try again.");
                }

                remainingattempts--;
            }
            if(!guessedcorrectly){
                System.out.println("sorry, you've run out of attempts. the number was:" +randomnum);
            }

            System.out.println("your score: "+score);

            System.out.println("Do you want to play again? (yes/no) ;");
            String playchoice = Scanner.next();

            playagain = playchoice.equalsIgnoreCase("yes");
        }
        System.out.println("thanks for playing!");
        Scanner.close();
    }
}
