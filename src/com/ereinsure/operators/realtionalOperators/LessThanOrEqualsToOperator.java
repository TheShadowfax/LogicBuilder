package com.ereinsure.operators.realtionalOperators;

import com.ereinsure.operators.AutoLoad;

@AutoLoad
public class LessThanOrEqualsToOperator extends BinaryRelationalOperator{
    public LessThanOrEqualsToOperator(){
        this.setValue("<=");
    }
}
