public class UC_6 {

    public static void main(String[] args) {

        String[] O = createO();
        String[] P = createP();
        String[] S = createS();

        for (int i = 0; i < O.length; i++) {
            System.out.println(O[i] + " " + P[i] + " " + P[i] + " " + S[i]);
        }
    }

    // Function to create letter O
    public static String[] createO() {
        return new String[]{
                "*****",
                "*   *",
                "*   *",
                "*   *",
                "*****"
        };
    }

    // Function to create letter P
    public static String[] createP() {
        return new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        };
    }

    // Function to create letter S
    public static String[] createS() {
        return new String[]{
                "*****",
                "*    ",
                "*****",
                "    *",
                "*****"
        };
    }
}