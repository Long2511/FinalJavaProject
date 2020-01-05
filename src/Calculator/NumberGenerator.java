package Calculator;

import java.util.Random;

public class NumberGenerator {
    public int firstNumber;
    public int secondNumber;
    public int result;
    public int questionType = 0;
    public String questionToDisplay;

    public NumberGenerator(){
        QuestionType();

            firstNumber = GenerateRandomNumber();
            secondNumber = GenerateRandomNumber();

            while (questionType == 4 && secondNumber == 0){
                secondNumber = GenerateRandomNumber();
            }
            while (questionType == 4 && firstNumber<secondNumber){
                firstNumber = GenerateRandomNumber();
            }

        System.out.println(questionType);
        switch (questionType){
            case 1:
                result = firstNumber + secondNumber;
                break;
            case 2:
                result = firstNumber - secondNumber;
                break;
            case 3:
                result = firstNumber * secondNumber;
                break;
            case 4:
                result = firstNumber / secondNumber;
                break;
        }
    }

    public int GenerateRandomNumber(){
        int randomGeneratedNumber;
        Random generateRandomNumber = new Random();

        randomGeneratedNumber = generateRandomNumber.nextInt(99);

        return randomGeneratedNumber;
    }
    public String GetDisplayText(){
        switch (questionType){
            case 1:
                questionToDisplay =  firstNumber + " + " + secondNumber;
                break;
            case 2:
                questionToDisplay = firstNumber + " - " + secondNumber;
                break;
            case 3:
                questionToDisplay = firstNumber + " x " + secondNumber;
                break;
            case 4:
                questionToDisplay = firstNumber + " / " + secondNumber;
                break;
            default:
                questionToDisplay = firstNumber + " x " + secondNumber;
    }
        return questionToDisplay;
    }

    public boolean VerifyTheResult(int userAnswer){
        if (result == userAnswer) return true;
        else return false;
    }

    public int QuestionType(){
        Random questionID = new Random();
        while (questionType==0) {
            questionType = questionID.nextInt(4) + 1;
        }
        return questionType;
    }

}