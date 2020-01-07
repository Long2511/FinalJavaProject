package Calculator;

import java.util.Random;

public abstract class NumberGenerator {
    public int firstNumber;
    public int secondNumber;
    public String questionToDisplay;

    public NumberGenerator(int num1, int num2) {
        firstNumber = num1;
        secondNumber = num2;
    }

    public NumberGenerator() {

        firstNumber = GenerateRandomNumber();
        secondNumber = GenerateRandomNumber();

    }


    public int GenerateRandomNumber() {
        int randomGeneratedNumber;
        Random generateRandomNumber = new Random();

        randomGeneratedNumber = generateRandomNumber.nextInt(99);

        return randomGeneratedNumber;
    }

    public abstract String GetDisplayText();

    public boolean VerifyTheResult(int userAnswer) {
        if (Calculation() == userAnswer) return true;
        else return false;
    }

    public static NumberGenerator GenerateQuestion() {
        Random questionID = new Random();
        int type = 0;

           type = questionID.nextInt(4);

        switch (type){
            case 0:
                return new AddOperation();
            case 1:
                return new SubtractOperation();
            case 2:
                return new MultipleOperation();
            case 3:
                return new DivideOperation();
            default:
                return null;
        }
    }

    public abstract int Calculation();
}


