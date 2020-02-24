class Darts {

    private int score;

    Darts(double x, double y) {
        double distance = Math.sqrt(x * x + y * y );

        if (distance <= 1) {
            score = 10;
        } else if (distance > 1 && distance <= 5){
            score = 5;
        } else if (distance > 5 && distance <= 10 ){
            score = 1;
        } else {
            score = 0;
        }
    }

    int score() {
       return score;
    }
}
