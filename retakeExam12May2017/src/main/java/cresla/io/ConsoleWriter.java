package cresla.io;

import cresla.interfaces.OutputWriter;

public class ConsoleWriter implements OutputWriter {
    public void write(String output) {
        System.out.print(output);
    }

    public void writeLine(String output) {
        System.out.println(output);
    }
}
