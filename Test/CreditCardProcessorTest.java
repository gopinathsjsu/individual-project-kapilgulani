
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CreditCardProcessorTest {

    @Test
    void testJSONStrategy() {
        Strategy strategy = CreditCardProcessor.getStrategy("data.json");
        assertTrue(strategy instanceof JSONStrategy);
    }

    @Test
    void testCSVStrategy() {
        Strategy strategy = CreditCardProcessor.getStrategy("data.csv");
        assertTrue(strategy instanceof CSVStrategy);
    }

    @Test
    void testGetStrategyInvalid() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            CreditCardApp.getStrategy("data.txt");
        });
        String expectedMessage = "File format which is given is not supported";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }
}
