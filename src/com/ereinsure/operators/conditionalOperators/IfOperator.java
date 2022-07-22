package com.ereinsure.operators.conditionalOperators;

import com.ereinsure.operators.AutoLoad;
import com.ereinsure.operators.EOperatorInputTypes;
import com.ereinsure.operators.Operator;
import com.ereinsure.operators.logicalOperators.LogicalOperator;
import com.ereinsure.operators.realtionalOperators.RelationalOperator;

@AutoLoad
public class IfOperator<T> extends ConditionalOperator{

    public IfOperator(){
        this.setValue("if");
    }


    @Override
    public ConditionalOperator addCondition(Object operator) {
        if (this.operands.size() < 1 && operator instanceof Operator  && ((Operator<?>) operator).meta.outputType == EOperatorInputTypes.BOOLEAN && (operator instanceof LogicalOperator || operator instanceof RelationalOperator)){
            this.operands.add(operator);
        }
        return this;
    }

    @Override
    public ConditionalOperator addThenLogic(Object operand) {
        if (this._then != null){
            this._then = operand;
        }
        return this;
    }

    @Override
    public ConditionalOperator addElseLogic(Object operand) {
        if (this._else != null){
            this._else = operand;
        }
        return this;
    }

    @Override
    public Object compute() {
        return null;
    }
}
