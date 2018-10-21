package p01_system_resources;

import p01_system_resources.contracts.GreetableDevice;
import p01_system_resources.contracts.TimeProvider;
import p01_system_resources.contracts.Writer;
import p01_system_resources.io.FileWriterImpl;
import p01_system_resources.models.devices.GreetingClock;
import p01_system_resources.io.ConsoleWriter;
import p01_system_resources.models.providers.TimeProviderImpl;

public class Main {
    public static void main(String[] args) {

        Writer fileWriter = new FileWriterImpl();
        TimeProvider timeProvider = new TimeProviderImpl();

        GreetableDevice device = new GreetingClock(timeProvider, fileWriter);
        device.greeting();
    }
}
