import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class fortuneCookie implements ActionListener {

	public static void main(String[] args) {

		fortuneCookie fc = new fortuneCookie();
		fc.showButton();

	}

	public void showButton() {

		JFrame frame = new JFrame();
		frame.setVisible(true);

		JButton button = new JButton();
		frame.add(button);

		button.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		int rand = new Random().nextInt(5);

		if (rand == 1) {

			JOptionPane.showMessageDialog(null, "You will win today.");

		}
		if (rand == 2) {

			JOptionPane.showMessageDialog(null, "You will loose today.");

		}

		if (rand == 3) {

			JOptionPane.showMessageDialog(null, "Try agin.(restart)");

		}

		if (rand == 4) {

			JOptionPane.showMessageDialog(null, "You LOST!!!!!!");

		}
	}

}
