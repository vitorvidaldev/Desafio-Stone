import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws Exception {
        List<Item> items = new ArrayList<Item>();
        List<String> emails = new ArrayList<String>();
        Map<String, Integer> result = new HashMap<String, Integer>();

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

                if (newItem.value < 0 || newItem.quantity < 0) {
                    itemsReader.close();
                    throw new Exception("Negative numbers are invalid!");
                }

                items.add(newItem);
            }
            itemsReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        if (emails.size() > 0) {
            // Calculate value per person.
            result = valuePerPerson(emails, items);

            // The result has been ordered following the HashMap. The keys won't be in the
            // same order that was established in the emails.txt file
            result.entrySet().forEach(entry -> {
                System.out.println(entry.getKey() + " " + entry.getValue());
            });
        }
    }

    public static Map<String, Integer> valuePerPerson(List<String> emails, List<Item> items) {
        int totalValue = 0;

        // Calculates the total value of all the items in the list
        for (Item i : items) {
            totalValue += i.value * i.quantity;
        }

        int finalValue = totalValue / emails.size();
        int remainder = totalValue % emails.size();

        Map<String, Integer> resultMap = new HashMap<String, Integer>();

        for (String email : emails) {

            // If there's a remainder, it has to be distributed as equally as possible
            // between all keys
            if (remainder > 0) {
                resultMap.put(email, finalValue + 1);
                remainder--;
            } else {
                resultMap.put(email, finalValue);
            }
        }

        return resultMap;
    }
}

// Item Class definition
class Item {
    String name;
    int value;
    int quantity;
}