public class RemoveSpaces {
    public static String removeWhiteSpaces(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!Character.isWhitespace(c)) {
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "This is a sample sentence with spaces.";

        String stringWithoutSpaces = removeWhiteSpaces(input);

        System.out.println("Original String: " + input);
        System.out.println("String without spaces: " + stringWithoutSpaces);
    }
}