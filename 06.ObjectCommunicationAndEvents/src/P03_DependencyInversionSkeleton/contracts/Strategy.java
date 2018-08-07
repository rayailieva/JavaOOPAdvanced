package P03_DependencyInversionSkeleton.contracts;

public interface Strategy {
    int Calculate(int firstOperand, int secondOperand);
}
