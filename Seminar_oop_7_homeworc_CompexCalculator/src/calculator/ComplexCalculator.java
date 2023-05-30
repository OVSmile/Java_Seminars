package src.calculator;

public class ComplexCalculator implements ComplexCalculable {

    private ComplexNumber primaryArg;

    public ComplexCalculator(ComplexNumber primaryArg) {
        this.primaryArg = primaryArg;
    }

    public ComplexCalculator sum(ComplexNumber secondaryArg) {
        primaryArg = new ComplexNumber(primaryArg.getA() + secondaryArg.getA(), primaryArg.getB() + secondaryArg.getB());
        return this;
    }

    public ComplexCalculator sub(ComplexNumber secondaryArg) {
        primaryArg = new ComplexNumber(primaryArg.getA() - secondaryArg.getA(), primaryArg.getB() - secondaryArg.getB());
        return this;
    }

    public ComplexCalculator mul(ComplexNumber secondaryArg) {
        double a = primaryArg.getA() * secondaryArg.getA() - primaryArg.getB() * secondaryArg.getB();
        double b = primaryArg.getA() * secondaryArg.getB() + primaryArg.getB() * secondaryArg.getA();
        primaryArg = new ComplexNumber(a, b);
        return this;
    }

    public ComplexCalculator div(ComplexNumber secondaryArg) {
        double a = primaryArg.getA();
        double b = primaryArg.getB();
        double c = secondaryArg.getA();
        double d = secondaryArg.getB();
        primaryArg = new ComplexNumber((a * c + b * d) / (c * c + d * d), (b * c - a * d) / (c * c + d * d));
        return this;
    }

    public ComplexNumber getResult(){
        return primaryArg;
    }
}