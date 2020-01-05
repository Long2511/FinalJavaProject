package Calculator;

import java.util.Random;

public class NumberGenerator {
    public int firstNumber;
    public int secondNumber;
    public Calculation operation;
    public String questionToDisplay;

    public NumberGenerator() {
        GenerateQuestion();
    }


    public int GenerateRandomNumber() {
        int randomGeneratedNumber;
        Random generateRandomNumber = new Random();

        randomGeneratedNumber = generateRandomNumber.nextInt(99);

        return randomGeneratedNumber;
    }

    public String GetDisplayText(){
        return operation.GetDisplayText();
    };

    public boolean VerifyTheResult(int userAnswer) {
        if (operation.Calculation() == userAnswer) return true;
        else return false;
    }

    public  void GenerateQuestion() {
        Random questionID = new Random();
        int type = 0;
        while (type == 0) {
            type = questionID.nextInt(4);
        }
        firstNumber = GenerateRandomNumber();
        secondNumber = GenerateRandomNumber();
        while (type == 3 && secondNumber == 0 ){
            firstNumber = GenerateRandomNumber();
            secondNumber = GenerateRandomNumber();
        }
        switch (type){
            case 0:
                operation = new AddOperation(firstNumber,secondNumber);
            case 1:
                operation = new SubtractOperation(firstNumber,secondNumber);
            case 2:
                operation = new MultipleOperation(firstNumber,secondNumber);
            case 3:
                operation = new DivideOperation(firstNumber,secondNumber);
        }
    }
}


