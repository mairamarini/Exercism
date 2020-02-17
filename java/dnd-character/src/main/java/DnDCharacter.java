import java.util.Arrays;

class DnDCharacter {

    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private int hitpoints;

   public static int number(int maxNumber) {
       return (int) (Math.random() * maxNumber + 1);
   }

    public DnDCharacter() {
        strength = ability();
        dexterity = ability();
        constitution = ability();
        intelligence = ability();
        wisdom = ability();
        charisma = ability();

        hitpoints = 10 + modifier(constitution);
    }

    int ability() {

      int rollOne = number(6);
      int rollTwo = number(6);
      int rollThree = number(6);
      int rollFour = number(6);

      int result = 0;

      int[] rolls = {rollOne, rollTwo, rollThree, rollFour};
      Arrays.sort(rolls);

      for (int i = 1; i < rolls.length ; i++) {
         result = result + rolls[i];
      }
      return result;
    }

    int modifier(int constitution) {
        return (int) Math.floor((constitution - 10) / 2.0);
    }

    int getStrength() {
        return strength;
    }

    int getDexterity() {
       return dexterity;
    }

    int getConstitution() {
       return constitution;
    }

    int getIntelligence() {
       return intelligence;
    }

    int getWisdom() {
        return wisdom;
    }

    int getCharisma() {
        return charisma;
    }

    int getHitpoints() {
       return hitpoints;
    }

}
