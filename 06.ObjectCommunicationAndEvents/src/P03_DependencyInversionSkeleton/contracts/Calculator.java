package P03_DependencyInversionSkeleton.contracts;

public interface Calculator {
    void changeStrategy(char operator);

    int performCalculation(int firstOperand, int secondOperand);
}
