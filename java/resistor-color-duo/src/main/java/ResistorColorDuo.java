class ResistorColorDuo {

    private enum resistorsValues {
        black ("0"),
        brown ("1"),
        red ("2"),
        orange ("3"),
        yellow ("4"),
        green ("5"),
        blue ("6"),
        violet ("7"),
        grey ("8"),
        white ("9");

        private String value;

        resistorsValues(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    int value(String[] colors) {
        String result = "";

        for (int i = 0; i < 2; i++) {
            switch (colors[i]) {
                case "black":
                    result += String.valueOf(resistorsValues.black.getValue());
                    break;
                case "brown":
                    result += String.valueOf(resistorsValues.brown.getValue());
                    break;
                case "red":
                    result += String.valueOf(resistorsValues.red.getValue());
                    break;
                case "orange":
                    result += String.valueOf(resistorsValues.orange.getValue());
                    break;
                case "yellow":
                    result += String.valueOf(resistorsValues.yellow.getValue());
                    break;
                case "green":
                    result += String.valueOf(resistorsValues.green.getValue());
                    break;
                case "blue":
                    result += String.valueOf(resistorsValues.blue.getValue());
                    break;
                case "violet":
                    result += String.valueOf(resistorsValues.violet.getValue());
                    break;
                case "grey":
                    result += String.valueOf(resistorsValues.grey.getValue());
                    break;
                case "white":
                    result += String.valueOf(resistorsValues.white.getValue());
                    break;
            }
        }
        return Integer.parseInt(result);
    }
}

