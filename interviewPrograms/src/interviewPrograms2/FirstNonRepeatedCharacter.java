package interviewPrograms2;

import java.util.HashMap;

public class FirstNonRepeatedCharacter {

  public static char firstNonRepeatedCharacter(String input) {
    HashMap<Character, Integer> charCountMap = new HashMap<>();
    for (char c : input.toCharArray()) {
      charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
    }

    for (char c : input.toCharArray()) {
      if (charCountMap.get(c) == 1) {
        return c;
      }
    }

    return Character.MIN_VALUE;
  }

  public static void main(String[] args) {
    String input = "abcad";
    char firstNonRepeatedCharacter = firstNonRepeatedCharacter(input);
    System.out.println("The first non-repeated character in \"" + input + "\" is \"" + firstNonRepeatedCharacter + "\"");
  }
}
