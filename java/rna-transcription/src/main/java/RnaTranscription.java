class RnaTranscription {

    String transcribe(String dnaStrand) {

      dnaStrand = dnaStrand.toUpperCase();
      char[] dnaChar = new char[dnaStrand.length()];
      String dnaStrandNew = "";

      if (dnaStrand.isEmpty()) {
          return dnaStrand;
      }

      for (int i = 0; i < dnaStrand.length() ; i++) {
            dnaChar[i] = dnaStrand.charAt(i);
      }

      replace(dnaChar);

      dnaStrandNew += String.valueOf(dnaChar);

      return dnaStrandNew;
    }

    char[] replace(char[] dnaArrayChar ) {
        for (int i = 0; i < dnaArrayChar.length ; i++) {
            switch (dnaArrayChar[i]) {
                case 'A':
                    dnaArrayChar[i] = 'U';
                    break;
                case 'T':
                    dnaArrayChar[i] = 'A';
                    break;
                case 'C':
                    dnaArrayChar[i] = 'G';
                    break;
                case 'G':
                    dnaArrayChar[i] = 'C';
                    break;
            }
        }
        return dnaArrayChar;
    }
}
