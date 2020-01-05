package Calculator;

public class SubtractOperation extends Calculation {

    public SubtractOperation(int num1, int num2){
        super(num1,num2);
    }


    @Override
    public int Calculation() {
        return firstNumber - secondNumber;
    }

    @Override
    public String GetDisplayText() {
        return firstNumber + " - " + secondNumber;
    }
}
