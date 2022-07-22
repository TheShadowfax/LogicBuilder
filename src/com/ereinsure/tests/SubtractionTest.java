package com.ereinsure.tests;

import com.ereinsure.operators.EOperatorInputTypes;
import com.ereinsure.operators.arithmeticOperators.AddOperator;
import com.ereinsure.operators.arithmeticOperators.SubtractOperator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubtractionTest extends BaseTest{

    @Test
    public void testSubtractionWithInteger() throws Exception {
        assertEquals(4, new SubtractOperator()
                .addOperand(this.getNewConstantOperand(6, EOperatorInputTypes.NUMBER))
                .addOperand(this.getNewConstantOperand(2, EOperatorInputTypes.NUMBER))
                .compute()
        );
    }

    @Test
    public void testSubtractionWithDecimals() throws Exception{
        assertEquals(0.2, new SubtractOperator()
                .addOperand(this.getNewConstantOperand(2.2, EOperatorInputTypes.NUMBER))
                .addOperand(this.getNewConstantOperand(2, EOperatorInputTypes.NUMBER))
                .compute()
        );
    }

    @Test
    public void testSubtractionWithDynamicOperand() throws Exception {
        assertEquals(2, new SubtractOperator()
                .addOperand(this.getNewDynamicOperand("PI", EOperatorInputTypes.NUMBER))
                .addOperand(this.getNewConstantOperand(1.14, EOperatorInputTypes.NUMBER))
                .compute()
        );
    }

    @Test
    public void testSubtractionWithReferenceOperand() throws Exception {
        assertEquals(-5.14, new SubtractOperator()
                .addOperand(this.getNewConstantOperand(3, EOperatorInputTypes.NUMBER))
                .addOperand(this.getNewReferenceOperand("RADIUS", EOperatorInputTypes.NUMBER))
                .compute()
        );
    }
}
