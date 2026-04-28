import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean isPositive = isPositive(5);
        System.out.println(isPositive);

        int multiply = multiply(5, 2);
        System.out.println(multiply);

        Scanner input = new Scanner(System.in);
        System.out.println("Gib hier deinen Text ein:");
        String text = input.nextLine();
        String firstLetterFromText = getFirstLetter(text);
        System.out.println(firstLetterFromText);

        double divide = divide(10, 3);
        System.out.println(divide);

        boolean isPrime = isPrime(4);
        System.out.println(isPrime);

        System.out.println("Bitte Wort eingeben:");
        String word = input.nextLine();
        reverseString(word);
    }

    public static boolean isPositive(int number) {
        return number > 0;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static String getFirstLetter(String text) {

        if (text == null || text.isEmpty()) {
            return null;
        }

        return text.substring(0, 1);
    }

    public static double divide(int a, int b) {

        if (b == 0) {
            throw new IllegalArgumentException("Eine Division durch den Wert 0 ist nicht erlaubt");
        }

        return a / b;
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        if (number == 2) {
            return true;
        }

        if (number % 2 == 0) {
            return false;
        }

        for (int i = 3; i < Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }

            if (i > Math.sqrt(number)) {
                return true;
            }
        }

        return true;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static String reverseString(String input) {
        String[] arrayFrom = input.split("");
        String[] arrayTo = new String[arrayFrom.length];

        for (int i = 0; i < arrayFrom.length; i++) {
            arrayTo[arrayFrom.length - i - 1] = arrayFrom[i];
        }

        return String.join("", arrayTo);
    }

    public static boolean isPalindrome(String text) {
        String toLower = text.toLowerCase();
        String reverse = reverseString(toLower);

        if (!toLower.equals(reverse)) {
            return false;
        }

        return true;
    }

    public static int countVowels(String text) {
        String[] helper = {"a", "e", "i", "o", "u"};
        String[] arrayFrom = text.toLowerCase().split("");
        int count = 0;

        for (String item : arrayFrom) {
            if (Arrays.asList(helper).contains(item)) {
                count++;
            }
        }

        return count;
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }

        int result = 1;
        for (int i = 1; i < n + 1; i++) {
            result *= i;
        }

        return result;
    }

    public static int fibonacci(int n) {
        if (n < 3) {
            return 1;
        }

        int fn2 = 1, fn1 = 1;
        for (int i = 3; i <= n; i++) {
            int stepBefore = fn2 + fn1;
            fn1 = fn2;
            fn2 = stepBefore;
        }

        return fn2;
    }

    public static int[] mergeArrays(int[] a, int[] b) {
        int sizeOfa = a.length;
        int sizeOfb = b.length;
        int[] result = new int[sizeOfa + sizeOfb];
        int index = 0;

        for (int num : a) {
            result[index] = num;
            index++;
        }

        for (int num : b) {
            result[index] = num;
            index++;
        }

        return result;
    }
}