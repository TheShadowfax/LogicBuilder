package com.ereinsure.tests;

import com.ereinsure.operators.EOperatorInputTypes;
import com.ereinsure.operators.arithmeticOperators.AddOperator;
import com.ereinsure.operators.arithmeticOperators.PowerOfOperator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PowerOfTest extends BaseTest{

    @Test
    public void testPowerOfWithInteger() throws Exception {
        assertEquals(4, new PowerOfOperator()
                .addOperand(this.getNewConstantOperand(2, EOperatorInputTypes.NUMBER))
                .addOperand(this.getNewConstantOperand(2, EOperatorInputTypes.NUMBER))
                .compute()
        );
    }

    @Test
    public void testPowerOfWithDecimals() throws Exception{
        assertEquals(6.25, new PowerOfOperator()
                .addOperand(this.getNewConstantOperand(2.5, EOperatorInputTypes.NUMBER))
                .addOperand(this.getNewConstantOperand(2, EOperatorInputTypes.NUMBER))
                .compute()
        );
    }

    @Test
    public void testPowerOfWithDynamicOperand() throws Exception {
        assertEquals(9.8596, new PowerOfOperator()
                .addOperand(this.getNewDynamicOperand("PI", EOperatorInputTypes.NUMBER))
                .addOperand(this.getNewConstantOperand(2, EOperatorInputTypes.NUMBER))
                .compute()
        );
    }

    @Test
    public void testPowerOfWithReferenceOperand() throws Exception {
        assertEquals(128, new PowerOfOperator()
                .addOperand(this.getNewConstantOperand(2, EOperatorInputTypes.NUMBER))
                .addOperand(this.getNewReferenceOperand("RADIUS", EOperatorInputTypes.NUMBER))
                .compute()
        );
    }
}
