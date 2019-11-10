package java;

import java.util.Random;

public class NumberGenerator {
    String displayQuestion = "8 x 6";
    Random random = new Random();



    public NumberGenerator(){
    }
    public NumberGeneratorResult GenerateNumberString(){
        int firstNum =  random.nextInt(9);
        int secondNum = random.nextInt(9);
       // NumberGeneratorResult result;
        result = new NumberGeneratorResult(firstNum,secondNum);
        return result;
    }
    public class NumberGeneratorResult{
        public int firstNumber;
        public  int secondNumber;
        public  NumberGeneratorResult(int first, int second){
            firstNumber = first;
            secondNumber=second;
        }
    }
}