package Calculator;

public abstract class Calculation {
    public int firstNumber;
    public int secondNumber;
    public Calculation(int num1, int num2) {
        firstNumber = num1;
        secondNumber = num2;
    }
    public abstract String GetDisplayText();
    public abstract int Calculation();
}
