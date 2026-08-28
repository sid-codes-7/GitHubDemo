import java.util.*;
import java.util.Scanner;

public class numberGuess {
  public static void main(String[] args){
    //since Math.random() is limited to 0 and 1, we must multiply +1, to get random values 0-100
    int num_to_guess = (int)(Math.random()*100) + 1;
    
    Scanner scanner = new Scanner(System.in);
    boolean correctAns = false;
    
    while(!correctAns){
      System.out.println("Enter your guess: ");
      int number = scanner.nextInt();

      if(number < num_to_guess){
        System.out.println("Your guess is lower than the acutal number.");
      } else if(number > num_to_guess){
        System.out.println("Your guess is higher than the acutal number. ");
      } else if(number == num_to_guess){
        System.out.println("Good job!");
        correctAns = true;
      }

    }
    
  }
}
