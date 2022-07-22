package com.ereinsure.tests;

import com.ereinsure.operators.EOperatorInputTypes;
import com.ereinsure.operators.arithmeticOperators.MultiplyOperator;
import com.ereinsure.operators.arithmeticOperators.SubtractOperator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplicationTest extends BaseTest{

    @Test
    public void testMultiplicationWithInteger() throws Exception {
        assertEquals(12, new MultiplyOperator()
                .addOperand(this.getNewConstantOperand(6, EOperatorInputTypes.NUMBER))
                .addOperand(this.getNewConstantOperand(2, EOperatorInputTypes.NUMBER))
                .compute()
        );
    }

    @Test
    public void testMultiplicationWithDecimals() throws Exception{
        assertEquals(4.4, new MultiplyOperator()
                .addOperand(this.getNewConstantOperand(2.2, EOperatorInputTypes.NUMBER))
                .addOperand(this.getNewConstantOperand(2, EOperatorInputTypes.NUMBER))
                .compute()
        );
    }

    @Test
    public void testMultiplicationWithDynamicOperand() throws Exception {
        assertEquals(6.28, new MultiplyOperator()
                .addOperand(this.getNewDynamicOperand("PI", EOperatorInputTypes.NUMBER))
                .addOperand(this.getNewConstantOperand(2, EOperatorInputTypes.NUMBER))
                .compute()
        );
    }

    @Test
    public void testMultiplicationWithReferenceOperand() throws Exception {
        assertEquals(21, new MultiplyOperator()
                .addOperand(this.getNewConstantOperand(3, EOperatorInputTypes.NUMBER))
                .addOperand(this.getNewReferenceOperand("RADIUS", EOperatorInputTypes.NUMBER))
                .compute()
        );
    }
}
