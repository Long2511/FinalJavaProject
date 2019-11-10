package java;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
public class Frontend {

	String displayQuestion = "8 x 2";
	private JFrame frame;
	private JTextField textField;


	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frontend window = new Frontend();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frontend() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 533, 345);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(281, 86, 153, 35);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblQuestion = new JLabel(displayQuestion);
		lblQuestion.setFont(new Font("Dialog", Font.PLAIN, 40));
		lblQuestion.setBounds(116, 86, 153, 35);
		frame.getContentPane().add(lblQuestion);
	}
}
