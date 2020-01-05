package Calculator;

public class DivideOperation extends NumberGenerator {

    public DivideOperation(int num1, int num2){
        super(num1,num2);
    }

    public DivideOperation(){
        super();
        while (secondNumber == 0 || firstNumber < secondNumber) {
            //reset everything
            firstNumber = GenerateRandomNumber();
            secondNumber = GenerateRandomNumber();
        }
    }

    @Override
    public int Calculation() {
        return firstNumber / secondNumber;
    }

    @Override
    public String GetDisplayText() {
        questionToDisplay = firstNumber + " / " + secondNumber;
        return questionToDisplay;
    }
}
