package com.ereinsure.operands;

import com.ereinsure.operators.EOperatorInputTypes;

public class DynamicOperand extends Operand{



    DynamicOperandResolver dynamicOperandResolver = new DynamicOperandResolver();
    public DynamicOperand(Object value, EOperatorInputTypes valueType) throws Exception {
        super(value, new OperandMetaData().setValueType(valueType).setType("DYNAMIC_OPERAND"));
    }

    @Override
    public Object compute() {
        return this.dynamicOperandResolver.getDynamicOperand(this.value.toString());
    }

    public void setDynamicOperandResolver(DynamicOperandResolver dynamicOperandResolver) {
        this.dynamicOperandResolver = dynamicOperandResolver;
    }
}
