import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ShowBoxLayout extends JPanel {
	//two box containers
	private Box box1 = Box.createHorizontalBox();
	private Box box2 = Box.createVerticalBox();
	
	//label to display flags
	private JLabel jlblFlag = new JLabel();
	
	//image icons for flag art done by me :D
	private ImageIcon imageIconUS = new ImageIcon("images/us.gif");
	private ImageIcon imageIconCanada = new ImageIcon("images/canada.gif");
	private ImageIcon imageIconNorway = new ImageIcon("images/norway.gif");
	private ImageIcon imageIconGermany = new ImageIcon("images/germany.gif");
	private ImageIcon imageIconPrint = new ImageIcon("images/print.gif");
	private ImageIcon imageIconSave = new ImageIcon("images/save.gif");
	
	//buttons!
	private JButton jbtUS = new JButton("US");
	private JButton jbtCanada = new JButton("Canada");
	private JButton jbtNorway = new JButton("Norway");
	private JButton jbtGermany = new JButton("Germany");
	
	public ShowBoxLayout(BorderLayout borderLayout) {
		this.setLayout(new BorderLayout());
		//top box
		box1.add(new JButton(imageIconPrint));
		box1.add(Box.createHorizontalStrut(20));
		box1.add(new JButton(imageIconSave));
		//right side box
		box2.add(jbtUS);
		box2.add(Box.createVerticalStrut(8));
		box2.add(jbtCanada);
		box2.add(Box.createGlue());
		box2.add(jbtNorway);
		box2.add(Box.createRigidArea(new Dimension(10, 8)));
		box2.add(jbtGermany);
		
		box1.setBorder(new javax.swing.border.LineBorder(Color.red));
		box2.setBorder(new javax.swing.border.LineBorder(Color.black));
		
		add(box1, BorderLayout.NORTH);
		add(box2, BorderLayout.EAST);
		add(jlblFlag, BorderLayout.CENTER);
		
		//register listeners
		jbtUS.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jlblFlag.setIcon(imageIconUS);
				System.out.println(getHeight());
			}
		});
		jbtCanada.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jlblFlag.setIcon(imageIconCanada);
			}
		});
		jbtNorway.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jlblFlag.setIcon(imageIconNorway);
			}
		});
		jbtGermany.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jlblFlag.setIcon(imageIconGermany);
			}
		});
	}
}
