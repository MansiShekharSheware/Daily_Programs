package demojava.lab4;

import java.util.Scanner;

class Search {
    public static int searchWordFunction(String input, String searchWord) {
        String[] words = input.split("\\s+");
        int count = 0;

        for (String word : words) {
            if (word.equalsIgnoreCase(searchWord)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.nextLine();

        System.out.print("Enter the word to search: ");
        String wordToSearch = scanner.next();

        int occurrences = searchWordFunction(inputSentence, wordToSearch);
        System.out.println("The word '" + wordToSearch + "' appears " + occurrences + " times.");

        scanner.close();
    }
}
