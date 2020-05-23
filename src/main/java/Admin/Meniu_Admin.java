package Admin;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings({ "unused", "serial" })
public class Meniu_Admin extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Meniu_Admin frame = new Meniu_Admin();
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
	public Meniu_Admin() {
		getContentPane().setLayout(null);
		setSize(1380,1080);
		JButton btnNewButton = new JButton("Lista carti");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Lista_carti_interfata listac=new Lista_carti_interfata();
				listac.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(23, 574, 270, 59);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Lista cereri");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Lista_cereri_interfata listac=new Lista_cereri_interfata();
				listac.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(23, 646, 270, 61);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Actualizare");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Actualizare actual=new Actualizare();
				actual.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton_2.setBounds(23, 720, 270, 61);
		getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("Admin page");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 70));
		lblNewLabel.setBounds(675, 357, 460, 114);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Meniu_Admin.class.getResource("src/main/resources/im.png")));
		lblNewLabel_1.setBounds(0, 0, 1902, 1033);
		getContentPane().add(lblNewLabel_1);
		
		JButton button = new JButton("New button");
		button.setBounds(1123, 906, 202, 36);
		getContentPane().add(button);
		

		
	}
}
