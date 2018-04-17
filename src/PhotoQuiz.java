/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */


import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)
String dog = "https://boygeniusreport.files.wordpress.com/2016/11/puppy-dog.jpg?quality=98&strip=all&w=782";
		// 2. create a variable of type "Component" that will hold your image
Component dogHolder;
		// 3. use the "createImage()" method below to initialize your Component
dogHolder = createImage(dog);
		// 4. add the image to the quiz window
quizWindow.add(dogHolder);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String answer = JOptionPane.showInputDialog("What animal is this?");
		// 7. print "CORRECT" if the user gave the right answer
if (answer .equals("cat")) {
	
	JOptionPane.showMessageDialog(null, "Correct");

}else {
	
	JOptionPane.showMessageDialog(null, "Incorect");

	
}

		// 8. print "INCORRECT" if the answer is wrong
quizWindow.remove(dogHolder);
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)

		// 10. find another image and create it (might take more than one line of code)
String cat = "http://i0.kym-cdn.com/entries/icons/original/000/002/232/bullet_cat.jpg";
		// 11. add the second image to the quiz window
Component catHolder;
catHolder = createImage(cat);
		// 12. pack the quiz window
quizWindow.add(catHolder);
quizWindow.pack();
		// 13. ask another question
answer = JOptionPane.showInputDialog("what animals is this");
		// 14+ check answer, say if correct or incorrect, etc.
if (answer .equals("chicken")) {
		
		JOptionPane.showMessageDialog(null, "Correct");
		System.exit(0);
	}else {
		
		JOptionPane.showMessageDialog(null, "incorect...");
		System.exit(0);
		
	}
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}