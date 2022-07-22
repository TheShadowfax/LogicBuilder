package com.ereinsure.operands;

import com.ereinsure.operators.EOperatorInputTypes;

public class OperandMetaData {
    public String type;
    public EOperatorInputTypes valueType;

    public OperandMetaData setType(String type) {
        this.type = type;
        return this;
    }

    public OperandMetaData setValueType(EOperatorInputTypes valueType) {
        this.valueType = valueType;
        return this;
    }
}
