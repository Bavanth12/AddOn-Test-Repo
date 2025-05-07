package AddOnTest;

public class RemoveDuplicateCharacters {
    public static void main(String[] args) {
        String input = "programming";
        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[256]; // For ASCII characters

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!seen[c]) {
                seen[c] = true;
                result.append(c);
            }
        }

        System.out.println("Original string: " + input);
        System.out.println("Result after removing duplicates: " + result.toString());
    }
}
