package template;
import java.util.*;

/**
 * model a Contact 
 * Contact has a name & list of phonebook entries
 * 
 * Support adding phonebookEntry to a contact
 * 
 * @Override hashCode and equals
 * 
 */

class Contact {
	private String name;
	private ArrayList<PhonebookEntry> entries;
	
	public Contact (String name) {
		this.name = name;
		this.entries = new ArrayList<>();
		
	}
	
	public void addPhonebookEntry (String name, String type) {
		PhonebookEntry entry = new PhonebookEntry(name, type);
		entries.add(entry);
		
	}
	@Override
    public boolean equals(Object obj) {
        
        if (this == obj) return true;

                if (obj == null || getClass() != obj.getClass()) return false;

                Contact contact = (Contact) obj;

        
        return Objects.equals(name, contact.name);
    }
    public String getName() {
        return name;
    }
    
    public List<PhonebookEntry> getPhonebookEntries() {
        return entries;
    }    
	@Override
    public int hashCode() {
        //hash code calculation based on the 'name' field
        int prime = 31;
        int result = 17;
        result = prime * result + (name == null ? 0 : name.hashCode());
        
        // Introduce some collision
        if (name != null && name.length() > 3 && name.charAt(0) == 'J') {
            result = result * prime + 7; 
        }

        return result;
    }

	 

}
