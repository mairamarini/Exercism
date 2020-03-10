class Scrabble {

    public int score = 0;

    Scrabble(String word) {
        word = word.toUpperCase();
        char[] wordChars = word.toCharArray();

        for (char wordChar : wordChars) {
            if (wordChar == 'A' || wordChar == 'E' || wordChar == 'I' || wordChar == 'O' || wordChar == 'U'
                    || wordChar == 'L' || wordChar == 'N' || wordChar == 'R' || wordChar == 'S' || wordChar == 'T') {
                score += 1;
            }
            if (wordChar == 'D' || wordChar == 'G') {
                score += 2;
            }
            if (wordChar == 'B' || wordChar == 'C' || wordChar == 'M' || wordChar == 'P') {
                score += 3;
            }
            if (wordChar == 'F' || wordChar == 'H' || wordChar == 'V' || wordChar == 'W' || wordChar == 'Y') {
                score += 4;
            }
            if (wordChar == 'K') {
                score += 5;
            }
            if (wordChar == 'J' || wordChar == 'X') {
                score += 8;
            }
            if (wordChar == 'Q' || wordChar == 'Z') {
                score += 10;
            }
        }
    }

    int getScore() {
        return score;
    }
}
