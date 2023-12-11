
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CreditCardFactoryTest {

    @Test
    void testCreateVisa() {
        CreditCard card = CreditCardFactory.getCreditCard("4111111111111111", "08/27", "Eve");
        assertTrue(card instanceof Visa);
    }

    @Test
    void testCreateMasterCard() {
        CreditCard card = CreditCardFactory.getCreditCard("5555555555554444", "09/28", "Frank");
        assertTrue(card instanceof MasterCard);
    }

    @Test
    void testCreateAmericanExpress() {
        CreditCard card = CreditCardFactory.getCreditCard("378282246310005", "10/29", "Grace");
        assertTrue(card instanceof AmericanExpress);
    }

    @Test
    void testCreateDiscover() {
        CreditCard card = CreditCardFactory.getCreditCard("6011111111111117", "11/30", "Henry");
        assertTrue(card instanceof Discover);
    }

    @Test
    void testCreateInvalidCreditCard() {
        CreditCard card = CreditCardFactory.getCreditCard("0000000000000000", "12/31", "Ivy");
        assertTrue(card instanceof InvalidCreditCard);
    }
}
