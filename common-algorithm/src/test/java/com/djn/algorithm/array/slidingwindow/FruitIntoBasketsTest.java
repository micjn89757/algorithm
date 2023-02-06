package com.djn.algorithm.array.slidingwindow;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FruitIntoBasketsTest {

    @Test
    public void testTotalFruit() {
        int[] fruits = {0,1,6,6,4,4,6};
        assertEquals(5, FruitIntoBaskets.totalFruit(fruits), "收集水果的最大数目不正确");
    }
}
