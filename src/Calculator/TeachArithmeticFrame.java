package Calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Scanner;


public class TeachArithmeticFrame {

	private JFrame frame;
	private JTextField userAnswerField;

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
		NumberGenerator generateNumber = new NumberGenerator();
		int number1, number2;
		number1 = generateNumber.GenerateRandomNumber();
		number2 = generateNumber.GenerateRandomNumber();
		System.out.println("Two random number are: "+ number1 + " and " + number2);

		String stringToDisplay;
		ConvertNumberToDisplay convertNumber = new ConvertNumberToDisplay();
		stringToDisplay = convertNumber.ConvertFromNumberToString(number1,number2);
		System.out.println("The String is: "+ stringToDisplay);

		int finalResult;
		CalculateResult calculateResult = new CalculateResult();
		finalResult = calculateResult.CalculateFinalResult(number1,number2);
		System.out.println("The result is: " + finalResult);

		int userAnswer;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the result: ");
		userAnswer = scanner.nextInt();

		boolean isUserCorrect;
		VerifyTheResult verifyresult = new VerifyTheResult();
		isUserCorrect = verifyresult.VerifyTheResult(finalResult,userAnswer);
		System.out.print("Is user correct? " + isUserCorrect);
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
		
		JLabel questionDisplayLabel = new JLabel();
		questionDisplayLabel.setBounds(93, 61, 56, 16);
		frame.getContentPane().add(questionDisplayLabel);
		
		userAnswerField = new JTextField();
		userAnswerField.setBounds(201, 58, 116, 22);
		frame.getContentPane().add(userAnswerField);
		userAnswerField.setColumns(10);
		
		JLabel userCheckLabel = new JLabel("New label");
		userCheckLabel.setBounds(167, 119, 56, 16);
		frame.getContentPane().add(userCheckLabel);
		
		JButton checkUserInputBtn = new JButton("OK");
		checkUserInputBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		checkUserInputBtn.setBounds(52, 190, 97, 25);
		frame.getContentPane().add(checkUserInputBtn);
		
		JButton nextQuestionBtn = new JButton("Next");
		nextQuestionBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		nextQuestionBtn.setBounds(162, 190, 97, 25);
		frame.getContentPane().add(nextQuestionBtn);
		
		JButton resetInputButton = new JButton("Reset");
		resetInputButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		resetInputButton.setBounds(271, 190, 97, 25);
		frame.getContentPane().add(resetInputButton);
	}
}
