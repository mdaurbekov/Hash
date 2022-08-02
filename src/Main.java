import java.util.HashMap;
import java.util.Map;

public class Main {
    static HashMap<Character, Integer> hashMap = new HashMap<>();

    public static void main(String[] args) {
        String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit," +
                " sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. " +
                "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi " +
                "ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit " +
                "in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur" +
                " sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt " +
                "mollit anim id est laborum.";


        for (Character symbol : str.toCharArray()) {
            if (hashMap.containsKey(symbol)) {
                int value = hashMap.get(symbol);
                hashMap.put(symbol, ++value);
            } else {
                hashMap.put(symbol, 1);
            }
        }
        char maxSymbol = ')';
        int maxValue = -1;
        char minSymbol = '(';
        int minValue = Integer.MAX_VALUE;

        for (Map.Entry<Character, Integer> map : hashMap.entrySet()) {
            char key = map.getKey();
            int value = map.getValue();
            if (maxValue < value) {
                maxValue = value;
                maxSymbol = key;
            }
            if (minValue > value) {
                minValue = value;
                minSymbol = key;
            }

        }
        System.out.format("Символ '%s' встречается чаще всего - %s раз\n", maxSymbol, maxValue);
        System.out.format("Символ '%s' встречается реже всего - %s раз", minSymbol, minValue);

    }
}
