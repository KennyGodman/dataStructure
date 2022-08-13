package com.Godman;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GodmanArrays {

    @Test
    void arrayTest() {
        int[] a = {11, 21, 3, 7, 60, 8, 18, 19, 18, 34, 57};
        int[] b = new int[34];
        for (int i = 0; i < 11; i++) {
            assertTrue(b[i] == 0);
        }

//        assertEquals(0, b[31]);
//    Arrays.copyOfRange(a, 0, 10);
        System.arraycopy(a, 0, b, 0, 11);
        for (int i = 0; i < a.length; i++) {
            assertEquals(a[i], b[i]);
        }
    }
}
