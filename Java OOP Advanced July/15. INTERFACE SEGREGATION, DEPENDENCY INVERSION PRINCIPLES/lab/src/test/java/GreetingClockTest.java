import org.junit.Test;
import org.mockito.Mockito;
import p01_system_resources.contracts.GreetableDevice;
import p01_system_resources.contracts.TimeProvider;
import p01_system_resources.contracts.Writer;
import p01_system_resources.io.ConsoleWriter;
import p01_system_resources.models.devices.GreetingClock;
import p01_system_resources.models.providers.TimeProviderImpl;

public class GreetingClockTest {

    @Test
    public void TestMorningGreeting() {
        TimeProvider mockTime = Mockito.mock(TimeProvider.class);

        Mockito.when(mockTime.getHour()).thenReturn(8);

        Writer consoleWriter = Mockito.mock(ConsoleWriter.class);

        GreetableDevice gd = new GreetingClock(mockTime, consoleWriter);

        gd.greeting();

        Mockito.verify(consoleWriter, Mockito.times(1))
                .writeLine("Good morning...");
    }
}
