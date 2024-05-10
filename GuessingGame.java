package GuessingGame;

import javax.swing.*;
import java.util.*;

public class GuessingGame {
   public static String determineGuess(int userc, int computerc,int count){
        if (userc <=0 || userc >100) {
            return "Your guess is invalid";
        }
        else if (userc == computerc){
            return "Correct!\nTotal Guesses: " + count;
        }
        else if (userc > computerc) {
            return "Your guess is too high, try again.\nTry Number: " + count ;
        }
        else if (userc < computerc) {
            return "Your guess is too low, try again.\nTry Number: " +count ;
        }
        else {
            return "Your guess is incorrect\nTry Number: "+count ;
        }
}

    
    public static void main(String[] args) {
        int computerc = (int) (Math.random()*100 + 1);
        int userc=0;
        System.out.println("Enter your choice:");
        Scanner input=new Scanner(System.in);
        userc=input.nextInt();
        System.out.println("The computer choice is " + computerc);
        System.out.println("Your guess " + userc);

        int count = 1;
        
        while (userc != computerc)
        {
           String response = JOptionPane.showInputDialog(null,
               "Enter a guess between 1 and 100", "Guessing Game", 3);
           userc = Integer.parseInt(response);
           JOptionPane.showMessageDialog(null, ""+ determineGuess(userc, computerc, count));
           count++;
       } 
                      
    }

    }