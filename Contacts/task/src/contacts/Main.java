package contacts;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {
            Contact contact = Engine.addRecord();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
