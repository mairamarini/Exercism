class Leap {

      boolean isLeapYear(int year) {
        if (year % 100 == 0 && year % 400 != 0) {
            return false;
        } else if(year % 400 == 0 || year % 4 == 0) {
            return true;
        } else return false;
    }
}
