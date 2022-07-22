package com.ereinsure.operands;

import com.ereinsure.operators.EOperatorInputTypes;

public abstract class Operand<T> {
    public T value;
    public OperandMetaData meta;
    public Operand(T value, OperandMetaData meta) throws Exception {
        this.meta = meta;
        if (this.meta.type.equals( "CONSTANT_OPERAND") && ((this.meta.valueType == EOperatorInputTypes.BOOLEAN && value instanceof  Boolean == false) || (this.meta.valueType == EOperatorInputTypes.NUMBER && (value instanceof  Number == false)) || (this.meta.valueType == EOperatorInputTypes.STRING && value instanceof  String == false) || (this.meta.valueType == EOperatorInputTypes.INHERIT))){
            throw new Exception("Incompatible value provided, was expecting: "+this.meta.valueType.toString()+" but found: "+value.getClass().getName());
        }
        this.value = value;
    }

    public abstract T compute();
}
