class ResistorColor {

    String[] allColors = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

    int colorCode(String color) {
        for (int i = 0; i < allColors.length; i++) {
            if (color == allColors[i]) {
                return i;
            }
        }
        return -1;
    }

    String[] colors() {
        return allColors;
    }
}
