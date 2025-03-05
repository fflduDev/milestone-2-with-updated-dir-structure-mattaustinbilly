package template;

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
	private PhonebookEntry[] entries;
	
	public Contact (String name) {
		this.name = name;
		
	}
	
	public void addPhonebookEntry (String name, String type) {
		PhonebookEntry entry = new PhonebookEntry(name, type);
	}
	 

}
