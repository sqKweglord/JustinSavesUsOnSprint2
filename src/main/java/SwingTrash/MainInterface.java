/*
package SwingTrash;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainInterface extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	private Container container;
	private JButton btnOpen, btnClose, btnOrder;
	private JPanel panOrder, panClosed;
	private CardLayout layMenu = new CardLayout();
	
	public static void main(String[] args) {
		new MainInterface();
	}

	public MainInterface() {
		container = getContentPane();
		container.setLayout(new CardLayout());
		
		panOrder = new JPanel();
		

		// window shit
		setTitle("Ma&Pa's Pizzeria");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(720, 480);
		setResizable(false);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		layMenu.next(container);
	}
	
}
*/