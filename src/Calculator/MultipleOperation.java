package Calculator;

public class MultipleOperation extends Calculation {

    public MultipleOperation(int num1, int num2){
        super(num1,num2);
    }
    @Override
    public int Calculation() {
        return firstNumber * secondNumber;
    }

    @Override
    public String GetDisplayText() {
        return firstNumber + " * " + secondNumber;
    }
}
