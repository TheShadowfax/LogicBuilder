package com.ereinsure.operands;

import com.ereinsure.operators.EOperatorInputTypes;

public class ConstantOperand extends Operand{

    public ConstantOperand(Object value, EOperatorInputTypes valueType) throws Exception {
        super(value, new OperandMetaData().setValueType(valueType).setType("CONSTANT_OPERAND"));
    }

    @Override
    public Object compute() {
        return this.value;
    }
}
