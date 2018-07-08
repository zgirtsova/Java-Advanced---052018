package app.controllers;

import app.contracts.Manager;
import app.io.ConsoleReader;
import app.io.ConsoleWriter;

import java.io.IOException;

public class Engine {

    private ConsoleReader reader;
    private ConsoleWriter writer;
    private Manager warManager;

    public Engine() {
        this.reader = new ConsoleReader();
        this.writer = new ConsoleWriter();
        this.warManager = new WarManager();
    }
    public void run() throws IOException {



        String input =  reader.readLine();

    }
}
