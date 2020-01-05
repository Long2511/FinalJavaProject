package Calculator;

public class MultipleOperation extends NumberGenerator {

    public MultipleOperation(int num1, int num2){
        super(num1,num2);
    }

    public MultipleOperation(){
        super();
    }

    @Override
    public int Calculation() {
        return firstNumber * secondNumber;
    }

    @Override
    public String GetDisplayText() {
        questionToDisplay = firstNumber + " * " + secondNumber;
        return questionToDisplay;
    }
}
