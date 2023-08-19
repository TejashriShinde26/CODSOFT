import java.util.Scanner;
import java.util.Random;

public class Number 
{
    public static void main(String args[])
    {
        Random random=new Random();
        Scanner sc=new Scanner(System.in);
        int round=0;
        int score=0;
        boolean playagain=true;

        while(playagain)
        {
            int targetNumber=random.nextInt(100);
            System.out.println("Round"+(round+1));
            int attempts=1;
            while(attempts<10)
            {
                System.out.println("Enter Your Guess(1 to 100): ");
                int userGuess=sc.nextInt();
                attempts++;

                if(userGuess==targetNumber)
                {
                    System.out.println("CONGRATULATIONS! You guessed the number in "+attempts+"attempts");
                    score++;
                    break;
                }
                else if(userGuess<targetNumber)
                {
                    System.out.println("Too Low! Try again.");
                }
                else
                {
                    System.out.println("Too High! Try again.");
                }
                if(attempts>=10)
                {
                    System.out.println("Out of attempts! The correct number was"+targetNumber);
                }
            }
            round++;

            System.out.println("Do you want to play another round? (yes/no):");
            String playString=sc.next();
            playagain=playString.equals("yes");
        }

        System.out.println("Game over! Your final score is : "+score);
        sc.close();
    }
}
