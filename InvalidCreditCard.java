public class InvalidCreditCard extends CreditCard {
    public InvalidCreditCard(String cardNumber, String expirationDate, String cardHolderName) {
        super(cardNumber, expirationDate, cardHolderName);
    }

    @Override
    public boolean isValid() {
        return false;
    }
}
