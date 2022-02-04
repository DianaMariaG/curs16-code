package homework.recursion;

import org.junit.jupiter.api.Test;
import ro.fasttrackit.curs16.homework.recursion.RecursionMethods;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RecursionMethodsTest {
    @Test
    void testSumOfFirstNNumbers() {
        RecursionMethods recursionMethods = new RecursionMethods();
        assertThat(recursionMethods.sumOfFirstNNumbers(0)).isZero();
        assertThat(recursionMethods.sumOfFirstNNumbers(1)).isEqualTo(1);
        assertThat(recursionMethods.sumOfFirstNNumbers(3)).isEqualTo(6);
    }
    @Test
    void testSumOfFirstNEvenIntegers() {
        RecursionMethods recursionMethods = new RecursionMethods();
        assertThat(recursionMethods.sumOfEvenNumbers(0)).isZero();
        assertThat(recursionMethods.sumOfEvenNumbers(1)).isEqualTo(0);
        assertThat(recursionMethods.sumOfEvenNumbers(3)).isEqualTo(2);
        assertThat(recursionMethods.sumOfEvenNumbers(10)).isEqualTo(30);
    }
    @Test
    void testSumOfOddIntegers() {
        RecursionMethods recursionMethods = new RecursionMethods();
        assertThat(recursionMethods.sumOfOddNumbers(0)).isZero();
        assertThat(recursionMethods.sumOfOddNumbers(1)).isEqualTo(1);
        assertThat(recursionMethods.sumOfOddNumbers(2)).isEqualTo(1);
        assertThat(recursionMethods.sumOfOddNumbers(3)).isEqualTo(4);
        assertThat(recursionMethods.sumOfOddNumbers(5)).isEqualTo(9);
    }
    @Test
    void testIsPalindrom() {
        RecursionMethods recursionMethods = new RecursionMethods();
        assertThat(recursionMethods.isPalindrome1(null)).isFalse();
        assertThat(recursionMethods.isPalindrome1("")).isTrue();
        assertThat(recursionMethods.isPalindrome1("v")).isTrue();
        assertThat(recursionMethods.isPalindrome1("ana")).isTrue();
        assertThat(recursionMethods.isPalindrome1("abcd")).isFalse();
    }

    @Test
    void testReverseString() {
        RecursionMethods recursionMethods = new RecursionMethods();
        assertThat(recursionMethods.reverseString(null)).isNull();
        assertThat(recursionMethods.reverseString("")).isEmpty();
        assertThat(recursionMethods.reverseString("a")).isEqualTo("a");
        assertThat(recursionMethods.reverseString("abc")).isEqualTo("cba");
    }
    @Test
    void testReversedStringIsPalindrome() {
        RecursionMethods recursionMethods = new RecursionMethods();
        assertThat(recursionMethods.isPalindrome2(null)).isFalse();
        assertThat(recursionMethods.isPalindrome2("")).isTrue();
        assertThat(recursionMethods.isPalindrome2("a")).isTrue();
        assertThat(recursionMethods.isPalindrome2("madam")).isTrue();
        assertThat(recursionMethods.isPalindrome2("cutie")).isFalse();
    }
    @Test
    void testSumOfDigits() {
        RecursionMethods recursionMethods = new RecursionMethods();
        assertThat(recursionMethods.sumOfDigits(0)).isZero();
        assertThat(recursionMethods.sumOfDigits(5)).isEqualTo(5);
        assertThat(recursionMethods.sumOfDigits(15)).isEqualTo(6);
        assertThat(recursionMethods.sumOfDigits(-34)).isEqualTo(7);
    }
    @Test
    void testFibonnaciRcursion() {
        RecursionMethods recursionMethods = new RecursionMethods();
        assertThat(recursionMethods.fibonacciRecursion(1)).isEqualTo(1);
        assertThat(recursionMethods.fibonacciRecursion(3)).isEqualTo(2);
        assertThat(recursionMethods.fibonacciRecursion(6)).isEqualTo(8);
    }
}
