import java.util.HashMap;
import java.util.Map;

public class NucleotideCounter {

    public Integer counterA = 0;
    public Integer counterC = 0;
    public Integer counterG = 0;
    public Integer counterT = 0;
    Map<Character, Integer> nucleiotideMap = new HashMap<>();

    public NucleotideCounter(String dnaString) {
        dnaString = dnaString.toUpperCase();
        char[] dnaChar = dnaString.toCharArray();

        for (char c : dnaChar) {
            switch (c) {
                case 'A':
                    counterA += 1;
                    break;
                case 'C':
                    counterC += 1;
                    break;
                case 'G':
                    counterG += 1;
                    break;
                case 'T':
                    counterT += 1;
                    break;
                default:
                    throw new IllegalArgumentException("Received a symbol that isn't a DNA symbol.");
            }
        }

        nucleiotideMap.put('A', counterA);
        nucleiotideMap.put('C', counterC);
        nucleiotideMap.put('G', counterG);
        nucleiotideMap.put('T', counterT);
    }

    public Map<Character, Integer> nucleotideCounts() {
        return nucleiotideMap;
    }
}