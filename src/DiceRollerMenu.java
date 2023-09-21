import javax.swing.*;
import java.awt.*;

public class DiceRollerMenu {
	public static void main(String args[]) {
		JFrame frame = new JFrame();
		frame.setLayout(new GridLayout(7, 1));
		frame.setSize(200,400);
		
		int[] diceTypes = {4, 6, 8, 10, 12, 20, 100};
        SingleDieRoller[] dice = new SingleDieRoller[diceTypes.length];
        for(int x = 0; x < dice.length; x++) {
            dice[x] = new SingleDieRoller(diceTypes[x]);
            dice[x].setVisible(true);
            frame.add(dice[x]);
        }
        frame.setVisible(true);
    }
}
