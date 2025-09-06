import java.util.*;

public class b7_print_duplicate {

  public static void print_dupli(String str) {

    HashMap<Character, Integer> freqMap = new LinkedHashMap<>();
    for (char ch : str.toCharArray()) {
      freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
    }
    boolean isDuplicate = false;

    for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
      if (entry.getValue() > 1) {
        System.out.println(entry.getKey() + " - " + entry.getValue());
        isDuplicate = true;
      }
    }
    if (!isDuplicate) {
      System.out.println("< -- No Output -- >");
    }

  }

  public static void main(String[] args) {
    String str = "aryandeooreapy";
    print_dupli(str);
  }
}
