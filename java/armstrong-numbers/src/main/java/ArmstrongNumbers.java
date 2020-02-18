class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {

		int lengthOfNumToCheck = (int) (Math.log10(numberToCheck) + 1);

		if(lengthOfNumToCheck == 1) {
			return true;
		}

		int sum = 0;
		int numberToCheckCopy = numberToCheck;

		while (numberToCheckCopy > 0) {
			int digit = numberToCheckCopy % 10;
			int pow = (int) Math.pow(digit, lengthOfNumToCheck);
			sum += pow;
			numberToCheckCopy = numberToCheckCopy /10;
		}

		return numberToCheck == sum;
	}
}
