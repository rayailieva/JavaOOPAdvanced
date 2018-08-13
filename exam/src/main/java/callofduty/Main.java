package callofduty;

import callofduty.core.Manager;
import callofduty.interfaces.InputReader;
import callofduty.interfaces.MissionManager;
import callofduty.interfaces.OutputWriter;
import callofduty.io.ConsoleInputReader;
import callofduty.io.ConsoleOutputWriter;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        MissionManager manager = new Manager();
        InputReader reader = new ConsoleInputReader();
        OutputWriter writer = new ConsoleOutputWriter();

        while (true) {
            List<String> input = Arrays.asList(reader.readLine().split(("\\s+")));
            String command = input.get(0);
            switch (command) {
                case "Agent":
                    writer.println(manager.agent(input));
                    break;
                case "Request":
                    writer.println(manager.request(input));
                    break;
                case "Status":
                    writer.println(manager.status(input));
                    break;
                case "Over":
                    writer.println(manager.over(input));
                    break;
            }
        }

    }

}




