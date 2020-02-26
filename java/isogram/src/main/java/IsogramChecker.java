import java.util.Arrays;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        if (phrase.isEmpty()) {
            return true;
        }

        phrase = replaceSpecialChars(phrase);
        phrase = phrase.toLowerCase();

        char[] phraseArray = phrase.toCharArray();
        Arrays.sort(phraseArray);

        for (int i = 0; i < phraseArray.length; i++) {
            if(i == phraseArray.length - 1){
                return true;
            }
             if (phraseArray[i] == phraseArray[i + 1]) {
                 return false;
             }
        }
        return true;
    }

    String replaceSpecialChars(String stringToReplace) {
       return stringToReplace.replaceAll("[^a-zA-Z0-9]", "");
    }
}
