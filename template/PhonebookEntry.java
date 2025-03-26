package template;

public class PhonebookEntry {
    private String phoneNumber;
    private String type;

    public PhonebookEntry(String phoneNumber, String type) {
        this.phoneNumber = phoneNumber;
        this.type = type;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return phoneNumber + " " + type;
    }
}
