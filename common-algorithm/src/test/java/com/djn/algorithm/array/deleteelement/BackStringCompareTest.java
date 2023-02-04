package com.djn.algorithm.array.deleteelement;

import org.junit.Test;
import static org.junit.Assert.assertTrue;


public class BackStringCompareTest {
    @Test
    public void testBackspaceCompare() {
        String s = "a##c";
        String t = "#a#c";

        assertTrue(BackStringCompare.backspaceCompare(s, t));
    }
}
