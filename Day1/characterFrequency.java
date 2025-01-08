import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        Map<Character, Integer> frequencyMap = new HashMap<>();
        char[] chars = input.toCharArray();
        for (char ch : chars) {
            if (frequencyMap.containsKey(ch)) {
                frequencyMap.put(ch, frequencyMap.get(ch) + 1);
            } else {
                frequencyMap.put(ch, 1);
            }
        }
        System.out.println("Character frequencies:");
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        scanner.close();
    }
}
