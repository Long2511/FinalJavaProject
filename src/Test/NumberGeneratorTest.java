package Test;

import Calculator.*;

import static org.junit.jupiter.api.Assertions.*;

class NumberGeneratorTest {
    NumberGenerator generator;


    @org.junit.jupiter.api.Test
    void verifyTheResultAdd() {
        generator = new AddOperation(3,4);
        assertTrue(generator.VerifyTheResult(7));
    }
    @org.junit.jupiter.api.Test
    void verifyTheResultSubtract() {
        generator = new SubtractOperation(8,4);
        assertTrue(generator.VerifyTheResult(4));
    }
    @org.junit.jupiter.api.Test
    void verifyTheResultMultiple() {
        generator = new MultipleOperation(8,4);
        assertTrue(generator.VerifyTheResult(32));
    }
    @org.junit.jupiter.api.Test
    void verifyTheResultDivide() {
        generator = new DivideOperation(8,4);
        assertTrue(generator.VerifyTheResult(2));
    }

    @org.junit.jupiter.api.Test
    void calculationAdd() {
        generator = new AddOperation(2,3);
        assertEquals(5, generator.Calculation());
    }
    @org.junit.jupiter.api.Test
    void calculationSubtract() {
        generator = new SubtractOperation(2,3);
        assertEquals(-1, generator.Calculation());
    }
    @org.junit.jupiter.api.Test
    void calculationDivide() {
        generator = new DivideOperation(9,3);
        assertEquals(3, generator.Calculation());
    }
    @org.junit.jupiter.api.Test
    void calculationMultiple() {
        generator = new MultipleOperation(2,3);
        assertEquals(6, generator.Calculation());
    }
}