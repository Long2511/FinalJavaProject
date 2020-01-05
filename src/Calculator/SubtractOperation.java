package Calculator;

public class SubtractOperation extends NumberGenerator {

    public SubtractOperation(int num1, int num2){
        super(num1,num2);
    }

    public SubtractOperation(){
        super();
    }

    @Override
    public int Calculation() {
        return firstNumber - secondNumber;
    }

    @Override
    public String GetDisplayText() {
        questionToDisplay = firstNumber + " - " + secondNumber;
        return questionToDisplay;
    }
}
