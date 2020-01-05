package Calculator;

import java.util.Random;

public class NumberGenerator {
    public int firstNumber;
    public int secondNumber;
    public int result;
    public int questionType = 0;
    public String questionToDisplay;

    public NumberGenerator(){
        QuestionType(); //Move logic out since you only use this method once
        
        firstNumber = GenerateRandomNumber();
        secondNumber = GenerateRandomNumber();

        while (questionType == 3 && (secondNumber == 0 || firstNumber < secondNumber)){
            //reset everything
            firstNumber = GenerateRandomNumber();
            secondNumber = GenerateRandomNumber();
        }
        switch (questionType){
            case 0:
                result = firstNumber + secondNumber;
                break;
            case 1:
                result = firstNumber - secondNumber;
                break;
            case 2:
                result = firstNumber * secondNumber;
                break;
            case 3:
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
            case 0:
                questionToDisplay =  firstNumber + " + " + secondNumber;
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

    public boolean VerifyTheResult(int userAnswer){
        if (result == userAnswer) return true;
        else return false;
    }

    public int QuestionType(){
        //move all logic to parent since it is only used once
        Random questionID = new Random();
        while (questionType==0) {
            questionType = questionID.nextInt(4);
        }
        return questionType;
    }

}
