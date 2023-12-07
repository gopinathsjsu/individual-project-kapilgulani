import org.json.JSONArray;
import org.json.JSONObject;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class JSONAdapter {

    public static List<CreditCard> readCardsFromFile(String filename) throws Exception {
        String content = new String(Files.readAllBytes(Paths.get(filename)));
        JSONObject jsonObject = new JSONObject(content);
        JSONArray cardsArray = jsonObject.getJSONArray("cards");
        List<CreditCard> cards = new ArrayList<>();

        for (int i = 0; i < cardsArray.length(); i++) {
            JSONObject cardObject = cardsArray.getJSONObject(i);
            String cardNumber = cardObject.getString("cardNumber");
            String expirationDate = cardObject.getString("expirationDate");
            String cardHolderName = cardObject.getString("cardHolderName");

            CreditCard card = CreditCardFactory.getCreditCard(cardNumber, expirationDate, cardHolderName);
            if (card != null && card.isValid()) {
                cards.add(card);
            }
        }

        return cards;
    }

    public static void writeCardsToFile(List<CreditCard> cards, String filename) throws Exception {
        JSONObject jsonObject = new JSONObject();
        JSONArray cardsArray = new JSONArray();

        for (CreditCard card : cards) {
            JSONObject cardObject = new JSONObject();
            cardObject.put("cardNumber", card.getCardNumber());
            cardObject.put("expirationDate", card.getExpirationDate());
            cardObject.put("cardHolderName", card.getCardHolderName());
            cardObject.put("cardType", card.getClass().getSimpleName());
            cardsArray.put(cardObject);
        }

        jsonObject.put("cards", cardsArray);
        Files.write(Paths.get(filename), jsonObject.toString().getBytes());
    }
}
