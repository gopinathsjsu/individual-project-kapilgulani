
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

class JSONStrategyTest {

    @Test
    void testReadCardsFromFile() throws Exception {
        Strategy strategy = new JSONStrategy();
        List<CreditCard> cards = strategy.readCardsFromFile("test_data.json"); // Assuming test_data.json exists with valid data
        assertNotNull(cards);
        assertFalse(cards.isEmpty());
    }

    @Test
    void testWriteCardsToFile() throws Exception {
        List<CreditCard> cards = new ArrayList<>();
        cards.add(new AmericanExpress("378282246310005", "03/25", "Alice"));
        cards.add(new Discover("6011111111111117", "04/26", "Bob"));

        Strategy strategy = new JSONStrategy();
        strategy.writeCardsToFile(cards, "output_test.json"); // Writes to an output file

        // Reading back to verify
        List<CreditCard> readCards = strategy.readCardsFromFile("output_test.json");
        assertEquals(cards.size(), readCards.size());
    }
}
