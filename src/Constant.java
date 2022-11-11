public class Constant extends Expression {
    private double a;

    public Constant(double a) {
        this.a = a;
    }

    @Override
    public double calculate() {
        return a;
    }

    @Override
    public String toString() {
        return a + "";
    }
}
