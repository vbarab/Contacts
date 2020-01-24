package contacts;

import java.util.List;

public class Contact {
   private String name;
    private String surname;
    private int number;
    private static List<Contact> list;

    public Contact(String name, String surname, int number) {
        this.name = name;
        this.surname = surname;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Contact() {
    }

    public static Contact getContactByNumber(int number) {
        Contact temp = null;
        for (Contact con : list) {
            if (con.getNumber() == number) {
                temp = con;
                break;
            }
        }
        return temp;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", number=" + number +
                '}';
    }

    public static void listContactList(){
        if (list.isEmpty()){
            System.out.println("empty list");
        }
        else {
            
        }

    }
}
