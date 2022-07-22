package com.ereinsure.operators.arithmeticOperators;

import com.ereinsure.operands.Operand;
import com.ereinsure.operators.AutoLoad;
import com.ereinsure.operators.Operator;

@AutoLoad
public class PowerOfOperator extends BinaryArithmeticOperator{
    public PowerOfOperator(){
        this.setValue("**");
    }

    @Override
    public Object compute() {
        Double res = null;
        for (Object operand: this.operands){
            if (operand instanceof Operand){
                Double temp = Double.valueOf( ((Operand<?>) operand).compute().toString());
                if (res == null){
                    res = temp;
                } else res = Math.pow(res,temp);
            } else if (operand instanceof Operator) {
                Double temp = Double.valueOf( ((Operator<?>) operand).compute().toString());
                if (res == null){
                    res = temp;
                } else res = Math.pow(res,temp);
            }
        }
        if (Math.floor(res.doubleValue()) == res){
            return res.intValue();
        }
        return  res;
    }
}
