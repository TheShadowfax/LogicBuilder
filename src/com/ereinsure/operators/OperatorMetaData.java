package com.ereinsure.operators;

public class OperatorMetaData {
    public OperatorMetaData setInputType(EOperatorInputTypes inputType) {
        this.inputType = inputType;
        return this;
    }

    public OperatorMetaData setOutputType(EOperatorInputTypes outputType) {
        this.outputType = outputType;
        return this;
    }

    public OperatorMetaData setMinOperands(int minOperands) {
        this.minOperands = minOperands;
        return this;
    }

    public OperatorMetaData setMaxOperands(int maxOperands) {
        this.maxOperands = maxOperands;
        return this;
    }

    public EOperatorInputTypes inputType = null;
    public EOperatorInputTypes outputType = null;
    public int minOperands;
    public  int maxOperands;


}
