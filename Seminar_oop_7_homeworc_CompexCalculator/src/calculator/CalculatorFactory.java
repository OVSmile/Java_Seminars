package src.calculator;

public class CalculatorFactory implements CalculatorFactorable {
    @Override
    public ComplexCalculable create(ComplexNumber primaryArg){
        return new ComplexCalculator(primaryArg);
    }
}
