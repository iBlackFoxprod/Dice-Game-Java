
package DiceGame;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Random rand = new Random();
        int userScore = 0;
        int botScore = 0;
        int rounds;
        
        System.out.println("**********************************");
        System.out.println("How many rounds you want to play?: ");
        System.out.println("**********************************");
        rounds = kb.nextInt();
        
        
        for(int x = 0; x < rounds; x++)
        {
            int userChoice = rand.nextInt(6) +1;
            int botChoice = rand.nextInt(6) +1;
            
            if(botChoice > userChoice) 
            
            {
                botScore += 1; 
            }
            else if(botChoice < userChoice)
            
            {
                userScore += 1;
            }
            else{
                userScore += 1;
                botScore +=1;
            }
        }
        System.out.printf("UserScore: %d\n BotScore: %d\n",userScore,botScore);
        if(botScore > userScore)
        {
            System.out.println("Computer Won!");
        }
        else if(botScore < userScore)
        {
            System.out.println("You Won!");
        }
        else{
            System.out.println("It's a Draw!");
        }
    }
    
}
