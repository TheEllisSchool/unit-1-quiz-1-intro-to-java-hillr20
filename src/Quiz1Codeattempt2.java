import javax.swing.JOptionPane;

public class Quiz1Codeattempt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int compWin = 0;
		int userWin = 0;
		for (int i = 0; i < 10; i++) {
			int compDieRoll = (int)(Math.random() * 6) + 1;
			int userDieRoll = (int)(Math.random() * 6) + 1;
			JOptionPane.showMessageDialog(null, "The computer's roll was " + compDieRoll + 
					" . \nThe user's roll was " + userDieRoll + " .");

			//int compWin;
			//int userWin;
			if (compDieRoll > userDieRoll) {
				JOptionPane.showMessageDialog(null, "The computer wins this round.");
				compWin += 1;
				//i++;
			}
			else if (userDieRoll > compDieRoll) {
				JOptionPane.showMessageDialog(null, "The user wins this round.");
				userWin += 1;
				//i++;
			}
			else {
				JOptionPane.showMessageDialog(null, "It was a tie. No win.");
				//i++;
			}
		
			}
		JOptionPane.showMessageDialog(null, "User's overall score was: " + userWin + 
				" \nComputer's overall score was: " + compWin + " .");
		if (userWin > compWin) {
			JOptionPane.showMessageDialog(null, "The user won!");
		}
		else if (compWin > userWin) {
			JOptionPane.showMessageDialog(null, "The computer won!");
		}
		else {
			JOptionPane.showMessageDialog(null, "It was a tie!");
		}

	}

}
