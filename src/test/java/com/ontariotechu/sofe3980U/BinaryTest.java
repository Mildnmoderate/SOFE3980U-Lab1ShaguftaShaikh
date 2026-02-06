package com.ontariotechu.sofe3980U;

import org.junit.Test;
import static org.junit.Assert.*;

public class BinaryTest {
    @Test
    public void testBinaryConstructor() {
        Binary b = new Binary("1010");
        assertEquals("1010", b.getValue());
    }
    
    @Test
    public void testBinaryConstructorWithLeadingZeros() {
        Binary b = new Binary("001010");
        assertEquals("1010", b.getValue());
    }
    
    @Test
    public void testBinaryConstructorZero() {
        Binary b = new Binary("0");
        assertEquals("0", b.getValue());
    }
    
    @Test
    public void testBinaryConstructorMultipleZeros() {
        Binary b = new Binary("000");
        assertEquals("0", b.getValue());
    }
    
    @Test
    public void testBinaryAdd() {
        Binary b1 = new Binary("1010"); // 10
        Binary b2 = new Binary("1100"); // 12
        Binary result = Binary.add(b1, b2);
        assertEquals("10110", result.getValue()); // 22 in binary
    }
    
    @Test
    public void testBinaryAddWithZero() {
        Binary b1 = new Binary("1010");
        Binary b2 = new Binary("0");
        Binary result = Binary.add(b1, b2);
        assertEquals("1010", result.getValue());
    }
    
    @Test
    public void testBinaryOr() {
        Binary b1 = new Binary("1010"); // 1010 (10)
        Binary b2 = new Binary("1100"); // 1100 (12)
        Binary result = Binary.or(b1, b2);
        assertEquals("1110", result.getValue()); // 1110 (14)
    }
    
    @Test
    public void testBinaryOrWithZero() {
        Binary b1 = new Binary("1111");
        Binary b2 = new Binary("0000");
        Binary result = Binary.or(b1, b2);
        assertEquals("1111", result.getValue());
    }
    
    @Test
    public void testBinaryAnd() {
        Binary b1 = new Binary("1010");
        Binary b2 = new Binary("1100");
        Binary result = Binary.and(b1, b2);
        assertEquals("1000", result.getValue()); // 1000 (8)
    }
    
    @Test
    public void testAndWithZero() {
        Binary b1 = new Binary("1111");
        Binary b2 = new Binary("0000");
        Binary result = Binary.and(b1, b2);
        assertEquals("0", result.getValue());
    }
    
    @Test
    public void testAndSameNumber() {
        Binary b1 = new Binary("1010");
        Binary result = Binary.and(b1, b1);
        assertEquals("1010", result.getValue());
    }
    
    @Test
    public void testBinaryMultiply() {
        Binary b1 = new Binary("1010"); // 10
        Binary b2 = new Binary("1100"); // 12
        Binary result = Binary.multiply(b1, b2);
        assertEquals("1111000", result.getValue()); // 120
    }
    
    @Test
    public void testBinaryMultiplyByZero() {
        Binary b1 = new Binary("1010");
        Binary b2 = new Binary("0");
        Binary result = Binary.multiply(b1, b2);
        assertEquals("0", result.getValue());
    }
    
    @Test
    public void testBinaryMultiplyByOne() {
        Binary b1 = new Binary("1010");
        Binary b2 = new Binary("1");
        Binary result = Binary.multiply(b1, b2);
        assertEquals("1010", result.getValue());
    }
}