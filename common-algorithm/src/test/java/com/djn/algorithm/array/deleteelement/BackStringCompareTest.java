package com.djn.algorithm.array.deleteelement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BackStringCompareTest {
    @Test
    public void testBackspaceCompare() {
        String s = "a##c";
        String t = "#a#c";

        assertTrue(BackStringCompare.backspaceCompare(s, t));
    }
}
