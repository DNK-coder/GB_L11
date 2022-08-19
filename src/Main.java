import java.io.IOException;
import java.util.*;

public class Main {
    static final String FILE_NAME1 = "TXTinfo.txt";
    static final String FILE_NAME2 = "TXTinfo.txt";

    public static void main(String[] args) {

        List<String> wordArray = new ArrayList<String>();
        wordArray = Array.fillTheArray(wordArray);
        System.out.println(wordArray + "\n");
        Array.printUniqueWords(wordArray);
        wordArray.clear();
        try {
            wordArray = Array.fillTheArrayFromFile(wordArray, FILE_NAME2);
        } catch (IOException e) {
            System.out.println("Failed to fill array from file!\n");
        }
        try {
            wordArray = Array.fillTheArrayFromFile(wordArray, FILE_NAME1);
        } catch (IOException e) {
            System.out.println("Failed to fill array from file!\n");
        }
        System.out.println(wordArray + "\n");
        Array.printUniqueWords(wordArray);

        Phonebook phonebook = new Phonebook();

        phonebook.add(5454545, "Tolstoy");
        phonebook.add(6767676, "Tolstoy");
        phonebook.add(4545455, "Chekhov");
        phonebook.add(5455454, "Chekhov");
        phonebook.add(6565656, "Pushkin");
        phonebook.add(6565656, "Pushkin");

        phonebook.get("Tolstoy");
        phonebook.get("Chekhov");
        phonebook.get("Pushkin");
        phonebook.get("Gogol");
    }
}
