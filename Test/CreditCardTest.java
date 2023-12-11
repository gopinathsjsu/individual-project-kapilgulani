
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CreditCardTest {

    @Test
    void testAmericanExpressValidity() {
        CreditCard card = new AmericanExpress("378282246310005", "04/23", "Alice");
        assertTrue(card.isValid());
    }

    @Test
    void testDiscoverValidity() {
        CreditCard card = new Discover("6011111111111117", "05/24", "Bob");
        assertTrue(card.isValid());
    }

    @Test
    void testMasterCardValidity() {
        CreditCard card = new MasterCard("5555555555554444", "06/25", "Charlie");
        assertTrue(card.isValid());
    }

    @Test
    void testInvalidCreditCard() {
        CreditCard card = new InvalidCreditCard("0000000000000000", "07/26", "Dave", "Test Error Message");
        assertFalse(card.isValid());
    }
}
