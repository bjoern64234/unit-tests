import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void isPositive_isTrueWhenNumberIsPositive() {
        // Given
        int number = 5;
        boolean expected = true;
        // When
        boolean result = Main.isPositive(number);
        // Then
        assertEquals(expected, result);
    }

    @Test
    void isPositive_isFalseWhenNumberIsNegative() {
        // Given
        int number = -5;
        boolean expected = false;
        // When
        boolean result = Main.isPositive(number);
        // Then
        assertEquals(expected, result);
    }

    @Test
    void multiply() {
        // Given
        int a = 5;
        int b = 5;
        int actual = 25;
        // When
        int result = Main.multiply(a, b);
        int negativeResult = Main.multiply(a, -b);
        // Then
        assertEquals(actual, result);
        assertEquals(-1 * actual, negativeResult);
    }

    @Test
    void getFirstLetter_isTrueWhenTextIsNoNull() {
        // Given
        String text = "Hier folgt der Text ...";
        String actual = "H";
        // When
        String result = Main.getFirstLetter(text);
        // Then
        assertNotNull(actual, result);
        assertEquals(actual, result);
    }

    @Test
    void getFirstLetter_isTrueWhenTextIsEmpty() {
        // Given
        String text = "";
        String actual = null;
        // When
        String result = Main.getFirstLetter(text);
        // Then
        assertNull(actual, result);
    }

    @Test
    void divide_ThrowsExceptionWhenFirst() {
        // Given
        int a = 10;
        int b = 0;
        // When
        // Then
        assertThrows(IllegalArgumentException.class, () -> Main.divide(a, b));
    }

    @ParameterizedTest
    @CsvSource({
            "2",
            "3",
            "5"
    })
    void isPrime(int a) {
        boolean isPrime = Main.isPrime(a);

        assertTrue(isPrime);
    }

    @Test
    void sum() {
        // Given
        int a = 10;
        int b = 3;
        int expected = 13;
        // When
        int actual = Main.sum(a, b);
        // Then
        assertEquals(expected, actual);
    }

    @Test
    void isEven_isTrueWhenNumberIsEvenEven() {
        assertTrue(Main.isEven(2));
    }

    @Test
    void isEven_isFalseWhenNumberIsNotEven() {
        assertFalse(Main.isEven(1));
    }

    @Test
    void reverseString() {
        // Given
        String input = "Hallo";
        String expected = "ollaH";
        // When
        String actual = Main.reverseString(input);
        // Then
        assertEquals(expected, actual);
    }

    @Test
    void isPalindrome_isTrueWhenWordIsPalindrome() {
        // Given
        String input = "Otto";
        // Then
        assertTrue(Main.isPalindrome(input));
    }

    @Test
    void isPalindrome_isFalseWhenWordIsNotPalindrome() {
        // Given
        String input = "Java";
        // Then
        assertFalse(Main.isPalindrome(input));
    }

    @Test
    void countVowels() {
        // Given
        String input = "Hallo";
        int expected = 2;
        // When
        int actual = Main.countVowels(input);
        // Then
        assertEquals(expected, actual);
    }

    @Test
    void factorial() {
        // Given
        int input = 5;
        int expected = 120;
        // When
        int actual = Main.factorial(input);
        // Then
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "1, 1",
            "2, 1",
            "3, 2",
            "4, 3",
            "5, 5",
            "6, 8",
            "7, 13"
    })
    void fibonacci(int n, int expected) {
        int actual = Main.fibonacci(n);

        assertEquals(expected, actual);
    }

    @Test
    void mergeArrays() {
        // Given
        int[] a = {1, 2};
        int[] b = {3, 4};
        int[] expected = {1, 2, 3, 4};
        // When
        int[] actual = Main.mergeArrays(a, b);
        // Then
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }
}