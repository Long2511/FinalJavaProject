package Calculator;

import java.util.Random;

public class NumberGenerator {
    public int firstNumber;
    public int secondNumber;
    public int questionType = 0;
    public String questionToDisplay;

    public NumberGenerator() {
        QuestionType();

        firstNumber = GenerateRandomNumber();
        secondNumber = GenerateRandomNumber();

        while (questionType == 3 && (secondNumber == 0 || firstNumber < secondNumber)) {
            //reset everything
            firstNumber = GenerateRandomNumber();
            secondNumber = GenerateRandomNumber();
        }
    }


    public int GenerateRandomNumber() {
        int randomGeneratedNumber;
        Random generateRandomNumber = new Random();

        randomGeneratedNumber = generateRandomNumber.nextInt(99);

        return randomGeneratedNumber;
    }

    public String GetDisplayText() {
        switch (questionType) {
            case 0:
                questionToDisplay = firstNumber + " + " + secondNumber;
                break;
            case 1:
                questionToDisplay = firstNumber + " - " + secondNumber;
                break;
            case 2:
                questionToDisplay = firstNumber + " x " + secondNumber;
                break;
            case 3:
                questionToDisplay = firstNumber + " / " + secondNumber;
                break;
        }
        return questionToDisplay;
    }

    public boolean VerifyTheResult(int userAnswer) {
        if (Calculation() == userAnswer) return true;
        else return false;
    }

    public int QuestionType() {
        Random questionID = new Random();
        while (questionType == 0) {
            questionType = questionID.nextInt(4);
        }
        return questionType;
    }

    public int Calculation() {
        switch (questionType) {
            case 0:
                return firstNumber + secondNumber;
            case 1:
                return firstNumber - secondNumber;
            case 2:
                return firstNumber * secondNumber;
            case 3:
                return firstNumber / secondNumber;
            default:
                return 0;
        }
    }
}


