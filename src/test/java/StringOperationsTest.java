import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import pjatk.tau.StringOperations;

import static org.junit.jupiter.api.Assertions.*;

public class StringOperationsTest {

    @ParameterizedTest
    @DisplayName("Is reverse function ok")
    @ValueSource(strings = {"aba", "aca", "acca", "1221"})
    public void testReverseTrue(String candidate) {
        assertEquals(candidate, StringOperations.reverse(candidate));
    }

    @ParameterizedTest
    @DisplayName("Is reverse function not ok")
    @ValueSource(strings = {"abc", "cab"})
    public void testReverseFalse(String candidate) {
        assertNotEquals(candidate, StringOperations.reverse(candidate));
    }

    @ParameterizedTest
    @DisplayName("Is Concat function ok")
    @ValueSource(strings = {"abc", "asd", "123", "@@#@", "mcxm,,mksdjaklj"})
    public void testConcatTrue(String candidate) {
        assertEquals(candidate.concat(candidate), StringOperations.concat(candidate, candidate));
    }

    @ParameterizedTest
    @DisplayName("Is Concat function not ok")
    @ValueSource(strings = {"abc", "asd", "123", "@@#@", "mcxm,,mksdjaklj"})
    public void testConcatNotTrue(String candidate) {
        assertNotEquals(candidate, StringOperations.concat(candidate, candidate));
    }

    @ParameterizedTest
    @DisplayName("Is palindrome function ok")
    @ValueSource(strings = {"a", "b", "aba", "aaa"})
    public void testPalindromeTrue(String candidate) {
        assertTrue(StringOperations.isPalindrome(candidate));
    }
    @ParameterizedTest
    @DisplayName("Is palindrome function not ok")
    @ValueSource(strings = {"acvb", "acvbacvbacvbacvbacvbacvb", "asfdafasdfe", "qwerdadvzstgarefda"})
    public void testPalindromeFalse(String candidate) {
        assertFalse(StringOperations.isPalindrome(candidate));
    }
}
