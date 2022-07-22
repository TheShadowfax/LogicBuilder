package com.ereinsure.operators.conditionalOperators;

import com.ereinsure.operators.EOperatorInputTypes;
import com.ereinsure.operators.Operator;
import com.ereinsure.operators.OperatorMetaData;

public abstract  class ConditionalOperator<T> extends Operator {

    protected T _then = null;
    protected T _else = null;
    public  ConditionalOperator(){
        super(new OperatorMetaData().setInputType(EOperatorInputTypes.BOOLEAN).setOutputType(EOperatorInputTypes.INHERIT).setMinOperands(1).setMaxOperands(1));
    }

    @Override
    public Operator addOperand(Object Operand) throws Exception {
        throw new Exception("Invalid Operation");
    }

    public abstract ConditionalOperator addCondition(T operator);
    public abstract ConditionalOperator addThenLogic(T operand);
    public abstract ConditionalOperator addElseLogic(T operand);
}
