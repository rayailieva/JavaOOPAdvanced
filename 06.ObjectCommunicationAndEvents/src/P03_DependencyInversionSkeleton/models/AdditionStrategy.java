package P03_DependencyInversionSkeleton.models;

import P03_DependencyInversionSkeleton.contracts.Strategy;

public class AdditionStrategy implements Strategy {

    @Override
    public int Calculate(int firstOperand, int secondOperand){
        return firstOperand + secondOperand;
    }
}
