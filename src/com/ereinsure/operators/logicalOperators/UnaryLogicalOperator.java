package com.ereinsure.operators.logicalOperators;

import com.ereinsure.operators.EOperatorInputTypes;
import com.ereinsure.operators.OperatorMetaData;

public class UnaryLogicalOperator extends LogicalOperator{
    public UnaryLogicalOperator() {
        super(new OperatorMetaData().setInputType(EOperatorInputTypes.BOOLEAN).setOutputType(EOperatorInputTypes.BOOLEAN).setMinOperands(1).setMaxOperands(1));
    }
}
