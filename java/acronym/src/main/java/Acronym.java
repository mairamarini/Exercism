class Acronym {

    String acronym = "";

    Acronym(String phrase) {

       String phraseToSplit;

       phraseToSplit = phrase.replaceAll("[ ,_-]+", " ");

       String[] wordsArray = phraseToSplit.split(" ");

       for (String word : wordsArray) {
           acronym += word.substring(0,1);
       }

       acronym = acronym.toUpperCase();
        System.out.println(acronym);
    }

    String get() {
        return acronym;
    }
}
