package com.ereinsure.tests;

import com.ereinsure.operands.ConstantOperand;
import com.ereinsure.operators.EOperatorInputTypes;
import com.ereinsure.operators.arithmeticOperators.AddOperator;
import com.ereinsure.operators.arithmeticOperators.PowerOfOperator;
import com.ereinsure.operators.arithmeticOperators.SubtractOperator;
import jdk.jfr.Description;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CompoundOperatorsTest extends BaseTest{
    @Test
    @Description("Calculate distance b/w two points")
    /*
        d=sqrt((x1-x2)^2 + (y1-y2)^2)
     */
    public void test1() throws Exception {
        int x1 = 2,x2 = 3, y1= 3, y2=6;
        assertEquals(3.1622776601683795, new PowerOfOperator().addOperand(
                new AddOperator()
                        .addOperand(
                                new PowerOfOperator().addOperand(
                                        new SubtractOperator().addOperand(
                                                new ConstantOperand(x1, EOperatorInputTypes.NUMBER)
                                        ).addOperand(
                                                new ConstantOperand(x2, EOperatorInputTypes.NUMBER)
                                        )
                                ).addOperand(new ConstantOperand(2, EOperatorInputTypes.NUMBER))
                        )
                        .addOperand(
                                new PowerOfOperator().addOperand(
                                        new SubtractOperator().addOperand(
                                                new ConstantOperand(y1, EOperatorInputTypes.NUMBER)
                                        ).addOperand(
                                                new ConstantOperand(y2, EOperatorInputTypes.NUMBER)
                                        )
                                ).addOperand(new ConstantOperand(2, EOperatorInputTypes.NUMBER))
                        )
        ).addOperand(new ConstantOperand(0.5, EOperatorInputTypes.NUMBER)).compute());
    }
}
