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

        // List initialization
        try {
            // Reading email list
            BufferedReader emailReader = new BufferedReader(new FileReader("emails.txt"));

            String line;
            while ((line = emailReader.readLine()) != null) {
                emails.add(line);
            }
            emailReader.close();

            // Reading items list
            BufferedReader itemsReader = new BufferedReader(new FileReader("items.txt"));

            while ((line = itemsReader.readLine()) != null) {
                String[] parts = line.split(";");

                Item newItem = new Item();
                newItem.name = parts[0];
                newItem.value = Integer.parseInt(parts[1]);
                newItem.quantity = Integer.parseInt(parts[2]);

                items.add(newItem);
            }
            itemsReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Calculate value per person.
        Map<String, Integer> result = valuePerPerson(emails, items);
    }

    public static Map<String, Integer> valuePerPerson(List<String> emails, List<Item> items) {
        int totalValue = 0;

        for (Item i : items) {
            totalValue += i.value * i.quantity;
        }

        int finalValue = totalValue / emails.size();

        System.out.println(totalValue);
        System.out.println(finalValue);

        return null;
    }
}

class Item {
    String name;
    int value;
    int quantity;
}