package Calculator;

import java.awt.*;

import javax.swing.*;
import javax.swing.plaf.multi.MultiLabelUI;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;


public class TeachArithmeticFrame {

	JFrame frame;
	JTextField userAnswerField;
	JLabel questionDisplayLabel;
	JButton checkUserInputBtn;
	NumberGenerator generator;
	JButton nextQuestionBtn;
	JLabel invalidValueLabel;
	JButton resetInputButton;
	JLabel userCheckLabel;
	Vector answerHolder = new Vector();
	int userTries;
	private JTextArea userAnswer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeachArithmeticFrame window = new TeachArithmeticFrame();
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
	public TeachArithmeticFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		questionDisplayLabel = new JLabel();
		questionDisplayLabel.setHorizontalAlignment(JLabel.RIGHT);
		questionDisplayLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		questionDisplayLabel.setBounds(137, 61, 56, 16);
		frame.getContentPane().add(questionDisplayLabel);

		userAnswerField = new JTextField();
		userAnswerField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		userAnswerField.setHorizontalAlignment(SwingConstants.LEFT);
		userAnswerField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
					invalidValueLabel.setText("");
			}
			@Override
			public void keyPressed(KeyEvent arg0) {
				if(arg0.getKeyCode()==KeyEvent.VK_ENTER){
					CheckUserInput();
				}
			}
		});


		userAnswerField.setBounds(240, 58, 116, 22);
		frame.getContentPane().add(userAnswerField);
		userAnswerField.setColumns(10);

		userCheckLabel = new JLabel("");
		userCheckLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		userCheckLabel.setBounds(244, 130, 56, 16);
		frame.getContentPane().add(userCheckLabel);

		
		checkUserInputBtn = new JButton("OK");
		checkUserInputBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				CheckUserInput();
			}
		});
		checkUserInputBtn.setBounds(169, 190, 97, 25);
		frame.getContentPane().add(checkUserInputBtn);

		nextQuestionBtn = new JButton("Next");
		nextQuestionBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GenerateCalculation();
				userCheckLabel.setText("");
				answerHolder.clear();
				userAnswer.setText("");
				userTries = 0;
				userAnswerField.setText("");
			}
		});
		nextQuestionBtn.setBounds(278, 190, 97, 25);
		frame.getContentPane().add(nextQuestionBtn);
		
		resetInputButton = new JButton("Reset");
		resetInputButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				userAnswer.setText("");
				userTries = 0;
				answerHolder.clear();
			}
		});
		resetInputButton.setBounds(15, 190, 97, 25);
		frame.getContentPane().add(resetInputButton);

		invalidValueLabel = new JLabel("");
		invalidValueLabel.setHorizontalAlignment(SwingConstants.CENTER);
		invalidValueLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		invalidValueLabel.setBounds(147, 90, 206, 16);
		invalidValueLabel.setForeground(Color.RED);
		frame.getContentPane().add(invalidValueLabel);
		
		userAnswer = new JTextArea(100,1);
		userAnswer.setPreferredSize(new Dimension(100,150));
		userAnswer.setEditable(false);


		JScrollPane scrollPane = new JScrollPane(userAnswer);
		scrollPane.setBounds(5, 16, 121, 150);
		scrollPane.setViewportView(userAnswer);
		frame.getContentPane().add(scrollPane);


		// Init default value

		GenerateCalculation();

	}

	private void CheckUserInput(){
		try {
			int i = Integer.parseInt(userAnswerField.getText());
			invalidValueLabel.setText("");
			boolean result = generator.VerifyTheResult(Integer.parseInt(userAnswerField.getText()));
			if (result == true) {
				userCheckLabel.setText("Correct!");
				userTries = 0;
				answerHolder.clear();
			} else {
				userCheckLabel.setText("Incorrect");
				userTries++;
				answerHolder.add(userTries + " : " + userAnswerField.getText());
				String value ="";
				for (int j=0;j<answerHolder.size();j++){
					value +=  (String) answerHolder.toArray()[j] + "\n";
					userAnswer.setText(value);
				}
			}
		} catch (NumberFormatException e1) {
			invalidValueLabel.setText("Invalid Number");
		}
	}

	private void GenerateCalculation() {
		generator = new NumberGenerator();
		questionDisplayLabel.setText(generator.GetDisplayText());
	}
}
