public class Product extends Expression {
    private Expression a;
    private Expression b;

    public Product(Expression a, Expression b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculate() {
        return a.calculate() * b.calculate();
    }

    @Override
    public String toString() {
        return "(" + a + "*" + b + ")";
    }
}
