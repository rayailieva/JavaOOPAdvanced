package panzer;

import panzer.contracts.InputReader;
import panzer.contracts.OutputWriter;
import panzer.core.ProgramManager;
import panzer.io.InputReaderImpl;
import panzer.io.OutputWriterImpl;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        InputReader reader = new InputReaderImpl();
        OutputWriter writer = new OutputWriterImpl();
        ProgramManager programManager = new ProgramManager();

        while (true) {
            String line = reader.readLine();
            String[] splitted = line.split("\\s+");
            if (splitted[0].equals("Terminate")) {
                System.out.println(programManager.terminate(null));
                break;
            }
            switch(splitted[0]){
                case "Vehicle":
                    System.out.println(programManager.addVehicle(Arrays.asList(splitted)));
                    break;
                case "Part":
                    System.out.println(programManager.addPart(Arrays.asList(splitted)));
                    break;
                case "Inspect":
                    System.out.println(programManager.inspect(Arrays.asList(splitted)));
                    break;
                case "Battle":
                    System.out.println(programManager.battle(Arrays.asList(splitted)));
                    break;
            }
        }
    }
}
