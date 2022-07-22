package com.ereinsure.operands;

import com.ereinsure.operators.EOperatorInputTypes;

public class ReferenceOperand extends Operand{

    ReferenceOperandResolver referenceOperandResolver = new ReferenceOperandResolver();
    public ReferenceOperand(Object value, EOperatorInputTypes valueType) throws Exception {
        super(value, new OperandMetaData().setValueType(valueType).setType("REFERENCE_OPERAND"));
    }
    @Override
    public Object compute() {
        return this.referenceOperandResolver.getReferenceOperand(this.value.toString());
    }

    public void setReferenceOperandResolver(ReferenceOperandResolver ReferenceOperandResolver) {
        this.referenceOperandResolver = ReferenceOperandResolver;
    }
}
