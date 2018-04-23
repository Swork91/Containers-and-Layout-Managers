import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ShowCardLayout extends JApplet {
	private CardLayout cardLayout = new CardLayout(20, 10);
	private JPanel cardPanel = new JPanel(cardLayout);
	private JButton jbtFirst, jbtNext, jbtPrevious, jbtLast;
	private JComboBox jcboImage;
	private final int NUM_OF_FLAGS = 6;
	
	public ShowCardLayout() {
		cardPanel.setBorder(new javax.swing.border.LineBorder(Color.red));
		
		//add 9 labels
		for (int i=1; i<=NUM_OF_FLAGS; i++) {
			JLabel label = new JLabel(new ImageIcon("images/Flag" + i + ".gif"));
			cardPanel.add(label, String.valueOf(i));
		}
		
		//panel to hold buttons and comboboxes
		JPanel p = new JPanel();
		p.add(jbtFirst = new JButton("First"));
		p.add(jbtNext = new JButton("Next"));
		p.add(jbtPrevious = new JButton("Previous"));
		p.add(jbtLast = new JButton("Last"));
		p.add(new JLabel("Image"));
		p.add(jcboImage = new JComboBox());
		
		//init combo box
		for (int i=1; i<=NUM_OF_FLAGS; i++)
			jcboImage.addItem(String.valueOf(i));
		
		//place panels in frame
		add(cardPanel, BorderLayout.CENTER);
		add(p, BorderLayout.SOUTH);
		
		//register listeners
		jbtFirst.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				cardLayout.first(cardPanel);		
			}
		});
		jbtNext.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.next(cardPanel);
			}
		});
		jbtPrevious.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				cardLayout.previous(cardPanel);		
			}
		});
		jbtLast.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.last(cardPanel);
			}
		});
		jcboImage.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent arg0) {
				cardLayout.show(cardPanel, (String) arg0.getItem());

			}
			
		});
	}
}
