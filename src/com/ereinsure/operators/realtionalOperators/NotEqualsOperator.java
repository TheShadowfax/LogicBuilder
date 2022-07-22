package com.ereinsure.operators.realtionalOperators;

import com.ereinsure.operators.AutoLoad;

@AutoLoad
public class NotEqualsOperator extends BinaryRelationalOperator{
    public NotEqualsOperator(){
        this.setValue("!=");
    }
}
