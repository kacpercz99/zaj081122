public class Sinus extends Expression {
    private Expression a;

    public Sinus(Expression a) {
        this.a = a;
    }

    @Override
    public double calculate() {
        return Math.sin(Math.toRadians(a.calculate()));
    }

    @Override
    public String toString() {
        return "sin(" + a + ")";
    }
}
