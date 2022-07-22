package com.ereinsure.operators.realtionalOperators;

import com.ereinsure.operators.EOperatorInputTypes;
import com.ereinsure.operators.OperatorMetaData;

public class BinaryRelationalOperator extends RelationalOperator{
    public BinaryRelationalOperator(){
        super(new OperatorMetaData().setInputType(EOperatorInputTypes.BOOLEAN).setOutputType(EOperatorInputTypes.BOOLEAN).setMinOperands(2).setMaxOperands(2));
    }
}
