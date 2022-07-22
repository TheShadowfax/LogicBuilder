package com.ereinsure.operators.arithmeticOperators;

import com.ereinsure.operands.Operand;
import com.ereinsure.operators.Operator;
import com.ereinsure.operators.OperatorMetaData;

public class ArithmeticOperator extends Operator {
    public ArithmeticOperator(OperatorMetaData meta){
        super(meta);
    }

    @Override
    public Operator addOperand(Object operand) throws Exception {
        if (this.operands.size() < this.meta.maxOperands && (
                ((operand instanceof Operator && ((Operator<?>) operand).meta.outputType == this.meta.inputType))
                        || ((operand instanceof Operand) && ((Operand<?>) operand).meta.valueType == this.meta.inputType))){

            this.operands.add(operand);
        }
        return this;
    }

    @Override
    public Object compute() {
        return null;
    }
}
