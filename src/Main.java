public class Main {
    public static void main(String[] args) {
        Expression exp = new Sum(new Constant(4), new Product(new Constant(5), new Variable(2, "a")));
        System.out.println(exp);
        System.out.println(exp.calculate());
    }
}