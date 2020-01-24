package contacts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Engine {
    static ArrayList<Contact> contactList = new ArrayList<>();

    public static Contact addRecord() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the name of the person:");
        String name = bufferedReader.readLine();
        System.out.println("Enter the surname of the person:");
        String surname = bufferedReader.readLine();
        System.out.println("Enter the number:");
        String[] number = bufferedReader.readLine().split("-");
        System.out.println("A record created!\nA Phone Book with a single record created!");
        StringBuilder sb = new StringBuilder();
        Arrays.stream(number).forEach(s -> sb.append(s));
        int numberConstruc = Integer.parseInt(String.valueOf(sb));
        contactList.add(new Contact(name, surname, numberConstruc));
        Contact.getContactByNumber(1);
        return new Contact(name, surname, numberConstruc);
    }

    public static Contact readRecord() {
        return new Contact();
    }

    public static boolean checkNumber() {
        boolean flag = false;
        //regex -|-  ^[+]*[(]{0,1}[0-9]{1,4}[)]{0,1}[-\s\./0-9]*([\s\S]{4})$  -|-
        return flag;
    }

    public static Contact editContact() {
        return new Contact();
    }

    public Contact getContactFromList(String name) {
        return null;
    }

    public Contact getContactFromList(String name, int number) {
        return null;
    }


    public static ArrayList<Contact> listContact() {

        return null;

    }

}
