import java.util.ArrayList;
import java.util.List;

class ProteinTranslator {

    List<String> translate(String rnaSequence) {

        List<String> proteinsList = new ArrayList<>();

        String[] rna = rnaSequence.split("(?<=\\G.{3})");

        for (int i = 0; i < rna.length ; i++) {

            if(rna[i].equals("AUG")) {
               proteinsList.add("Methionine");
            }
            if (rna[i].equals("UUU") || rna[i].equals("UUC")) {
                proteinsList.add("Phenylalanine");
            }
            if(rna[i].equals("UUA") || rna[i].equals("UUG")) {
                proteinsList.add("Leucine");
            }
            if(rna[i].equals("UCU") || rna[i].equals("UCC") || rna[i].equals("UCA") || rna[i].equals("UCG")) {
                proteinsList.add("Serine");
            }
            if(rna[i].equals("UAU") || rna[i].equals("UAC")) {
                proteinsList.add("Tyrosine");
            }
            if(rna[i].equals("UGU") || rna[i].equals("UGC")) {
                proteinsList.add("Cysteine");
            }
            if(rna[i].equals("UGG")) {
                proteinsList.add("Tryptophan");
            }
            if(rna[i].equals("UAA") || rna[i].equals("UAG") || rna[i].equals("UGA")) {
                return proteinsList;
            }
        }
        return proteinsList;
    }
}