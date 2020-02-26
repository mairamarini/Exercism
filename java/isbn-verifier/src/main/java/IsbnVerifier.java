import java.util.Arrays;

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
            if(stringToVerifyWithoutLastChar.length() != 9){
                return false;
            }
            if(stringToVerifyWithoutLastChar.contains("^[a-Z]")) {
                return false;
            }
            if(lastChar.equals("X")){
                lastChar = "10";
            }
            if (!lastChar.equals("X") && lastChar.contains("^[a-Z]")){
                return false;
            }

            
           char[] arrayLastChar = lastChar.toCharArray();
            System.out.println(arrayLastChar);

           char[] arrayToVerify = stringToVerifyWithoutLastChar.toCharArray();
            System.out.println("ok");

           if(((arrayToVerify[0] * 10 + arrayToVerify[1] * 9 + arrayToVerify[2] * 8 + arrayToVerify[3] * 7 + arrayToVerify[4] * 6 +
                   arrayToVerify[5] * 5 + arrayToVerify[6] * 4 + arrayToVerify[7] * 3 + arrayToVerify[8] * 2 + arrayLastChar[0]) % 11) == 0 ){
               System.out.println("yey");
               return true;
           }
        }
        return false;
    }
}
