public class Variable extends Expression {
    private double value;
    private String name;

    public Variable(double value, String name) {
        this.value = value;
        this.name = name;
    }

    @Override
    public double calculate() {
        return value;
    }

    @Override
    public String toString() {
        return name;
    }
}
