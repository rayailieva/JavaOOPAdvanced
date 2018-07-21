package pr0304Barracks.core.commands;

import jdk.jshell.spi.ExecutionControl;
import pr0304Barracks.contracts.Executable;
import pr0304Barracks.contracts.Repository;
import pr0304Barracks.core.annotations.Inject;

public class RetireCommand implements Executable {

    @Inject
    private String[] data;

    @Inject
    private Repository repository;

    @Override
    public String execute() throws ExecutionControl.NotImplementedException {
        String unitType = this.data[1];

        try {
            this.repository.removeUnit(unitType);

            return unitType + " retired!";
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
    }
}
