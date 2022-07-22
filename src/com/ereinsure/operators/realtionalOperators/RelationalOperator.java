package com.ereinsure.operators.realtionalOperators;

import com.ereinsure.operands.Operand;
import com.ereinsure.operators.Operator;
import com.ereinsure.operators.OperatorMetaData;

public class RelationalOperator extends Operator {
    public RelationalOperator(OperatorMetaData meta){
        super(meta);
    }
    @Override
    public Operator addOperand(Object operand) throws Exception {
        if (this.operands.size() <= this.meta.maxOperands && (
                ((operand instanceof Operator && ((Operator<?>) operand).meta.outputType == this.meta.inputType))
                        || ((operand instanceof com.ereinsure.operands.Operand) && ((Operand<?>) operand).meta.valueType == this.meta.inputType))){
            this.operands.add(operand);
        }
        return this;
    }

    @Override
    public Object compute() {
        return null;
    }
}
