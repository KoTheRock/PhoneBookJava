import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class PhoneBook {
    public static void main(String[] args) {
        Map<String, Set<String>> phoneBook = new HashMap<>();

        addContact(phoneBook, "Илья", "123456789");
        addContact(phoneBook, "Сергей", "987654321");
        addContact(phoneBook, "Архип", "555555555");
        addContact(phoneBook, "Андрей", "111111111");
        addContact(phoneBook, "Анатолий", "777777777");
        addContact(phoneBook, "Илья", "123123123123");
        addContact(phoneBook, "Сергей", "321321321");
        addContact(phoneBook, "Илья", "1234567890");

        List<Map.Entry<String, Set<String>>> sortedContacts = new ArrayList<>(phoneBook.entrySet());
        sortedContacts.sort((entry1, entry2) -> entry2.getValue().size() - entry1.getValue().size());

        System.out.println();
        for (Map.Entry<String, Set<String>> entry : sortedContacts) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void addContact(Map<String, Set<String>> phonebook, String name, String phoneNumber) {
        if (phonebook.containsKey(name)) {
            phonebook.get(name).add(phoneNumber);
        } else {
            Set<String> phoneNumbers = new HashSet<>();
            phoneNumbers.add(phoneNumber);
            phonebook.put(name, phoneNumbers);
        }
    }
}

