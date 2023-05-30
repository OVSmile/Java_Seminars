package src.calculator.log;

import src.calculator.CalculatorFactorable;
import src.calculator.ComplexCalculable;
import src.calculator.ComplexNumber;
import src.loggers.Loggable;

public class LogCalculatorFactory implements CalculatorFactorable {

    private CalculatorFactorable primaryFactory;
    private Loggable logger;

    public LogCalculatorFactory(CalculatorFactorable primaryFactory, Loggable logger){
        this.primaryFactory = primaryFactory;
        this.logger = logger;
    }

    @Override
    public ComplexCalculable create(ComplexNumber primaryArg) {
        return new LogComplexCalculator(primaryFactory.create(primaryArg), logger);
    }
}
