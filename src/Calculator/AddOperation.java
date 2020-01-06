package Calculator;

public class AddOperation extends NumberGenerator {

    public AddOperation(){
        super();
    }

    public AddOperation(int num1, int num2){
        super(num1,num2);
    }

    @Override
    public int Calculation() {
        return firstNumber + secondNumber;
    }

    @Override
    public String GetDisplayText() {
        questionToDisplay = firstNumber + " + " + secondNumber;
        return questionToDisplay;
    }
}
