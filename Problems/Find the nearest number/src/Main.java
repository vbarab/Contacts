import java.awt.image.AreaAveragingScaleFilter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] items = scanner.nextLine().split("\\s+");
        List<Integer> numbers = new ArrayList<>();

        for (String item : items) {
            numbers.add(Integer.parseInt(item));
        }

        int n = scanner.nextInt();
        ArrayList<Integer> result = new ArrayList<>();

        int delta = Integer.MAX_VALUE;
        for (int i : numbers) {
            if (Math.abs(i - n) < delta) {
                delta = Math.abs(i - n);
                result.clear();
                result.add(i);
            } else if (Math.abs(i - n) == delta) {
                result.add(i);
            }
        }

        Collections.sort(result);

        for (int item : result) {
            System.out.print(item + " ");
        }
    }

    private static ArrayList<Integer> readArrayList(Scanner scanner) {
        return Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}