package com.ereinsure.operators.arithmeticOperators;

import com.ereinsure.operands.Operand;
import com.ereinsure.operators.AutoLoad;
import com.ereinsure.operators.Operator;

@AutoLoad
public class AddOperator extends BinaryArithmeticOperator{
    public AddOperator(){
        this.setValue("+");
    }

    @Override
    public Object compute() {
        Double res = Double.valueOf(0);
        for (Object operand: this.operands){
            if (operand instanceof Operand){
                res+= Double.valueOf( ((Operand<?>) operand).compute().toString());
            } else if (operand instanceof  Operator) {
                res+= Double.valueOf(((Operator<?>) operand).compute().toString());
            }
        }
        if (Math.floor(res.doubleValue()) == res){
            return res.intValue();
        }
        return  res;
    }
}
