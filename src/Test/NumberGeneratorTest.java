package Test;

import Calculator.AddOperation;
import Calculator.NumberGenerator;

import static org.junit.jupiter.api.Assertions.*;

class NumberGeneratorTest {
    NumberGenerator generator;


    @org.junit.jupiter.api.Test
    void verifyTheResult() {
        generator = new AddOperation(1,1);
        assertTrue(generator.VerifyTheResult(15));
        assertTrue(generator.VerifyTheResult(3));
        assertTrue(generator.VerifyTheResult(54));
        assertTrue(generator.VerifyTheResult(1));
    }

    @org.junit.jupiter.api.Test
    void calculation() {
        assertEquals(2, generator.Calculation());
    }
}