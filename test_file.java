import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloWorldTest {

    @Test
    public void testGetMessage() {
        HelloWorld helloWorld = new HelloWorld();
        String expected = "Salut, c’est notre première image Docker!!";
        String actual = helloWorld.getMessage();
        assertEquals(expected, actual);
    }
}
