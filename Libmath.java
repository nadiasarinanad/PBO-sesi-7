public class Libmath <A extends Number, B extends Number> {
    A number1;
    B number2;

    public Libmath(A number1, B number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public double add() {
        return number1.doubleValue() + number2.doubleValue();
    }

    public double min() {
        return number1.doubleValue() - number2.doubleValue();
    }

    
}
