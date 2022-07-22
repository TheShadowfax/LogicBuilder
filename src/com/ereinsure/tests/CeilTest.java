package com.ereinsure.tests;

import com.ereinsure.operators.EOperatorInputTypes;
import com.ereinsure.operators.arithmeticOperators.AddOperator;
import com.ereinsure.operators.arithmeticOperators.CeilOperator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CeilTest extends BaseTest{

    @Test
    public void testCeilWithInteger() throws Exception {
        assertEquals(2, new CeilOperator()
                .addOperand(this.getNewConstantOperand(2, EOperatorInputTypes.NUMBER))
                .compute()
        );
    }

    @Test
    public void testCeilWithDecimals() throws Exception{
        assertEquals(3, new CeilOperator()
                .addOperand(this.getNewConstantOperand(2.2, EOperatorInputTypes.NUMBER))
                .compute()
        );
    }

    @Test
    public void testCeilWithDynamicOperand() throws Exception {
        assertEquals(4, new CeilOperator()
                .addOperand(this.getNewDynamicOperand("PI", EOperatorInputTypes.NUMBER))
                .compute()
        );
    }

    @Test
    public void testCeilWithReferenceOperand() throws Exception {
        assertEquals(7, new CeilOperator()
                .addOperand(this.getNewReferenceOperand("RADIUS", EOperatorInputTypes.NUMBER))
                .compute()
        );
    }
}
