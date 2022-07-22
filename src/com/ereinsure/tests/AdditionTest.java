package com.ereinsure.tests;

import com.ereinsure.operands.ConstantOperand;
import com.ereinsure.operators.EOperatorInputTypes;
import com.ereinsure.operators.arithmeticOperators.AddOperator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdditionTest extends BaseTest{

    @Test
    public void testAdditionWithInteger() throws Exception {
        assertEquals(4, new AddOperator()
                .addOperand(this.getNewConstantOperand(2, EOperatorInputTypes.NUMBER))
                .addOperand(this.getNewConstantOperand(2, EOperatorInputTypes.NUMBER))
                .compute()
        );
    }

    @Test
    public void testAdditionWithDecimals() throws Exception{
        assertEquals(4.2, new AddOperator()
                .addOperand(this.getNewConstantOperand(2, EOperatorInputTypes.NUMBER))
                .addOperand(this.getNewConstantOperand(2.2, EOperatorInputTypes.NUMBER))
                .compute()
        );
    }

    @Test
    public void testAdditionWithDynamicOperand() throws Exception {
        assertEquals(5, new AddOperator()
                .addOperand(this.getNewConstantOperand(1.86, EOperatorInputTypes.NUMBER))
                .addOperand(this.getNewDynamicOperand("PI", EOperatorInputTypes.NUMBER))
                .compute()
        );
    }

    @Test
    public void testAdditionWithReferenceOperand() throws Exception {
        assertEquals(8.86, new AddOperator()
                .addOperand(this.getNewConstantOperand(1.86, EOperatorInputTypes.NUMBER))
                .addOperand(this.getNewReferenceOperand("RADIUS", EOperatorInputTypes.NUMBER))
                .compute()
        );
    }
}
