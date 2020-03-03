class IsbnVerifier {

    boolean isValid(String stringToVerify) {

        if (stringToVerify.isEmpty()){
            return false;
        }

        String lastChar = stringToVerify.substring(stringToVerify.length() - 1);
        lastChar = lastChar.toUpperCase();

        String stringToVerifyWithoutLastChar = stringToVerify.substring(0, stringToVerify.length() - 1);

        if(stringToVerifyWithoutLastChar.contains("-")) {
            stringToVerifyWithoutLastChar = stringToVerifyWithoutLastChar.replaceAll("-", "");
        }

        if(stringToVerifyWithoutLastChar.length() != 9){
            return false;
        }

        if(stringToVerifyWithoutLastChar.matches(".*[a-zA-Z].*")) {
            return false;
        }

        if (!lastChar.equals("X") && lastChar.matches(".*[A-Z].*")){
            return false;
        }

        if(lastChar.equals("X")){
            lastChar = "10";
        }

        char[] arrayToVerify = stringToVerifyWithoutLastChar.toCharArray();

        int lastInt = Integer.parseInt(lastChar);

        int[] arrayIntToVerify = new int[arrayToVerify.length];

        for (int i = 0; i < arrayToVerify.length; i++) {
            arrayIntToVerify[i] = Character.getNumericValue(arrayToVerify[i]);
        }

        return ((arrayIntToVerify[0] * 10 + arrayIntToVerify[1] * 9 + arrayIntToVerify[2] * 8 + arrayIntToVerify[3] * 7 + arrayIntToVerify[4] * 6 +
                arrayIntToVerify[5] * 5 + arrayIntToVerify[6] * 4 + arrayIntToVerify[7] * 3 + arrayIntToVerify[8] * 2 + lastInt) % 11) == 0;
    }
}
