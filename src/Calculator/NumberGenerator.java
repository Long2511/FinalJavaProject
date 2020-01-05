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

        while (questionType == 4 && (secondNumber == 0 || firstNumber < secondNumber){
            //reset everything
            firstNumber = GenerateRandomNumber();
            secondNumber = GenerateRandomNumber();
        }
        //??? 
        System.out.println(questionType);
        //Maybe create an enum for arimethic operation for easier reading? Like:  case Operation.ADD:
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
        //Maybe create an enum to shorten this part to questionToDisplay =  firstNumber + questionTypeEnum.Value + secondNumber;
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
        //move all logic to parent since it is only used once
        Random questionID = new Random();
        while (questionType==0) {
            questionType = questionID.nextInt(4) + 1;
        }
        return questionType;
    }

}
