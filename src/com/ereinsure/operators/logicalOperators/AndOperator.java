package com.ereinsure.operators.logicalOperators;

import com.ereinsure.operators.AutoLoad;

@AutoLoad
public class AndOperator extends BinaryLogicalOperator{
    public AndOperator(){
        this.setValue("&&");
    }
}
