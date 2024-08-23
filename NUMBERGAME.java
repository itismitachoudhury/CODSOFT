import java.util.Random;
import java.util.Scanner;

public class NUMBERGAME{
private static final int MAX_ATTEMPTS=10;
private static final int NUM_START=1;
private static final int NUM_END=100;  
  
public static void main(String[]args){
    try (Scanner sc = new Scanner (System.in)) {
        Random random=new Random();
        boolean playagain=true;
        int totalScore=0;
        
        while(playagain){
            int targetnumber=random.nextInt(NUM_END - NUM_START + 1) + NUM_START;
            int attemptsleft= MAX_ATTEMPTS;
            boolean correctguess=false;
            
            System.out.println("Welcome to Number Guessing Game.");
            System.out.println("I have generated a number between " +NUM_START + " and " +NUM_END + ".");
            System.out.println("You have Max " +MAX_ATTEMPTS + " attempts to guess it");
            
            
            while(attemptsleft>0 && !correctguess){
                System.out.println("Enter your guess:");
                int userguess=sc.nextInt();
                attemptsleft--;
                
                if(userguess==targetnumber){
                    System.out.println("congratulations your guess is correct!:");
                    correctguess=true;
                    totalScore +=attemptsleft;
                }
                else if(userguess<targetnumber){
                    System.out.println("Your guess is too low, try again");
                }
                else{
                    System.out.println("Your guess is too high, try again");
                }
                //print the number of attempts left
                System.out.println("Your total attempts left:" +attemptsleft);
            }
            if(!correctguess){
                System.out.println("you have no more attempts left. The correct number was" +targetnumber);
            }
            System.out.println("Your current score is:" +totalScore);
            System.out.println("Do you want to play again?(yes/no):");
            playagain=sc.next().equalsIgnoreCase("yes");
        }
        System.out.println("Thank you for playing! Your final score is " +totalScore);
    }
}
}