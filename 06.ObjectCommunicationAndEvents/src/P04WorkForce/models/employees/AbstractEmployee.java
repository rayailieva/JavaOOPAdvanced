package P04WorkForce.models.employees;

import P04WorkForce.contracts.Employee;

abstract class AbstractEmployee implements Employee {

    String name;
    int workingHoursPerWeek;

    public AbstractEmployee(String name, int hours) {
        this.name = name;
        this.workingHoursPerWeek = hours;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getWorkingHoursPerWeek() {
        return this.workingHoursPerWeek;
    }
}
