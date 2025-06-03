package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane; 

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0; 

		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
				String input = JOptionPane.showInputDialog("what is the first letter of the alphabet?");
				
				// 3.  Use an if statement to check if their answer is correct
				if(input.equalsIgnoreCase("a")){
					score++;
					JOptionPane.showMessageDialog(null, "Correct! Gain one point. Your current score is "+score);

				} else{
					score--;
					JOptionPane.showMessageDialog(null, "You are incorrect! Gain 0 points. Your current score is "+score+"." );
					
					String input2 = JOptionPane.showInputDialog("How many words are in this sentence?");
					if(input2.equalsIgnoreCase("7")){
						score++;
						JOptionPane.showMessageDialog(null, "Correct. Gain one point. Your current score is " + score); 
					} else{
						score--;
						JOptionPane.showMessageDialog(null,"Incorrect. Lose one point. Your current score is " + score); 
					}

					JOptionPane.showMessageDialog(null, "Your final score is " + score); 






				}
				
				
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
				

				
				
		
		
		// After all the questions have been asked, tell the user their final score 
		
		
	}
}

