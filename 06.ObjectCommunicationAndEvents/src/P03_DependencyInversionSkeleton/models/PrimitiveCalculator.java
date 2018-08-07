package P03_DependencyInversionSkeleton.models;


import P03_DependencyInversionSkeleton.contracts.Calculator;
import P03_DependencyInversionSkeleton.contracts.Strategy;

import java.util.HashMap;
import java.util.Map;

public class PrimitiveCalculator implements Calculator {

    private Strategy currentStrategy;
    private Map<Character, Strategy> strategies;

    public PrimitiveCalculator() {
        this.strategies = new HashMap<>();
        this.currentStrategy = new AdditionStrategy();
        this.strategies.put('+', currentStrategy);
    }

    @Override
    public void changeStrategy(char operator) {
        switch (operator) {
            case '+':
            case '-':
                if(!this.strategies.containsKey(operator)){
                    this.strategies.put(operator, new SubtractionStrategy());
                }
            case '*':
                if(!this.strategies.containsKey(operator)){
                    this.strategies.put(operator, new MultiplicationStrategy());
                }
            case '/':
                if(!this.strategies.containsKey(operator)){
                    this.strategies.put(operator, new DivisingStrategy());
                }
                this.currentStrategy = this.strategies.get(operator);
                break;
        }
    }

    @Override
    public int performCalculation(int firstOperand, int secondOperand) {
        return this.currentStrategy.Calculate(firstOperand, secondOperand);
    }
}