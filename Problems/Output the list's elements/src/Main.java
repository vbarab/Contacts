import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));
        // write your code here
/*        for (String s:nameList) {
            System.out.println(s);
        }*/
        nameList.stream().forEach(System.out::println);
    }
}