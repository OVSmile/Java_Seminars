package src.calculator;

public interface ComplexCalculable {
    ComplexCalculator sum(ComplexNumber secondaryArg);
    ComplexCalculator sub(ComplexNumber secondaryArg);
    ComplexCalculator mul(ComplexNumber secondaryArg);
    ComplexCalculator div(ComplexNumber secondaryArg);
    ComplexNumber getResult();
}
