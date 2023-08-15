package main.java.com.georgescuconstantin.pregatireinterviu.base_algorithms;

public class StringAndArrays {

    public void countOccurrencesIgnoreCase(String[] array, String key) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equalsIgnoreCase(key)) {
                count++;
            }
        }
        System.out.println("The occurrence of the key is : " + count);
    }

    public boolean isPalindromIgnoreCase(String word) {
        String lowerCaseWord = word.toLowerCase();
        StringBuilder sb = new StringBuilder(lowerCaseWord);
        String reverseLowerCaseWord = sb.reverse().toString();

        if (lowerCaseWord.equalsIgnoreCase(reverseLowerCaseWord)) {
            return true;
        }
        return false;
    }

    public boolean isPalindromIgnoreCasePRO(String sentence) {
        String lowerCaseSentence = sentence.toLowerCase();
        // filter sentence for non-letters characters using the StringBuilder class
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lowerCaseSentence.length(); i++) {
            if (Character.isLetter(lowerCaseSentence.charAt(i))) {
                sb.append(lowerCaseSentence.charAt(i));
            }
        }

        String onlyLettersSentence = sb.toString();
        String onlyLettersSentenceReverse = sb.reverse().toString();
        if (onlyLettersSentence.equalsIgnoreCase(onlyLettersSentenceReverse)) {
            return true;
        }
        return false;
    }


}
