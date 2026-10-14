package com.example;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    public class PrimeCheckerTest {
        @Test 
        void test() {
            PrimeChecker p = new PrimeChecker();
            assertTrue(p.isPrime(7));
            assertFalse(p.isPrime(4));            
        }
    }
}
