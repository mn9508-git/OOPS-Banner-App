import java.util.HashMap;
import java.util.Map;

public class UC_8 {

    // Map to store character patterns
    static Map<Character, String[]> patternMap = new HashMap<>();

    public static void main(String[] args) {

        // Initialize patterns
        patternMap.put('O', new String[]{
                "*****",
                "*   *",
                "*   *",
                "*   *",
                "*****"
        });

        patternMap.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        patternMap.put('S', new String[]{
                "*****",
                "*    ",
                "*****",
                "    *",
                "*****"
        });

        // Render the banner word
        renderBanner("OOPS");
    }

    // Function to render banner
    public static void renderBanner(String word) {

        int height = patternMap.get(word.charAt(0)).length;

        for (int i = 0; i < height; i++) {

            for (char c : word.toCharArray()) {
                String[] pattern = patternMap.get(c);
                System.out.print(pattern[i] + " ");
            }

            System.out.println();
        }
    }
}
