package Calculator;

import java.util.Random;

public class NumberGenerator {
    public int firstNumber;
    public int secondNumber;
    public int result;
    public NumberGenerator(){
        firstNumber = GenerateRandomNumber();
        secondNumber = GenerateRandomNumber();
        result = firstNumber * secondNumber;
    }
    public int GenerateRandomNumber(){
        int randomGeneratedNumber;
        Random generateRandomNumber = new Random();

        randomGeneratedNumber = generateRandomNumber.nextInt(20);

        return randomGeneratedNumber;
    }
    public String GetDisplayText(){
        return firstNumber + " x " + secondNumber;
    }

    public boolean VerifyTheResult(int userAnswer){
        if (result == userAnswer) return true;
        else return false;
    }

}