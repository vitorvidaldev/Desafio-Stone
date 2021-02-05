import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        List<Item> items = new ArrayList<Item>();
        List<String> emails = new ArrayList<String>();

        try {
            // Leitura da lista de emails
            BufferedReader emailReader = new BufferedReader(new FileReader("emails.txt"));

            String line;
            while ((line = emailReader.readLine()) != null) {
                emails.add(line);
            }
            emailReader.close();

            // Leitura da lista de itens
            BufferedReader itemsReader = new BufferedReader(new FileReader("items.txt"));

            while ((line = itemsReader.readLine()) != null) {
                System.out.println(line);
            }
            itemsReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Item {
    String name;
    int value;
    int quantity;
}