package Calculator;

import java.util.Scanner;

public class Main {
    String stringToDisplay;
    public static void main(String[] args) {
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
}
