import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		/** Card Layout */
		ShowCardLayout card = new ShowCardLayout();
		frame.add(card, BorderLayout.CENTER); 
		/** BoxLayout */
		ShowBoxLayout box = new ShowBoxLayout(new BorderLayout());
		
		frame.add(box, BorderLayout.EAST);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setLocationRelativeTo(frame);
		frame.setVisible(true);
	}

}
