package com.ereinsure.operators.realtionalOperators;

import com.ereinsure.operators.AutoLoad;

@AutoLoad
public class GreaterThanOrEqualsToOperator extends BinaryRelationalOperator{
    public GreaterThanOrEqualsToOperator(){
        this.setValue(">=");
    }
}
