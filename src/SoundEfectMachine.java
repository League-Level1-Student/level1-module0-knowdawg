import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEfectMachine implements ActionListener{
	JButton button1 = new JButton("BOOM");
	JButton button2 = new JButton("hat");
	JButton button3 = new JButton("just press it.");
	public static void main(String[] args) {

		new SoundEfectMachine().setUp();
		
	}
	
	private void setUp() {
		

		JFrame frame = new JFrame();
		
		JPanel panel = new JPanel();
		
		
		
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		
		frame.pack();
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		frame.setVisible(true);
	
		
		frame.setVisible(true);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
	     sound.play();
	}




	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button1) {
		playSound("drum.wav");
		}
		if (e.getSource() == button2) {
			playSound("cymbal.wav");
			}
		if (e.getSource() == button3) {
			playSound("sawing-wood-daniel_simon.wav");
			}
	}
	
}
