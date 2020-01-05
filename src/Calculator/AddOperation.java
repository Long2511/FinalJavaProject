package Calculator;

public class AddOperation extends Calculation {
    public int questionType = 0;

    public AddOperation(int num1, int num2){
        super(num1,num2);
    }

    @Override
    public int Calculation() {
        return firstNumber + secondNumber;
    }

    @Override
    public String GetDisplayText() {
        return firstNumber + " + " + secondNumber;
    }
}
