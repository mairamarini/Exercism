import java.util.ArrayList;
import java.util.List;

public class Allergies {

    public int allergieScore;

    public Allergies(int allergieScore) {
        this.allergieScore = allergieScore;
    }

    public boolean isAllergicTo(Allergen allergen) {
        return (allergen.getScore() & allergieScore) == allergen.getScore();
    }

    public List<Allergen> getList() {
        List<Allergen> allergenList = new ArrayList<>();

        for (Allergen allergen : Allergen.values()) {
            if (isAllergicTo(allergen)) {
                allergenList.add(allergen);
            }
        }
        return allergenList;
    }
}