
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

class CSVStrategyTest {

    @Test
    void testReadCardsFromFile() throws Exception {
        Strategy strategy = new CSVStrategy();
        List<CreditCard> cards = strategy.readCardsFromFile("test_data.csv"); // Assuming test_data.csv exists with valid data
        assertNotNull(cards);
        assertFalse(cards.isEmpty());
    }

    @Test
    void testWriteCardsToFile() throws Exception {
        List<CreditCard> cards = new ArrayList<>();
        cards.add(new Visa("4111111111111111", "01/23", "John"));
        cards.add(new MasterCard("5555555555554444", "02/24", "Doe"));

        Strategy strategy = new CSVStrategy();
        strategy.writeCardsToFile(cards, "output_test.csv"); // Writes to an output file

        // Reading back to verify
        List<CreditCard> readCards = strategy.readCardsFromFile("output_test.csv");
        assertEquals(cards.size(), readCards.size());
    }
}
