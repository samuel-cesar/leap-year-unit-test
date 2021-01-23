package school.cesar.eta.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeStaticTest {

    @Test
    public void check_1CharWord_true(){
        String word = "a";
        boolean actual;

        actual = PalindromeStatic.check(word);
        Assertions.assertTrue(actual);
    }

    @Test
    public void check_1stCharNotEqualtoLast_false(){
        String word = "oba";
        boolean actual;

        actual = PalindromeStatic.check(word);
        Assertions.assertFalse(actual);
    }

    @Test
    public void check_wordIsPalindrome_true(){
        String word = "ovo";
        boolean actual;

        actual = PalindromeStatic.check(word);
        Assertions.assertTrue(actual);
    }
}


