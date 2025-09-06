
// Capitalize first and last character of each word of a string

// Problem Statement: Given a string, write a program to Capitalize the first and last character of each word of that string.

public class b4_capitalize_first_last_letter_of_string {

    // Method to capitalize first and last character of each word
    public static String capitalizeFirstLast(String str) {
        // Split the sentence into words by space
        String[] words = str.split(" ");

        // Use StringBuilder to build the final result
        StringBuilder result = new StringBuilder();

        // Loop through each word in the array
        for (String word : words) {
            if (word.length() == 0) {
                // Skip if the word is empty (for multiple spaces)
                continue;
            } else if (word.length() == 1) {
                // If word has only 1 character → capitalize it
                result.append(Character.toUpperCase(word.charAt(0)));
            } else {
                // If word has more than 1 character
                // Capitalize first letter
                char first = Character.toUpperCase(word.charAt(0));
                // Keep the middle part same
                String middle = word.substring(1, word.length() - 1);
                // Capitalize last letter
                char last = Character.toUpperCase(word.charAt(word.length() - 1));

                // Combine first + middle + last
                String modified = first + middle + last;

                // Append modified word
                result.append(modified);
            }
            // Add space after each word
            result.append(" ");
        }

        // Convert StringBuilder to string and remove trailing space
        return result.toString().trim();
    }

    // Main method for testing
    public static void main(String[] args) {
        String input = "take u forward";
        System.out.println("Original: " + input);
        System.out.println("Modified: " + capitalizeFirstLast(input));
    }
}
