package Calculator;

import java.util.Random;

public class NumberGenerator {
    public int GenerateRandomNumber(){
        int randomGeneratedNumber;
        Random generateRandomNumber = new Random();

        randomGeneratedNumber = generateRandomNumber.nextInt(10);

        return randomGeneratedNumber;
    }
}