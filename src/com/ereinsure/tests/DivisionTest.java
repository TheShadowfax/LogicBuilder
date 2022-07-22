package com.ereinsure.tests;

import com.ereinsure.operators.EOperatorInputTypes;
import com.ereinsure.operators.arithmeticOperators.DivideOperator;
import com.ereinsure.operators.arithmeticOperators.MultiplyOperator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DivisionTest extends BaseTest{

    @Test
    public void testDivisionWithInteger() throws Exception {
        assertEquals(3, new DivideOperator()
                .addOperand(this.getNewConstantOperand(6, EOperatorInputTypes.NUMBER))
                .addOperand(this.getNewConstantOperand(2, EOperatorInputTypes.NUMBER))
                .compute()
        );
    }

    @Test
    public void testDivisionWithDecimals() throws Exception{
        assertEquals(1.1, new DivideOperator()
                .addOperand(this.getNewConstantOperand(2.2, EOperatorInputTypes.NUMBER))
                .addOperand(this.getNewConstantOperand(2, EOperatorInputTypes.NUMBER))
                .compute()
        );
    }

    @Test
    public void testDivisionWithDynamicOperand() throws Exception {
        assertEquals(1.57, new DivideOperator()
                .addOperand(this.getNewDynamicOperand("PI", EOperatorInputTypes.NUMBER))
                .addOperand(this.getNewConstantOperand(2, EOperatorInputTypes.NUMBER))
                .compute()
        );
    }

    @Test
    public void testDivisionWithReferenceOperand() throws Exception {
        assertEquals(3, new DivideOperator()
                .addOperand(this.getNewConstantOperand(21, EOperatorInputTypes.NUMBER))
                .addOperand(this.getNewReferenceOperand("RADIUS", EOperatorInputTypes.NUMBER))
                .compute()
        );
    }
}
