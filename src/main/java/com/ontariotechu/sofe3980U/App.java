/**
 * The main application class for the Binary Calculator.
 * Demonstrates binary operations: ADD, OR, AND, MULTIPLY.
 * Uses Joda Time library to display current date and time.
 */
package com.ontariotechu.sofe3980U;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) {
        // Display current date and time using Joda Time
        DateTime dt = new DateTime();
        DateTimeFormatter fmt = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("=== SOFE3980U Lab 1 - Binary Calculator ===");
        System.out.println("Current Date & Time: " + fmt.print(dt));
        System.out.println();
        
        // Test case 1: Basic operations
        System.out.println("Test Case 1: Basic Operations");
        Binary b1 = new Binary("1010");  // 10 in decimal
        Binary b2 = new Binary("1100");  // 12 in decimal
        
        System.out.println("Binary 1: " + b1.getValue() + " (decimal: " + 
                          Integer.parseInt(b1.getValue(), 2) + ")");
        System.out.println("Binary 2: " + b2.getValue() + " (decimal: " + 
                          Integer.parseInt(b2.getValue(), 2) + ")");
        System.out.println();
        
        System.out.println("Results:");
        System.out.println("  ADD:      " + Binary.add(b1, b2).getValue());
        System.out.println("  OR:       " + Binary.or(b1, b2).getValue());
        System.out.println("  AND:      " + Binary.and(b1, b2).getValue());
        System.out.println("  MULTIPLY: " + Binary.multiply(b1, b2).getValue());
        
        // Test case 2: Edge cases
        System.out.println("\nTest Case 2: Edge Cases");
        Binary zero = new Binary("0");
        Binary one = new Binary("1");
        Binary fifteen = new Binary("1111");  // 15
        
        System.out.println("0 AND 1 = " + Binary.and(zero, one).getValue());
        System.out.println("0 OR 1  = " + Binary.or(zero, one).getValue());
        System.out.println("1 * 15  = " + Binary.multiply(one, fifteen).getValue());
        System.out.println("15 * 15 = " + Binary.multiply(fifteen, fifteen).getValue());
        
        // Test case 3: More examples
        System.out.println("\nTest Case 3: Additional Examples");
        Binary b3 = new Binary("0101");  // 5
        Binary b4 = new Binary("0011");  // 3
        
        System.out.println("5 OR 3  = " + Binary.or(b3, b4).getValue() + 
                         " (binary) = " + Integer.parseInt(Binary.or(b3, b4).getValue(), 2) + " (decimal)");
        System.out.println("5 AND 3 = " + Binary.and(b3, b4).getValue() + 
                         " (binary) = " + Integer.parseInt(Binary.and(b3, b4).getValue(), 2) + " (decimal)");
        System.out.println("5 * 3   = " + Binary.multiply(b3, b4).getValue() + 
                         " (binary) = " + Integer.parseInt(Binary.multiply(b3, b4).getValue(), 2) + " (decimal)");
    }
}
