import java.util.List;

public class CreditCardProcessor {

    public static void processFile(String inputFilename, String outputFilename) {
        try {
            // Read the credit cards from the input file
            List<CreditCard> creditCards = JSONAdapter.readCardsFromFile(inputFilename);

            // Write the processed credit cards to the output file
            JSONAdapter.writeCardsToFile(creditCards, outputFilename);

            System.out.println("Processing completed successfully.");
        } catch (Exception e) {
            System.err.println("Error processing file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java CreditCardProcessor <inputFile> <outputFile>");
            return;
        }

        processFile(args[0], args[1]);
    }
}
