package Test;

import Calculator.NumberGenerator;

import static org.junit.jupiter.api.Assertions.*;

class NumberGeneratorTest {
    NumberGenerator generator;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        generator = new NumberGenerator();
        generator.firstNumber = 9;
        generator.secondNumber = 6;
        generator.questionType = 0;
    }

    @org.junit.jupiter.api.Test
    void verifyTheResult() {
        assertTrue(generator.VerifyTheResult(15));
        generator.questionType = 1;
        assertTrue(generator.VerifyTheResult(3));
        generator.questionType = 2;
        assertTrue(generator.VerifyTheResult(54));
        generator.questionType = 3;
        assertTrue(generator.VerifyTheResult(1));
    }

    @org.junit.jupiter.api.Test
    void calculation() {
        assertEquals(2, generator.Calculation());
    }
}