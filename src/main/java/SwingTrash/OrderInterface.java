package SwingTrash;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JCheckBox;

public class OrderInterface extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderInterface frame = new OrderInterface();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public OrderInterface() {
		setTitle("Ma&Pa's Pizzeria");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 480);
		getContentPane().setLayout(null);
		
		JButton btnCheckout = new JButton("View Order");
		btnCheckout.setBounds(22, 354, 175, 34);
		getContentPane().add(btnCheckout);
		
		JButton btnCancel = new JButton("Cancel Order");
		btnCancel.setBounds(495, 354, 175, 34);
		getContentPane().add(btnCancel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Pizza", "Drink"}));
		comboBox.setBounds(163, 0, 300, 34);
		getContentPane().add(comboBox);
		
		JPanel panel = new JPanel();
		panel.setBounds(340, 46, 330, 165);
		getContentPane().add(panel);
		
		JLabel lblPizzaSize = new JLabel("Pizza Size:");
		panel.add(lblPizzaSize);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"10-Inch", "12-Inch", "14-Inch", "16-Inch"}));
		panel.add(comboBox_1);
		
		JLabel lblCrust = new JLabel("Pizza Crust:");
		panel.add(lblCrust);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Thin Crust", "Hand Tossed", "Pan Crust"}));
		panel.add(comboBox_2);
		
		JLabel lblPizzaType = new JLabel("Pizza Type:");
		panel.add(lblPizzaType);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Meat Lovers", "Supreme", "Hawaiian", "Garden", "Build Your Own"}));
		panel.add(comboBox_3);
		
		JButton btnAddToOrder_1 = new JButton("Add To Order");
		panel.add(btnAddToOrder_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(22, 216, 549, 134);
		getContentPane().add(panel_1);
		
		JCheckBox chckbxSausage = new JCheckBox("Cheese");
		panel_1.add(chckbxSausage);
		
		JCheckBox chckbxPepparoni = new JCheckBox("Sausage");
		panel_1.add(chckbxPepparoni);
		
		JCheckBox chckbxExtraCheese = new JCheckBox("Ham");
		panel_1.add(chckbxExtraCheese);
		
		JCheckBox chckbxMushrooms = new JCheckBox("Mushrooms");
		panel_1.add(chckbxMushrooms);
		
		JCheckBox chckbxPineapple = new JCheckBox("Pineapple");
		panel_1.add(chckbxPineapple);
		
		JCheckBox chckbxBlackOlives = new JCheckBox("Black Olives");
		panel_1.add(chckbxBlackOlives);
		
		JCheckBox chckbxGreenPeppers = new JCheckBox("Green Peppers");
		panel_1.add(chckbxGreenPeppers);
		
		JCheckBox chckbxOnions = new JCheckBox("Onions");
		panel_1.add(chckbxOnions);
		
		JCheckBox chckbxTomato = new JCheckBox("Tomato");
		panel_1.add(chckbxTomato);
		
		JCheckBox chckbxBacon = new JCheckBox("Bacon");
		panel_1.add(chckbxBacon);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(22, 43, 315, 125);
		getContentPane().add(panel_2);
		
		JLabel lblDrinkType = new JLabel("Drink Type:");
		panel_2.add(lblDrinkType);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Pepsi", "Diet Pepsi", "Sierra Mist", "Cheerwine", "Mountain Dew"}));
		panel_2.add(comboBox_4);
		
		JLabel lblDrinkSize = new JLabel("Drink Size:");
		panel_2.add(lblDrinkSize);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"20-Ounce", "2-Liter", "1-Liter"}));
		panel_2.add(comboBox_5);
		
		JButton btnAddToOrder = new JButton("Add To Order");
		panel_2.add(btnAddToOrder);
	}
}
