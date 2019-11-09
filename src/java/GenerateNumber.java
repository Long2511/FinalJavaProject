package java;

import java.util.Random;

public class GenerateNumber {

    public GenerateNumber(){
        String displayQuestion;
        Random random = new Random();
        int firstNum =  random.nextInt(9);
        int secondNum = random.nextInt(9);
        System.out.println("First Number: "+ firstNum);
        System.out.println("Second Number: "+ secondNum);
    }
}