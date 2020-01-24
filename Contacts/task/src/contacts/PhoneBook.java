package contacts;

import java.util.HashSet;

public class PhoneBook {
    HashSet<Contact> ContactList;

    public PhoneBook() {
    }

    public HashSet<Contact> getContactList() {
        return ContactList;
    }

    public void setContactList(HashSet<Contact> contactList) {
        ContactList = contactList;
    }
}
