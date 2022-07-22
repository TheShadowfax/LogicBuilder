package com.ereinsure.operators.logicalOperators;

import com.ereinsure.operators.EOperatorInputTypes;
import com.ereinsure.operators.OperatorMetaData;

public class BinaryLogicalOperator extends LogicalOperator{
    public BinaryLogicalOperator() {
        super(new OperatorMetaData().setInputType(EOperatorInputTypes.BOOLEAN).setOutputType(EOperatorInputTypes.BOOLEAN).setMinOperands(2).setMaxOperands(2));
    }
}
