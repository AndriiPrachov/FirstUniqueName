import java.util.Objects;

public class Solution {
    public static String firstUniqueName(String[] names) {
        for (String uniqueName : names) {
            int counter = 0;
            for (String name : names) {
                if (Objects.equals(uniqueName.toLowerCase(), name.toLowerCase())) {
                    counter++;
                }
            }
            if (counter < 2) {
                return uniqueName;
            }

        }

        return null;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqueName(new String[] { "Abbi", "Adeline", "Abbi", "Adalia" }));
    }
}