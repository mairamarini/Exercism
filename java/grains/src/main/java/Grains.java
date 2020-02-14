import java.math.BigInteger;

class Grains {

    private static final BigInteger two = new BigInteger("2");

    BigInteger grainsOnSquare(final int square) {

        int power = square - 1;

        if(square < 1 || square > 64) {
            throw new IllegalArgumentException("square must be between 1 and 64");
        }
       return two.pow(power);
    }

    BigInteger grainsOnBoard() {

        BigInteger totalChessboard = new BigInteger("0");

        for (int i = 0; i < 64 ; i++) {
          totalChessboard = totalChessboard.add(two.pow(i));
        }
        return totalChessboard;
    }
}
