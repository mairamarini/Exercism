public class Main {
    public static void main(String[] args) {
        System.out.println((3 * 10 + 5 * 9 + 9 * 8 + 8 * 7 + 2 * 6 + 1 * 5 + 5 * 4 + 0 * 3 + 8 * 2 + 8 * 1) % 11);

        IsbnVerifier isbnVerifier = new IsbnVerifier();

        isbnVerifier.isValid("3-598-21508-8");
        isbnVerifier.isValid("3-598-21507-X");

    }
}
