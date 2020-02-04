class RaindropConverter {

    String convert(int number) {
        String rainSound = "";
        if(number % 3 != 0 && number % 5 != 0 && number % 7 != 0) {
            rainSound += String.valueOf(number);
        }
        if(number % 3 == 0) {
            rainSound +="Pling";
        }
        if(number % 5 == 0) {
            rainSound +="Plang";
        }
        if (number % 7 == 0) {
            rainSound += "Plong";
        }
        return rainSound;
    }
}
