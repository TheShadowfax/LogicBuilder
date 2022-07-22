package com.ereinsure.operators.arithmeticOperators;

import com.ereinsure.operands.Operand;
import com.ereinsure.operators.AutoLoad;
import com.ereinsure.operators.Operator;

@AutoLoad
public class FloorOperator extends UnaryArithmeticOperator{
    public FloorOperator(){
        this.setValue("floor");
    }

    @Override
    public Object compute() {
        Double res = null;
        for (Object operand: this.operands){
            if (operand instanceof Operand){
                res= Math.floor(Double.valueOf( ((Operand<?>) operand).compute().toString()));
            } else if (operand instanceof Operator) {
                res= Math.ceil(Double.valueOf((String) ((Operator<?>) operand).compute().toString()));
            }
        }

        if (Math.floor(res.doubleValue()) == res){
            return res.intValue();
        }
        return res;
    }
}
