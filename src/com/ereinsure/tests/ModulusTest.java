package com.ereinsure.tests;

import com.ereinsure.operators.EOperatorInputTypes;
import com.ereinsure.operators.arithmeticOperators.AddOperator;
import com.ereinsure.operators.arithmeticOperators.ModulusOperator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ModulusTest extends BaseTest{

    @Test
    public void testModulusWithInteger() throws Exception {
        assertEquals(5, new ModulusOperator()
                .addOperand(this.getNewConstantOperand(23, EOperatorInputTypes.NUMBER))
                .addOperand(this.getNewConstantOperand(6, EOperatorInputTypes.NUMBER))
                .compute()
        );
    }

    @Test
    public void testModulusWithDecimals() throws Exception{
        assertEquals(5.5, new ModulusOperator()
                .addOperand(this.getNewConstantOperand(23.5, EOperatorInputTypes.NUMBER))
                .addOperand(this.getNewConstantOperand(6, EOperatorInputTypes.NUMBER))
                .compute()
        );
    }

    @Test
    public void testModulusWithDynamicOperand() throws Exception {
        assertEquals(0, new ModulusOperator()
                .addOperand(this.getNewConstantOperand(6.28, EOperatorInputTypes.NUMBER))
                .addOperand(this.getNewDynamicOperand("PI", EOperatorInputTypes.NUMBER))
                .compute()
        );
    }

    @Test
    public void testModulusWithReferenceOperand() throws Exception {
        assertEquals(2, new ModulusOperator()
                .addOperand(this.getNewConstantOperand(16, EOperatorInputTypes.NUMBER))
                .addOperand(this.getNewReferenceOperand("RADIUS", EOperatorInputTypes.NUMBER))
                .compute()
        );
    }
}
