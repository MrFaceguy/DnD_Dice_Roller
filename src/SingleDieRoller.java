import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.Random;

public class SingleDieRoller extends JPanel{

    public SingleDieRoller(int diceName) {
        // Initialize Variables
    	Random rng = new Random();
    	JFrame frame = new JFrame();

        // Add UI Components
        JButton button = new JButton("d" + diceName);
        JLabel statement = new JLabel("You rolled a: ");
        JLabel answer = new JLabel("0");
        frame.setLayout(new FlowLayout());

        button.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		answer.setText(String.valueOf(rng.nextInt(diceName) + 1));
        	}
        });
        
        
        add(button);
        add(statement);
        add(answer);
    }
}
