package com.ereinsure.operators.logicalOperators;

import com.ereinsure.operators.AutoLoad;

@AutoLoad
public class NotOperator extends UnaryLogicalOperator{
    public NotOperator(){
        this.setValue("!");
    }
}
