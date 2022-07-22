package com.ereinsure.operators.realtionalOperators;

import com.ereinsure.operators.AutoLoad;

@AutoLoad
public class EqualsOperator extends BinaryRelationalOperator{
    public EqualsOperator(){
        this.setValue("==");
    }
}
