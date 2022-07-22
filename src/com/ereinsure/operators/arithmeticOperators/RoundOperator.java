package com.ereinsure.operators.arithmeticOperators;

import com.ereinsure.operands.Operand;
import com.ereinsure.operators.AutoLoad;
import com.ereinsure.operators.Operator;

@AutoLoad
public class RoundOperator extends UnaryArithmeticOperator{
    public RoundOperator(){
        this.setValue("round");
    }

    @Override
    public Object compute() {
        Double res = null;
        for (Object operand: this.operands){
            if (operand instanceof Operand){
                res= Double.valueOf( ((Operand<?>) operand).compute().toString());
            } else if (operand instanceof Operator) {
                res= Double.valueOf((String) ((Operator<?>) operand).compute().toString());
            }
        }

        return  res.intValue();
    }
}
