package com.ereinsure.tests;

import com.ereinsure.operators.EOperatorInputTypes;
import com.ereinsure.operators.arithmeticOperators.CeilOperator;
import com.ereinsure.operators.arithmeticOperators.FloorOperator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FloorTest extends BaseTest{

    @Test
    public void testFloorWithInteger() throws Exception {
        assertEquals(2, new FloorOperator()
                .addOperand(this.getNewConstantOperand(2, EOperatorInputTypes.NUMBER))
                .compute()
        );
    }

    @Test
    public void testFloorWithDecimals() throws Exception{
        assertEquals(2, new FloorOperator()
                .addOperand(this.getNewConstantOperand(2.2, EOperatorInputTypes.NUMBER))
                .compute()
        );
    }

    @Test
    public void testFloorWithDynamicOperand() throws Exception {
        assertEquals(3, new FloorOperator()
                .addOperand(this.getNewDynamicOperand("PI", EOperatorInputTypes.NUMBER))
                .compute()
        );
    }

    @Test
    public void testFloorWithReferenceOperand() throws Exception {
        assertEquals(7, new FloorOperator()
                .addOperand(this.getNewReferenceOperand("RADIUS", EOperatorInputTypes.NUMBER))
                .compute()
        );
    }
}
