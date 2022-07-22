package com.ereinsure.tests;

import com.ereinsure.operators.EOperatorInputTypes;
import com.ereinsure.operators.arithmeticOperators.CeilOperator;
import com.ereinsure.operators.arithmeticOperators.RoundOperator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoundTest extends BaseTest{

    @Test
    public void testRoundWithInteger() throws Exception {
        assertEquals(2, new RoundOperator()
                .addOperand(this.getNewConstantOperand(2, EOperatorInputTypes.NUMBER))
                .compute()
        );
    }

    @Test
    public void testRoundWithDecimals() throws Exception{
        assertEquals(2, new RoundOperator()
                .addOperand(this.getNewConstantOperand(2.2, EOperatorInputTypes.NUMBER))
                .compute()
        );
    }

    @Test
    public void testRoundWithDynamicOperand() throws Exception {
        assertEquals(3, new RoundOperator()
                .addOperand(this.getNewDynamicOperand("PI", EOperatorInputTypes.NUMBER))
                .compute()
        );
    }

    @Test
    public void testRoundWithReferenceOperand() throws Exception {
        assertEquals(7, new RoundOperator()
                .addOperand(this.getNewReferenceOperand("RADIUS", EOperatorInputTypes.NUMBER))
                .compute()
        );
    }
}
