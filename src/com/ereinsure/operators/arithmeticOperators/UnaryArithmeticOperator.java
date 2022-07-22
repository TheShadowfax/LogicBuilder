package com.ereinsure.operators.arithmeticOperators;

import com.ereinsure.operators.EOperatorInputTypes;
import com.ereinsure.operators.OperatorMetaData;

public class UnaryArithmeticOperator extends ArithmeticOperator{
    public UnaryArithmeticOperator(){
        super(new OperatorMetaData().setInputType(EOperatorInputTypes.NUMBER).setOutputType(EOperatorInputTypes.BOOLEAN).setMinOperands(1).setMaxOperands(1));
    }
}
