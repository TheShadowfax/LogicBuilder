package com.ereinsure.operators.arithmeticOperators;

import com.ereinsure.operators.EOperatorInputTypes;
import com.ereinsure.operators.OperatorMetaData;

public class BinaryArithmeticOperator extends ArithmeticOperator{
    public BinaryArithmeticOperator(){
        super(new OperatorMetaData().setInputType(EOperatorInputTypes.NUMBER).setOutputType(EOperatorInputTypes.NUMBER).setMinOperands(2).setMaxOperands(2));
    }
}
