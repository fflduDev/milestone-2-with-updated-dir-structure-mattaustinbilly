package template;

import java.util.*;

public class PhonebookHandler implements iPhonebookHander {

    private Map<Contact, List<PhonebookEntry>> phonebook;

    public PhonebookHandler(Map<Contact, List<PhonebookEntry>> phonebook) {
        this.phonebook = phonebook;
    }

    @Override
    public List<Contact> sortByName() {
        List<Contact> contactList = new ArrayList<>(phonebook.keySet());

        // Bubble Sort implementation
        int n = contactList.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (contactList.get(j).getName().compareTo(contactList.get(j + 1).getName()) > 0) {
                    Contact temp = contactList.get(j);
                    contactList.set(j, contactList.get(j + 1));
                    contactList.set(j + 1, temp);
                }
            }
        }

        return contactList;
    }

    @Override
    public List<PhonebookEntry> binarySearch(List<Contact> sortedContacts, String name) {
        int low = 0;
        int high = sortedContacts.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            Contact midContact = sortedContacts.get(mid);
            int comparison = midContact.getName().compareTo(name);

            if (comparison == 0) {
                return phonebook.get(midContact);
            } else if (comparison < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("No entries found for: " + name);
        return new ArrayList<>();
    }

    @Override
    public void display(List<Contact> sortedContacts) {
        System.out.println("Sorted Phonebook (Bubble Sort):");
        for (Contact contact : sortedContacts) {
            System.out.println(contact.getName());
        }
    }
}
